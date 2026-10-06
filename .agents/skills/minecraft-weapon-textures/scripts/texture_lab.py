#!/usr/bin/env python3
"""Deterministic native-pixel examples, RGBA analysis and scoped style checks.

Python 3.10+, Pillow. No image resampling is used to draw the sprites.
Analysis never guesses a material from a pixel's color.
"""
from __future__ import annotations
import argparse
from collections import Counter
import hashlib
import json
import math
from pathlib import Path
from PIL import Image, ImageDraw, ImageFont

DEFAULT_PALETTE = Path(__file__).resolve().parents[1] / 'references' / 'palette.json'
NEIGHBORS = [(a, b) for a in (-1, 0, 1) for b in (-1, 0, 1) if a or b]


def rgba(c):
    return tuple(int(c[i:i+2], 16) for i in (1, 3, 5)) + (255,)


def luma(c):
    rgb = rgba(c) if isinstance(c, str) else c
    return sum(a*b for a,b in zip(rgb[:3], (0.2126, 0.7152, 0.0722)))


def load_palette(path=None):
    data = json.loads(Path(path or DEFAULT_PALETTE).read_text(encoding='utf-8'))
    ramps={k: v['colors'] for k,v in data['generation'].items()}
    for material, minimum in {'wood':4,'metal':6,'leather':5,'string':3,'feather':3}.items():
        if material not in ramps or len(ramps[material])<minimum:
            raise ValueError(f'Paleta para geração exige {minimum} cores em {material}.')
        if any(len(c)!=7 or c[0]!='#' for c in ramps[material]):
            raise ValueError('Cores precisam usar #RRGGBB.')
        values=[luma(c) for c in ramps[material]]
        if values!=sorted(values): raise ValueError(f'Rampa de {material} não está em ordem de brilho.')
    return data, ramps


def components(mask):
    remaining = set(mask); sizes=[]
    while remaining:
        stack=[remaining.pop()]; size=0
        while stack:
            x,y=stack.pop(); size+=1
            for dx,dy in NEIGHBORS:
                nxt=(x+dx,y+dy)
                if nxt in remaining:
                    remaining.remove(nxt); stack.append(nxt)
        sizes.append(size)
    return sorted(sizes, reverse=True)


def analyze_image(path):
    path=Path(path)
    with Image.open(path) as src:
        original_mode=src.mode; original_format=src.format
        im=src.convert('RGBA')
    w,h=im.size
    px=im.load()
    mask={(x,y) for y in range(h) for x in range(w) if px[x,y][3]>0}
    colors=Counter(px[x,y][:3] for x,y in mask)
    boundary={(x,y) for x,y in mask if any((x+dx,y+dy) not in mask for dx,dy in ((0,1),(0,-1),(1,0),(-1,0)))}
    ec=Counter(px[x,y][:3] for x,y in boundary)
    if len(mask)>1:
        mx=sum(x for x,y in mask)/len(mask); my=sum(y for x,y in mask)/len(mask)
        xx=sum((x-mx)**2 for x,y in mask); yy=sum((y-my)**2 for x,y in mask)
        xy=sum((x-mx)*(y-my) for x,y in mask)
        angle=math.degrees(0.5*math.atan2(2*xy,xx-yy))
        anisotropy=math.hypot(xx-yy,2*xy)/(xx+yy) if xx+yy else 0
    else: angle=0; anisotropy=0
    return {'file':str(path),'format':original_format,'mode':original_mode,'size':[w,h],
        'bbox':im.getchannel('A').getbbox(),'visible_pixels':len(mask),
        'alpha':dict(sorted(Counter(px[x,y][3] for y in range(h) for x in range(w)).items())),
        'color_count':len(colors),'black_pixels':colors[(0,0,0)],
        'pca_angle_screen_deg':round(angle,3),'pca_anisotropy':round(anisotropy,3),
        'components_8':components(mask),
        'palette':[{'hex':'#%02X%02X%02X'%rgb,'pixels':n,'boundary_pixels':ec[rgb],'luma':round(luma(rgb),3)}
                   for rgb,n in sorted(colors.items(),key=lambda item:(luma(item[0]),item[0]))],
        'edge_top':[{'hex':'#%02X%02X%02X'%rgb,'pixels':n} for rgb,n in ec.most_common(5)],
        'sha256':hashlib.sha256(path.read_bytes()).hexdigest()}


