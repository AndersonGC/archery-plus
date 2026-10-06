"""Archery Plus: authored native-pixel recipes, never filtered or downsampled.

Python 3.10+ / Pillow. PNGs are committed resources; Gradle does not run this tool.
Run from any directory: python tools/textures/redraw.py
Palettes are sampled from the user-selected inspirations, documented in README.md.
"""
from pathlib import Path
import json
import math
from PIL import Image, ImageDraw, ImageFont

ROOT = Path(__file__).resolve().parents[2]
OUT = ROOT / 'src/main/resources/assets/archery_plus/textures'
REVIEW = ROOT / 'build/texture-redesign'
TIERS = ['leather', 'iron', 'gold', 'diamond', 'netherite']
P = {
    'wood': ['#1F1206', '#493615', '#684E1E', '#896727'],
    'leather': ['#1C1616', '#312018', '#41291F', '#55362A', '#6E4738'],
    'metal': ['#343436', '#4C4D4F', '#87898A', '#A6A9AA', '#BABFC0', '#D5DDDD'],
    'binding': ['#353331', '#454241', '#655E58', '#7E756C', '#B2AD98'],
    'string': ['#444444', '#6D6D6D', '#C0B493'],
    'feather': ['#293133', '#A9A9A9', '#DEDEDE'],
    'gold': ['#502205', '#6C3F05', '#9B5B08', '#DC9613', '#FAD64A', '#FFFDE0'],
    'diamond': ['#0E3F36', '#156355', '#1E8A77', '#2BC7AC', '#33EBCB', '#A4FDF0'],
    'netherite': ['#341F2D', '#4A2940', '#4F3C3E', '#5D565D', '#706770', '#867B86'],
}


class Pixel:
    def __init__(self, size=(32, 32)):
        self.im = Image.new('RGBA', size)
        self.labels = Image.new('L', size)
        self.ids = {k: i+1 for i, k in enumerate(P)}

    def mark(self, method, coords, material, tone, **kwargs):
        getattr(ImageDraw.Draw(self.im), method)(coords, fill=P[material][tone], **kwargs)
        getattr(ImageDraw.Draw(self.labels), method)(coords, fill=self.ids[material], **kwargs)

    def poly(self, coords, m, t): self.mark('polygon', coords, m, t)
    def line(self, coords, m, t, width=1): self.mark('line', coords, m, t, width=width)
    def dot(self, coords, m, t): self.mark('point', coords, m, t)
    def rect(self, coords, m, t): self.mark('rectangle', coords, m, t)

    def save(self, relative, **meta):
        path = OUT / (relative + '.png')
        path.parent.mkdir(parents=True, exist_ok=True)
        self.im.save(path)
        review = REVIEW / 'measured' / (relative + '.png')
        review.parent.mkdir(parents=True, exist_ok=True)
        self.im.save(review)
        w, h = self.im.size
        meta.update(material_ids=self.ids, labels=[[self.labels.getpixel((x,y)) for x in range(w)] for y in range(h)])
        review.with_suffix('.materials.json').write_text(json.dumps(meta), encoding='utf8')


