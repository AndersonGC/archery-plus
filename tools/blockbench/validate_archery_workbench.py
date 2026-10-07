"""Validate the files actually exported by Blockbench, including rotated bounds."""
from pathlib import Path
import base64
import io
import itertools
import json
import math
from PIL import Image, ImageChops

OUT = Path(__file__).resolve().parents[2] / "docs/models/archery_workbench"
source = json.loads((OUT / "archery_workbench.bbmodel").read_text(encoding="utf-8"))
model = json.loads((OUT / "archery_workbench.json").read_text(encoding="utf-8"))
recipe = json.loads((OUT / "mcp_recipe.json").read_text(encoding="utf-8"))
assert source["meta"]["model_format"] == "java_block"
assert source["java_block_version"] == "1.21.11"
assert len(source["textures"]) == 1
assert len(model["elements"]) == len(source["elements"]) == len(recipe["cubes"])
assert model["textures"] == {"0": "archery_plus:block/archery_workbench"}
texture = Image.open(OUT / "archery_workbench.png").convert("RGBA")
embedded = Image.open(io.BytesIO(base64.b64decode(source["textures"][0]["source"].split(",", 1)[1]))).convert("RGBA")
assert texture.size == embedded.size == (256, 256)
assert ImageChops.difference(texture, embedded).getbbox(alpha_only=False) is None
assert texture.getchannel("A").getextrema() == (255, 255)
support = next(e for e in source["elements"] if e["name"] == "pe_E_frente")
drawer_fronts = [e for e in source["elements"] if e["name"].startswith("gaveta_") and e["name"].endswith("_frente")]
assert len(drawer_fronts) == 2
for drawer in drawer_fronts:
    assert support["from"][0] >= drawer["to"][0] + 0.05

# Four full-width legs must remain at the tabletop's four corners.
legs = [e for e in source["elements"] if e["name"].startswith("pe_")]
assert len(legs) == 4
expected_corners = {"E_frente": (29.8, 0.5), "E_tras": (29.8, 13.3),
                    "D_frente": (0.2, 0.5), "D_tras": (0.2, 13.3)}
for leg in legs:
    x, z = expected_corners[leg["name"][3:]]
    assert all(math.isclose(leg["from"][i], n, abs_tol=1e-6)
               for i, n in enumerate((x, 0.5, z)))
    assert all(math.isclose(leg["to"][i], n, abs_tol=1e-6)
               for i, n in enumerate((x + 2, 12.6, z + 2.2)))
    assert leg.get("visibility", True)
front_foot = next(e for e in source["elements"] if e["name"] == "sapata_E_frente")
holder = [e for e in source["elements"] if e["name"].startswith("caixa_lateral_")
          or (e["name"].startswith("canto_caixa_") and not e["name"].startswith("canto_caixa_traseira_"))]
assert len(holder) == 25
holder_front = min(e["from"][2] for e in holder)
holder_back = max(e["to"][2] for e in holder)
assert holder_front >= front_foot["to"][2] + 0.3
assert holder_back <= 7.8 + 1e-6
recipe_by_name = {c["element"]["name"]: c["element"] for c in recipe["cubes"]}
front_collar = next(e for e in source["elements"] if e["name"] == "cinta_E_frente")
for element in legs + holder + [front_foot, front_collar]:
    for key in ("from", "to"):
        assert all(math.isclose(n, m, abs_tol=1e-6) for n, m in
                   zip(element[key], recipe_by_name[element["name"]][key]))

points = []
faces = 0
mapped = 0
maximum_uv_error = 0
for element in model["elements"]:
    a, b = element["from"], element["to"]
    assert all(0 <= a[i] < b[i] <= (32, 32, 16)[i] for i in range(3)), element
    rotation = element.get("rotation")
    for vertex in itertools.product(*zip(a, b)):
        point = list(vertex)
        if rotation:
            assert rotation["angle"] in (-45, -22.5, 0, 22.5, 45)
            assert not rotation.get("rescale", False)
            axis = "xyz".index(rotation["axis"])
            angle = math.radians(rotation["angle"])
            origin = rotation["origin"]
            p = [point[i] - origin[i] for i in range(3)]
            u, v = ((1, 2), (2, 0), (0, 1))[axis]
            p[u], p[v] = p[u] * math.cos(angle) - p[v] * math.sin(angle), p[u] * math.sin(angle) + p[v] * math.cos(angle)
            point = [p[i] + origin[i] for i in range(3)]
        assert all(-1e-6 <= point[i] <= (32, 32, 16)[i] + 1e-6 for i in range(3)), (element.get("name"), point)
        points.append(point)
    d = [b[i] - a[i] for i in range(3)]
    face_dimensions = {"north": (d[0], d[1]), "south": (d[0], d[1]), "east": (d[2], d[1]), "west": (d[2], d[1]), "up": (d[0], d[2]), "down": (d[0], d[2])}
    for name, face in element["faces"].items():
        assert face["texture"] == "#0", face
        uv = face["uv"]
        assert all(0 <= c <= 16 for c in uv), uv
        w, h = face_dimensions[name]
        pixels = (abs(uv[2] - uv[0]) * 16, abs(uv[3] - uv[1]) * 16)
        # The Java codec rounds normalized UV coordinates to five decimals.
        # Two rounded endpoints can differ by at most 0.00016 sampled pixels.
        maximum_uv_error = max(maximum_uv_error, abs(pixels[0] - w), abs(pixels[1] - h))
        assert math.isclose(pixels[0], w, abs_tol=0.0002), (name, pixels, (w, h))
        assert math.isclose(pixels[1], h, abs_tol=0.0002), (name, pixels, (w, h))
        faces += 1
        mapped += 1

minimum = [min(p[i] for p in points) for i in range(3)]
maximum = [max(p[i] for p in points) for i in range(3)]
assert minimum == [0, 0, 0]
assert maximum == [32, 32, 16]
report = {"passed": True, "cubes": len(model["elements"]), "groups": len(source["groups"]), "faces": faces, "triangles_equivalent": faces * 2, "bounds_model_units": [minimum, maximum], "size_in_blocks": [2, 2, 1], "texture_size": [256, 256], "texture_count": 1, "alpha": "opaque", "pixels_per_model_unit": [1, 1], "uv_faces_checked": mapped, "maximum_export_uv_rounding_error_pixels": maximum_uv_error, "embedded_texture_matches_png": True, "rotations_compatible_with_java_26_1_2": True, "minecraft_runtime_tested": False}
report["four_full_width_legs_at_corners"] = True
report["drawer_fronts_clear_of_corner_support"] = True
report["drawer_support_bounds"] = [support["from"], support["to"]]
report["arrow_holder_depth_bounds"] = [holder_front, holder_back]
report["arrow_holder_clear_of_corner_foot"] = True
report["texture_reference_style"] = "MedievalPack_v.1.0.0_Final"
(OUT / "validation.json").write_text(json.dumps(report, indent=2) + "\n", encoding="utf-8")
print(json.dumps(report))