class Sprite:
    def __init__(self, palette):
        self.im=Image.new('RGBA',(32,32),(0,0,0,0))
        self.labels=Image.new('L',(32,32),0)
        self.p=palette
        self.ids={k:i+1 for i,k in enumerate(palette)}

    def draw(self, method, geometry, material, tone, **kw):
        getattr(ImageDraw.Draw(self.im),method)(geometry, fill=rgba(self.p[material][tone]), **kw)
        getattr(ImageDraw.Draw(self.labels),method)(geometry, fill=self.ids[material], **kw)

    def line(self, points, material, tone, width=1):
        self.draw('line',points,material,tone,width=width)

    def poly(self, points, material, tone):
        self.draw('polygon',points,material,tone)

    def points(self, points, material, tone):
        for p in points: self.draw('point',p,material,tone)


def make_bow(p):
    s=Sprite(p)
    # String first, no outline around a one-pixel functional element.
    s.line([(6,26),(26,6)],'string',0)
    s.line([(9,23),(13,19)],'string',1)
    s.line([(18,14),(21,11)],'string',1)
    # Limbs are discrete native polygons; upper-left is the lit face.
    s.poly([(4,26),(5,20),(7,16),(10,13),(13,10),(16,7),(20,5),(26,4),(27,7),(21,8),(18,10),(14,14),(10,18),(8,22),(7,27)],'wood',0)
    s.poly([(5,24),(6,20),(8,16),(11,13),(14,10),(17,8),(21,6),(25,5),(25,6),(20,7),(17,10),(13,14),(9,18),(7,23),(6,25)],'wood',1)
    s.line([(6,22),(7,18),(9,15),(11,13)],'wood',2)
    s.line([(14,10),(17,8),(21,6),(24,6)],'wood',2)
    s.points([(6,20),(8,16),(17,8),(21,6),(22,6)],'wood',3)
    s.poly([(10,12),(12,10),(16,14),(14,16)],'leather',0)
    s.line([(11,12),(14,15)],'leather',2,width=2)
    s.points([(11,12),(12,13),(13,14)],'leather',3)
    s.points([(11,11)],'leather',4)
    # Small cool metal tips, contour selection depends on material.
    s.line([(4,26),(6,27)],'metal',0)
    s.points([(4,25),(5,26)],'metal',2)
    s.line([(25,4),(27,6)],'metal',0)
    s.points([(25,4),(26,5)],'metal',3)
    return s, {'kind':'bow','functional_axis':[[6,26],[26,6]],'sections':[{'name':'membro inferior','role':'limb','y':20,'x_range':[4,10],'materials':['wood']},{'name':'corda livre','role':'string','y':18,'x_range':[12,20],'materials':['string']}]}


def make_arrow(p):
    s=Sprite(p)
    # Three adjacent diagonals make a 3-pixel horizontal shaft section.
    s.line([(4,26),(24,6)],'wood',0)
    s.line([(4,25),(23,6)],'wood',1)
    s.line([(3,25),(23,5)],'wood',2)
    s.points([(11,17),(15,13),(19,9)],'wood',3)
    # Two fletchings, attached to the shaft, no isolated noise.
    s.poly([(3,20),(6,21),(10,24),(7,27),(3,27)],'feather',0)
    s.poly([(3,21),(6,22),(9,25),(7,26),(4,26)],'feather',1)
    s.line([(3,21),(6,22),(8,24)],'feather',2)
    s.poly([(6,28),(7,25),(10,22),(13,24),(10,28)],'feather',0)
    s.poly([(7,27),(8,25),(11,23),(12,24),(10,27)],'feather',1)
    s.line([(8,25),(11,23)],'feather',2)
    # Binding and arrowhead, entirely original geometry.
    s.line([(21,6),(24,9)],'leather',1)
    s.points([(21,6),(22,7)],'leather',3)
    s.poly([(23,3),(28,3),(28,8),(24,10),(22,7)],'metal',0)
    s.poly([(24,4),(27,4),(27,7),(24,9),(22,7)],'metal',1)
    s.poly([(24,4),(27,4),(25,6),(22,7)],'metal',3)
    s.line([(24,4),(26,4)],'metal',4)
    s.points([(27,5),(26,7),(24,8)],'metal',2)
    s.points([(26,4)],'metal',5)
    return s, {'kind':'arrow','functional_axis':[[5,25],[26,4]],'sections':[{'name':'haste livre','role':'shaft','y':15,'x_range':[8,20],'materials':['wood']},{'name':'ponta','role':'blade','y':7,'x_range':[20,29],'materials':['metal']}]}


