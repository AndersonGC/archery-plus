"""Author the pixel atlas and MCP cube recipe for the 2 x 2 x 1 archery bench.

Geometry is created in Blockbench through its MCP place_cube tool.
Run: python tools/blockbench/archery_workbench.py
"""
from pathlib import Path
import json
from PIL import Image, ImageDraw

ROOT = Path(__file__).resolve().parents[2]
OUT = ROOT / "docs/models/archery_workbench"
OUT.mkdir(parents=True, exist_ok=True)
atlas = Image.new("RGBA", (256, 256), "#453024")
draw = ImageDraw.Draw(atlas)
tiles = {}


def tile(name, base, light, dark, style="plain"):
    index = len(tiles)
    x, y = index % 8 * 32, index // 8 * 32
    tiles[name] = (x, y)
    draw.rectangle((x, y, x + 31, y + 31), fill=base)
    if style.startswith("wood"):
        for a in range(2, 32, 5):
            for b in range((a * 7) % 9, 31, 11):
                length = 5 + (a + b) % 6
                if style == "wood_v":
                    draw.rectangle((x + a, y + b, x + a, y + min(31, b + length)), fill=dark)
                    draw.rectangle((x + a + 1, y + b + 1, x + a + 1, y + min(31, b + length - 1)), fill=light)
                else:
                    draw.rectangle((x + b, y + a, x + min(31, b + length), y + a), fill=dark)
                    draw.rectangle((x + b + 1, y + a + 1, x + min(31, b + length - 1), y + a + 1), fill=light)
    elif style == "metal":
        for a in range(1, 32, 8):
            draw.line((x + a, y + 1, x + a + 3, y + 1), fill=light)
            draw.line((x + a + 3, y + 6, x + a + 5, y + 6), fill=dark)
        draw.line((x, y, x + 31, y), fill=light)
        draw.line((x, y, x, y + 31), fill=light)
        # Reusable 3 x 3 raised fastener mark in the upper-left trim patch.
        draw.point((x + 1, y + 2), fill=dark)
        draw.point((x + 2, y + 1), fill=light)
    elif style == "cloth":
        for a in range(3, 32, 6):
            draw.line((x + a, y, x + a, y + 31), fill=dark)
            draw.line((x + a + 1, y, x + a + 1, y + 31), fill=light)
    elif style == "pages":
        for a in range(2, 32, 3):
            draw.line((x, y + a, x + 31, y + a), fill=dark)
    elif style == "glass":
        draw.rectangle((x + 1, y + 1, x + 2, y + 31), fill=light)
        for a in range(7, 32, 7):
            draw.line((x + a, y, x + a, y + 31), fill=dark)
    return x, y


tile("oak_v", "#9b6c3f", "#b9864e", "#805430", "wood_v")
tile("oak_h", "#a57644", "#c6975c", "#8b5d35", "wood_h")
tile("walnut_v", "#65412c", "#7e5335", "#4e3223", "wood_v")
tile("walnut_h", "#745034", "#94683f", "#533726", "wood_h")
tile("honey_v", "#bd8c53", "#d9aa6b", "#a47340", "wood_v")
tile("honey_h", "#c4985d", "#e0b779", "#a67843", "wood_h")
tile("endgrain", "#ad7d48", "#c99c60", "#835831", "plain")
tile("iron", "#778183", "#a4aeb0", "#515d60", "metal")
tile("iron_dark", "#454e50", "#707c7e", "#333a3d", "metal")
tile("iron_light", "#a5abaa", "#ced0c6", "#838e8e", "metal")
tile("leather", "#8f4f2b", "#ab6838", "#703d23", "wood_v")
tile("linen", "#e4d8ba", "#f7ecd2", "#c5b594", "pages")
tile("rope", "#b89462", "#dec494", "#997548", "pages")
tile("red", "#9d3841", "#b44d4c", "#7b2933", "cloth")
tile("gold", "#d7af63", "#f4d589", "#a47b3b", "plain")
tile("purple", "#685179", "#927499", "#4c3b5d", "cloth")
tile("blue", "#345e70", "#678da0", "#284452", "glass")
tile("green", "#627944", "#91a15d", "#455932", "glass")
tile("brown", "#875338", "#ad7650", "#60392a", "glass")
tile("amber", "#ffc962", "#fff1b0", "#e98c33", "glass")
tile("wax", "#efc779", "#ffe7a1", "#dca557", "plain")
tile("flame", "#ffb03c", "#fff0ac", "#f27a28", "plain")
tile("paper", "#e8d4a7", "#fae6bb", "#c4a273", "plain")
tile("pages", "#d7ceb2", "#eee6d0", "#aea084", "pages")
tile("black", "#30393b", "#495355", "#22292c", "plain")
tile("bow_dark", "#80502e", "#ab7341", "#60371f", "wood_v")
tile("bow_light", "#bd945a", "#ddbb7f", "#9f723e", "wood_v")
tile("steel_tool", "#8d9897", "#bdc5bb", "#596c70", "metal")
tile("moss", "#74803e", "#98a250", "#53612d", "cloth")
tile("parchment_plan", "#e8d4a7", "#fae6bb", "#c4a273", "plain")
tile("banner", "#9d3841", "#b44d4c", "#7b2933", "cloth")
tile("bottle_label", "#e9d9ad", "#fff0cf", "#c4a576", "plain")