def bow(long=False, stage=-1):
    s = Pixel()
    bend = max(0, stage)
    # The bow axis matches vanilla. Grip pixels remain registered at (12,12).
    tip = (29, 3) if long else (27, 4)
    tip = (tip[0], tip[1] + bend)
    lower = (tip[1], tip[0])
    nock = (16,16) if stage == 0 else (20,20) if stage == 1 else (24,24)
    s.line([lower, tip] if stage < 0 else [lower, nock, tip], 'string', 0 if stage < 0 else 1)
    if long:
        outline = [(12,9),(17,5),(23,2+bend),(28,2+bend),(30,3+bend),
                   (28,5+bend),(23,6+bend),(18,8),(14,12)]
        face = [(13,9),(18,6),(23,3+bend),(28,3+bend),(27,4+bend),
                (22,5+bend),(18,7),(14,11)]
        light = [(14,8),(18,6),(23,3+bend),(27,3+bend)]
    else:
        outline = [(12,10),(17,6),(21,6),(23,7),(25,5+bend),(26,3+bend),
                   (28,3+bend),(27,7+bend),(24,10+bend),(20,9),(16,13),(14,14)]
        face = [(13,10),(18,7),(21,7),(23,8),(26,5+bend),(26,7+bend),
                (24,9+bend),(20,8),(16,12),(14,13)]
        light = [(15,9),(18,7),(21,7),(23,8)]
    for transpose in (False, True):
        def xy(points): return [(y,x) if transpose else (x,y) for x,y in points]
        s.poly(xy(outline), 'wood', 0)
        s.poly(xy(face), 'wood', 1)
        s.line(xy(light), 'wood', 2)
        # Restrained glints on the upper-left edge, never random grain.
        s.dot(xy([(18,6 if long else 7),(19,5 if long else 7)]), 'wood', 3)
        if not long:
            s.line(xy([(26,4+bend),(26,6+bend)]), 'binding', 2)
        else:
            s.dot(xy([(28,3+bend)]), 'binding', 3)
    # Longbow has a leather wrap; recurve retains the reference's horn/linen grip.
    grip = 'leather' if long else 'binding'
    s.poly([(10,13),(13,10),(15,12),(12,15)], grip, 0)
    s.line([(11,13),(13,11)], grip, 2, 2)
    s.line([(11,12),(13,10)], grip, 3)
    s.dot([(12,11)], grip, 4)
    if stage >= 0:
        # A straight 45-degree arrow translates with the draw; the hand does not.
        head = 5 + stage * 3
        s.line([(head+2,head+2), nock], 'wood', 1)
        s.line([(head+2,head+1),(nock[0],nock[1]-1)], 'wood', 3)
        s.poly([(head-1,head-1),(head+3,head),(head+3,head+2),(head+2,head+3),(head,head+3)], 'metal', 1)
        s.line([(head,head),(head+2,head+1)], 'metal', 4)
        s.dot([(head,head)], 'metal', 5)
        s.line([(nock[0]-3,nock[1]),(nock[0]-1,nock[1])], 'feather', 1)
        s.line([(nock[0],nock[1]-3),(nock[0],nock[1]-1)], 'feather', 1)
        s.dot([(nock[0],nock[1]-3)], 'feather', 2)
    name = 'longbow' if long else 'recurve_bow'
    s.save('item/' + name + ('' if stage < 0 else '_pulling_' + str(stage)),
           kind='bow', grip_anchor=[12,12], string_endpoints=[lower,tip],
           nock=list(nock) if stage >= 0 else None,
           functional_axis=[lower,tip],
           sections=[] if stage >= 0 else [
               {'name':'Corda livre','role':'string','y':19,'x_range':[10,22],'materials':['string']},
               {'name':'Membro inferior','role':'limb','y':19,'x_range':[2,10],'materials':['wood']}])


