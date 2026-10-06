# Guia de estilo medido — archery-plus

## Evidência e limites

Fonte: `D:/Workspace/archery-plus/docs/inspirations`, leitura de 236 PNGs, incluindo subpasta `quiver`. A análise individual e o JSON registram cada arquivo, SHA-256, paleta RGB visível, contagem por cor, alpha, bounding box e cor na borda. Coordenadas começam em 0; bounding boxes seguem Pillow: direita/baixo exclusivos. Cores RGB sob alpha 0 não entram na paleta.

Há 71 arquivos 16×16, 143 em 32×32, 19 em 64×64, `aljava.png` 512×512, `image.png` 260×193 e `image1.png` 681×694. Os dois `image` são pranchas/capturas, não ícones exportáveis; a segunda inclui fundo quadriculado e artefatos da captura. Martelos, maças, escudos e `quiver/` exibem ilhas UV. Os 53 arquivos terminados em `_e.png` aparentam máscaras emissivas pareadas; confirmar o material/modelo antes da integração.

Medidas são exatas; classificação de materiais, direção da luz e ausência de dithering são leituras visuais. Novas regras de orçamento, percentuais e margens abaixo são uma proposta operacional para a família básica, não propriedades universais da pasta.

## 1. Resolução, ocupação e espessura

| Referência | Canvas | Bbox visível | Medida concreta |
|---|---:|---:|---|
| composite_longbow.png | 32×32 | (7,7)–(25,25), 18×18 | Em y=18, membro x=9…12: 4 px; corda x=16: 1 px |
| aether_longbow.png | 32×32 | (6,6)–(27,27), 21×21 | Membros estreitos com contorno selecionado |
| iron_spear.png | 32×32 | (2,2)–(30,30), 28×28 | Haste y=15, x=15…17: 3 px; ponta y=4, x=25…29: 5 px |
| heavy_crossbow_standby.png | 32×32 | (7,7)–(25,25), 18×18 | Coronha diagonal y=18, x=17…21: 5 px |
| rapid_crossbow_standby.png | 16×16 | (0,0)–(16,16) | Ocupa as bordas; não impor margem obrigatória |
| small_quiver.png | 16×16 | (2,1)–(14,15), 12×14 | Corpo compacto, sem textura microscópica |

Espessuras acima são extensões horizontais em uma linha de pixels, incluindo sombra/outline; não são distância euclidiana perpendicular à diagonal. Para uma faixa a 45°, a largura perpendicular aproximada é a horizontal dividida por √2, com erro da rasterização.

**Para novos ícones básicos 32×32:** bbox de arco/besta entre 18 e 26 px por eixo; haste/flecha pode ocupar 24–28 px. Empunhadura/haste 3–5 px de extensão horizontal, membros 3–5 px, lâmina/ponta 4–7 px no ponto mais largo. Corda tem 1 px; reforços até 2 px localmente. Margem preferida 2–4 px em ícones compridos; arcos pequenos podem ter 6–7 px como a referência. Em 16×16, use desenho nativo: haste 1–2 px, ponta 2–4 px, corda 1 px. Não redimensione automaticamente 32→16. Use 64×64 quando modelo/atlas ou escolha explícita exigirem, não para adicionar resolução sem destino.

## 2. Paleta real e rampas

Nos 109 ícones básicos não-emissivos de até 32×32 (excluídos `unique_` e `quiver/`), há **5–30 cores visíveis por arquivo, mediana 16**. Nos 58 arquivos `unique_` completos até 32×32, há **11–189, mediana 56**; alguns são atlas. Essa é a contagem de RGB distintos, não de materiais ou de degraus perceptuais. Não imponha 16 cores a todos os únicos.

As rampas abaixo são extraídas dos PNGs, da sombra ao brilho. `palette.json` registra uma coordenada real para cada hex. O significado do material é atribuído visualmente; uma cor de contorno pode ser compartilhada por materiais.

