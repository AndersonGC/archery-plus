# Arte dos itens e interface

Os PNGs finais ficam em `src/main/resources/assets/archery_plus/textures`.
São recursos editáveis e entram diretamente no JAR. O Gradle gera apenas os
modelos JSON, definições de itens, receitas e estrutura de teste; não redesenha
nem substitui as texturas durante o build.

Para reproduzir a arte e a prancha de inspeção, com Python 3.10+ e Pillow:

```powershell
python tools/textures/redraw.py
```

A receita desenha coordenadas inteiras na resolução final, com alpha 0/255.
Não há antialiasing, redução de arte grande, dithering ou ruído aleatório.
Ampliações de inspeção usam somente NEAREST. Saída de revisão em
`build/texture-redesign`: prancha `items.png`, paleta e mapas semânticos dos
materiais separados dos recursos distribuídos.

## Referências e paleta

Guia seguido: `.agents/skills/minecraft-weapon-textures/SKILL.md`, incluindo
`references/style-guide.md` e `references/review-checklist.md`.
As formas foram redesenhadas; as cores foram medidas nos arquivos locais:

| Elemento | Procedência visual / das cores |
| --- | --- |
| Recurvo | `docs/inspirations/composite_longbow.png`: madeira escura, pontas recurvadas e empunhadura clara |
| Madeira | `composite_longbow.png` e `iron_spear.png` |
| Corpo de couro | `small_quiver.png`, rampa `#1C1616` até `#6E4738` |
| Alça, boca e ponteira das aljavas | Composição de `large_quiver.png`, substituindo a superfície verde por couro |
| Ferro | Cinzas de `large_quiver.png` |
| Ouro / diamante / netherita | `golden_spear.png`, `diamond_spear.png`, `netherite_spear.png` |
| Corda / penas | Rampas documentadas pela skill: `composite_longbow`, `heavy_crossbow_arrow`, `unique_longbow_1`, `small_quiver_filled` |
| Interface | Paleta própria de pergaminho, couro e latão, coordenada com os itens |

## Silhuetas e animação

- Os dois arcos e as cinco aljavas têm canvas nativo 32×32. O arco normal é o vanilla.
- Recurvo em repouso: bbox 26×26; arco longo: 29×29. O arco longo excede
  deliberadamente o objetivo básico 18–26 da skill para atender ao tamanho
  solicitado, além da escala maior do modelo na mão.
- Na seção y=19 de ambos, o membro mede 5 pixels horizontais e a corda 1 pixel.
  Essa é a extensão horizontal, não a espessura perpendicular da diagonal.
- A orientação da corda em repouso é −45°, compatível com o modelo vanilla.
- Empunhadura fixa em (12,12) nos quatro estados; nock em (16,16), (20,20),
  (24,24). A flecha desliza ao longo de 45° e pode ocultar parte da empunhadura.
- Couro: costura e aba; ferro: travessa e rebites; ouro: fecho gravado e borda
  fina; diamante: encaixe facetado e cantos; netherita: placas e reforço cruzado.
- Atlas das costas: 64×64, com ilhas UV desenhadas para as faces do modelo
  `models/entity/quiver.bbmodel`. O projeto nativo inclui as cinco texturas.
- Roda: setores 256×256, centro 128×128. Painel da aljava: 176×148.

## Validação

Execute o validador da skill nos PNGs de `build/texture-redesign/measured/item`,
passando `--palette build/texture-redesign/palette.json`. Nos atlas, use
`--size 64 --profile uv`. Os mapas `.materials.json` permitem verificar as
cores por material e medir a corda separadamente dos membros.

```powershell
$env:PYTHONIOENCODING='utf-8'
$items = Get-ChildItem build/texture-redesign/measured/item/*.png | ForEach-Object FullName
python .agents/skills/minecraft-weapon-textures/scripts/texture_lab.py validate @items --palette build/texture-redesign/palette.json --report build/texture-redesign/items-validation.json
```

O validador não substitui a revisão artística: confira os ícones em 1× sobre
fundos claro/escuro, os três estados de tensão, os modelos no Blockbench e a
interface no cliente Minecraft. Para atualizar o atlas, reimporte também as
cinco texturas no `.bbmodel`; o script não modifica projetos do Blockbench.