def quiver(tier):
    s = Pixel()
    m = 'leather' if tier == 'leather' else 'metal' if tier == 'iron' else tier
    hi = len(P[m])-1
    # Open shoulder loop, rising above the bag just like large_quiver.
    s.poly([(6,21),(5,16),(8,8),(12,2),(15,2),(20,9),(18,12),(14,6),(11,10),(9,18),(9,23)], 'leather', 0)
    s.line([(7,20),(7,16),(9,9),(13,4),(14,4),(18,10)], 'leather', 3, 2)
    s.line([(7,16),(9,9),(13,3),(14,3)], 'leather', 4)
    s.line([(14,5),(17,10)], 'leather', 2)
    # Wide tapered tube. All structural highlights are hand-placed pixel clusters.
    s.poly([(4,22),(7,18),(18,7),(23,6),(29,12),(29,15),(14,29),(9,30),(4,27)], 'leather', 0)
    s.poly([(5,22),(8,18),(19,8),(23,8),(27,12),(27,15),(13,28),(9,28),(6,26)], 'leather', 2)
    s.poly([(6,22),(9,18),(20,8),(23,9),(24,11),(12,24),(8,26),(6,25)], 'leather', 3)
    s.line([(8,20),(20,9),(22,9)], 'leather', 4)
    s.line([(14,26),(26,14),(26,12)], 'leather', 1)
    s.line([(10,26),(13,25),(24,14)], 'leather', 2)
    # Bound toe and rolled open collar, a true dark opening rather than a badge.
    s.poly([(4,22),(6,22),(6,25),(10,28),(13,27),(15,27),(13,30),(9,31),(4,28),(3,25)], m, 0)
    s.line([(4,23),(5,27),(9,30),(12,29),(14,28)], m, min(2,hi), 2)
    s.line([(4,23),(5,25)], m, max(2,hi-1))
    s.dot([(9,29)], m, hi)
    s.poly([(18,7),(22,5),(25,6),(30,11),(30,14),(27,17),(25,16),(25,13),(20,9),(18,10)], m, 0)
    s.poly([(20,7),(23,6),(26,8),(29,11),(29,13),(27,15),(26,13),(22,9),(20,9)], m, min(2,hi))
    s.line([(19,7),(22,6),(24,7),(27,10)], m, max(2,hi-1))
    s.dot([(21,6),(22,6)], m, hi)
    s.poly([(23,8),(24,8),(28,12),(27,13),(25,11)], 'leather', 0)
    s.line([(25,9),(28,12)], 'leather', 1)
    if tier == 'leather':
        # Saddle stitching and a folded seam.
        s.line([(9,23),(19,13)], 'leather', 1)
        s.dot([(9,22),(12,19),(15,16),(18,13)], 'binding', 2)
        s.poly([(13,17),(15,15),(18,18),(16,20)], 'leather', 0)
        s.line([(14,17),(16,19)], 'binding', 2)
    elif tier == 'iron':
        # One transverse iron brace and riveted corners.
        s.poly([(11,16),(13,14),(22,22),(20,24)], m, 0)
        s.line([(12,16),(20,23)], m, 2, 2)
        s.line([(12,15),(20,22)], m, 3)
        s.dot([(12,15),(20,22)], m, 5)
        s.dot([(8,21),(23,12)], m, 3)
    elif tier == 'gold':
        # Gilded edging, a narrow engraved clasp and asymmetrical strap.
        s.line([(7,21),(19,10)], m, 1)
        s.line([(16,26),(26,16)], m, 2)
        s.poly([(14,15),(16,13),(21,17),(19,20),(17,20)], m, 0)
        s.line([(15,15),(16,14),(20,17),(18,19),(17,18)], m, 3)
        s.dot([(16,14),(18,16)], m, 4)
        s.line([(10,26),(12,25)], m, 3)
    elif tier == 'diamond':
        # Angular corners and one faceted inset; the main panel stays leather.
        s.poly([(7,19),(9,17),(11,18),(9,22),(7,23)], m, 0)
        s.line([(8,19),(9,18),(10,18)], m, 3)
        s.poly([(16,16),(19,16),(21,19),(18,22),(15,19)], m, 0)
        s.poly([(16,18),(18,17),(20,19),(18,21)], m, 2)
        s.line([(16,18),(18,17),(19,18)], m, 4)
        s.dot([(17,18)], m, 5)
        s.line([(22,21),(25,18)], m, 2)
    else:
        # Reinforced dark plates frame a warm leather centre.
        s.poly([(7,18),(10,15),(12,17),(9,21),(8,24),(5,24)], m, 0)
        s.line([(7,19),(10,16),(11,17),(8,21)], m, 3)
        s.poly([(17,26),(20,23),(24,19),(26,17),(28,17),(26,21),(19,28)], m, 0)
        s.line([(18,26),(24,20),(26,19)], m, 2)
        s.line([(12,17),(18,23)], m, 1, 2)
        s.line([(12,17),(18,23)], m, 4)
        s.dot([(12,17),(18,23)], m, 5)
    s.save('item/' + tier + '_quiver', kind='quiver', reference='large_quiver.png')