def make_crossbow(p):
    s=Sprite(p)
    # String is tensioned toward the lower-right, the stock's direction.
    s.line([(5,23),(23,23),(23,5)],'string',0)
    s.line([(9,23),(17,23)],'string',1)
    s.line([(23,9),(23,16)],'string',1)
    # Stock runs NW -> SE. Bow limbs cross it on the other diagonal.
    s.poly([(9,9),(11,8),(25,22),(25,25),(23,26),(8,11)],'wood',0)
    s.poly([(10,10),(12,10),(24,22),(25,25),(23,25),(10,12)],'wood',1)
    s.line([(10,10),(23,23)],'wood',2,width=2)
    s.points([(11,10),(14,13),(17,16),(21,20)],'wood',3)
    s.poly([(20,21),(22,19),(26,23),(24,26)],'leather',0)
    s.line([(21,21),(24,24)],'leather',2,width=2)
    s.points([(21,21),(22,22),(23,23)],'leather',3)
    s.points([(21,20)],'leather',4)
    s.poly([(4,23),(4,18),(7,13),(12,8),(18,4),(23,4),(24,7),(19,8),(14,11),(10,15),(8,19),(7,24)],'wood',0)
    s.poly([(5,21),(6,17),(9,13),(13,9),(18,6),(22,5),(22,6),(18,7),(14,10),(10,14),(7,18),(6,22)],'wood',1)
    s.line([(6,18),(8,14),(12,10),(17,7),(21,6)],'wood',2)
    s.points([(7,16),(10,12),(17,7),(19,6)],'wood',3)
    s.poly([(10,12),(12,10),(16,14),(14,16)],'metal',0)
    s.line([(11,12),(14,15)],'metal',2,width=2)
    s.points([(11,11),(12,12),(13,13)],'metal',3)
    s.points([(11,11)],'metal',4)
    s.line([(4,23),(6,24)],'metal',0)
    s.points([(4,22),(5,23)],'metal',3)
    s.line([(22,4),(24,6)],'metal',0)
    s.points([(22,4),(23,5)],'metal',3)
    s.points([(17,20),(18,21)],'metal',1)
    return s, {'kind':'crossbow','functional_axis':[[10,10],[25,25]],'sections':[{'name':'coronha','role':'stock','y':24,'x_range':[18,28],'materials':['wood','leather']},{'name':'corda vertical','role':'string','y':15,'x_range':[19,25],'materials':['string']}]}


def save_sprite(sprite, metadata, out):
    out=Path(out); out.parent.mkdir(parents=True,exist_ok=True)
    sprite.im.save(out)
    metadata['size']=[32,32]
    metadata['material_ids']=sprite.ids
    metadata['labels']=[[sprite.labels.getpixel((x,y)) for x in range(32)] for y in range(32)]
    out.with_suffix('.materials.json').write_text(json.dumps(metadata,ensure_ascii=False,indent=2),encoding='utf-8')