# Decorative pixels are authored on existing surface tiles, not extra fasteners.
x, y = tiles["endgrain"]
for a in (3, 7, 11, 15):
    draw.rectangle((x + a, y + a, x + 31 - a, y + 31 - a), outline="#8e6237")
x, y = tiles["parchment_plan"]
# 10 x 6 px work drawing: recurve profile, center line, annotation marks.
draw.line([(x + 2, y + 1), (x + 5, y + 2), (x + 6, y + 3), (x + 5, y + 4), (x + 2, y + 5)], fill="#9d7545")
draw.line((x + 2, y + 1, x + 2, y + 5), fill="#ba9560")
draw.point((x + 8, y + 1), fill="#b28b55")
draw.line((x + 7, y + 3, x + 9, y + 3), fill="#b28b55")
draw.line((x, y + 5, x + 1, y + 5), fill="#b28b55")
x, y = tiles["banner"]
# A diamond aiming emblem fills the 4 x 9 px banner patch.
draw.point((x + 2, y + 2), fill="#d8ae67")
draw.line((x + 1, y + 3, x + 3, y + 3), fill="#d8ae67")
draw.point((x, y + 4), fill="#d8ae67")
draw.point((x + 2, y + 4), fill="#e4bd77")
draw.line((x + 1, y + 5, x + 3, y + 5), fill="#d8ae67")
draw.point((x + 2, y + 6), fill="#d8ae67")

# A reviewed MedievalPack atlas is authored directly in Blockbench through MCP.
# Keep it when regenerating the geometry recipe instead of replacing its pixels.
if not (OUT / "texture_recipe.json").exists():
    atlas.save(OUT / "archery_workbench.png")
