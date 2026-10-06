# Tutorial breve: Blockbench no Codex

## O que são estas skills?

São 15 conjuntos de instruções: o Codex lê nome e descrição para escolher uma skill e carrega o `SKILL.md` e suas referências quando precisa. Os scripts ajudam com imagens e conversões; quem controla o editor é o MCP do Blockbench. Instalar as skills não instala o MCP, Blender nem os demais programas.

## Instalação no Windows

Na pasta desta coleção, execute:

```powershell
.\scripts\install_codex.ps1
```

O instalador cria junctions em `.agents\skills` nesta pasta. Abra este projeto/pasta no Codex para descobri-las. As alterações nos arquivos originais ficam disponíveis pelos links. Se a lista não atualizar, reinicie o Codex. O script pode ser executado novamente e não substitui skills existentes.

Para usar em outros projetos, escolha **um** destino pessoal reconhecido pela sua versão:

```powershell
# Local pessoal documentado atualmente:
.\scripts\install_codex.ps1 -Target "$env:USERPROFILE\.agents\skills"
# Alternativa para ambientes que usam o catálogo ~/.codex/skills:
.\scripts\install_codex.ps1 -Target "$env:USERPROFILE\.codex\skills"
```

Não instale nos dois locais: isso pode duplicar os nomes no seletor. Use `-Copy` para distribuir cópias independentes; nesse caso, mudanças futuras na origem não são sincronizadas. `-WhatIf` mostra a operação sem instalar.

## Conexão MCP

Para controlar o Blockbench aberto, deixe o plugin MCP ativo. O endereço usado neste repositório é `http://localhost:3000/bb-mcp`. Se esse servidor ainda não estiver configurado no seu Codex, use a CLI:

```powershell
codex mcp add blockbench --url http://localhost:3000/bb-mcp
codex mcp list
```

O fluxo headless opcional cria arquivos sem abrir o editor. O pacote abaixo segue a versão fixada no `.mcp.json` do repositório:

```powershell
codex mcp add blockbench-headless -- npx -y github:jasonjgardner/blockbench-mcp-plugin#v1.9.1 --root "D:\Workspace\blockbench-mcp-project"
```

Substitua `--root` pelo diretório absoluto onde os modelos serão gravados. A instalação das skills não executa esses comandos nem muda a configuração MCP. A configuração standalone do Codex fica em `config.toml`; o `.mcp.json` deste repositório não basta para registrar esses servidores. Use apenas conexões que ainda não existam na sua configuração.

## Workflow documentado no README

O fluxo principal é **descobrir → planejar → modelar → mapear UV/texturizar → animar, se necessário → verificar → exportar**. As skills são combinadas conforme o trabalho:

| Etapa | Skills |
|---|---|
| Entrada e descoberta | `blockbench-use`, `blockbench-mcp-overview` |
| Geometria e UV/textura | `blockbench-modeling`, `blockbench-texturing` |
| Materiais Minecraft originais | `blockbench-vanilla-textures` |
| Texturas geradas por IA | `blockbench-gpt-image-textures` |
| Texturas animadas | `blockbench-flipbook-textures` |
| Mapas e materiais PBR | `blockbench-albedo-to-pbr`, `blockbench-pbr-materials` |
| Movimento e efeitos | `blockbench-animation`, `blockbench-particles` |
| Formato Hytale | `blockbench-hytale` |
| Pipeline Adobe opcional | `blockbench-substance` |
| Desenvolvimento de plugins | `blockbench-development` |

`blockbench-new-model` é um workflow adicional para entregar uma cena Blender: coleta as preferências ainda ausentes, faz o preflight, escreve `plan.md`, constrói e valida os modelos, importa no Blender, ajusta materiais/luzes/câmeras e gera scripts de render e previews. Pode dividir assets independentes entre agentes quando o cliente permite; a edição de um mesmo projeto desktop é sequencial. O vídeo completo é renderizado quando solicitado. Os scripts de render são gerados para cada projeto; esta coleção não inclui templates prontos.

## Como pedir

Mencione a skill com `$nome-da-skill`, selecione-a na interface quando disponível, ou descreva o trabalho para seleção automática. Exemplos de prompts:

```text
$blockbench-modeling Crie uma cadeira low-poly no formato free,
com equilíbrio entre aparência e desempenho; preserve o projeto atual.

$blockbench-texturing Corrija a escala dos UVs e pinte uma textura
pixel art de 32x32 para o modelo aberto.

$blockbench-animation Faça um idle de 2 segundos em loop e verifique a emenda.

$blockbench-new-model Uma vinheta de farol para Blender, low-poly,
textura clássica, animação por keyframes, preview 720p, saída D:\Modelos.
```

## Dependências e verificação

Modelagem básica precisa do MCP correspondente conectado. IA via fal.ai precisa de `FAL_KEY` e endpoint disponível; não cole a chave no chat. Flipbooks existentes podem ser convertidos sem IA. Scripts de imagem podem precisar de Pillow; PBR derivado usa PyPBR ou Node/WebGPU conforme a rota. Substance, Hytale e Havok exigem suas instalações/plugins. O workflow Blender precisa de Blender e FFmpeg; o render headless também tem requisitos próprios de Node/GPU.

Para conferir os arquivos da coleção:

```powershell
python -m pip install PyYAML
python .\scripts\validate_codex.py
```

Essa validação confere manifests, metadados e links. A execução completa de cada workflow depende dos programas, credenciais e ferramentas disponíveis.

Fontes: [README desta coleção](README.md), [skills e descoberta no Codex](https://learn.chatgpt.com/docs/build-skills), [conexões MCP](https://learn.chatgpt.com/docs/extend/mcp?surface=cli).