def validate(path, p, expected_size=32, profile='basic'):
    r=analyze_image(path); errors=[]; warnings=[]
    if r['format']!='PNG': errors.append('Arquivo precisa ser PNG.')
    if r['size']!=[expected_size,expected_size]: errors.append(f'Canvas deve ser {expected_size}×{expected_size}.')
    if r['mode']!='RGBA': errors.append('Exportar em RGBA explícito.')
    if any(int(a) not in (0,255) for a in r['alpha']): errors.append('Alpha intermediário / antialias detectado.')
    if not r['visible_pixels']: errors.append('Textura vazia.')
    if profile=='basic':
        if r['black_pixels']: errors.append('Preto puro fora do perfil básico.')
        if r['color_count']>30: errors.append('Mais de 30 RGB visíveis no perfil básico.')
        allowed={c for ramp in p.values() for c in ramp}
        extra=[x['hex'] for x in r['palette'] if x['hex'] not in allowed]
        if extra: errors.append('Cores fora da paleta básica selecionada: '+', '.join(extra))
        if len(r['components_8'])>1: warnings.append('Silhueta possui ilhas: revisar se são intencionais.')
        if r['bbox'] and r['bbox']==[0,0,expected_size,expected_size]: warnings.append('Sprite toca todas as bordas: conferir margem/encaixe.')
    # Material membership is checked only with a declared semantic map.
    sidecar=Path(path).with_suffix('.materials.json')
    material_stats={}; sections=[]
    if sidecar.exists():
        data=json.loads(sidecar.read_text(encoding='utf-8'))
        labels=data.get('labels'); ids=data.get('material_ids',{})
        w,h=r['size']
        if not isinstance(labels,list) or len(labels)!=h or any(not isinstance(row,list) or len(row)!=w for row in labels):
            errors.append('Mapa de materiais incompatível com o canvas.')
        elif not ids or any(k not in p for k in ids) or any(not isinstance(v,int) or v<=0 for v in ids.values()) or len(set(ids.values()))!=len(ids):
            errors.append('IDs de materiais inválidos.')
        else:
            im=Image.open(path).convert('RGBA'); counts={k:Counter() for k in ids}
            rev={v:k for k,v in ids.items()}
            bad=0
            for y in range(h):
                for x in range(w):
                    pixel=im.getpixel((x,y)); label=labels[y][x]
                    if pixel[3]:
                        c='#%02X%02X%02X'%pixel[:3]
                        if label not in rev or c not in p[rev[label]]: bad+=1
                        else: counts[rev[label]][c]+=1
                    elif label: bad+=1
            if bad: errors.append(f'{bad} pixels divergem do mapa/paleta de materiais.')
            for material,c in counts.items():
                total=sum(c.values())
                if not total: continue
                light=p[material][-1]; fraction=c[light]/total
                material_stats[material]={'pixels':total,'colors':len(c),'hex_counts':dict(c),'brightest_fraction':round(fraction,4)}
                budget={'wood':4,'metal':6,'leather':5,'string':3,'feather':3}.get(material,30)
                if len(c)>budget and profile=='basic': errors.append(f'{material}: mais de {budget} cores visíveis.')
                if fraction>0.2 and material!='string' and profile=='basic':
                    warnings.append(f'{material}: highlight mais claro ocupa {fraction:.1%}; revisar objetivo ≤20%.')
            for section in data.get('sections',[]):
                y=section['y']; lo,hi=section['x_range']
                if not (0<=y<h and 0<=lo<=hi<w) or any(k not in ids for k in section['materials']):
                    errors.append('Seção declarada inválida.'); continue
                selected={ids[k] for k in section['materials']}
                xs=[x for x in range(lo,hi+1) if labels[y][x] in selected and im.getpixel((x,y))[3]]
                span=max(xs)-min(xs)+1 if xs else 0
                sections.append({'name':section['name'],'y':y,'xs':xs,'horizontal_span':span,'pixels':len(xs)})
                limits={'shaft':(3,5),'limb':(3,5),'stock':(3,5),'blade':(4,7),'string':(1,2)}.get(section.get('role'))
                if expected_size==32 and profile=='basic' and limits and not limits[0]<=span<=limits[1]:
                    errors.append(f'{section["name"]}: seção de {span} px fora do objetivo {limits[0]}–{limits[1]} px.')
            axis=data.get('functional_axis')
            if axis and len(axis)==2:
                dx=axis[1][0]-axis[0][0]; dy=axis[1][1]-axis[0][1]
                r['declared_functional_angle_screen_deg']=round(math.degrees(math.atan2(dy,dx)),3)
                r['functional_axis_note']='Ângulo da receita, não inferência da máscara.'
    else:
        warnings.append('Sem mapa de materiais: quantidades por material e espessuras semânticas não verificadas.')
    r.update({'profile':profile,'errors':errors,'warnings':warnings,'material_stats':material_stats,'sections':sections,'passed':not errors})
    return r