def atlas(tier):
    s = Pixel((64,64))
    m = 'leather' if tier == 'leather' else 'metal' if tier == 'iron' else tier
    hi = len(P[m])-1
    # Texture islands match the native Blockbench box UVs. No procedural noise.
    s.rect((0,0,23,23),'leather',2)
    # The two 5x13 broad faces have a lit fold, subtle wear and a sewn edge.
    # Lay out each face independently, rather than stripes crossing UV islands.
    face=['33321','43321','33321','33231','33221','33321','33331',
          '32321','23321','33331','33321','23221','22211']
    for start in (1,7):
        for y,row in enumerate(face,1):
            for x,tone in enumerate(row): s.dot([(start+x,y)],'leather',int(tone))
        s.dot([(start+1,3),(start+1,10)],'leather',4)
    # Side gussets stay darker than the large front panel.
    s.rect((14,0,23,16),'leather',2)
    for x in (16,20): s.line([(x,3),(x,13)],'leather',1)
    s.dot([(15,4),(15,10),(19,7)],'leather',3)
    s.rect((0,18,23,23),'leather',1)
    s.line([(1,19),(18,19)],'leather',3)
    s.rect((24,0,31,4),'leather',0)
    s.rect((24,5,31,20),'leather',2)
    s.line([(25,6),(25,18)],'leather',4)
    s.line([(28,6),(28,18)],'leather',0)
    for y in (7,10,13,16): s.dot([(26,y)],'binding',2)
    # Rims share UVs with tier reinforcements. Broad strips remain legible in game.
    s.rect((0,24,23,41),m,1)
    for y in (24,26,30,32,36):
        s.line([(0,y),(22,y)],m,min(3,hi))
    for x in (1,6,11,16,21):
        s.dot([(x,25),(x,31)],m,hi)
    s.rect((32,0,39,23),'wood',1)
    s.line([(32,0),(32,23)],'wood',3)
    s.line([(34,0),(34,23)],'wood',0)
    s.rect((40,0,55,11),'feather',1)
    for x in (40,44,48,52):
        s.rect((x,0,x+1,8),'feather',2)
        s.line([(x+2,0),(x+2,9)],'feather',0)
    s.rect((40,16,55,29),'leather',1)
    # Native box UVs give each front ornament only 3-4 texels across.
    # Place the design on the actual south face, not the unused atlas margin.
    if tier == 'diamond':
        s.rect((44,17,47,20),'leather',0)
        s.poly([(46,17),(47,18),(46,20),(44,18)],m,2)
        s.line([(45,18),(46,17)],m,4)
        s.dot([(46,18)],m,hi)
    elif tier == 'gold':
        s.rect((43,17,45,20),m,1)
        s.line([(44,17),(43,18),(44,20),(45,19)],m,3)
        s.dot([(44,17)],m,hi-1)
    elif tier == 'netherite':
        s.rect((44,17,47,20),m,0)
        s.line([(44,17),(47,17)],m,3)
        s.rect((45,18,46,19),'leather',2)
        s.dot([(44,19),(47,19)],m,hi)
    elif tier == 'iron':
        s.rect((43,17,46,19),m,2)
        s.line([(43,17),(46,17)],m,4)
        s.line([(44,18),(45,18)],'leather',1)
        s.dot([(43,17)],m,hi)
    else:
        s.rect((44,17,47,20),'leather',3)
        s.line([(44,20),(47,20)],'leather',0)
        s.dot([(44,17),(46,17),(44,19),(46,19)],'binding',2)
    s.save('entity/quiver/' + tier, kind='uv')


def save_ui(im, name):
    path = OUT / 'gui' / (name + '.png')
    path.parent.mkdir(parents=True,exist_ok=True)
    im.save(path)