checker = Image.new("RGBA", atlas.size)
for cy in range(256):
    for cx in range(256):
        checker.putpixel((cx, cy), (230, 210, 150, 255) if (cx // 2 + cy // 2) % 2 == 0 else (70, 55, 90, 255))
checker.save(OUT / "uv_checker.png")

cubes = []


def cube(group, name, a, b, material, rotation=None, pivot=None, hide=(), face_material=None):
    item = {"group": group, "material": material, "element": {"name": name, "from": a, "to": b}}
    if material in ("amber", "flame"):
        item["element"]["light_emission"] = 15
    if rotation:
        item["element"]["rotation"] = rotation
        item["element"]["origin"] = pivot or [(a[i] + b[i]) / 2 for i in range(3)]
    dx, dy, dz = [b[i] - a[i] for i in range(3)]
    dims = {"north": (dx, dy), "south": (dx, dy), "east": (dz, dy), "west": (dz, dy), "up": (dx, dz), "down": (dx, dz)}
    faces = []
    for direction, (w, h) in dims.items():
        if direction in hide:
            continue
        mat = (face_material or {}).get(direction, material)
        if mat.startswith(("oak", "walnut", "honey")) and direction in ("up", "down"):
            mat = mat.replace("_v", "_h")
        u, v = tiles[mat]
        if mat.startswith(("oak", "walnut", "honey", "bow")) or mat == "leather":
            # Sample internal grain even on the narrow two-unit supports.
            u += min(2, 32 - w)
            v += min(2, 32 - h)
        faces.append({"face": direction, "uv": [u, v, u + w, v + h]})
    item["faces"] = faces
    cubes.append(item)


# Author around X -8..24, then align the delivery to X 0..32.
# Y 0..32, Z 0..16; north is the front.
g = "01_Estrutura_e_tampo"
cube(g, "base_inferior", [-7, 0.8, 1], [23, 2.3, 15.5], "walnut_h", hide=("down",))
cube(g, "rodape_frontal", [-7, 1, 0.7], [23, 2.4, 2], "oak_h")
cube(g, "fundo_gabinete", [-6, 2, 14.4], [22, 12.5, 15.4], "walnut_v")
for side, x in (("esquerda", -3.3), ("direita", 21.2)):
    width = 0.6 if side == "esquerda" else 1.5
    cube(g, "lateral_" + side, [x, 2, 1.5], [x + width, 12.6, 14.4], "walnut_v")
cube(g, "divisoria_gavetas", [3.6, 2.3, 2], [4.7, 12.5, 14.4], "walnut_v")
cube(g, "divisoria_direita", [16.8, 2.3, 2], [17.8, 12.5, 14.4], "walnut_v")
cube(g, "prateleira_inferior", [4.7, 5.5, 2.2], [21.2, 6.5, 14.4], "oak_h")
for i, (x0, x1) in enumerate(((-8, 0), (0, 8), (8, 16), (16, 24))):
    cube(g, f"tampo_prancha_{i + 1}", [x0, 12.6, 0], [x1, 14.3, 16], "honey_h")
cube(g, "friso_tampo_frente", [-8, 11.8, 0.4], [24, 12.8, 1.5], "oak_h")
cube(g, "friso_tampo_esquerdo", [-7.98, 11.8, 1.5], [-6.9, 12.8, 15], "oak_v")
cube(g, "friso_tampo_direito", [22.9, 11.8, 1.5], [23.98, 12.8, 15], "oak_v")
for x, side in ((-7.8, "E"), (21.8, "D")):
    for z, label in ((0.5, "frente"), (13.3, "tras")):
        cube(g, f"pe_{side}_{label}", [x, 0.5, z], [x + 2, 12.6, z + 2.2], "oak_v")
        cube(g, f"sapata_{side}_{label}", [x - 0.15, 0, z - 0.15], [x + 2.15, 1.8, z + 2.35], "iron")
        cube(g, f"cinta_{side}_{label}", [x - 0.12, 10.7, z - 0.12], [x + 2.12, 12.4, z + 2.32], "iron")

g = "02_Gavetas_e_armario"
for i, y in enumerate((2.5, 7.2)):
    cube(g, f"gaveta_{i + 1}_corpo", [-2.7, y, 1.7], [3.4, y + 4.2, 12.5], "walnut_h")
    cube(g, f"gaveta_{i + 1}_frente", [-2.8, y + 0.2, 1.1], [3.5, y + 4, 1.8], "oak_h")
    cube(g, f"gaveta_{i + 1}_rebaixo", [-2.2, y + 0.8, 0.98], [2.9, y + 3.4, 1.18], "honey_h")
    for x in (-1.4, 1.1):
        cube(g, f"gaveta_{i + 1}_suporte_{x}", [x, y + 1.5, 0.55], [x + 0.7, y + 2.5, 1.1], "iron_dark")
    cube(g, f"gaveta_{i + 1}_puxador", [-1.4, y + 1.6, 0.3], [1.8, y + 2.2, 0.65], "iron")

g = "03_Expositor_de_madeira"
for x, label in ((-6.8, "esquerdo"), (5.8, "central"), (19.5, "direito")):
    top = 31.4 if label == "esquerdo" else 32
    cube(g, "poste_" + label, [x, 14.3, 13], [x + 2, top, 15.5], "oak_v", face_material={"up": "endgrain"})
    cube(g, "colar_inferior_" + label, [x - 0.2, 14.3, 12.8], [x + 2.2, 15.7, 15.7], "iron")
    cube(g, "colar_superior_" + label, [x - 0.15, 28.4, 12.85], [x + 2.15, 29.8, 15.65], "iron")
cube(g, "travessa_superior", [-7.7, 29.2, 13.6], [21.7, 30.8, 15.2], "oak_h")
cube(g, "travessa_base", [-7.4, 15.1, 13.5], [22.4, 16.6, 15.3], "walnut_h")
cube(g, "painel_fundo_prateleiras", [7.8, 16.5, 14.3], [19.5, 29.2, 15.1], "walnut_v")
cube(g, "regua_suporte_arcos", [-4.8, 27.5, 12.3], [5.8, 28.6, 13.6], "walnut_h")
for x in (-3.8, -0.3, 3.2):
    cube(g, f"gancho_arco_{x}", [x, 26.7, 11.6], [x + 0.7, 28, 12.7], "iron_dark")
for x, label in ((-6, "E"), (19.7, "D")):
    cube(g, "escora_" + label, [x, 24.6, 12.5], [x + 0.7, 28, 13.2], "honey_v", [0, 0, -45], [x + 0.35, 26.3, 12.85])


def hanging_bow(center, mat, index):
    g = f"04_Arco_suspenso_{index}"
    z = 11.8
    # Six rigid cuboids form a clean continuous recurve silhouette.
    cube(g, "empunhadura", [center + 0.2, 21, z - 0.45], [center + 0.85, 23.4, z + 0.45], "leather")
    for name, a, b, angle in (
        ("lamina_superior", [center + 0.12, 23.2, z - 0.38], [center + 0.8, 25.5, z + 0.38], 22.5),
        ("ponta_superior", [center - 0.68, 25.27, z - 0.38], [center, 27.25, z + 0.38], 22.5),
        ("lamina_inferior", [center + 0.12, 18.9, z - 0.38], [center + 0.8, 21.2, z + 0.38], -22.5),
        ("ponta_inferior", [center - 0.68, 17.15, z - 0.38], [center, 19.13, z + 0.38], -22.5),
    ):
        cube(g, name, a, b, mat, [0, 0, angle])
    cube(g, "corda", [center - 1.08, 17.25, z - 0.12], [center - 0.88, 27.2, z + 0.12], "linen")
    for y in (19.1, 24.9):
        cube(g, "amarra_" + str(y), [center - 0.12, y, z - 0.49], [center + 0.91, y + 0.6, z + 0.49], "linen")


for i, (x, mat) in enumerate(((-3.1, "bow_dark"), (0.25, "bow_light"), (3.4, "leather")), 1):
    hanging_bow(x, mat, i)

g = "05_Prateleiras_e_suprimentos"
for name, y, z in (("alta", 25.2, 9.3), ("meio", 20.3, 9.3), ("baixa", 16.8, 9.3)):
    cube(g, "prateleira_" + name, [8.1, y, z], [17.2, y + 0.8, 14.5], "honey_h")
    for x in (8.4, 15.8):
        cube(g, f"mao_francesa_{name}_{x}", [x, y - 1.1, 12.9], [x + 0.6, y, 13.5], "walnut_v")


def bottle(group, name, x, y, z, mat, height=2.6):
    cube(group, name + "_corpo", [x, y, z], [x + 1.9, y + height, z + 1.8], mat)
    cube(group, name + "_gargalo", [x + 0.45, y + height, z + 0.45], [x + 1.45, y + height + 0.4, z + 1.35], mat)
    cube(group, name + "_rolha", [x + 0.42, y + height + 0.35, z + 0.42], [x + 1.48, y + height + 0.8, z + 1.38], "endgrain")
    cube(group, name + "_rotulo", [x + 0.5, y + 0.5, z - 0.045], [x + 1.4, y + height - 0.3, z + 0.025], "bottle_label", hide=("south",))


for x, mat in ((8.6, "brown"), (11.65, "green"), (14.7, "blue")):
    bottle(g, "frasco_alto_" + mat, x, 26, 10.8, mat, 2.1)
cube(g, "bobina_linho", [9.3, 21.4, 10.8], [15.7, 23.4, 13.2], "linen")
for x in (9, 15.6):
    cube(g, "bobina_tampa_" + str(x), [x, 21.05, 10.55], [x + 0.5, 23.75, 13.45], "endgrain")
cube(g, "bobina_cinta", [12.4, 21.25, 10.65], [13.15, 23.55, 13.35], "leather")
for x, y, width in ((8.6, 17.6, 3.4), (12.4, 17.6, 3.7), (11.2, 18.7, 3.8)):
    cube(g, f"pacote_{x}_{y}", [x, y, 11], [x + width, y + 1, 13.6], "leather")
    cube(g, f"pacote_amarra_{x}_{y}", [x + 1.5, y - 0.03, 10.95], [x + 2, y + 1.04, 13.65], "linen")
for x in (17.5, 18.65):
    cube(g, f"ferramenta_pendurada_{x}", [x, 18.6, 11.9], [x + 0.3, 23.2, 12.2], "steel_tool")
    cube(g, f"cabo_ferramenta_{x}", [x - 0.1, 21.9, 11.75], [x + 0.4, 23.6, 12.35], "oak_v")


def arrow(group, name, x, y, z, height=5.5, angle=0):
    pivot = [x, y, z]
    cube(group, name + "_haste", [x - 0.14, y, z - 0.14], [x + 0.14, y + height, z + 0.14], "honey_v", [0, 0, angle], pivot)
    cube(group, name + "_pena", [x - 0.48, y + height - 1.2, z - 0.12], [x + 0.48, y + height, z + 0.12], "linen", [0, 0, angle], pivot)
    cube(group, name + "_pena_cruzada", [x - 0.12, y + height - 1.2, z - 0.48], [x + 0.12, y + height, z + 0.48], "linen", [0, 0, angle], pivot)


def arrow_box(group, name, a, b, count, height, start_y=None):
    x0, y0, z0 = a
    x1, y1, z1 = b
    cube(group, name + "_fundo", [x0, y0, z0], [x1, y0 + 0.7, z1], "walnut_h", hide=("north", "south", "east", "west", "down"))
    cap_hide = ("east", "west") if name.startswith("caixa") else ()
    cube(group, name + "_frente", [x0, y0, z0], [x1, y1, z0 + 0.55], "walnut_v", hide=cap_hide)
    cube(group, name + "_tras", [x0, y0, z1 - 0.55], [x1, y1, z1], "walnut_v", hide=cap_hide)
    if not name.startswith("caixa"):
        cube(group, name + "_lado_E", [x0, y0, z0 + 0.55], [x0 + 0.55, y1, z1 - 0.55], "oak_v")
        cube(group, name + "_lado_D", [x1 - 0.55, y0, z0 + 0.55], [x1, y1, z1 - 0.55], "oak_v")
    cube(group, name + "_borda", [x0 - 0.08, y1 - 0.6, z0 - 0.07], [x1 + 0.08, y1 + 0.08, z0 + 0.65], "honey_h")
    cube(group, name + "_cinta", [x0 - 0.04, y0 + 0.75, z0 - 0.05], [x1 + 0.04, y0 + 1.25, z0 + 0.08], "iron_dark")
    for i in range(count):
        x = x0 + 0.9 + (x1 - x0 - 1.8) * (i % 3) / 2 + (i // 3) * 0.12
        z = z0 + 1.2 + (i // 3) * 0.8
        arrow(group, f"{name}_flecha_{i + 1}", x, start_y or (y1 - 1.2), z, height - 0.35 * (i % 2))


g = "06_Flechas_e_estandarte_alto"
arrow_box(g, "aljava_alta", [16.8, 24.6, 9.6], [20.2, 26.8, 13.3], 6, 5.5, 26.2)
cube(g, "estandarte_alto", [16.9, 18.8, 9.3], [20.1, 26.7, 9.6], "red", face_material={"north": "banner"})
for x, end_y in ((16.9, 18), (18, 18.4), (19.1, 18.15)):
    cube(g, "franja_alta_" + str(x), [x, end_y, 9.3], [x + 0.85, 19, 9.6], "red")
g = "07_Porta_flechas_lateral"
arrow_box(g, "caixa_lateral", [-7.6, 1.9, 3.3], [-3.2, 5.9, 7.7], 6, 5.1)
for x in (-7.6, -3.8):
    cube(g, "canto_caixa_" + str(x), [x, 1.7, 3.2], [x + 0.58, 6.2, 7.8], "oak_v")
arrow_box(g, "caixa_traseira", [-7.6, 1.9, 8], [-3.2, 6.6, 12.4], 6, 5.2)
for x in (-7.6, -3.8):
    cube(g, "canto_caixa_traseira_" + str(x), [x, 1.7, 7.9], [x + 0.58, 6.9, 12.5], "oak_v")

g = "08_Lanterna"
cube(g, "braco_lanterna", [20.6, 27.7, 9.7], [23.4, 28.5, 10.5], "honey_h")
cube(g, "suporte_profundo_lanterna", [20.6, 27.7, 10.5], [21.4, 28.5, 14.3], "honey_h")
cube(g, "gancho_lanterna", [22.2, 25.1, 12.45], [22.55, 27.9, 12.8], "iron_dark")
cube(g, "lanterna_base", [21, 19.6, 10.9], [23.9, 20.35, 13.9], "iron_dark")
cube(g, "lanterna_vidro", [21.35, 20.35, 11.25], [23.55, 23.8, 13.55], "amber")
cube(g, "lanterna_tampa", [20.95, 23.8, 10.85], [23.95, 24.4, 13.95], "iron")
cube(g, "lanterna_topo", [21.5, 24.4, 11.4], [23.4, 24.9, 13.4], "iron_dark")
for x in (21.1, 23.45):
    for z in (11.05, 13.5):
        cube(g, f"lanterna_montante_{x}_{z}", [x, 20.2, z], [x + 0.25, 23.9, z + 0.25], "iron_dark")

g = "09_Bancada_de_montagem"
cube(g, "trilho_gabarito", [-4.2, 14.3, 8], [15.5, 15.15, 9.5], "oak_h")
for x, label in ((-3.5, "E"), (13.4, "D")):
    cube(g, "morsa_base_" + label, [x - 0.6, 14.3, 7.5], [x + 1.9, 15.1, 10.1], "iron")
    cube(g, "morsa_" + label, [x, 15.1, 8.1], [x + 1.25, 18.1, 9.5], "iron_dark")
    cube(g, "morsa_mordente_" + label, [x - 0.3, 17.6, 7.9], [x + 1.5, 18.3, 9.6], "iron")
cube(g, "arco_montagem_empunhadura", [4.5, 15.65, 7.7], [7.3, 16.4, 8.5], "leather")
for name, a, b, ang in (
    ("arco_montagem_E1", [0.2, 16.25, 7.75], [4.8, 16.85, 8.45], -22.5),
    ("arco_montagem_E2", [-3.2, 17.4, 7.75], [0.8, 18, 8.45], -22.5),
    ("arco_montagem_D1", [7, 16.25, 7.75], [11.6, 16.85, 8.45], 22.5),
    ("arco_montagem_D2", [11, 17.4, 7.75], [15, 18, 8.45], 22.5),
):
    cube(g, name, a, b, "bow_dark", [0, 0, ang])
cube(g, "corda_arco_em_montagem", [-3.3, 18.35, 8], [15.1, 18.55, 8.2], "linen")
for x in (-0.5, 10.2):
    cube(g, "amarra_arco_montagem_" + str(x), [x, 16.7, 7.65], [x + 0.8, 17.5, 8.6], "linen")

g = "10_Pergaminho_e_ferramentas"
cube(g, "pergaminho_projeto", [0, 14.34, 1.5], [10, 14.52, 7.5], "paper", face_material={"up": "parchment_plan"})
for z in (1.2, 7.35):
    cube(g, "borda_enrolada_" + str(z), [0, 14.36, z], [10, 14.8, z + 0.45], "paper")
cube(g, "faca_cabo", [-5, 14.35, 2.3], [-2.6, 14.85, 3], "leather", [0, 22.5, 0])
cube(g, "faca_lamina", [-3.2, 14.36, 2.5], [-0.6, 14.66, 3.2], "steel_tool", [0, 22.5, 0])
cube(g, "alicate_E", [-3.7, 14.35, 4.7], [-1.1, 14.7, 5.25], "iron_dark", [0, 22.5, 0])
cube(g, "alicate_D", [-3.7, 14.35, 5.2], [-1.1, 14.7, 5.75], "iron_dark", [0, -22.5, 0])
cube(g, "martelo_cabo", [10.7, 14.35, 3.2], [13.1, 14.85, 3.8], "oak_h", [0, -22.5, 0])
cube(g, "martelo_cabeca", [12.45, 14.35, 2.7], [13.3, 15.1, 4.6], "iron")
for x, z in ((11.6, 5.9), (12.8, 6.5)):
    cube(g, "peca_madeira_" + str(x), [x, 14.32, z], [x + 0.7, 14.7, z + 0.55], "honey_h")

g = "11_Tecido_e_vela"
cube(g, "tecido_sobre_tampo", [13.5, 14.31, 0.6], [17.5, 14.47, 6.8], "red")
cube(g, "tecido_frente", [13.5, 5.8, 0.47], [17.5, 14.45, 0.7], "red", face_material={"north": "banner"})
for x, bottom in ((13.5, 5.1), (14.6, 5.55), (15.7, 4.9), (16.8, 5.35)):
    cube(g, "franja_frontal_" + str(x), [x, bottom, 0.47], [x + 0.7, 5.95, 0.7], "red")
cube(g, "castical_base", [17.4, 14.3, 8], [20, 14.8, 10.4], "linen")
cube(g, "vela", [17.95, 14.8, 8.55], [19.45, 17.6, 9.95], "wax")
cube(g, "pavio", [18.55, 17.6, 9.1], [18.8, 18, 9.4], "black")
cube(g, "chama", [18.35, 17.85, 8.95], [18.95, 18.85, 9.55], "flame")
cube(g, "cera_escorrida", [19.25, 16.1, 8.6], [19.6, 17.5, 9.1], "wax")


def book(group, name, x, y, z, w, d, mat):
    cube(group, name + "_paginas", [x + 0.15, y + 0.25, z + 0.15], [x + w - 0.15, y + 1.25, z + d - 0.15], "pages")
    for cy in (y, y + 1.25):
        cube(group, name + "_capa_" + str(cy), [x, cy, z], [x + w, cy + 0.25, z + d], mat)
    cube(group, name + "_lombada", [x, y + 0.25, z], [x + 0.3, y + 1.25, z + d], mat)
    cube(group, name + "_fecho", [x + w * 0.58, y - 0.015, z - 0.035], [x + w * 0.58 + 0.6, y + 1.52, z + 0.3], "gold")


g = "12_Livros_e_tinteiro"
book(g, "livro_azul", 19, 14.35, 1.5, 4.5, 4.8, "blue")
book(g, "livro_roxo", 18.65, 15.85, 1.8, 4.5, 4.5, "purple")
book(g, "livro_verde", 20.2, 14.35, 6.4, 3.5, 3.5, "moss")
cube(g, "tinteiro_base", [16, 14.35, 4.5], [18.3, 15.15, 6.6], "iron_dark")
cube(g, "tinteiro_boca", [16.4, 15.15, 4.9], [17.9, 15.65, 6.2], "black")
arrow(g, "flecha_tinteiro_1", 16.7, 15.4, 5.45, 4.2, -22.5)
arrow(g, "flecha_tinteiro_2", 17.2, 15.4, 5.8, 4.6, 22.5)
g = "13_Objetos_armario_aberto"
for x, mat in ((6.1, "brown"), (9.2, "green"), (12.3, "blue")):
    bottle(g, "frasco_baixo_" + mat, x, 6.5, 3.3, mat, 2.2)
book(g, "livro_armario_1", 6, 2.4, 3, 5, 5, "leather")
book(g, "livro_armario_2", 8.3, 3.9, 4.5, 5, 5, "leather")
cube(g, "lingotes_base", [18.6, 6.4, 3.1], [20.8, 7.5, 6.5], "iron")
cube(g, "lingote_topo", [18.9, 7.5, 3.5], [20.6, 8.6, 6.2], "iron_light")

for c in cubes:
    if c["element"]["name"] in ("castical_base", "vela", "pavio", "chama", "cera_escorrida"):
        for key in ("from", "to"):
            c["element"][key][0] -= 2.6
            c["element"][key][2] += 1
    if c["group"] == "08_Lanterna" and c["element"]["name"] not in ("braco_lanterna", "suporte_profundo_lanterna"):
        for key in ("from", "to"):
            c["element"][key][2] -= 3

for c in cubes:
    e = c["element"]
    x0, x1 = e["from"][0], e["to"][0]
    e["from"][0], e["to"][0] = 24 - x1, 24 - x0
    if "origin" in e:
        e["origin"][0] = 24 - e["origin"][0]
    if "rotation" in e:
        e["rotation"][1] *= -1
        e["rotation"][2] *= -1
recipe = {"name": "archery_workbench", "bounds": [[0, 0, 0], [32, 32, 16]], "density": 1, "texture": str(OUT / "archery_workbench.png"), "tiles": tiles, "cubes": cubes}
(OUT / "mcp_recipe.json").write_text(json.dumps(recipe, indent=2), encoding="utf-8")
print(json.dumps({"cubes": len(cubes), "faces": sum(len(c["faces"]) for c in cubes), "texture": str(OUT / "archery_workbench.png")}))