def preview(paths, out):
    paths=list(paths); width=max(900,300*len(paths)); height=530
    panel=Image.new('RGB',(width,height),'#192331'); d=ImageDraw.Draw(panel)
    try: font=ImageFont.truetype('C:/Windows/Fonts/consola.ttf',18)
    except OSError: font=ImageFont.load_default()
    labels={'bow':'ARCO','arrow':'FLECHA','crossbow':'BESTA'}
    for i,path in enumerate(paths):
        path=Path(path); im=Image.open(path).convert('RGBA'); x=i*300
        d.text((x+20,15),labels.get(path.stem,path.stem.upper()),font=font,fill='#EBF1F8')
        for y,bg in [(55,'#E6E3DD'),(300,'#303A49')]:
            tile=Image.new('RGB',(224,224),bg)
            factor=max(1,min(224//im.width,224//im.height))
            enlarged=im.resize((im.width*factor,im.height*factor),Image.Resampling.NEAREST)
            tile.paste(enlarged,((224-enlarged.width)//2,(224-enlarged.height)//2),enlarged)
            panel.paste(tile,(x+20,y))
        d.text((x+250,175),'1x',font=font,fill='#EBF1F8')
        panel.paste(im,(x+250,205),im)
        d.text((x+250,355),'32',font=font,fill='#EBF1F8')
    Path(out).parent.mkdir(parents=True,exist_ok=True); panel.save(out)


def main():
    ap=argparse.ArgumentParser(description=__doc__)
    sub=ap.add_subparsers(dest='command',required=True)
    gen=sub.add_parser('generate'); gen.add_argument('--out',required=True); gen.add_argument('--kind',choices=['all','bow','arrow','crossbow'],default='all'); gen.add_argument('--palette')
    val=sub.add_parser('validate'); val.add_argument('paths',nargs='+'); val.add_argument('--size',type=int,default=32); val.add_argument('--profile',choices=['basic','unique','uv','emissive'],default='basic'); val.add_argument('--palette'); val.add_argument('--report')
    ana=sub.add_parser('analyze'); ana.add_argument('input'); ana.add_argument('--out',required=True)
    source=sub.add_parser('source'); source.add_argument('--name',required=True); source.add_argument('--catalog',default=str(DEFAULT_PALETTE.with_name('source-metrics.json')))
    pre=sub.add_parser('preview'); pre.add_argument('--input',required=True); pre.add_argument('--out',required=True)
    a=ap.parse_args()
    if a.command=='source':
        records=json.loads(Path(a.catalog).read_text(encoding='utf-8'))
        record=next((r for r in records if r['file']==a.name),None)
        if record is None: ap.error('Nome ausente no catálogo; use o caminho relativo exato do PNG.')
        print(json.dumps(record,ensure_ascii=False,indent=2)); return 0
    if a.command=='analyze':
        root=Path(a.input); paths=sorted(root.rglob('*.png')) if root.is_dir() else [root]
        records=[analyze_image(p) for p in paths]
        if root.is_dir():
            for r,p in zip(records,paths): r['file']=p.relative_to(root).as_posix()
        Path(a.out).parent.mkdir(parents=True,exist_ok=True)
        Path(a.out).write_text(json.dumps(records,ensure_ascii=False,indent=2),encoding='utf-8')
        print(json.dumps({'files':len(records),'sizes':dict(Counter(f'{r["size"][0]}x{r["size"][1]}' for r in records))},ensure_ascii=False))
        return 0
    if a.command=='preview':
        preview([Path(a.input)/f'{kind}.png' for kind in ('bow','arrow','crossbow') if (Path(a.input)/f'{kind}.png').exists()],a.out); print(a.out); return 0
    _,p=load_palette(a.palette)
    if a.command=='generate':
        recipes={'bow':make_bow,'arrow':make_arrow,'crossbow':make_crossbow}
        for kind,recipe in recipes.items():
            if a.kind not in ('all',kind): continue
            sprite,metadata=recipe(p); save_sprite(sprite,metadata,Path(a.out)/f'{kind}.png')
        print(a.out); return 0
    records=[validate(path,p,a.size,a.profile) for path in a.paths]
    if a.report:
        Path(a.report).parent.mkdir(parents=True,exist_ok=True)
        Path(a.report).write_text(json.dumps(records,ensure_ascii=False,indent=2),encoding='utf-8')
    print(json.dumps([{'file':r['file'],'passed':r['passed'],'colors':r['color_count'],'bbox':r['bbox'],'components_8':r['components_8'],'sections':r['sections'],'errors':r['errors'],'warnings':r['warnings']} for r in records],ensure_ascii=False,indent=2))
    return 0 if all(r['passed'] for r in records) else 1


if __name__=='__main__':
    raise SystemExit(main())