def wheel():
    # Native 256 px mask. Discrete leather / brass rings, not a noisy gradient.
    palettes = [
        ['#211A15','#503724','#967044','#D0AD6B','#DBCA9F','#E6D9B8'],
        ['#302113','#765023','#CCA34E','#F4D27C','#EDCE86','#F8E1A5'],
        ['#211F17','#494A30','#929463','#C1C494','#D6D4AE','#E8E1BD'],
    ]
    for state, colors in enumerate(palettes):
        im=Image.new('RGBA',(256,256)); px=im.load()
        for y in range(256):
            for x in range(256):
                dx,dy=x-127.5,y-127.5
                r=math.hypot(dx,dy); angle=math.atan2(dx,-dy)
                if not 47 <= r <= 114 or abs(angle)>.755: continue
                edge=min(r-47,114-r,(.755-abs(angle))*r)
                color=colors[0] if edge<1.5 else colors[1] if edge<4 else colors[2] if edge<5 else colors[3] if edge<6 else colors[4]
                if 56<r<105 and abs(angle)<.66: color=colors[5]
                # Short, spaced stitches in the leather binding. No random pixels.
                if 109<r<110.5 and int((angle+.755)*80)%8<3: color=colors[3]
                px[x,y]=tuple(int(color[i:i+2],16) for i in (1,3,5))+(255,)
        d=ImageDraw.Draw(im)
        # Paired rivets flank the labels; none shares the numeral's radial axis.
        for rx,ry in [(77,35),(178,35)]:
            d.polygon([(rx,ry-3),(rx+3,ry),(rx,ry+3),(rx-3,ry)],fill=colors[0])
            d.polygon([(rx,ry-2),(rx+2,ry),(rx,ry+2),(rx-2,ry)],fill=colors[2])
            d.point((rx-1,ry-1),fill=colors[3])
        for sector in range(4):
            rotated=im if sector == 0 else im.transpose({1:Image.Transpose.ROTATE_270,2:Image.Transpose.ROTATE_180,3:Image.Transpose.ROTATE_90}[sector])
            # Pillow rotates counterclockwise; sectors run top,right,bottom,left.
            save_ui(rotated,'wheel/sector_'+str(sector)+'_'+str(state))
    hub=Image.new('RGBA',(128,128)); d=ImageDraw.Draw(hub)
    for inset,c in [(2,'#211A15'),(4,'#967044'),(5,'#D0AD6B'),(7,'#503724'),(10,'#312018'),(12,'#41291F')]:
        d.ellipse((inset,inset,127-inset,127-inset),fill=c)
    for x,y in [(63,9),(9,63),(117,63),(63,117)]:
        d.polygon([(x,y-2),(x+2,y),(x,y+2),(x-2,y)],fill='#D0AD6B')
    save_ui(hub,'wheel/hub')
    panel=Image.new('RGBA',(176,148)); d=ImageDraw.Draw(panel)
    for inset,c in [(0,'#211A15'),(1,'#967044'),(2,'#D0AD6B'),(3,'#503724'),(5,'#D0AD6B'),(6,'#E6D9B8')]:
        d.rectangle((inset,inset,175-inset,147-inset),fill=c)
    d.rectangle((6,6,169,21),fill='#41291F')
    d.line((6,22,169,22),fill='#967044')
    for x,y in [(3,3),(172,3),(3,144),(172,144)]: d.point((x,y),fill='#F4D27C')
    save_ui(panel,'quiver')


def preview():
    paths=[OUT/'item'/f'{n}.png' for n in ['recurve_bow','longbow']+[t+'_quiver' for t in TIERS]]
    names=['RECURVO','LONGO','COURO','FERRO','OURO','DIAMANTE','NETHERITE']
    board=Image.new('RGB',(1120,570),'#211e20'); d=ImageDraw.Draw(board)
    d.text((24,16),'ARCHERY PLUS  /  Pixels nativos e paletas das referencias',fill='#eee2c5')
    for i,(p,name) in enumerate(zip(paths,names)):
        x=i*160
        d.text((x+12,52),name,fill='#d0ad6b')
        im=Image.open(p)
        board.paste(im.resize((128,128),Image.Resampling.NEAREST),(x+16,80),im.resize((128,128),Image.Resampling.NEAREST))
        for y,bg in [(234,'#d0c9b9'),(302,'#343036')]:
            d.rectangle((x+8,y,x+151,y+55),fill=bg)
            board.paste(im,(x+64,y+12),im)
        for k in range(3):
            if i < 2:
                anim=Image.open(p.with_name(p.stem+'_pulling_'+str(k)+'.png'))
                anim=anim.resize((48,48),Image.Resampling.NEAREST)
                board.paste(anim,(x+k*52+3,393),anim)
        d.text((x+18,470),str(im.size[0])+' x '+str(im.size[1]),fill='#9c9282')
    d.text((24,522),'4x NEAREST acima  /  1x sobre claro e escuro  /  tres estagios de tensao',fill='#d0ad6b')
    board.save(REVIEW/'items.png')


def main():
    REVIEW.mkdir(parents=True,exist_ok=True)
    (REVIEW/'palette.json').write_text(json.dumps({'generation':{k:{'colors':v} for k,v in P.items()}},indent=2),encoding='utf8')
    for long in (False,True):
        for stage in range(-1,3): bow(long,stage)
    for tier in TIERS: quiver(tier); atlas(tier)
    wheel(); preview()
    print('32 native PNGs written to',OUT)


if __name__ == '__main__': main()
