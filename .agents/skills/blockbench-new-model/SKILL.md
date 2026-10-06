---
name: blockbench-new-model
description: "Create a new Blockbench model or scene for Blender rendering, with intake, MCP modeling, textures, animation, and a render launcher. Use for a render-ready Blender scene or video workflow."
---

# Blockbench New Model

Build a new subject end to end: headless `.bbmodel` authoring, a Blender scene ready to render, and a `render.cmd` that renders PNG stills on every GPU and encodes them with FFmpeg.

Load [blockbench-use](../blockbench-use/SKILL.md) before the first model edit and follow its routing to the domain skills. The form answers settle its appearance-versus-performance question; do not ask it again.

## 1. Intake form

Reuse details already supplied by the user. In Codex, use `request_user_input_async` for missing preferences when available; otherwise ask a concise numbered list in chat. Respect the tool's question and option limits, splitting the intake across calls when needed. Ask only unanswered questions and follow the client's option-order conventions.

**Round 1: what to build.** Ask all four questions in one call.

| Header | Question | Options (label: description) |
|---|---|---|
| Quality | What quality level? | **High-quality**: detailed silhouette, smooth rounded parts, detail in textures · **Low-poly**: faceted, bold shapes, flat color regions |
| Textures | Which texture style? | **PBR textured**: albedo + normal + MER, resolution asked next · **Vanilla Minecraft**: Minecraft's own 16× textures · **Classic Blockbench**: hand-painted pixel art, no PBR |
| Animation | How should it move? | **Animated**: keyframed clips · **Havok physics**: physics-based motion baked with the Havok plugin in Blockbench desktop |
| Scene | What kind of scene? | **Simple 3D scene**: subject with a few context props · **Complete 3D scene**: full environment with foreground to background · **Simple 3D vignette**: subject on a small diorama base · **3D isometric room**: cutaway room seen from an isometric camera |

**Round 2: details.** Ask only the questions that apply, in one call.

| Header | When | Question | Options |
|---|---|---|---|
| Subject | No argument was given | What is the subject? | Two or three example subjects suited to the round 1 answers; the user types their own through Other |
| Resolution | Textures = PBR | Which PBR resolution? | **2K PBR**: 2048² maps, ~32 px per unit · **HD PBR**: 512–1024² maps, 128–256 px per block · **PBR (standard)**: 16×–32× pixel art with PBR channels |
| Output | Always | Where should the project folder go? | A parent folder the user chose before, if you know one · **Current directory**: `./<slug>/` · anything else through Other |
| Render | Always | Which render preset? | **1080p**: 1920×1080, 30 fps, 10 s · **4K UHD**: 3840×2160, 30 fps, 10 s · **Square loop**: 1080×1080, 30 fps, 6 s seamless loop · **Quick preview**: 1280×720, 24 fps, 5 s |

Text after the skill mention (`$blockbench-new-model a lighthouse on a sea stack`) is the subject. This is a skill mention, not a custom slash command. Derive `<slug>` from it (lowercase, hyphens, ≤ 40 characters). Create `<output>/<slug>/`; if it already holds a project, use an available numbered slug and report it.

Echo the full brief back in one sentence ("A high-quality, 2K PBR textured, animated simple 3D vignette of a lighthouse on a sea stack, 1080p 30 fps 10 s, in …") and continue without waiting for confirmation.

## 2. Preflight

Check everything the answers need before modeling; report all gaps at once.

- **Headless server**: discover `bbmodel_*` tools. If absent, see [setup](references/headless-build.md#setup). A connected desktop Blockbench MCP can build assets with its dedicated tools and export `.bbmodel`; inspect and preserve the user's current project first. Report missing headless validation/render features. If neither backend is available, prepare the brief and setup instructions without claiming a model was created.
- **Preview renders**: `bbmodel_render` needs Node 23.6+ with npm and a GPU; its packages install on first use ([rendering](references/headless-build.md#rendering)). Warn the user about the one-time install, and about `$BB_RENDER_HOME` if C: is short on space.
- **Blender, FFmpeg, GPUs**: locate and probe them as in [find the tools](references/blender-handoff.md#find-the-tools).
- **Havok physics**: Blockbench desktop with the MCP plugin and the Havok Physics Animations plugin (`havok_*` tools after `blockbench_launch`). If unavailable, ask whether to switch to keyframed animation.
- **AI textures (PBR)**: `FAL_KEY` for generated albedo. If missing, note it and paint procedurally.
- **glTF route**: when Blender has no `.bbmodel` importer, Blockbench desktop is needed for glTF export.

## 3. Plan

Write `plan.md` in the project folder: the brief, each answer translated with [option specs](references/option-specs.md) (geometry budget, texel density, texture size, filtering, channels, scene contents, camera and lights, frame range), the part list with real-world sizes, the animation beats per second of the render, and the shot list. Keep it current; subagents read it.

## 4. Build the models

Follow [headless build](references/headless-build.md): layout, build order, verification after each pass, and optional parallel subagents for independent assets when supported. Shared desktop editor state must be edited sequentially. Textures and animation follow the rows in [option specs](references/option-specs.md) for the chosen answers. Share returned `web_app` links when available.

Gate before Blender: every asset validates, its contact sheet and a posed render look right, and the plan's budgets hold. Havok scenes are baked and saved first.

## 5. Build the Blender scene

Follow [Blender handoff](references/blender-handoff.md): import, run the fix pass, assemble, light and stage cameras for the scene type, apply the render preset, and save `blender/<slug>.blend` from scripts kept in `blender/scripts/`.

## 6. Render deliverable

Create the render worker and launcher in `render/` using the contract in [Blender handoff](references/blender-handoff.md#deliverable). This collection does not ship ready-made render templates. Verify the generated scripts and their preview output before reporting them as ready. Render the verification stills, look at them, fix what they show, and time one full-quality frame. Do not start the full render unless the user asks.

## 7. Report

Reply with:

- the project folder, the `.blend`, `render/render.cmd` and the video path it will write;
- the verification stills (send or link them);
- the `web_app` links of the final models;
- GPUs found, seconds per frame, frame count and estimated total render time;
- what was substituted or skipped (no `FAL_KEY`, no Havok, glTF route) and anything unverified.