| Material / variante | Número de cores da rampa observada | Hex reais em ordem escuro→claro |
|---|---:|---|
| Madeira da haste, iron_spear | 4 | #281E0B → #493615 → #684E1E → #896727 |
| Madeira escura, composite_longbow | 3 | #1F1206 → #493615 → #684E1E |
| Madeira avermelhada, heavy_crossbow | 5 | #1F1206 → #3D2B23 → #54271F → #6E392D → #8C4D40 |
| Metal neutro, iron_spear | 6 | #181818 → #444444 → #6B6B6B → #969696 → #D8D8D8 → #FFFFFF |
| Metal frio, heavy_crossbow | 4 | #3F4149 → #5A5F6A → #93979D → #CCD4D7 |
| Couro marrom, small_quiver | 5 | #1C1616 → #312018 → #41291F → #55362A → #6E4738 |
| Corda cinza, composite_longbow | 1 | #444444 |
| Corda cinza, heavy_crossbow_arrow | 1 | #6D6D6D; #444444 também aparece perto das terminações, uso exato depende da peça |
| Corda clara, unique_longbow_1 | 3 | #A17562 → #C0B493 → #ECE7C9 |
| Penas, small_quiver_filled | 3 | #293133 → #A9A9A9 → #DEDEDE |
| Cristal violeta/azul, crystal_shortbow | 5 | #7200A2 → #2E1889 → #4267B9 → #8D91EF → #BBEBFC |
| Corda turquesa, crystal_shortbow | 3 | #2E857D → #5AB2AA → #A7E8E2 |

O violeta/azul é ordenado por brilho percebido; matiz não precisa caminhar monotonicamente. Cor #FFFFFF está presente nas referências e pode ser highlight; a proibição de preto puro não implica proibir branco.

**Construção mensurável:** use brilho luma sRGB `Y′=0,2126R+0,7152G+0,0722B`, em 0–255, para ordenar degraus; isto não é luminância linear nem uma medida perceptual completa. Madeira da haste: Y′ ≈ 30,8 / 55,7 / 80,1 / 105,6 (saltos ≈ 25/24/26). Couro: ≈ 23,3 / 35,0 / 45,4 / 59,7 / 78,2. Metal neutro: 24 / 68 / 107 / 150 / 216 / 255, com saltos maiores nas luzes. Metal frio: ≈ 65,2 / 94,7 / 150,6 / 210,5. Não construir rampas com incremento RGB uniforme: a madeira conserva R>G>B e migra para o ocre; o metal frio conserva B≥G>R; o couro fica quente e escuro. O cristal muda deliberadamente do violeta para azul/ciano claro.

**Para nova família básica:** 3–4 degraus de madeira, 4–6 de metal, 3–5 de couro, 1–3 de corda, 2–3 de penas. Use um subconjunto por superfície: 2–3 degraus em faixas finas, 3–4 em faces largas. Orçamento proposto ≤24 RGB por ícone dos testes; até 30 é compatível com o conjunto básico. O validador usa 30 como teto básico. Não gerar automaticamente tons intermediários. As penas do teste são derivadas das aljavas; não há uma flecha isolada na pasta.

## 3. Outline

Há contornos **selecionados e coloridos**, geralmente 1 px nativo, que também funcionam como sombra de material. Madeira #1F1206 ou #281E0B; couro #1C1616; metal #181818 / #3F4149; cristal #070707 ou sombras violetas. Nem toda borda recebe a cor mais escura: highlights e cordas alcançam a silhueta.

Preto #000000 aparece somente em `unique_staff_damage_4.png` e `unique_staff_damage_5.png` entre os 236 arquivos. Assim, evitar preto puro é uma regra da nova família básica, não uma afirmação de ausência absoluta. Evite contorno preto contínuo ao redor de cada componente, duplicar outlines em junções ou adicionar um halo externo. Em hastes muito finas, uma faixa escura de um lado basta.

## 4. Sombra e luz

Leitura predominante: fonte de luz no alto/esquerda, com brilho na face superior/esquerda e sombras na inferior/direita. O volume é indicado por faixas e clusters, não por sombreado fisicamente uniforme. `iron_spear` tem branco no centro iluminado da ponta; `small_quiver` tem couro claro no lado superior/esquerdo. Cordas mágicas/emissivas podem ser claras por toda a extensão.

**Regra nova:** 2–3 tons em faces estreitas, 3–4 em planos largos e até 6 disponíveis para metal; outline não conta como uma face adicional. Use patches de brilho de 1–4 px nativos e linhas curtas de 2–6 px em arestas. Como objetivo, mantenha o degrau mais claro de cada material em até 20% da sua área nos exemplos básicos; corda pode ter 100%, pois é uma linha, e material emissivo é outra categoria. Esse percentual é uma decisão de desenho, não medição universal das referências.

