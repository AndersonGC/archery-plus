---
name: minecraft-weapon-textures
description: Crie, edite e revise texturas pixel art de armas e itens Minecraft para o projeto archery-plus, incluindo arcos, flechas, bestas, materiais e estados de disparo. Use sempre em pedidos de texturas de armas/itens para archery-plus ou suas referências em docs/inspirations.
---

# Minecraft weapon textures — archery-plus

Leia [o guia de estilo](references/style-guide.md) antes de desenhar. Ele distingue medidas das referências de decisões para novas texturas. Busque pelo nome do arquivo em [a análise individual](references/individual-analysis.md) quando precisar escolher uma família específica. [source-metrics.json](references/source-metrics.json) contém todas as cores e contagens exatas; use o comando `source` para extrair somente a entrada desejada, pois o catálogo inclui uma captura com 44.073 cores.

## Fluxo

- Identifique o destino: ícone 16×16/32×32, atlas UV, ou máscara emissiva. Preserve o canvas e a orientação de uma textura existente. Para um ícone novo sem tamanho solicitado, use 32×32 nativo e a família básica.
- Use as rampas reais em [palette.json](references/palette.json). A paleta básica não representa todas as armas únicas; para uma variante unique, extraia a paleta do PNG correspondente. Madeira, couro e corda são identificações visuais, não metadados do arquivo.
- Desenhe pixels inteiros, transparência 0/255, contornos selecionados de 1 px e luz preferencial no alto/esquerda. Use PIL/ImageDraw para criação procedural quando adequado. Não use suavização nem reduza um desenho grande para simular pixel art.
- Para arco/besta animados, mantenha o encaixe da empunhadura e a rampa de materiais entre standby, pulling_0/1/2 e arrow/firework. Meça separadamente corda, membros e projétil. Não invente estados ou nomes de integração sem inspecionar o projeto.
- Execute o validador, inspecione a 1× e uma ampliação NEAREST em fundos claro e escuro, e aplique [o checklist](references/review-checklist.md). Validação técnica não prova qualidade artística; ângulo PCA não identifica automaticamente o cano de uma besta ou a corda de um arco.
- Entregue PNGs transparentes no tamanho real, uma prancha ampliada e as medidas. Não integre exemplos ao resource pack sem que a tarefa inclua essa integração.

## Script PIL

Requer Python 3.10+ e Pillow. Resolva o diretório desta skill e invoque o script; evite depender de um caminho absoluto de uma máquina específica.

```text
python scripts/texture_lab.py generate --out <pasta> --kind all
python scripts/texture_lab.py validate <pasta>/bow.png <pasta>/arrow.png <pasta>/crossbow.png --report <pasta>/validation.json
python scripts/texture_lab.py preview --input <pasta> --out <pasta>/preview.png
python scripts/texture_lab.py analyze <pasta-referencias> --out <pasta>/source-metrics.json
python scripts/texture_lab.py source --name composite_longbow.png
```

O gerador fornece exemplos originais em 32×32 e mapas de materiais `.materials.json`. Edite as receitas para desenhos novos; os três exemplos não são uma biblioteca universal de armas. `--palette` permite outra paleta JSON com a mesma estrutura. Valide outros tamanhos com `--size 16` ou `--size 64`; use `--profile unique`, `uv` ou `emissive` quando necessário. Mantenha o padrão `basic` para os exemplos básicos. O comando `analyze` extrai pixels sem inferir materiais automaticamente.