Não observei dithering regular (xadrez repetido para misturar dois tons) nos ícones básicos. Variação local em `unique_longbow_1` e outros únicos pode conter dezenas de RGB próximos; não confundir isso com transparência suave ou impor uma quantização que apague a identidade da variante. Para os novos básicos, use clusters intencionais e nenhum dithering automático.

## 5. Silhueta, ângulos e estados

Arcos, lanças, espadas, adagas e cajados em geral sobem do canto inferior/esquerdo ao superior/direito: **−45° nas coordenadas de imagem (y cresce para baixo)**. Das 167 texturas completas até 32×32, 109 têm eixo PCA a ±45° com tolerância 0,05°; os outros incluem aljavas, armaduras, atlas e assimetrias. PCA mede distribuição dos pixels, não o eixo funcional.

Bestas têm corpo/coronha em direção inferior/direita e membros na diagonal cruzada; `rapid_crossbow_standby` tem PCA +45°, mas `heavy_crossbow_standby` tem −45° pelo peso dos membros. Portanto não gire toda besta para atingir um único número PCA. Para o desenho novo, use duas diagonais a 45° que se cruzam, cano/projétil para cima/esquerda e coronha para baixo/direita; revise a leitura visual.

Arco: preserve ponta de cada membro e empunhadura; ao tensionar, corda passa de segmento diagonal para dois segmentos com vértice puxado. A flecha sobrepõe o espaço interno sem engrossar a corda. Em animações, tolere movimentos previstos dos membros, mas mantenha o encaixe da mão no mesmo ponto ou justifique a mudança no modelo. As medidas do ponto da mão precisam ser conferidas na família usada; não presumir que toda animação desta pasta o conserva exatamente.

**Regra nova:** haste reta com `|Δx|=|Δy|` quando a orientação desejada for 45°. Curvas de arco com degraus regulares e pontas levemente recurvadas; nenhuma spline suavizada. Empunhadura sólida; não deixar buracos acidentais ou pixels soltos fora de uma máscara emissiva/ornamento deliberado.

## 6. Detalhe e ruído

O reconhecimento vem de membro, corda, empunhadura, ponta e coronha. Veio de madeira, mecanismo de gatilho, costura e filamentos de pena são simplificados em faixas de 1 px e pequenas mudanças de tom. Gemas ou insígnias usam clusters contrastantes, em geral próximos de junções, pontas e centro do item. Highlights ficam em ponta metálica, rebordo, extremidades e articulações, e não são espalhados aleatoriamente por toda a textura.

**Regra nova:** definir primeiro a máscara/silhueta, depois 2–4 componentes materiais e então highlights. Testar leitura em 1×. Não adicionar ruído aleatório; todo pixel isolado deve ter função identificável. O script mede componentes de conectividade-8, mas não decide se uma mancha é ruído ou detalhe semântico. Atlas UV e emissivos permitem ilhas separadas.

## 7. Anti-padrões

- Alpha intermediário 1…254: **ausente em todos os 236 arquivos**, rejeitar nas texturas novas.
- Antialiasing automático, blur, filtro bilinear/bicúbico, glow semitransparente ou sombras externas suaves. As capturas `image1.png` têm rasterização própria e não são base para paleta de ícones.
- Fundo quadriculado exportado dentro de um ícone: usar alpha; as capturas são exceções de apresentação.
- Outline preto uniforme de 2+ px ou contornar separadamente cada pequeno plano, engrossando a arma.
- Degradê procedural contínuo e dezenas de tons quase iguais em uma arma **básica**. Nas armas únicas, a alta contagem real é uma exceção documentada, não um erro automático.
- Dithering ou ruído aleatório para fabricar detalhe; pintura fotográfica de madeira, couro ou penas.
- Espessura da corda igual à do membro; lâmina e cabo com silhuetas indistinguíveis.
- Tratar mapas `_e` como ícones completos; desenhar atlas UV com as regras de bbox/orientação de um sprite.
- Inferir o material somente pelo hex, obrigar todo o corpus a 32×32, ou contar RGB transparente como cor de material.
- Tomar a aljava ampliada 512×512 como resolução nativa padrão ou prometer aparência 3D a partir de um PNG 2D sem testar o modelo.
