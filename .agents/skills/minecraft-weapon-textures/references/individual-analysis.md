# Análise individual das 236 referências

Cada entrada combina inspeção visual ampliada e extração exata dos pixels. Materiais/luz são inferências visuais; bbox, alpha, paleta e contagens são medidas. Consulte `source-metrics.json` para a lista completa inclusive as 44.073 cores da captura. As rampas semânticas com coordenadas estão em `palette.json`.

Bbox direita/baixo exclusivos; x e y iniciam em zero. Ângulo PCA usa y crescente para baixo e descreve distribuição, não eixo funcional. Cores ordenadas em Y′ sRGB; n conta pixels visíveis. Nenhum arquivo tem alpha intermediário.

## 001. aeternium_spear.png
- **Categoria e observação:** ícone completo. Haste marrom longa; ponta curta verde-petróleo com núcleo branco/ciano; separação nítida entre shaft e metal fictício.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 96 pixels visíveis (9.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #4E2A19 (16 px de borda), #493615 (14 px de borda), #281E0B (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Haste marrom longa; ponta curta verde-petróleo com núcleo branco/ciano; separação nítida entre shaft e metal fictício. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #082520×2 · #281E0B×13 · #002C25×7 · #4E2A19×16 · #0D423E×5 · #493615×14 · #075951×4 · #684E1E×5 · #4C5A5A×4 · #935030×6 · #896727×5 · #B8643C×4 · #6C8681×4 · #93A3A3×1 · #C4CBCB×2 · #CEF9F9×4

## 002. aether_heavy_crossbow_arrow.png
- **Categoria e observação:** ícone completo. Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 206 pixels visíveis (20.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 23 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (21 px de borda), #414646 (21 px de borda), #CA5A0F (18 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 133 pixels RGBA diferentes de `aether_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×41 · #1B2458×2 · #631C10×9 · #18326D×5 · #45320D×1 · #543D12×14 · #1C4692×3 · #8B3312×14 · #444444×2 · #414646×21 · #6D4F18×3 · #2659AE×2 · #896727×7 · #CA5A0F×19 · #657A78×11 · #747A97×10 · #969696×2 · #A39DBB×10 · #F2B711×10 · #DBD3E0×8 · #D8D8D8×1 · #FDEE66×8 · #FFFFFF×3

## 003. aether_heavy_crossbow_firework.png
- **Categoria e observação:** ícone completo. Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 209 pixels visíveis (20.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 26 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (21 px de borda), #414646 (19 px de borda), #CA5A0F (18 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 170 pixels RGBA diferentes de `aether_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×39 · #171A24×6 · #222530×10 · #1B2458×2 · #6D1717×2 · #631C10×9 · #18326D×3 · #841B1B×3 · #2F364D×5 · #992929×4 · #1C4692×3 · #8B3312×14 · #414646×19 · #B92929×4 · #D62A2A×7 · #2659AE×2 · #CA5A0F×19 · #657A78×8 · #5C8189×3 · #747A97×10 · #A39DBB×6 · #F2B711×10 · #B2CCD1×3 · #DBD3E0×8 · #FDEE66×8 · #F4F4F4×2

## 004. aether_heavy_crossbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 189 pixels visíveis (18.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (21 px de borda), #414646 (21 px de borda), #8B3312 (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 74 pixels RGBA diferentes de `aether_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×39 · #1B2458×6 · #631C10×10 · #18326D×9 · #1C4692×6 · #8B3312×17 · #414646×21 · #2659AE×10 · #CA5A0F×16 · #657A78×11 · #747A97×10 · #A39DBB×10 · #F2B711×4 · #DBD3E0×9 · #FDEE66×7 · #FEF573×4

## 005. aether_heavy_crossbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 193 pixels visíveis (18.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (23 px de borda), #414646 (21 px de borda), #8B3312 (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 86 pixels RGBA diferentes de `aether_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×44 · #1B2458×6 · #631C10×8 · #18326D×9 · #1C4692×6 · #8B3312×15 · #414646×21 · #2659AE×10 · #CA5A0F×17 · #657A78×11 · #747A97×10 · #A39DBB×10 · #F2B711×8 · #DBD3E0×9 · #FDEE66×7 · #FEF573×2

## 006. aether_heavy_crossbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 205 pixels visíveis (20.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (23 px de borda), #414646 (21 px de borda), #CA5A0F (18 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 103 pixels RGBA diferentes de `aether_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×44 · #1B2458×6 · #631C10×9 · #18326D×9 · #1C4692×6 · #8B3312×14 · #414646×21 · #2659AE×10 · #CA5A0F×22 · #657A78×11 · #747A97×10 · #A39DBB×10 · #F2B711×12 · #DBD3E0×9 · #FDEE66×8 · #FEF573×4

## 007. aether_heavy_crossbow_standby.png
- **Categoria e observação:** ícone completo. Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 185 pixels visíveis (18.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (21 px de borda), #414646 (21 px de borda), #657A78 (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros prateados, corpo azul e corda dourada/laranja; contrastes frios e quentes concentrados nas partes. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×42 · #1B2458×6 · #631C10×12 · #18326D×8 · #1C4692×4 · #8B3312×13 · #414646×21 · #2659AE×8 · #CA5A0F×15 · #657A78×11 · #747A97×10 · #A39DBB×10 · #F2B711×8 · #DBD3E0×9 · #FDEE66×4 · #FEF573×4

## 008. aether_longbow.png
- **Categoria e observação:** ícone completo. Membros prateados/lilases com sombra carvão; corda laranja-amarela, fio destacado sem halo.
- **Resolução/proporção:** 32×32; bbox [6, 6, 27, 27], 21×21; 115 pixels visíveis (11.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 11 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (26 px de borda), #414646 (25 px de borda), #657A78 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros prateados/lilases com sombra carvão; corda laranja-amarela, fio destacado sem halo. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×28 · #414646×37 · #CA5A0F×2 · #CB5B0F×2 · #657A78×6 · #707A79×8 · #747A97×2 · #A39DBB×12 · #F2B711×6 · #DBD3E0×9 · #FDEE66×3

## 009. aether_longbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros prateados/lilases com sombra carvão; corda laranja-amarela, fio destacado sem halo. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [6, 6, 27, 27], 21×21; 137 pixels visíveis (13.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (25 px de borda), #414646 (24 px de borda), #281E0B (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.93°; ver categoria antes de interpretar como eixo. 154 pixels RGBA diferentes de `aether_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros prateados/lilases com sombra carvão; corda laranja-amarela, fio destacado sem halo. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×27 · #281E0B×9 · #414646×36 · #896727×8 · #CA5A0F×8 · #657A78×6 · #707A79×7 · #747A97×2 · #A39DBB×12 · #B1B1B1×1 · #F2B711×6 · #DBD3E0×8 · #D8D8D8×1 · #FDEE66×5 · #FFFFFF×1

## 010. aether_longbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros prateados/lilases com sombra carvão; corda laranja-amarela, fio destacado sem halo. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [6, 6, 27, 27], 21×21; 139 pixels visíveis (13.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (27 px de borda), #414646 (24 px de borda), #F2B711 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.03°; ver categoria antes de interpretar como eixo. 176 pixels RGBA diferentes de `aether_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros prateados/lilases com sombra carvão; corda laranja-amarela, fio destacado sem halo. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×27 · #281E0B×8 · #414646×36 · #896727×8 · #CA5A0F×8 · #657A78×6 · #707A79×7 · #747A97×2 · #A39DBB×12 · #B1B1B1×1 · #F2B711×12 · #DBD3E0×8 · #D8D8D8×1 · #FDEE66×2 · #FFFFFF×1

## 011. aether_longbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros prateados/lilases com sombra carvão; corda laranja-amarela, fio destacado sem halo. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [6, 6, 27, 27], 21×21; 141 pixels visíveis (13.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (27 px de borda), #414646 (24 px de borda), #F2B711 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.07°; ver categoria antes de interpretar como eixo. 190 pixels RGBA diferentes de `aether_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros prateados/lilases com sombra carvão; corda laranja-amarela, fio destacado sem halo. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×27 · #281E0B×9 · #414646×36 · #896727×8 · #CA5A0F×8 · #657A78×6 · #707A79×7 · #747A97×2 · #A39DBB×12 · #B1B1B1×1 · #F2B711×10 · #DBD3E0×8 · #D8D8D8×1 · #FDEE66×5 · #FFFFFF×1

## 012. aether_rapid_crossbow_arrow.png
- **Categoria e observação:** ícone completo. Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 163 pixels visíveis (63.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 27 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (30 px de borda), #414646 (17 px de borda), #8B3312 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 93 pixels RGBA diferentes de `aether_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×32 · #1B2458×2 · #631C10×2 · #18326D×7 · #45320D×1 · #543D12×14 · #1C4692×3 · #8B3312×14 · #444444×2 · #414646×19 · #6D4F18×3 · #2659AE×2 · #C5530A×2 · #896727×7 · #CA5A0F×4 · #CB5B0F×2 · #747A97×6 · #969696×2 · #A39DBB×7 · #F1B60A×2 · #F2B711×6 · #DBD3E0×6 · #D8D8D8×1 · #FDEE66×6 · #FEF573×4 · #EDF9FF×4 · #FFFFFF×3

## 013. aether_rapid_crossbow_firework.png
- **Categoria e observação:** ícone completo. Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 177 pixels visíveis (69.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 30 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (30 px de borda), #414646 (15 px de borda), #8B3312 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 103 pixels RGBA diferentes de `aether_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×32 · #171A24×6 · #222530×10 · #1B2458×2 · #6D1717×2 · #631C10×2 · #18326D×5 · #841B1B×3 · #2F364D×5 · #992929×4 · #1C4692×3 · #8B3312×14 · #414646×19 · #B92929×4 · #D62A2A×7 · #2659AE×2 · #C5530A×2 · #CA5A0F×4 · #CB5B0F×2 · #5C8189×3 · #747A97×6 · #A39DBB×7 · #F1B60A×2 · #F2B711×6 · #B2CCD1×3 · #DBD3E0×6 · #FDEE66×6 · #FEF573×4 · #F4F4F4×2 · #EDF9FF×4

## 014. aether_rapid_crossbow_pulling_0.png
- **Categoria e observação:** ícone completo. Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 153 pixels visíveis (59.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (30 px de borda), #414646 (17 px de borda), #8B3312 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 35 pixels RGBA diferentes de `aether_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×32 · #1B2458×6 · #631C10×2 · #18326D×9 · #1C4692×8 · #8B3312×14 · #414646×19 · #2659AE×10 · #C5530A×2 · #CA5A0F×4 · #CB5B0F×2 · #657A78×4 · #747A97×8 · #A39DBB×10 · #F1B60A×2 · #F2B711×5 · #DBD3E0×6 · #FDEE66×2 · #FEF573×4 · #EDF9FF×4

## 015. aether_rapid_crossbow_pulling_1.png
- **Categoria e observação:** ícone completo. Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 157 pixels visíveis (61.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (30 px de borda), #414646 (17 px de borda), #8B3312 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 42 pixels RGBA diferentes de `aether_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×34 · #1B2458×6 · #631C10×2 · #18326D×10 · #1C4692×8 · #8B3312×14 · #414646×21 · #2659AE×10 · #C5530A×2 · #CA5A0F×4 · #CB5B0F×2 · #657A78×2 · #747A97×8 · #A39DBB×9 · #F1B60A×2 · #F2B711×5 · #DBD3E0×6 · #FDEE66×4 · #FEF573×4 · #EDF9FF×4

## 016. aether_rapid_crossbow_pulling_2.png
- **Categoria e observação:** ícone completo. Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 159 pixels visíveis (62.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (30 px de borda), #414646 (17 px de borda), #8B3312 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 49 pixels RGBA diferentes de `aether_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×32 · #1B2458×6 · #631C10×2 · #18326D×10 · #1C4692×8 · #8B3312×14 · #414646×21 · #2659AE×10 · #C5530A×2 · #CA5A0F×4 · #CB5B0F×2 · #657A78×4 · #747A97×6 · #A39DBB×10 · #F1B60A×2 · #F2B711×6 · #DBD3E0×6 · #FDEE66×6 · #FEF573×4 · #EDF9FF×4

## 017. aether_rapid_crossbow_standby.png
- **Categoria e observação:** ícone completo. Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 153 pixels visíveis (59.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (31 px de borda), #414646 (16 px de borda), #8B3312 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Corpo azul, ferragens prateadas e corda amarelo/laranja; contorno carvão selecionado. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×34 · #1B2458×6 · #631C10×2 · #18326D×7 · #1C4692×8 · #8B3312×14 · #414646×21 · #2659AE×10 · #C5530A×2 · #CA5A0F×2 · #CB5B0F×2 · #657A78×4 · #747A97×8 · #A39DBB×10 · #F1B60A×2 · #F2B711×4 · #DBD3E0×6 · #FDEE66×3 · #FEF573×4 · #EDF9FF×4

## 018. aether_spear.png
- **Categoria e observação:** ícone completo. Haste metálica cinza muito estreita; ponta e pomo alaranjados, com brilho amarelo concentrado.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 102 pixels visíveis (10.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #414646 (18 px de borda), #161717 (17 px de borda), #391404 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -46.57°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Haste metálica cinza muito estreita; ponta e pomo alaranjados, com brilho amarelo concentrado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×17 · #391404×9 · #632307×6 · #682505×2 · #682507×1 · #682508×1 · #652707×1 · #414646×18 · #9A4314×5 · #9C4514×1 · #9D4615×1 · #9E4715×2 · #C1651C×5 · #8C9697×4 · #DD8E21×5 · #B0BDBE×10 · #F2D53B×5 · #D3DCE0×3 · #FAF98B×1 · #FFFEE5×5

## 019. aljava.png
- **Categoria e observação:** ampliação de referência. Aljava marrom ampliada em blocos duros, penas brancas/cinza e pequeno fecho ocre. Canvas 512 não deve virar resolução padrão de ícones.
- **Resolução/proporção:** 512×512; bbox [64, 64, 480, 480], 416×416; 84992 pixels visíveis (32.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 13 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #3A3A3A (1002 px de borda), #2E1C10 (694 px de borda), #E0E0E0 (283 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -40.7°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Aljava marrom ampliada em blocos duros, penas brancas/cinza e pequeno fecho ocre. Canvas 512 não deve virar resolução padrão de ícones. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #281E0B×6144 · #2E1C10×12288 · #412716×6144 · #52311C×8192 · #3A3A3A×11264 · #6C4125×8192 · #684E1E×2048 · #965A33×15360 · #896727×1024 · #A36238×5120 · #A1A1A1×1024 · #C6C6C6×2048 · #E0E0E0×6144

## 020. archer_armor_chest.png
- **Categoria e observação:** ícone completo. Peitoral com ombreiras laterais, em couro marrom; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [0, 1, 16, 15], 16×14; 161 pixels visíveis (62.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 11 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1C1616 (29 px de borda), #312018 (10 px de borda), #897A7A (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 9.42°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Peitoral com ombreiras laterais, em couro marrom; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1C1616×36 · #312018×32 · #41291F×28 · #55362A×22 · #6E4738×13 · #555B5C×2 · #6B6464×11 · #797886×2 · #897A7A×7 · #C0B4A8×5 · #E4D9CD×3

## 021. archer_armor_feet.png
- **Categoria e observação:** ícone completo. Par de botas em duas ilhas intencionais, em couro marrom; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [2, 3, 15, 14], 13×11; 91 pixels visíveis (35.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 5 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1C1616 (31 px de borda), #312018 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 20.64°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Par de botas em duas ilhas intencionais, em couro marrom; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1C1616×37 · #312018×20 · #41291F×13 · #55362A×15 · #6E4738×6

## 022. archer_armor_head.png
- **Categoria e observação:** ícone completo. Capacete curvo com espaço interno escuro, em couro marrom; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [2, 2, 14, 14], 12×12; 112 pixels visíveis (43.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 5 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1C1616 (16 px de borda), #312018 (9 px de borda), #41291F (9 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -28.76°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Capacete curvo com espaço interno escuro, em couro marrom; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1C1616×36 · #312018×18 · #41291F×21 · #55362A×23 · #6E4738×14

## 023. archer_armor_legs.png
- **Categoria e observação:** ícone completo. Perneiras com duas pernas e vão central, em couro marrom; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [1, 2, 15, 15], 14×13; 123 pixels visíveis (48.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #312018 (18 px de borda), #1C1616 (15 px de borda), #41291F (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -10.41°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Perneiras com duas pernas e vão central, em couro marrom; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1C1616×22 · #312018×32 · #41291F×18 · #55362A×22 · #6E4738×9 · #6B6464×7 · #897A7A×7 · #C0B4A8×6

## 024. archer_scroll.png
- **Categoria e observação:** ícone completo. Pergaminho creme enrolado, faixa verde; formas cilíndricas sugeridas por três ou quatro tons.
- **Resolução/proporção:** 16×16; bbox [0, 3, 16, 13], 16×10; 117 pixels visíveis (45.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #574538 (18 px de borda), #271B0D (16 px de borda), #694009 (2 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 12.7°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Pergaminho creme enrolado, faixa verde; formas cilíndricas sugeridas por três ou quatro tons. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #271B0D×17 · #043519×4 · #054F18×6 · #694009×3 · #574538×29 · #0C6A13×1 · #855F05×2 · #0D8216×3 · #937D61×15 · #AFA08D×2 · #E4B636×2 · #CEC1B1×15 · #F2E9DE×13 · #FFF962×1 · #F6F4E5×4

## 025. archer_spell_book.png
- **Categoria e observação:** ícone completo. Livro verde, ferragens douradas, páginas claras e marcador vermelho; corpo compacto quase horizontal.
- **Resolução/proporção:** 16×16; bbox [0, 1, 16, 15], 16×14; 160 pixels visíveis (62.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #043519 (14 px de borda), #855F05 (9 px de borda), #694009 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -12.2°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Livro verde, ferragens douradas, páginas claras e marcador vermelho; corpo compacto quase horizontal. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #5B0505×4 · #840B25×4 · #043519×21 · #A2121D×1 · #054F18×24 · #694009×10 · #0C6A13×17 · #855F05×11 · #0D8216×26 · #65635F×3 · #7D7A77×9 · #BA8817×6 · #A5A29D×11 · #E4B636×5 · #D5D1CA×3 · #FFF962×5

## 026. auto_fire_hook.png
- **Categoria e observação:** ícone completo. Gancho cinza com haste ocre; silhueta curva, poucos clusters e contraste de material.
- **Resolução/proporção:** 16×16; bbox [2, 4, 13, 14], 11×10; 57 pixels visíveis (22.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 10 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #3F2706 (11 px de borda), #211E1E (10 px de borda), #694009 (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 10.07°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Gancho cinza com haste ocre; silhueta curva, poucos clusters e contraste de material. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #211E1E×11 · #3F2706×11 · #694009×5 · #494D53×9 · #855F05×4 · #6A6D72×4 · #A88022×1 · #92969C×5 · #CCAE59×5 · #BDD4DB×2

## 027. composite_longbow.png
- **Categoria e observação:** ícone completo. Membros ocres pequenos, faixa central bege/cinza e corda cinza de um pixel; volume simplificado em bandas.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 87 pixels visíveis (8.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 11 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1F1206 (16 px de borda), #444444 (13 px de borda), #493615 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros ocres pequenos, faixa central bege/cinza e corda cinza de um pixel; volume simplificado em bandas. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×18 · #353331×6 · #493615×16 · #443D3D×4 · #454241×7 · #444444×13 · #684E1E×8 · #655E58×4 · #705D4C×2 · #7E756C×5 · #B2AD98×4

## 028. composite_longbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros ocres pequenos, faixa central bege/cinza e corda cinza de um pixel; volume simplificado em bandas. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 105 pixels visíveis (10.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1F1206 (16 px de borda), #444444 (15 px de borda), #493615 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.66°; ver categoria antes de interpretar como eixo. 96 pixels RGBA diferentes de `composite_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros ocres pequenos, faixa central bege/cinza e corda cinza de um pixel; volume simplificado em bandas. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×18 · #281E0B×9 · #353331×6 · #493615×16 · #443D3D×4 · #454241×5 · #444444×15 · #684E1E×8 · #655E58×4 · #705D4C×2 · #896727×8 · #7E756C×4 · #B2AD98×3 · #B1B1B1×1 · #D8D8D8×1 · #FFFFFF×1

## 029. composite_longbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros ocres pequenos, faixa central bege/cinza e corda cinza de um pixel; volume simplificado em bandas. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 107 pixels visíveis (10.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1F1206 (18 px de borda), #444444 (17 px de borda), #493615 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.82°; ver categoria antes de interpretar como eixo. 113 pixels RGBA diferentes de `composite_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros ocres pequenos, faixa central bege/cinza e corda cinza de um pixel; volume simplificado em bandas. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×18 · #281E0B×9 · #353331×6 · #493615×16 · #443D3D×4 · #454241×5 · #444444×17 · #684E1E×8 · #655E58×4 · #705D4C×2 · #896727×8 · #7E756C×4 · #B2AD98×3 · #B1B1B1×1 · #D8D8D8×1 · #FFFFFF×1

## 030. composite_longbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros ocres pequenos, faixa central bege/cinza e corda cinza de um pixel; volume simplificado em bandas. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 109 pixels visíveis (10.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #444444 (20 px de borda), #1F1206 (18 px de borda), #493615 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.04°; ver categoria antes de interpretar como eixo. 123 pixels RGBA diferentes de `composite_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros ocres pequenos, faixa central bege/cinza e corda cinza de um pixel; volume simplificado em bandas. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×18 · #281E0B×8 · #353331×6 · #493615×16 · #443D3D×4 · #454241×5 · #444444×20 · #684E1E×8 · #655E58×4 · #705D4C×2 · #896727×8 · #7E756C×4 · #B2AD98×3 · #B1B1B1×1 · #D8D8D8×1 · #FFFFFF×1

## 031. crystal_longbow.png
- **Categoria e observação:** ícone completo. Membros violeta/azul com highlights ciano; corda turquesa, aparência facetada.
- **Resolução/proporção:** 32×32; bbox [6, 6, 27, 27], 21×21; 124 pixels visíveis (12.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2E1889 (26 px de borda), #7200A2 (16 px de borda), #070707 (9 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros violeta/azul com highlights ciano; corda turquesa, aparência facetada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #070707×11 · #002C25×3 · #7200A2×18 · #2E1889×30 · #9006CA×6 · #0D423E×5 · #A73EDD×6 · #4267B9×6 · #2E857D×6 · #8D91EF×10 · #5AB2AA×6 · #93A3A3×2 · #C4CBCB×1 · #A7E8E2×4 · #BBEBFC×10

## 032. crystal_longbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros violeta/azul com highlights ciano; corda turquesa, aparência facetada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [6, 6, 27, 27], 21×21; 143 pixels visíveis (14.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 19 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2E1889 (26 px de borda), #7200A2 (16 px de borda), #2E857D (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.87°; ver categoria antes de interpretar como eixo. 142 pixels RGBA diferentes de `crystal_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros violeta/azul com highlights ciano; corda turquesa, aparência facetada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #070707×10 · #281E0B×9 · #002C25×2 · #7200A2×18 · #2E1889×30 · #9006CA×6 · #0D423E×4 · #A73EDD×6 · #4267B9×6 · #896727×8 · #2E857D×8 · #8D91EF×10 · #5AB2AA×6 · #93A3A3×2 · #B1B1B1×1 · #D8D8D8×1 · #A7E8E2×5 · #BBEBFC×10 · #FFFFFF×1

## 033. crystal_longbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros violeta/azul com highlights ciano; corda turquesa, aparência facetada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [6, 6, 27, 27], 21×21; 145 pixels visíveis (14.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 19 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2E1889 (28 px de borda), #7200A2 (16 px de borda), #5AB2AA (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.98°; ver categoria antes de interpretar como eixo. 169 pixels RGBA diferentes de `crystal_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros violeta/azul com highlights ciano; corda turquesa, aparência facetada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #070707×10 · #281E0B×8 · #002C25×2 · #7200A2×18 · #2E1889×30 · #9006CA×6 · #0D423E×4 · #A73EDD×6 · #4267B9×6 · #896727×8 · #2E857D×8 · #8D91EF×10 · #5AB2AA×10 · #93A3A3×2 · #B1B1B1×1 · #D8D8D8×1 · #A7E8E2×4 · #BBEBFC×10 · #FFFFFF×1

## 034. crystal_longbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros violeta/azul com highlights ciano; corda turquesa, aparência facetada. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [6, 6, 27, 27], 21×21; 149 pixels visíveis (14.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 19 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2E1889 (28 px de borda), #7200A2 (16 px de borda), #2E857D (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.09°; ver categoria antes de interpretar como eixo. 184 pixels RGBA diferentes de `crystal_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros violeta/azul com highlights ciano; corda turquesa, aparência facetada. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #070707×10 · #281E0B×9 · #002C25×2 · #7200A2×18 · #2E1889×30 · #9006CA×6 · #0D423E×4 · #A73EDD×6 · #4267B9×6 · #896727×8 · #2E857D×12 · #8D91EF×10 · #5AB2AA×8 · #93A3A3×2 · #B1B1B1×1 · #D8D8D8×1 · #A7E8E2×5 · #BBEBFC×10 · #FFFFFF×1

## 035. crystal_shortbow.png
- **Categoria e observação:** ícone completo. Violeta nas pontas e azul no corpo; ciano claro em arestas; corda turquesa em um pixel.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 96 pixels visíveis (37.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 13 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2E1889 (18 px de borda), #070707 (12 px de borda), #7200A2 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Violeta nas pontas e azul no corpo; ciano claro em arestas; corda turquesa em um pixel. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #070707×14 · #7200A2×12 · #2E1889×18 · #3B2754×2 · #0D423E×5 · #075951×2 · #4267B9×8 · #2E857D×4 · #6C8681×5 · #8D91EF×10 · #5AB2AA×4 · #A7E8E2×4 · #BBEBFC×8

## 036. crystal_shortbow_pulling_0.png
- **Categoria e observação:** ícone completo. Violeta nas pontas e azul no corpo; ciano claro em arestas; corda turquesa em um pixel. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 113 pixels visíveis (44.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2E1889 (17 px de borda), #070707 (13 px de borda), #7200A2 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.28°; ver categoria antes de interpretar como eixo. 106 pixels RGBA diferentes de `crystal_shortbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Violeta nas pontas e azul no corpo; ciano claro em arestas; corda turquesa em um pixel. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #070707×13 · #281E0B×8 · #7200A2×12 · #2E1889×18 · #3B2754×2 · #0D423E×3 · #075951×2 · #4267B9×7 · #896727×8 · #2E857D×4 · #6C8681×4 · #8D91EF×10 · #5AB2AA×6 · #B1B1B1×1 · #D8D8D8×1 · #A7E8E2×5 · #BBEBFC×8 · #FFFFFF×1

## 037. crystal_shortbow_pulling_1.png
- **Categoria e observação:** ícone completo. Violeta nas pontas e azul no corpo; ciano claro em arestas; corda turquesa em um pixel. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 113 pixels visíveis (44.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2E1889 (17 px de borda), #070707 (13 px de borda), #7200A2 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.15°; ver categoria antes de interpretar como eixo. 119 pixels RGBA diferentes de `crystal_shortbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Violeta nas pontas e azul no corpo; ciano claro em arestas; corda turquesa em um pixel. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #070707×13 · #281E0B×8 · #7200A2×12 · #2E1889×18 · #3B2754×2 · #0D423E×3 · #075951×2 · #4267B9×7 · #896727×8 · #2E857D×4 · #6C8681×4 · #8D91EF×10 · #5AB2AA×6 · #B1B1B1×1 · #D8D8D8×1 · #A7E8E2×5 · #BBEBFC×8 · #FFFFFF×1

## 038. crystal_shortbow_pulling_2.png
- **Categoria e observação:** ícone completo. Violeta nas pontas e azul no corpo; ciano claro em arestas; corda turquesa em um pixel. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 117 pixels visíveis (45.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2E1889 (17 px de borda), #070707 (15 px de borda), #7200A2 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.97°; ver categoria antes de interpretar como eixo. 121 pixels RGBA diferentes de `crystal_shortbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Violeta nas pontas e azul no corpo; ciano claro em arestas; corda turquesa em um pixel. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #070707×15 · #281E0B×8 · #7200A2×12 · #2E1889×18 · #3B2754×2 · #0D423E×3 · #075951×2 · #4267B9×7 · #896727×8 · #2E857D×6 · #6C8681×4 · #8D91EF×10 · #5AB2AA×6 · #B1B1B1×1 · #D8D8D8×1 · #A7E8E2×5 · #BBEBFC×8 · #FFFFFF×1

## 039. diamond_spear.png
- **Categoria e observação:** ícone completo. Haste ocre; ponta turquesa com luz ciano clara, outline verde escuro.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 92 pixels visíveis (9.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 10 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #493615 (23 px de borda), #281E0B (22 px de borda), #156355 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Haste ocre; ponta turquesa com luz ciano clara, outline verde escuro. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #281E0B×22 · #0E3F36×8 · #493615×23 · #684E1E×10 · #156355×7 · #896727×11 · #1E8A77×2 · #2BC7AC×1 · #33EBCB×3 · #A4FDF0×5

## 040. flint_spear.png
- **Categoria e observação:** ícone completo. Haste ocre; ponta cinza fosca de poucos degraus, sem brilho branco intenso.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 95 pixels visíveis (9.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 10 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #493615 (23 px de borda), #281E0B (22 px de borda), #0E0E0E (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.35°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Haste ocre; ponta cinza fosca de poucos degraus, sem brilho branco intenso. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0E0E0E×9 · #281E0B×22 · #2E2D2D×10 · #493615×23 · #3D3C3C×3 · #684E1E×10 · #565656×3 · #896727×11 · #7F7F7F×2 · #A8A8A8×2

## 041. golden_spear.png
- **Categoria e observação:** ícone completo. Haste ocre; ponta dourada com pequeno brilho quase branco, sombra laranja/marrom.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 92 pixels visíveis (9.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 10 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #493615 (23 px de borda), #281E0B (22 px de borda), #9B5B08 (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Haste ocre; ponta dourada com pequeno brilho quase branco, sombra laranja/marrom. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #281E0B×22 · #502205×4 · #493615×23 · #6C3F05×5 · #684E1E×10 · #9B5B08×6 · #896727×11 · #DC9613×3 · #FAD64A×3 · #FFFDE0×5

## 042. heavy_crossbow_arrow.png
- **Categoria e observação:** ícone completo. Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 197 pixels visíveis (19.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #3F4149 (28 px de borda), #1F1206 (27 px de borda), #6D6D6D (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 102 pixels RGBA diferentes de `heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×33 · #3D2B23×12 · #54271F×10 · #45320D×1 · #0E4C43×4 · #543D12×18 · #3F4149×33 · #6E392D×12 · #444444×2 · #6D4F18×3 · #8C4D40×8 · #0C6E76×6 · #5A5F6A×4 · #896727×9 · #6D6D6D×16 · #969696×2 · #93979D×12 · #20C5B5×2 · #CCD4D7×4 · #D8D8D8×1 · #A1FBE8×2 · #FFFFFF×3

## 043. heavy_crossbow_firework.png
- **Categoria e observação:** ícone completo. Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 204 pixels visíveis (19.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 24 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #3F4149 (28 px de borda), #1F1206 (27 px de borda), #6D6D6D (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 135 pixels RGBA diferentes de `heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×33 · #171A24×8 · #222530×10 · #6D1717×2 · #3D2B23×12 · #54271F×8 · #841B1B×3 · #2F364D×6 · #0E4C43×4 · #992929×4 · #3F4149×33 · #6E392D×12 · #B92929×4 · #D62A2A×7 · #8C4D40×8 · #0C6E76×6 · #5A5F6A×4 · #6D6D6D×14 · #5C8189×3 · #93979D×12 · #20C5B5×2 · #B2CCD1×3 · #CCD4D7×4 · #F4F4F4×2

## 044. heavy_crossbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 173 pixels visíveis (16.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1F1206 (31 px de borda), #3F4149 (20 px de borda), #0C6E76 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 44 pixels RGBA diferentes de `heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×35 · #3D2B23×12 · #54271F×13 · #0E4C43×7 · #3F4149×28 · #6E392D×17 · #8C4D40×16 · #0C6E76×9 · #5A5F6A×4 · #6D6D6D×9 · #93979D×12 · #20C5B5×2 · #CCD4D7×5 · #A1FBE8×2 · #FFFFFF×2

## 045. heavy_crossbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 177 pixels visíveis (17.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1F1206 (29 px de borda), #3F4149 (22 px de borda), #0C6E76 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 50 pixels RGBA diferentes de `heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×33 · #3D2B23×12 · #54271F×13 · #0E4C43×7 · #3F4149×30 · #6E392D×19 · #8C4D40×16 · #0C6E76×9 · #5A5F6A×4 · #6D6D6D×9 · #93979D×14 · #20C5B5×2 · #CCD4D7×5 · #A1FBE8×2 · #FFFFFF×2

## 046. heavy_crossbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 189 pixels visíveis (18.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #3F4149 (28 px de borda), #1F1206 (27 px de borda), #6D6D6D (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 60 pixels RGBA diferentes de `heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×33 · #3D2B23×14 · #54271F×13 · #0E4C43×7 · #3F4149×33 · #6E392D×20 · #8C4D40×18 · #0C6E76×9 · #5A5F6A×4 · #6D6D6D×14 · #93979D×13 · #20C5B5×2 · #CCD4D7×5 · #A1FBE8×2 · #FFFFFF×2

## 047. heavy_crossbow_standby.png
- **Categoria e observação:** ícone completo. Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 167 pixels visíveis (16.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1F1206 (29 px de borda), #3F4149 (16 px de borda), #0C6E76 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros marrom-avermelhados, coronha marrom e ferragens frias; gema turquesa central, corda cinza. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1F1206×35 · #3D2B23×12 · #54271F×13 · #0E4C43×7 · #3F4149×25 · #6E392D×17 · #8C4D40×16 · #0C6E76×9 · #5A5F6A×4 · #6D6D6D×8 · #93979D×10 · #20C5B5×2 · #CCD4D7×5 · #A1FBE8×2 · #FFFFFF×2

## 048. image.png
- **Categoria e observação:** prancha/captura. Prancha de doze arcos, com fundo quadriculado incorporado; ajuda a comparar curva/materiais, mas mistura várias paletas.
- **Resolução/proporção:** 260×193; bbox [0, 0, 260, 193], 260×193; 50180 pixels visíveis (100.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 88 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #22242A (264 px de borda), #FFFFFF (203 px de borda), #EFEFEF (202 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Direções locais dos arcos; captura não sustenta uma luz nem número de tons de material únicos. Dithering não avaliável pelo conjunto de pixels da captura.
- **Silhueta/ângulo:** PCA 0.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Prancha de doze arcos, com fundo quadriculado incorporado; ajuda a comparar curva/materiais, mas mistura várias paletas. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #120004×224 · #030162×352 · #260A18×416 · #440911×272 · #380E08×384 · #171717×96 · #3E0F21×368 · #700500×240 · #341622×64 · #032620×384 · #281E0B×288 · #3E1528×256 · #231E23×208 · #2B1F2D×48 · #22242A×780 · #99042B×160 · #3B2226×128 · #2D2D2D×160 · #0C3730×384 · #57212E×128 · #2C2E35×760 · #362E35×448 · #6A2218×16 · #323232×32 · #552A22×424 · #42331F×128 · #552E34×368 · #493615×352 · #72291E×368 · #49324C×64 · #33319C×416 · #BA1C08×224 · #3E3E3E×304 · #4C3E47×96 · #334080×96 · #553D3C×112 · #444444×672 · #7B3748×64 · #5D3E5F×176 · #684437×288 · #105C5E×144 · #066437×592 · #684E1E×96 · #734946×128 · #61532A×128 · #634F58×128 · #9B4D32×160 · #705A50×272 · #7D537D×32 · #69652C×384 · #2A7268×160 · #7553CB×96 · #646464×112 · #4F6793×64 · #896727×160 · #906252×64 · #6B6B6B×368 · #A75F45×160 · #E6502D×96 · #E7523F×96 · #A96E4B×160 · #867C41×192 · #349988×144 · #FF6D00×288 · #938473×320 · #AA75F8×64 · #50A43D×320 · #8F8F8F×96 · #969696×64 · #C6926E×64 · #F98751×32 · #71CC79×64 · #FFAE05×128 · #AECA69×392 · #C4BFB1×64 · #D7BE96×64 · #D5CD96×64 · #DFDABB×96 · #EBDE8F×16 · #EBE1B6×64 · #FCE57C×128 · #F0EFE9×128 · #EFEFEF×17064 · #EBF8B6×128 · #F8FC74×144 · #FCFFD1×192 · #FFFFF0×160 · #FFFFFF×15352

## 049. image1.png
- **Categoria e observação:** prancha/captura. Captura ampliada de treze arcos, com quadriculado e elementos da interface. Seus 44.073 RGB refletem também a captura; não usá-los como paleta de um item.
- **Resolução/proporção:** 681×694; bbox [0, 0, 681, 694], 681×694; 472614 pixels visíveis (100.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 44073 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #22242A (1378 px de borda), #EFEFEF (686 px de borda), #FFFFFF (639 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Direções locais dos arcos; captura não sustenta uma luz nem número de tons de material únicos. Dithering não avaliável pelo conjunto de pixels da captura.
- **Silhueta/ângulo:** PCA 90.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Captura ampliada de treze arcos, com quadriculado e elementos da interface. Seus 44.073 RGB refletem também a captura; não usá-los como paleta de um item. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** Lista integral no JSON; omitida aqui por ser uma captura com 44.073 cores.

## 050. iron_spear.png
- **Categoria e observação:** ícone completo. Haste com quatro ocres; ponta branca/cinza com seis degraus; contorno escolhido por material.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 92 pixels visíveis (9.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 10 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #493615 (23 px de borda), #281E0B (22 px de borda), #6B6B6B (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Haste com quatro ocres; ponta branca/cinza com seis degraus; contorno escolhido por material. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #181818×4 · #281E0B×22 · #493615×23 · #444444×6 · #684E1E×10 · #896727×11 · #6B6B6B×7 · #969696×3 · #D8D8D8×2 · #FFFFFF×4

## 051. large_quiver.png
- **Categoria e observação:** ícone completo. Corpo verde-petróleo, alça violeta/cinza e borda cinza clara; não generalizar esta rampa como couro marrom.
- **Resolução/proporção:** 16×16; bbox [2, 1, 14, 15], 12×14; 101 pixels visíveis (39.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #4C4D4F (10 px de borda), #706770 (6 px de borda), #4F3C3E (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -55.41°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Corpo verde-petróleo, alça violeta/cinza e borda cinza clara; não generalizar esta rampa como couro marrom. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #111E21×4 · #0E2E2B×4 · #4A2940×5 · #123D3A×6 · #343436×9 · #4F3C3E×6 · #194E47×12 · #4C4D4F×13 · #24664F×13 · #706770×7 · #867B86×4 · #87898A×11 · #A6A9AA×1 · #BABFC0×5 · #D5DDDD×1

## 052. large_quiver_filled.png
- **Categoria e observação:** ícone completo. Corpo verde-petróleo, alça violeta/cinza e borda cinza clara; não generalizar esta rampa como couro marrom. Variante preenchida: penas claras surgem junto à boca e alteram a bbox/paleta.
- **Resolução/proporção:** 16×16; bbox [2, 1, 15, 15], 13×14; 106 pixels visíveis (41.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #4C4D4F (8 px de borda), #706770 (6 px de borda), #4F3C3E (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -51.46°; ver categoria antes de interpretar como eixo. 27 pixels RGBA diferentes de `large_quiver.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Corpo verde-petróleo, alça violeta/cinza e borda cinza clara; não generalizar esta rampa como couro marrom. Variante preenchida: penas claras surgem junto à boca e alteram a bbox/paleta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #111E21×4 · #0E2E2B×4 · #293133×3 · #4A2940×5 · #123D3A×6 · #343436×4 · #4F3C3E×6 · #194E47×12 · #4C4D4F×11 · #24664F×13 · #706770×7 · #867B86×4 · #87898A×10 · #A6A9AA×1 · #A9A9A9×4 · #BABFC0×5 · #D5DDDD×1 · #DEDEDE×6

## 053. mechanic_shortbow.png
- **Categoria e observação:** ícone completo. Estrutura cinza, pequenos acentos vermelhos em pontas/empunhadura; mecanismo resumido a blocos.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 85 pixels visíveis (33.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 9 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #131C21 (18 px de borda), #3F4149 (14 px de borda), #420000 (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Estrutura cinza, pequenos acentos vermelhos em pontas/empunhadura; mecanismo resumido a blocos. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×15 · #131C21×18 · #850C0C×5 · #BC1010×5 · #3D3F43×8 · #3F4149×14 · #5A5F6A×6 · #93979D×12 · #CCD4D7×2

## 054. mechanic_shortbow_pulling_0.png
- **Categoria e observação:** ícone completo. Estrutura cinza, pequenos acentos vermelhos em pontas/empunhadura; mecanismo resumido a blocos. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 102 pixels visíveis (39.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 14 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #131C21 (18 px de borda), #3F4149 (14 px de borda), #420000 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.41°; ver categoria antes de interpretar como eixo. 39 pixels RGBA diferentes de `mechanic_shortbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Estrutura cinza, pequenos acentos vermelhos em pontas/empunhadura; mecanismo resumido a blocos. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×13 · #131C21×18 · #281E0B×8 · #850C0C×4 · #BC1010×4 · #3D3F43×10 · #3F4149×14 · #5A5F6A×6 · #896727×8 · #93979D×12 · #B1B1B1×1 · #CCD4D7×2 · #D8D8D8×1 · #FFFFFF×1

## 055. mechanic_shortbow_pulling_1.png
- **Categoria e observação:** ícone completo. Estrutura cinza, pequenos acentos vermelhos em pontas/empunhadura; mecanismo resumido a blocos. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 101 pixels visíveis (39.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 14 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #131C21 (18 px de borda), #3F4149 (14 px de borda), #420000 (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.25°; ver categoria antes de interpretar como eixo. 44 pixels RGBA diferentes de `mechanic_shortbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Estrutura cinza, pequenos acentos vermelhos em pontas/empunhadura; mecanismo resumido a blocos. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×12 · #131C21×18 · #281E0B×8 · #850C0C×5 · #BC1010×4 · #3D3F43×10 · #3F4149×14 · #5A5F6A×6 · #896727×7 · #93979D×12 · #B1B1B1×1 · #CCD4D7×2 · #D8D8D8×1 · #FFFFFF×1

## 056. mechanic_shortbow_pulling_2.png
- **Categoria e observação:** ícone completo. Estrutura cinza, pequenos acentos vermelhos em pontas/empunhadura; mecanismo resumido a blocos. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 104 pixels visíveis (40.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 14 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #131C21 (18 px de borda), #3D3F43 (14 px de borda), #3F4149 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.92°; ver categoria antes de interpretar como eixo. 47 pixels RGBA diferentes de `mechanic_shortbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Estrutura cinza, pequenos acentos vermelhos em pontas/empunhadura; mecanismo resumido a blocos. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×11 · #131C21×18 · #281E0B×8 · #850C0C×4 · #BC1010×4 · #3D3F43×14 · #3F4149×14 · #5A5F6A×6 · #896727×8 · #93979D×12 · #B1B1B1×1 · #CCD4D7×2 · #D8D8D8×1 · #FFFFFF×1

## 057. medium_quiver.png
- **Categoria e observação:** ícone completo. Couro ocre de faces largas, boca cinza/bege e detalhe dourado central.
- **Resolução/proporção:** 16×16; bbox [2, 1, 14, 15], 12×14; 92 pixels visíveis (35.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 13 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2C1F1C (15 px de borda), #6B6464 (9 px de borda), #C0B4A8 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -55.87°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Couro ocre de faces largas, boca cinza/bege e detalhe dourado central. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #2C1F1C×17 · #412E1C×5 · #593927×11 · #6E4630×1 · #6D4E30×8 · #745408×1 · #805D3B×13 · #6B6464×11 · #A8773C×9 · #897A7A×7 · #C58B2C×2 · #C0B4A8×6 · #FFD825×1

## 058. medium_quiver_filled.png
- **Categoria e observação:** ícone completo. Couro ocre de faces largas, boca cinza/bege e detalhe dourado central. Variante preenchida: penas claras surgem junto à boca e alteram a bbox/paleta.
- **Resolução/proporção:** 16×16; bbox [2, 1, 15, 15], 13×14; 97 pixels visíveis (37.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2C1F1C (13 px de borda), #6B6464 (9 px de borda), #C0B4A8 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -51.12°; ver categoria antes de interpretar como eixo. 24 pixels RGBA diferentes de `medium_quiver.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Couro ocre de faces largas, boca cinza/bege e detalhe dourado central. Variante preenchida: penas claras surgem junto à boca e alteram a bbox/paleta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #2C1F1C×15 · #293133×3 · #412E1C×5 · #593927×7 · #6E4630×1 · #6D4E30×6 · #745408×1 · #805D3B×13 · #6B6464×11 · #A8773C×9 · #897A7A×7 · #C58B2C×2 · #A9A9A9×4 · #C0B4A8×6 · #FFD825×1 · #DEDEDE×6

## 059. netherite_heavy_crossbow_arrow.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 190 pixels visíveis (18.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 19 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (27 px de borda), #4A2940 (24 px de borda), #B35350 (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 93 pixels RGBA diferentes de `netherite_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×33 · #322727×14 · #4A2940×32 · #45320D×5 · #603432×6 · #543D12×13 · #4F3C3E×12 · #444444×2 · #51444E×4 · #6D4F18×3 · #5D565D×10 · #B35350×19 · #706770×6 · #896727×7 · #969696×2 · #CDA886×10 · #D8D8D8×1 · #F6E0BF×8 · #FFFFFF×3

## 060. netherite_heavy_crossbow_firework.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 204 pixels visíveis (19.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (27 px de borda), #4A2940 (24 px de borda), #B35350 (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 109 pixels RGBA diferentes de `netherite_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×33 · #171A24×8 · #222530×11 · #6D1717×2 · #322727×12 · #841B1B×3 · #4A2940×32 · #2F364D×5 · #603432×6 · #4F3C3E×12 · #992929×4 · #51444E×4 · #B92929×4 · #D62A2A×7 · #5D565D×10 · #B35350×19 · #706770×6 · #5C8189×3 · #CDA886×10 · #B2CCD1×3 · #F6E0BF×8 · #F4F4F4×2

## 061. netherite_heavy_crossbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 170 pixels visíveis (16.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 12 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (31 px de borda), #4A2940 (28 px de borda), #B35350 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 44 pixels RGBA diferentes de `netherite_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×35 · #322727×17 · #4A2940×38 · #603432×8 · #4F3C3E×12 · #51444E×6 · #734543×7 · #5D565D×13 · #B35350×12 · #706770×13 · #CDA886×2 · #F6E0BF×7

## 062. netherite_heavy_crossbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 174 pixels visíveis (17.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 12 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (29 px de borda), #4A2940 (28 px de borda), #B35350 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 50 pixels RGBA diferentes de `netherite_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×33 · #322727×17 · #4A2940×38 · #603432×10 · #4F3C3E×12 · #51444E×6 · #734543×7 · #5D565D×13 · #B35350×14 · #706770×13 · #CDA886×4 · #F6E0BF×7

## 063. netherite_heavy_crossbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 186 pixels visíveis (18.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 12 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (27 px de borda), #4A2940 (26 px de borda), #B35350 (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 60 pixels RGBA diferentes de `netherite_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×33 · #322727×17 · #4A2940×36 · #603432×11 · #4F3C3E×12 · #51444E×6 · #734543×9 · #5D565D×13 · #B35350×19 · #706770×12 · #CDA886×10 · #F6E0BF×8

## 064. netherite_heavy_crossbow_standby.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 164 pixels visíveis (16.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 12 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (29 px de borda), #4A2940 (24 px de borda), #322727 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros vinho/cinza, coronha escura e corda clara rosada; poucos highlights fortes. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×35 · #322727×15 · #4A2940×34 · #603432×8 · #4F3C3E×14 · #51444E×6 · #734543×7 · #5D565D×13 · #B35350×11 · #706770×13 · #CDA886×4 · #F6E0BF×4

## 065. netherite_longbow.png
- **Categoria e observação:** ícone completo. Arco vinho/cinza com pequenos pontos azulados; corda bege/rosa, sombra colorida profunda.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 116 pixels visíveis (11.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 14 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #4A2940 (24 px de borda), #231012 (19 px de borda), #20316B (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Arco vinho/cinza com pequenos pontos azulados; corda bege/rosa, sombra colorida profunda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×23 · #20316B×6 · #4A2940×28 · #603432×4 · #283D87×6 · #4F3C3E×2 · #51444E×8 · #734543×3 · #5D565D×6 · #3569E0×6 · #B35350×6 · #706770×8 · #CDA886×6 · #F6E0BF×4

## 066. netherite_longbow_pulling_0.png
- **Categoria e observação:** ícone completo. Arco vinho/cinza com pequenos pontos azulados; corda bege/rosa, sombra colorida profunda. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 135 pixels visíveis (13.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 19 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #4A2940 (23 px de borda), #231012 (18 px de borda), #B35350 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.87°; ver categoria antes de interpretar como eixo. 119 pixels RGBA diferentes de `netherite_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Arco vinho/cinza com pequenos pontos azulados; corda bege/rosa, sombra colorida profunda. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×22 · #281E0B×9 · #20316B×6 · #4A2940×27 · #603432×3 · #283D87×6 · #4F3C3E×2 · #51444E×8 · #734543×2 · #5D565D×6 · #3569E0×6 · #B35350×8 · #706770×8 · #896727×8 · #CDA886×6 · #B1B1B1×1 · #D8D8D8×1 · #F6E0BF×5 · #FFFFFF×1

## 067. netherite_longbow_pulling_1.png
- **Categoria e observação:** ícone completo. Arco vinho/cinza com pequenos pontos azulados; corda bege/rosa, sombra colorida profunda. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 137 pixels visíveis (13.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 19 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #4A2940 (23 px de borda), #231012 (20 px de borda), #CDA886 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.99°; ver categoria antes de interpretar como eixo. 148 pixels RGBA diferentes de `netherite_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Arco vinho/cinza com pequenos pontos azulados; corda bege/rosa, sombra colorida profunda. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×22 · #281E0B×8 · #20316B×6 · #4A2940×27 · #603432×3 · #283D87×6 · #4F3C3E×2 · #51444E×8 · #734543×2 · #5D565D×6 · #3569E0×6 · #B35350×8 · #706770×8 · #896727×8 · #CDA886×12 · #B1B1B1×1 · #D8D8D8×1 · #F6E0BF×2 · #FFFFFF×1

## 068. netherite_longbow_pulling_2.png
- **Categoria e observação:** ícone completo. Arco vinho/cinza com pequenos pontos azulados; corda bege/rosa, sombra colorida profunda. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 141 pixels visíveis (13.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 19 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #4A2940 (23 px de borda), #231012 (20 px de borda), #B35350 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.12°; ver categoria antes de interpretar como eixo. 163 pixels RGBA diferentes de `netherite_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Arco vinho/cinza com pequenos pontos azulados; corda bege/rosa, sombra colorida profunda. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×22 · #281E0B×9 · #20316B×6 · #4A2940×27 · #603432×3 · #283D87×6 · #4F3C3E×2 · #51444E×8 · #734543×2 · #5D565D×6 · #3569E0×6 · #B35350×12 · #706770×8 · #896727×8 · #CDA886×8 · #B1B1B1×1 · #D8D8D8×1 · #F6E0BF×5 · #FFFFFF×1

## 069. netherite_ranger_armor_chest.png
- **Categoria e observação:** ícone completo. Peitoral com ombreiras laterais, em verde-petróleo com ferragens vinho/cinza; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [0, 1, 15, 15], 15×14; 173 pixels visíveis (67.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 14 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #111E21 (19 px de borda), #241F20 (10 px de borda), #101013 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 61.74°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Peitoral com ombreiras laterais, em verde-petróleo com ferragens vinho/cinza; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #090E10×5 · #101013×18 · #111E21×26 · #241F20×22 · #232114×9 · #0E2E2B×26 · #352D2D×1 · #123D3A×13 · #373537×4 · #473E3F×11 · #194E47×17 · #24664F×6 · #5D565D×7 · #766A76×8

## 070. netherite_ranger_armor_feet.png
- **Categoria e observação:** ícone completo. Par de botas em duas ilhas intencionais, em verde-petróleo com ferragens vinho/cinza; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [2, 3, 15, 14], 13×11; 96 pixels visíveis (37.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 10 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2C1F1C (19 px de borda), #241F20 (15 px de borda), #101013 (4 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 13.11°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Par de botas em duas ilhas intencionais, em verde-petróleo com ferragens vinho/cinza; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #101013×8 · #241F20×17 · #2C1F1C×20 · #412E1C×12 · #3F303B×5 · #593927×8 · #51444E×6 · #6E4630×10 · #865744×3 · #766A76×7

## 071. netherite_ranger_armor_head.png
- **Categoria e observação:** ícone completo. Capacete curvo com espaço interno escuro, em verde-petróleo com ferragens vinho/cinza; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [1, 2, 15, 14], 14×12; 123 pixels visíveis (48.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 12 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #111E21 (20 px de borda), #123D3A (9 px de borda), #0E2E2B (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -18.31°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Capacete curvo com espaço interno escuro, em verde-petróleo com ferragens vinho/cinza; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #111E21×43 · #241F20×1 · #0E2E2B×10 · #123D3A×17 · #3F303B×5 · #49393F×6 · #194E47×14 · #51444E×2 · #24664F×6 · #5D565D×7 · #766A76×10 · #8F808F×2

## 072. netherite_ranger_armor_legs.png
- **Categoria e observação:** ícone completo. Perneiras com duas pernas e vão central, em verde-petróleo com ferragens vinho/cinza; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [1, 2, 15, 15], 14×13; 130 pixels visíveis (50.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #111E21 (14 px de borda), #0E2E2B (12 px de borda), #101013 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 3.85°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Perneiras com duas pernas e vão central, em verde-petróleo com ferragens vinho/cinza; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #090E10×5 · #101013×7 · #111E21×21 · #241F20×8 · #0E2E2B×21 · #322727×7 · #123D3A×15 · #3F303B×13 · #49393F×5 · #473E3F×2 · #194E47×6 · #51444E×4 · #24664F×6 · #5D565D×4 · #766A76×4 · #8F808F×2

## 073. netherite_rapid_crossbow_arrow.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 163 pixels visíveis (63.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (27 px de borda), #4A2940 (14 px de borda), #322727 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 53 pixels RGBA diferentes de `netherite_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×6 · #231012×33 · #2F2122×6 · #322727×14 · #4A2940×20 · #45320D×1 · #603432×4 · #543D12×14 · #4F3C3E×6 · #444444×2 · #51444E×2 · #734543×8 · #6D4F18×3 · #5D565D×12 · #B35350×4 · #706770×3 · #896727×7 · #969696×2 · #CDA886×6 · #D8D8D8×1 · #F6E0BF×6 · #FFFFFF×3

## 074. netherite_rapid_crossbow_firework.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 177 pixels visíveis (69.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 25 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (27 px de borda), #322727 (12 px de borda), #4A2940 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 69 pixels RGBA diferentes de `netherite_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×6 · #231012×33 · #171A24×6 · #2F2122×6 · #222530×10 · #6D1717×2 · #322727×12 · #841B1B×3 · #4A2940×20 · #2F364D×5 · #603432×4 · #4F3C3E×6 · #992929×4 · #51444E×2 · #B92929×4 · #D62A2A×7 · #734543×8 · #5D565D×12 · #B35350×4 · #706770×3 · #5C8189×3 · #CDA886×6 · #B2CCD1×3 · #F6E0BF×6 · #F4F4F4×2

## 075. netherite_rapid_crossbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 153 pixels visíveis (59.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (27 px de borda), #4A2940 (16 px de borda), #322727 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 15 pixels RGBA diferentes de `netherite_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×11 · #231012×33 · #2F2122×6 · #850C0C×6 · #322727×15 · #4A2940×26 · #603432×6 · #4F3C3E×10 · #51444E×3 · #734543×8 · #5D565D×13 · #B35350×4 · #706770×5 · #CDA886×5 · #F6E0BF×2

## 076. netherite_rapid_crossbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 157 pixels visíveis (61.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (27 px de borda), #4A2940 (16 px de borda), #322727 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 20 pixels RGBA diferentes de `netherite_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×11 · #231012×35 · #2F2122×6 · #850C0C×6 · #322727×15 · #4A2940×25 · #603432×7 · #4F3C3E×10 · #51444E×3 · #734543×8 · #5D565D×13 · #B35350×4 · #706770×5 · #CDA886×5 · #F6E0BF×4

## 077. netherite_rapid_crossbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 159 pixels visíveis (62.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (27 px de borda), #4A2940 (16 px de borda), #322727 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 23 pixels RGBA diferentes de `netherite_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×11 · #231012×33 · #2F2122×6 · #850C0C×6 · #322727×15 · #4A2940×26 · #603432×9 · #4F3C3E×8 · #51444E×3 · #734543×8 · #5D565D×13 · #B35350×4 · #706770×5 · #CDA886×6 · #F6E0BF×6

## 078. netherite_rapid_crossbow_standby.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 153 pixels visíveis (59.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (27 px de borda), #4A2940 (16 px de borda), #322727 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros vinho/cinza e miolo vermelho escuro; corda creme contrastante. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×13 · #231012×35 · #2F2122×6 · #850C0C×6 · #322727×15 · #4A2940×24 · #603432×6 · #4F3C3E×10 · #51444E×3 · #734543×8 · #5D565D×13 · #B35350×2 · #706770×5 · #CDA886×4 · #F6E0BF×3

## 079. netherite_shortbow.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e pontas vermelhas; corda creme, brilho local sem borda branca geral.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 85 pixels visíveis (33.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 12 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (16 px de borda), #4A2940 (14 px de borda), #420000 (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros vinho/cinza e pontas vermelhas; corda creme, brilho local sem borda branca geral. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×15 · #231012×16 · #850C0C×5 · #322727×2 · #4A2940×14 · #BC1010×5 · #4F3C3E×6 · #5D565D×10 · #B35350×2 · #706770×4 · #CDA886×2 · #F6E0BF×4

## 080. netherite_shortbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e pontas vermelhas; corda creme, brilho local sem borda branca geral. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 100 pixels visíveis (39.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 17 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (16 px de borda), #4A2940 (14 px de borda), #420000 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.38°; ver categoria antes de interpretar como eixo. 89 pixels RGBA diferentes de `netherite_shortbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza e pontas vermelhas; corda creme, brilho local sem borda branca geral. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×11 · #231012×16 · #281E0B×8 · #850C0C×4 · #322727×2 · #4A2940×14 · #BC1010×4 · #4F3C3E×6 · #5D565D×10 · #B35350×2 · #706770×4 · #896727×8 · #CDA886×4 · #B1B1B1×1 · #D8D8D8×1 · #F6E0BF×4 · #FFFFFF×1

## 081. netherite_shortbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e pontas vermelhas; corda creme, brilho local sem borda branca geral. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 101 pixels visíveis (39.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 17 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (16 px de borda), #4A2940 (14 px de borda), #420000 (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.25°; ver categoria antes de interpretar como eixo. 111 pixels RGBA diferentes de `netherite_shortbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza e pontas vermelhas; corda creme, brilho local sem borda branca geral. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×12 · #231012×16 · #281E0B×8 · #850C0C×5 · #322727×2 · #4A2940×14 · #BC1010×4 · #4F3C3E×6 · #5D565D×10 · #B35350×2 · #706770×4 · #896727×7 · #CDA886×4 · #B1B1B1×1 · #D8D8D8×1 · #F6E0BF×4 · #FFFFFF×1

## 082. netherite_shortbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros vinho/cinza e pontas vermelhas; corda creme, brilho local sem borda branca geral. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 104 pixels visíveis (40.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 17 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (16 px de borda), #4A2940 (14 px de borda), #420000 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.92°; ver categoria antes de interpretar como eixo. 127 pixels RGBA diferentes de `netherite_shortbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/cinza e pontas vermelhas; corda creme, brilho local sem borda branca geral. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×11 · #231012×16 · #281E0B×8 · #850C0C×4 · #322727×2 · #4A2940×14 · #BC1010×4 · #4F3C3E×6 · #5D565D×10 · #B35350×2 · #706770×4 · #896727×8 · #CDA886×8 · #B1B1B1×1 · #D8D8D8×1 · #F6E0BF×4 · #FFFFFF×1

## 083. netherite_spear.png
- **Categoria e observação:** ícone completo. Haste e ponta escuras vinho/cinza; contraste baixo deliberado, brilho discreto.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 94 pixels visíveis (9.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 12 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231012 (23 px de borda), #2F2122 (22 px de borda), #4A2940 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Haste e ponta escuras vinho/cinza; contraste baixo deliberado, brilho discreto. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #231012×23 · #2F2122×22 · #341F2D×7 · #322727×2 · #4A2940×8 · #463939×5 · #603432×7 · #4F3C3E×9 · #734543×4 · #5D565D×2 · #706770×2 · #867B86×3

## 084. quiver/large_quiver.png
- **Categoria e observação:** atlas UV aparente. Ilhas retangulares do corpo e tira/fecho; flecha clara em região independente do atlas. Não interpretar espaços entre ilhas como furos na arma.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 156 pixels visíveis (60.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 17 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #11474C (12 px de borda), #51444E (10 px de borda), #1A373C (9 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -68.92°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Ilhas retangulares do corpo e tira/fecho; flecha clara em região independente do atlas. Não interpretar espaços entre ilhas como furos na arma. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #241F20×4 · #13292E×1 · #322727×6 · #1A373C×35 · #3F303B×11 · #11474C×33 · #49393F×1 · #11545A×13 · #51444E×15 · #7D4925×2 · #146762×1 · #5D565D×15 · #127663×1 · #896727×3 · #766A76×9 · #969696×3 · #D8D8D8×3

## 085. quiver/medium_quiver.png
- **Categoria e observação:** atlas UV aparente. Ilhas retangulares do corpo e tira/fecho; flecha clara em região independente do atlas. Não interpretar espaços entre ilhas como furos na arma.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 150 pixels visíveis (58.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 13 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #51342A (21 px de borda), #3D2321 (20 px de borda), #452B24 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -69.33°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Ilhas retangulares do corpo e tira/fecho; flecha clara em região independente do atlas. Não interpretar espaços entre ilhas como furos na arma. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #2F1A17×1 · #3D2321×34 · #452B24×34 · #51342A×38 · #5A3E31×16 · #6D4534×9 · #7D4925×2 · #7E4F3A×5 · #896727×3 · #969696×3 · #FFC637×1 · #D8D8D8×3 · #FFE92B×1

## 086. quiver/small_quiver.png
- **Categoria e observação:** atlas UV aparente. Ilhas retangulares do corpo e tira/fecho; flecha clara em região independente do atlas. Não interpretar espaços entre ilhas como furos na arma.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 149 pixels visíveis (58.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 10 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #452B24 (21 px de borda), #2F1A17 (19 px de borda), #3D2321 (15 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -69.08°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Ilhas retangulares do corpo e tira/fecho; flecha clara em região independente do atlas. Não interpretar espaços entre ilhas como furos na arma. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #2F1A17×26 · #3D2321×44 · #452B24×38 · #51342A×16 · #5A3E31×9 · #6D4534×5 · #7D4925×2 · #896727×3 · #969696×3 · #D8D8D8×3

## 087. ranger_armor_chest.png
- **Categoria e observação:** ícone completo. Peitoral com ombreiras laterais, em verde com acessórios de couro marrom; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [0, 2, 15, 15], 15×13; 164 pixels visíveis (64.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 9 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #192921 (21 px de borda), #2C1F1C (12 px de borda), #412E1C (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 28.21°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Peitoral com ombreiras laterais, em verde com acessórios de couro marrom; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #2C1F1C×19 · #192921×33 · #183920×26 · #412E1C×26 · #593927×11 · #1F4C2B×14 · #6E4630×11 · #2A6235×18 · #3C7F3B×6

## 088. ranger_armor_feet.png
- **Categoria e observação:** ícone completo. Par de botas em duas ilhas intencionais, em verde com acessórios de couro marrom; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [2, 3, 15, 14], 13×11; 96 pixels visíveis (37.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2C1F1C (21 px de borda), #412E1C (10 px de borda), #593927 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 13.11°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Par de botas em duas ilhas intencionais, em verde com acessórios de couro marrom; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #2C1F1C×22 · #412E1C×22 · #593927×21 · #6E4630×10 · #6D4E30×5 · #865744×3 · #805D3B×6 · #A8773C×7

## 089. ranger_armor_head.png
- **Categoria e observação:** ícone completo. Capacete curvo com espaço interno escuro, em verde com acessórios de couro marrom; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [1, 2, 15, 14], 14×12; 123 pixels visíveis (48.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 5 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #192921 (20 px de borda), #1F4C2B (9 px de borda), #183920 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -18.31°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Capacete curvo com espaço interno escuro, em verde com acessórios de couro marrom; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #192921×43 · #183920×19 · #1F4C2B×23 · #2A6235×21 · #3C7F3B×17

## 090. ranger_armor_legs.png
- **Categoria e observação:** ícone completo. Perneiras com duas pernas e vão central, em verde com acessórios de couro marrom; leitura frontal compacta, sem diagonal obrigatória.
- **Resolução/proporção:** 16×16; bbox [1, 2, 15, 15], 14×13; 131 pixels visíveis (51.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 12 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #192921 (20 px de borda), #183920 (14 px de borda), #1F4C2B (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 10.83°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Perneiras com duas pernas e vão central, em verde com acessórios de couro marrom; leitura frontal compacta, sem diagonal obrigatória. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #2C1F1C×7 · #192921×26 · #183920×32 · #412E1C×11 · #593927×4 · #1F4C2B×18 · #6E4630×4 · #2A6235×15 · #745408×3 · #3C7F3B×8 · #C58B2C×2 · #FFD825×1

## 091. rapid_crossbow_arrow.png
- **Categoria e observação:** ícone completo. Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 164 pixels visíveis (64.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #201413 (30 px de borda), #3F4149 (16 px de borda), #422E23 (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 43.5°; ver categoria antes de interpretar como eixo. 66 pixels RGBA diferentes de `rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×6 · #201413×36 · #422E23×19 · #45320D×1 · #543D12×14 · #3F4149×16 · #444444×6 · #6D4A18×4 · #6D4F18×3 · #5A5F6A×8 · #95622A×10 · #896727×7 · #6D6D6D×9 · #969696×8 · #93979D×10 · #CCD4D7×3 · #D8D8D8×1 · #FFFFFF×3

## 092. rapid_crossbow_firework.png
- **Categoria e observação:** ícone completo. Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 176 pixels visíveis (68.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 23 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #201413 (30 px de borda), #3F4149 (14 px de borda), #422E23 (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 44.41°; ver categoria antes de interpretar como eixo. 86 pixels RGBA diferentes de `rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×6 · #201413×36 · #171A24×6 · #222530×10 · #6D1717×2 · #841B1B×3 · #422E23×17 · #2F364D×5 · #992929×4 · #3F4149×16 · #444444×4 · #B92929×4 · #6D4A18×4 · #D62A2A×7 · #5A5F6A×8 · #95622A×10 · #6D6D6D×7 · #5C8189×3 · #969696×6 · #93979D×10 · #B2CCD1×3 · #CCD4D7×3 · #F4F4F4×2

## 093. rapid_crossbow_pulling_0.png
- **Categoria e observação:** ícone completo. Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 151 pixels visíveis (59.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 13 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #201413 (30 px de borda), #3F4149 (16 px de borda), #422E23 (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 94 pixels RGBA diferentes de `rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×11 · #201413×36 · #850C0C×6 · #422E23×22 · #3F4149×18 · #444444×4 · #6D4A18×11 · #5A5F6A×10 · #95622A×12 · #6D6D6D×5 · #969696×2 · #93979D×11 · #CCD4D7×3

## 094. rapid_crossbow_pulling_1.png
- **Categoria e observação:** ícone completo. Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 155 pixels visíveis (60.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 13 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #201413 (30 px de borda), #3F4149 (16 px de borda), #422E23 (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 20 pixels RGBA diferentes de `rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×12 · #201413×38 · #850C0C×6 · #422E23×23 · #3F4149×18 · #444444×4 · #6D4A18×9 · #5A5F6A×10 · #95622A×12 · #6D6D6D×5 · #969696×4 · #93979D×11 · #CCD4D7×3

## 095. rapid_crossbow_pulling_2.png
- **Categoria e observação:** ícone completo. Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 158 pixels visíveis (61.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 13 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #201413 (30 px de borda), #3F4149 (16 px de borda), #422E23 (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 41.36°; ver categoria antes de interpretar como eixo. 24 pixels RGBA diferentes de `rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×12 · #201413×36 · #850C0C×6 · #422E23×24 · #3F4149×18 · #444444×4 · #6D4A18×11 · #5A5F6A×8 · #95622A×12 · #6D6D6D×7 · #969696×6 · #93979D×11 · #CCD4D7×3

## 096. rapid_crossbow_standby.png
- **Categoria e observação:** ícone completo. Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 151 pixels visíveis (59.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 13 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #201413 (30 px de borda), #3F4149 (16 px de borda), #422E23 (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Madeira ocre, ferragens cinza e centro vermelho escuro; coronha para baixo/direita e membros cruzados. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×13 · #201413×38 · #850C0C×6 · #422E23×22 · #3F4149×18 · #444444×4 · #6D4A18×9 · #5A5F6A×10 · #95622A×12 · #6D6D6D×4 · #969696×1 · #93979D×11 · #CCD4D7×3

## 097. royal_longbow.png
- **Categoria e observação:** ícone completo. Membros dourados/ocres com joias azuis; corda cinza; highlights nas pequenas incrustações.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 112 pixels visíveis (10.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 14 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #6C300B (18 px de borda), #444444 (15 px de borda), #361301 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros dourados/ocres com joias azuis; corda cinza; highlights nas pequenas incrustações. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #361301×18 · #20316B×4 · #6C300B×20 · #283D87×8 · #444444×15 · #7A5C0A×4 · #3569E0×6 · #6B6B6B×6 · #A87A10×8 · #868686×8 · #B7B7B9×2 · #E6B83A×8 · #CCDADD×1 · #FFEFD2×4

## 098. royal_longbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros dourados/ocres com joias azuis; corda cinza; highlights nas pequenas incrustações. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 131 pixels visíveis (12.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #6C300B (18 px de borda), #444444 (15 px de borda), #361301 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.86°; ver categoria antes de interpretar como eixo. 168 pixels RGBA diferentes de `royal_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados/ocres com joias azuis; corda cinza; highlights nas pequenas incrustações. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #361301×18 · #281E0B×9 · #20316B×4 · #6C300B×20 · #283D87×8 · #444444×15 · #7A5C0A×4 · #3569E0×6 · #896727×8 · #6B6B6B×8 · #A87A10×8 · #868686×6 · #B1B1B1×1 · #B7B7B9×2 · #E6B83A×8 · #D8D8D8×1 · #FFEFD2×4 · #FFFFFF×1

## 099. royal_longbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros dourados/ocres com joias azuis; corda cinza; highlights nas pequenas incrustações. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 133 pixels visíveis (13.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #6C300B (18 px de borda), #361301 (16 px de borda), #444444 (15 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.98°; ver categoria antes de interpretar como eixo. 180 pixels RGBA diferentes de `royal_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados/ocres com joias azuis; corda cinza; highlights nas pequenas incrustações. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #361301×18 · #281E0B×8 · #20316B×4 · #6C300B×20 · #283D87×8 · #444444×15 · #7A5C0A×4 · #3569E0×6 · #896727×8 · #6B6B6B×14 · #A87A10×8 · #868686×3 · #B1B1B1×1 · #B7B7B9×2 · #E6B83A×8 · #D8D8D8×1 · #FFEFD2×4 · #FFFFFF×1

## 100. royal_longbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros dourados/ocres com joias azuis; corda cinza; highlights nas pequenas incrustações. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 137 pixels visíveis (13.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #444444 (19 px de borda), #6C300B (18 px de borda), #361301 (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.12°; ver categoria antes de interpretar como eixo. 187 pixels RGBA diferentes de `royal_longbow.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados/ocres com joias azuis; corda cinza; highlights nas pequenas incrustações. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #361301×18 · #281E0B×9 · #20316B×4 · #6C300B×20 · #283D87×8 · #444444×19 · #7A5C0A×4 · #3569E0×6 · #896727×8 · #6B6B6B×10 · #A87A10×8 · #868686×6 · #B1B1B1×1 · #B7B7B9×2 · #E6B83A×8 · #D8D8D8×1 · #FFEFD2×4 · #FFFFFF×1

## 101. ruby_heavy_crossbow_arrow.png
- **Categoria e observação:** ícone completo. Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 206 pixels visíveis (20.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 24 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (19 px de borda), #4C000B (18 px de borda), #B35350 (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 161 pixels RGBA diferentes de `ruby_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×24 · #231012×12 · #69000F×2 · #740011×29 · #910015×1 · #322727×10 · #AB0C23×10 · #4A2940×19 · #45320D×1 · #543D12×14 · #4F3C3E×2 · #D91A2B×10 · #444444×2 · #51444E×2 · #6D4F18×3 · #B35350×19 · #896727×7 · #E95F6B×9 · #969696×2 · #CDA886×10 · #FCC7CB×6 · #D8D8D8×1 · #F6E0BF×8 · #FFFFFF×3

## 102. ruby_heavy_crossbow_firework.png
- **Categoria e observação:** ícone completo. Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 209 pixels visíveis (20.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 25 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (19 px de borda), #4C000B (18 px de borda), #B35350 (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 191 pixels RGBA diferentes de `ruby_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×24 · #231012×12 · #69000F×2 · #740011×25 · #171A24×6 · #910015×1 · #222530×10 · #6D1717×2 · #322727×10 · #AB0C23×10 · #841B1B×3 · #4A2940×14 · #2F364D×5 · #992929×4 · #D91A2B×10 · #B92929×4 · #D62A2A×7 · #B35350×19 · #5C8189×3 · #E95F6B×9 · #CDA886×10 · #B2CCD1×3 · #FCC7CB×6 · #F6E0BF×8 · #F4F4F4×2

## 103. ruby_heavy_crossbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 190 pixels visíveis (18.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (19 px de borda), #4C000B (18 px de borda), #4A2940 (15 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 72 pixels RGBA diferentes de `ruby_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×27 · #231012×12 · #69000F×2 · #740011×32 · #910015×2 · #322727×15 · #AB0C23×11 · #4A2940×22 · #603432×2 · #4F3C3E×3 · #D91A2B×12 · #51444E×4 · #734543×6 · #5D565D×2 · #B35350×12 · #706770×1 · #E95F6B×9 · #CDA886×2 · #FCC7CB×7 · #F6E0BF×7

## 104. ruby_heavy_crossbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 194 pixels visíveis (18.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (19 px de borda), #4C000B (18 px de borda), #4A2940 (15 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 90 pixels RGBA diferentes de `ruby_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×27 · #231012×12 · #69000F×2 · #740011×32 · #910015×2 · #322727×13 · #AB0C23×11 · #4A2940×24 · #603432×2 · #4F3C3E×3 · #D91A2B×12 · #51444E×4 · #734543×6 · #5D565D×2 · #B35350×14 · #706770×1 · #E95F6B×9 · #CDA886×4 · #FCC7CB×7 · #F6E0BF×7

## 105. ruby_heavy_crossbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 206 pixels visíveis (20.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (19 px de borda), #4C000B (18 px de borda), #B35350 (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 122 pixels RGBA diferentes de `ruby_heavy_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×27 · #231012×12 · #69000F×2 · #740011×32 · #910015×1 · #322727×13 · #AB0C23×11 · #4A2940×23 · #603432×2 · #4F3C3E×3 · #D91A2B×12 · #51444E×4 · #734543×8 · #5D565D×2 · #B35350×19 · #706770×1 · #E95F6B×9 · #CDA886×10 · #FCC7CB×7 · #F6E0BF×8

## 106. ruby_heavy_crossbow_standby.png
- **Categoria e observação:** ícone completo. Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 32×32; bbox [7, 7, 25, 25], 18×18; 184 pixels visíveis (18.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (19 px de borda), #4C000B (16 px de borda), #231012 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros rubros com brilho rosa/branco, corpo escuro; corda creme/rosa. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×27 · #231012×14 · #69000F×2 · #740011×32 · #910015×2 · #322727×13 · #AB0C23×11 · #4A2940×12 · #663230×6 · #4F3C3E×3 · #D91A2B×12 · #51444E×4 · #734543×8 · #5D565D×2 · #B35350×11 · #706770×1 · #E95F6B×9 · #CDA886×4 · #FCC7CB×7 · #F6E0BF×4

## 107. ruby_rapid_crossbow_arrow.png
- **Categoria e observação:** ícone completo. Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 167 pixels visíveis (65.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (26 px de borda), #4C000B (18 px de borda), #231012 (15 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 92 pixels RGBA diferentes de `ruby_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×8 · #4C000B×24 · #231012×17 · #740011×28 · #2F2122×6 · #AB0C23×10 · #45320D×1 · #543D12×14 · #D91A2B×6 · #444444×2 · #6D4F18×3 · #5D565D×2 · #B35350×4 · #706770×1 · #896727×7 · #E95F6B×8 · #969696×2 · #CDA886×6 · #FCC7CB×8 · #D8D8D8×1 · #F6E0BF×6 · #FFFFFF×3

## 108. ruby_rapid_crossbow_firework.png
- **Categoria e observação:** ícone completo. Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 175 pixels visíveis (68.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 25 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (22 px de borda), #4C000B (18 px de borda), #231012 (15 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 109 pixels RGBA diferentes de `ruby_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×8 · #4C000B×22 · #231012×17 · #740011×22 · #171A24×6 · #2F2122×6 · #222530×10 · #6D1717×2 · #AB0C23×10 · #841B1B×3 · #2F364D×5 · #992929×4 · #D91A2B×6 · #B92929×4 · #D62A2A×7 · #5D565D×2 · #B35350×4 · #706770×1 · #5C8189×3 · #E95F6B×8 · #CDA886×6 · #B2CCD1×3 · #FCC7CB×8 · #F6E0BF×6 · #F4F4F4×2

## 109. ruby_rapid_crossbow_pulling_0.png
- **Categoria e observação:** ícone completo. Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 157 pixels visíveis (61.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (30 px de borda), #4C000B (18 px de borda), #231012 (15 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 40 pixels RGBA diferentes de `ruby_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×10 · #4C000B×27 · #231012×17 · #740011×31 · #2F2122×6 · #850C0C×6 · #AB0C23×10 · #4A2940×4 · #603432×2 · #4F3C3E×2 · #D91A2B×8 · #5D565D×3 · #B35350×4 · #706770×1 · #E95F6B×11 · #CDA886×5 · #FCC7CB×8 · #F6E0BF×2

## 110. ruby_rapid_crossbow_pulling_1.png
- **Categoria e observação:** ícone completo. Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 161 pixels visíveis (62.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 17 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (30 px de borda), #4C000B (18 px de borda), #231012 (15 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 47 pixels RGBA diferentes de `ruby_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×13 · #4C000B×27 · #231012×19 · #740011×31 · #2F2122×6 · #850C0C×6 · #AB0C23×10 · #4A2940×3 · #4F3C3E×2 · #D91A2B×8 · #5D565D×3 · #B35350×4 · #706770×1 · #E95F6B×11 · #CDA886×5 · #FCC7CB×8 · #F6E0BF×4

## 111. ruby_rapid_crossbow_pulling_2.png
- **Categoria e observação:** ícone completo. Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 163 pixels visíveis (63.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 17 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (30 px de borda), #4C000B (18 px de borda), #231012 (15 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 54 pixels RGBA diferentes de `ruby_rapid_crossbow_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×13 · #4C000B×27 · #231012×17 · #740011×31 · #2F2122×6 · #850C0C×6 · #AB0C23×10 · #4A2940×4 · #603432×2 · #D91A2B×8 · #5D565D×3 · #B35350×4 · #706770×1 · #E95F6B×11 · #CDA886×6 · #FCC7CB×8 · #F6E0BF×6

## 112. ruby_rapid_crossbow_standby.png
- **Categoria e observação:** ícone completo. Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 157 pixels visíveis (61.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #740011 (30 px de borda), #4C000B (18 px de borda), #231012 (17 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros vermelhos de grandes faces e bordas rosa clara; corpo escuro e corda creme. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #420000×10 · #4C000B×27 · #231012×19 · #740011×31 · #2F2122×6 · #850C0C×6 · #AB0C23×10 · #4A2940×4 · #603432×2 · #4F3C3E×2 · #D91A2B×8 · #5D565D×3 · #B35350×2 · #706770×1 · #E95F6B×11 · #CDA886×4 · #FCC7CB×8 · #F6E0BF×3

## 113. ruby_spear.png
- **Categoria e observação:** ícone completo. Haste escura; cabeça vermelha facetada com highlight rosa claro.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 106 pixels visíveis (10.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 11 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2F2122 (17 px de borda), #231012 (17 px de borda), #740011 (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Haste escura; cabeça vermelha facetada com highlight rosa claro. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×15 · #231012×18 · #740011×19 · #2F2122×18 · #AB0C23×5 · #CE1425×5 · #603432×4 · #51444E×9 · #734543×5 · #E95F6B×4 · #F8C0C5×4

## 114. small_quiver.png
- **Categoria e observação:** ícone completo. Corpo de couro marrom, borda quase preta colorida, alça cinza/bege. Silhueta inclinada mais vertical que 45°.
- **Resolução/proporção:** 16×16; bbox [2, 1, 14, 15], 12×14; 92 pixels visíveis (35.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1C1616 (14 px de borda), #312018 (9 px de borda), #6B6464 (9 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -55.87°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Corpo de couro marrom, borda quase preta colorida, alça cinza/bege. Silhueta inclinada mais vertical que 45°. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1C1616×15 · #312018×12 · #41291F×11 · #55362A×17 · #6E4738×13 · #6B6464×11 · #897A7A×7 · #C0B4A8×6

## 115. small_quiver_filled.png
- **Categoria e observação:** ícone completo. Corpo de couro marrom, borda quase preta colorida, alça cinza/bege. Silhueta inclinada mais vertical que 45°. Variante preenchida: penas claras surgem junto à boca e alteram a bbox/paleta.
- **Resolução/proporção:** 16×16; bbox [2, 1, 15, 15], 13×14; 97 pixels visíveis (37.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 11 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1C1616 (14 px de borda), #6B6464 (9 px de borda), #C0B4A8 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -51.12°; ver categoria antes de interpretar como eixo. 24 pixels RGBA diferentes de `small_quiver.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Corpo de couro marrom, borda quase preta colorida, alça cinza/bege. Silhueta inclinada mais vertical que 45°. Variante preenchida: penas claras surgem junto à boca e alteram a bbox/paleta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1C1616×15 · #312018×9 · #41291F×8 · #293133×3 · #55362A×15 · #6E4738×13 · #6B6464×11 · #897A7A×7 · #A9A9A9×4 · #C0B4A8×6 · #DEDEDE×6

## 116. unique_claymore_1.png
- **Categoria e observação:** ícone completo. Lâmina com núcleo laranja/amarelo e moldura fria; guarda escura vermelha e cabo fino marrom.
- **Resolução/proporção:** 32×32; bbox [0, 0, 32, 32], 32×32; 216 pixels visíveis (21.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2C2D34 (15 px de borda), #150F18 (11 px de borda), #82908E (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina com núcleo laranja/amarelo e moldura fria; guarda escura vermelha e cabo fino marrom. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #340413×11 · #150F18×22 · #290F0A×5 · #520818×7 · #930206×10 · #54210E×5 · #2C2D34×37 · #6A2508×10 · #34353C×10 · #DC1500×23 · #7A3718×6 · #566770×13 · #B86329×2 · #C36B02×1 · #FF750D×11 · #82908E×14 · #FFA922×6 · #EFB437×2 · #BACEC9×9 · #FFD02B×3 · #FFEEA5×1 · #F1FFFE×8

## 117. unique_claymore_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina com núcleo laranja/amarelo e moldura fria; guarda escura vermelha e cabo fino marrom. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [7, 2, 30, 25], 23×23; 60 pixels visíveis (5.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 6 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #DC1500 (21 px de borda), #FF750D (10 px de borda), #930206 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina com núcleo laranja/amarelo e moldura fria; guarda escura vermelha e cabo fino marrom. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #520818×7 · #930206×10 · #DC1500×23 · #FF750D×11 · #FFA922×6 · #FFD02B×3

## 118. unique_claymore_2.png
- **Categoria e observação:** ícone completo. Lâmina cinza/lilás clara, guarda dourada grande com gema azul; sombras azuladas.
- **Resolução/proporção:** 32×32; bbox [0, 0, 32, 32], 32×32; 250 pixels visíveis (24.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 189 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #313131 (6 px de borda), #767676 (4 px de borda), #3E3C5A (3 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (189 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 189 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina cinza/lilás clara, guarda dourada grande com gema azul; sombras azuladas. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0F0F35×1 · #12102E×1 · #0E122E×1 · #0F122E×1 · #141432×1 · #181525×1 · #191525×1 · #151533×2 · #181627×1 · #1A172C×1 · #1F192A×1 · #211927×1 · #1E1B28×1 · #1D1C2E×1 · #551000×1 · #201B37×1 · #531200×2 · #201D31×1 · #1E1E2F×1 · #211D32×1 · #1F1E2E×1 · #541300×1 · #211E34×1 · #1D202F×1 · #201F34×1 · #581400×1 · #521600×1 · #4C1B06×1 · #511A05×1 · #5C1800×1 · #4B1D02×1 · #501C02×1 · #511C01×1 · #591C01×2 · #601B00×1 · #571D0A×1 · #25283E×1 · #591F00×1 · #651D02×1 · #5A2006×2 · #582102×4 · #562201×1 · #5D2002×1 · #651E00×1 · #621F00×1 · #5C2104×1 · #542308×2 · #621E1C×4 · #592401×1 · #641F17×1 · #671F13×1 · #672106×1 · #2E2D43×1 · #732104×1 · #313131×7 · #6B240B×1 · #682700×1 · #1F3099×5 · #7A2800×1 · #693000×1 · #383859×1 · #912A01×2 · #3E3C5A×5 · #3C3E5C×1 · #3E3F5D×1 · #423E5C×1 · #413F60×1 · #3F405C×2 · #3D4063×1 · #413F63×1 · #823600×1 · #42405D×1 · #43415D×1 · #414163×1 · #7E3900×1 · #853700×1 · #41425D×1 · #42425C×1 · #9E3100×1 · #434264×1 · #983300×1 · #424360×2 · #41445F×1 · #454365×1 · #424464×1 · #424467×1 · #AB3000×1 · #45455F×1 · #4B455D×1 · #4A475B×1 · #AD3500×1 · #48496A×1 · #4C4962×2 · #B23500×1 · #4B4B66×1 · #AE3800×1 · #504A70×1 · #4A4D69×1 · #4C4E65×1 · #4F4F66×1 · #4E4F69×1 · #4F5068×1 · #505068×1 · #505168×1 · #515169×1 · #52526B×1 · #994900×1 · #A64600×1 · #9E4903×1 · #9C4A00×1 · #934D06×1 · #A14A00×1 · #974D00×1 · #54566D×1 · #A14D00×1 · #5D5674×2 · #59586D×1 · #5B5C72×1 · #5C5C71×1 · #5B5C75×1 · #595D72×1 · #5D5F76×1 · #606379×1 · #B15610×4 · #636379×1 · #A85B04×1 · #63657C×1 · #656578×3 · #B45F09×1 · #696B7D×1 · #696C7D×1 · #2C75DA×2 · #696D7F×1 · #6A6D81×1 · #BF6200×1 · #6C6E7F×1 · #6E6F82×1 · #6E7184×1 · #BA6A0A×1 · #767676×6 · #CE6A00×1 · #767B8D×1 · #7A7D8C×1 · #7D8192×1 · #D47900×1 · #818593×1 · #838797×1 · #838898×1 · #D38202×1 · #848BAC×1 · #EF8500×1 · #8A93B1×1 · #8C93B2×1 · #8F95A6×1 · #E58E00×1 · #9198A9×1 · #E49300×1 · #939EAE×1 · #9D9D9D×4 · #FD9401×1 · #E59D02×1 · #99A4B3×1 · #EB9E02×1 · #9CA4B4×2 · #FBA400×1 · #9BAFC0×1 · #9DB3C1×1 · #FFAE04×1 · #ACBDC9×1 · #B0BEC7×1 · #FFBD04×1 · #F8C004×1 · #ACC2D2×1 · #FCC904×1 · #FCCB02×1 · #BBCBDA×1 · #FFCA2A×1 · #FED000×1 · #FEDC0F×1 · #FFDF1D×1 · #D1DAE7×1 · #FFE42B×2 · #FDE82D×2 · #FFEB21×1 · #8FF7FB×1 · #FFEE7A×3 · #EBF4F8×13 · #FFFC73×1 · #FCF4EA×1

## 119. unique_claymore_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina cinza/lilás clara, guarda dourada grande com gema azul; sombras azuladas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [2, 19, 13, 30], 11×11; 8 pixels visíveis (0.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 3 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1F3099 (5 px de borda), #2C75DA (2 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina cinza/lilás clara, guarda dourada grande com gema azul; sombras azuladas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #1F3099×5 · #2C75DA×2 · #8FF7FB×1

## 120. unique_claymore_sw.png
- **Categoria e observação:** ícone completo. Lâmina verde viva com ornamentos assimétricos, guarda marrom/vermelha e pomo verde.
- **Resolução/proporção:** 32×32; bbox [0, 0, 32, 32], 32×32; 223 pixels visíveis (21.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 27 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #311309 (24 px de borda), #002C02 (20 px de borda), #005103 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina verde viva com ornamentos assimétricos, guarda marrom/vermelha e pomo verde. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×5 · #161717×11 · #311309×46 · #002C02×20 · #411A0D×6 · #4B2215×23 · #AB0C23×6 · #005103×14 · #6D3421×8 · #D91A2B×3 · #414646×9 · #9C4529×6 · #007804×7 · #585E5E×3 · #C15A36×2 · #009906×7 · #657A78×3 · #747A97×3 · #E77C56×1 · #0AC706×5 · #0ECF06×1 · #A39DBB×3 · #20EF1C×8 · #DBD3E0×3 · #C9FF44×14 · #EDF9FF×1 · #F0FFCB×5

## 121. unique_claymore_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina verde viva com ornamentos assimétricos, guarda marrom/vermelha e pomo verde. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [1, 0, 32, 31], 31×31; 81 pixels visíveis (7.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 9 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #002C02 (20 px de borda), #005103 (14 px de borda), #C9FF44 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina verde viva com ornamentos assimétricos, guarda marrom/vermelha e pomo verde. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×20 · #005103×14 · #007804×7 · #009906×7 · #0AC706×5 · #0ECF06×1 · #20EF1C×8 · #C9FF44×14 · #F0FFCB×5

## 122. unique_dagger_1.png
- **Categoria e observação:** ícone completo. Lâmina azul larga com brilho branco; pequeno cabo marrom e junção violeta.
- **Resolução/proporção:** 16×16; bbox [0, 1, 15, 16], 15×15; 73 pixels visíveis (28.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1F538C (13 px de borda), #081D35 (12 px de borda), #3F1610 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -46.51°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina azul larga com brilho branco; pequeno cabo marrom e junção violeta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #081D35×13 · #3F1610×6 · #0F2A49×2 · #542310×2 · #25384D×3 · #683116×1 · #1F436B×2 · #563677×4 · #1F538C×16 · #8F56B8×2 · #2C75C5×5 · #5B97D9×5 · #94BCE8×7 · #C8DBF0×2 · #FFFFFF×3

## 123. unique_dagger_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina azul larga com brilho branco; pequeno cabo marrom e junção violeta. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 16×16; bbox [0, 1, 15, 16], 15×15; 56 pixels visíveis (21.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 9 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1F538C (15 px de borda), #081D35 (13 px de borda), #25384D (3 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -42.49°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina azul larga com brilho branco; pequeno cabo marrom e junção violeta. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #081D35×13 · #25384D×3 · #1F436B×2 · #1F538C×16 · #2C75C5×5 · #5B97D9×5 · #94BCE8×7 · #C8DBF0×2 · #FFFFFF×3

## 124. unique_dagger_2.png
- **Categoria e observação:** ícone completo. Lâmina branca/cinza curta, ranhuras vermelhas e guarda/pomo vinho escuro.
- **Resolução/proporção:** 16×16; bbox [0, 1, 15, 16], 15×15; 97 pixels visíveis (37.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 62 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #676471 (6 px de borda), #434459 (3 px de borda), #4C0A2F (2 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (62 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 62 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina branca/cinza curta, ranhuras vermelhas e guarda/pomo vinho escuro. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #080020×1 · #06002D×1 · #09002C×4 · #060323×1 · #060326×1 · #16002A×1 · #0B0427×1 · #18002C×1 · #19002C×2 · #2C002D×1 · #380125×1 · #3F0031×1 · #4E002C×1 · #4D0031×1 · #430428×1 · #4F0124×1 · #0F1332×1 · #540024×1 · #51002E×1 · #55002A×2 · #55002F×2 · #590025×1 · #5A002F×1 · #5C002E×1 · #111633×2 · #5F0029×1 · #530335×1 · #61002A×2 · #56042F×2 · #5D0326×2 · #131834×2 · #6B0028×1 · #181839×2 · #4C0A2F×2 · #70002E×1 · #6B0229×1 · #1A1934×1 · #231939×1 · #79013C×1 · #1C1F39×1 · #7B071E×2 · #7E0533×1 · #990907×4 · #AB0136×2 · #C8001B×1 · #C3033E×3 · #FF0000×1 · #3A374C×1 · #434459×5 · #4E4A64×1 · #676471×6 · #626773×1 · #747E89×4 · #F46A71×1 · #908F91×2 · #A2A1A5×2 · #ADA6AD×1 · #ACB0B2×1 · #CCCED8×2 · #D9E1EB×1 · #E0EDFD×1 · #ECF3FC×1

## 125. unique_dagger_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina branca/cinza curta, ranhuras vermelhas e guarda/pomo vinho escuro. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 16×16; bbox [8, 4, 12, 8], 4×4; 4 pixels visíveis (1.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 3 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #AB0136 (2 px de borda), #79013C (1 px de borda), #7E0533 (1 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina branca/cinza curta, ranhuras vermelhas e guarda/pomo vinho escuro. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #79013C×1 · #7E0533×1 · #AB0136×2

## 126. unique_dagger_sw.png
- **Categoria e observação:** ícone completo. Lâmina cinza/ciano, guarda dourada grande e acento verde; cabo vermelho e pomo ocre.
- **Resolução/proporção:** 16×16; bbox [0, 1, 15, 16], 15×15; 98 pixels visíveis (38.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 23 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #414646 (14 px de borda), #161717 (14 px de borda), #652707 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina cinza/ciano, guarda dourada grande e acento verde; cabo vermelho e pomo ocre. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×3 · #161717×14 · #632307×8 · #AB0C23×4 · #682508×2 · #652707×8 · #D91A2B×2 · #414646×14 · #9B4415×12 · #9E4414×1 · #9C4514×1 · #A14514×2 · #009906×2 · #8C9697×1 · #DD8E21×4 · #0ECF06×1 · #B0BDBE×2 · #F3D63D×4 · #D3DCE0×5 · #C9FF44×1 · #FFE5F3×1 · #FEF898×2 · #EDF9FF×4

## 127. unique_dagger_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina cinza/ciano, guarda dourada grande e acento verde; cabo vermelho e pomo ocre. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 16×16; bbox [1, 9, 7, 15], 6×6; 5 pixels visíveis (2.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 4 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #009906 (2 px de borda), #0ECF06 (1 px de borda), #C9FF44 (1 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina cinza/ciano, guarda dourada grande e acento verde; cabo vermelho e pomo ocre. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #009906×2 · #0ECF06×1 · #C9FF44×1 · #FFE5F3×1

## 128. unique_double_axe_1.png
- **Categoria e observação:** ícone completo. Cabeça dupla escura com núcleo laranja; haste estreita diagonal e terminações incandescentes.
- **Resolução/proporção:** 32×32; bbox [4, 4, 28, 28], 24×24; 208 pixels visíveis (20.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 11 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #18150E (43 px de borda), #211C16 (39 px de borda), #500300 (18 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.92°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça dupla escura com núcleo laranja; haste estreita diagonal e terminações incandescentes. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #500300×20 · #18150E×48 · #211C16×47 · #720703×16 · #2A2619×15 · #38352B×23 · #A02008×10 · #534F45×14 · #636257×4 · #DB561A×5 · #FA8432×6

## 129. unique_double_axe_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Cabeça dupla escura com núcleo laranja; haste estreita diagonal e terminações incandescentes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [4, 7, 24, 28], 20×21; 57 pixels visíveis (5.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 5 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #500300 (20 px de borda), #720703 (14 px de borda), #A02008 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.5°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça dupla escura com núcleo laranja; haste estreita diagonal e terminações incandescentes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #500300×20 · #720703×16 · #A02008×10 · #DB561A×5 · #FA8432×6

## 130. unique_double_axe_2.png
- **Categoria e observação:** ícone completo. Duas lâminas roxas/cinza em volta de centro claro circular; cabo lilás escuro.
- **Resolução/proporção:** 32×32; bbox [4, 4, 28, 28], 24×24; 222 pixels visíveis (21.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 109 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #0F0013 (5 px de borda), #161530 (5 px de borda), #2D1239 (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (109 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 109 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Duas lâminas roxas/cinza em volta de centro claro circular; cabo lilás escuro. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0A000A×1 · #0C0010×4 · #0E000C×1 · #0D000F×2 · #0D0010×1 · #0C0014×1 · #0D0013×1 · #0D0014×1 · #0E0013×4 · #10000E×1 · #0E0014×1 · #0F0013×5 · #0F0015×1 · #0D001B×1 · #110011×5 · #100014×1 · #110017×1 · #120015×2 · #120016×1 · #140018×4 · #1D0F29×1 · #221030×3 · #250F33×2 · #161530×5 · #21142C×1 · #2D1236×2 · #2D1239×5 · #291435×2 · #281439×4 · #291536×1 · #2B143B×2 · #241733×2 · #2A1537×2 · #271636×2 · #231830×2 · #2B1537×2 · #2B1538×2 · #2E143A×2 · #2C153A×2 · #261832×3 · #271832×2 · #2A163D×2 · #2C1639×1 · #251A31×2 · #251A35×2 · #2C183A×2 · #251C31×2 · #251C32×2 · #241C36×2 · #2C193D×1 · #30183D×1 · #271D33×2 · #281E31×2 · #262033×2 · #2B1F38×2 · #292035×4 · #292037×2 · #282137×2 · #292138×2 · #2B2538×2 · #29263C×2 · #30273C×1 · #30273D×1 · #302A3E×2 · #302F63×6 · #3C2F4D×1 · #373246×1 · #413D53×3 · #453F56×1 · #494658×12 · #4E4A61×1 · #4F4B5D×2 · #524D90×5 · #565467×4 · #585467×2 · #5B536A×2 · #57556A×1 · #5D566C×3 · #5C5A71×1 · #605B6F×2 · #615C70×1 · #635E75×2 · #6B6478×1 · #7D768C×3 · #77798B×1 · #7F7E8D×2 · #7C8292×1 · #828491×1 · #828494×1 · #808595×1 · #848696×1 · #8F92A1×1 · #939AA9×1 · #969CA2×5 · #A4A7B4×1 · #A8AABB×1 · #A5ACB4×1 · #A4ADB6×2 · #ADB2B7×1 · #AEB9BE×5 · #BABFC6×1 · #C5CBD3×1 · #CEDBDD×1 · #D9E1DF×1 · #DAE2DD×2 · #CDFFFF×1 · #CEFFFF×1 · #CFFFFF×1 · #D4FFFE×2

## 131. unique_double_axe_sw.png
- **Categoria e observação:** ícone completo. Duas lâminas frias com joias verdes; cabo marrom/vermelho e pequenos highlights verdes.
- **Resolução/proporção:** 32×32; bbox [3, 0, 26, 29], 23×29; 190 pixels visíveis (18.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #414646 (26 px de borda), #161717 (19 px de borda), #002C02 (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -54.89°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Duas lâminas frias com joias verdes; cabo marrom/vermelho e pequenos highlights verdes. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×5 · #161717×20 · #311309×15 · #002C02×20 · #4B2215×16 · #AB0C23×4 · #652509×5 · #005103×5 · #6D3421×3 · #D91A2B×5 · #414646×28 · #9C4529×2 · #007804×8 · #009906×4 · #0AC706×1 · #8C9697×8 · #20EF1C×5 · #B0BDBE×11 · #D3DCE0×4 · #C9FF44×3 · #EDF9FF×11 · #F0FFCB×7

## 132. unique_double_axe_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Duas lâminas frias com joias verdes; cabo marrom/vermelho e pequenos highlights verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [7, 5, 26, 25], 19×20; 53 pixels visíveis (5.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #002C02 (20 px de borda), #007804 (8 px de borda), #F0FFCB (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.17°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Duas lâminas frias com joias verdes; cabo marrom/vermelho e pequenos highlights verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×20 · #005103×5 · #007804×8 · #009906×4 · #0AC706×1 · #20EF1C×5 · #C9FF44×3 · #F0FFCB×7

## 133. unique_glaive_1.png
- **Categoria e observação:** ícone completo. Lâmina comprida incandescente laranja, com haste cinza/ocre extremamente fina no canvas 64.
- **Resolução/proporção:** 64×64; bbox [13, 15, 51, 51], 38×36; 218 pixels visíveis (5.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #231F1E (27 px de borda), #57413A (20 px de borda), #3C2A28 (19 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.04°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina comprida incandescente laranja, com haste cinza/ocre extremamente fina no canvas 64. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0B0B18×19 · #231F1E×29 · #6D1206×9 · #3C2A28×20 · #2E302E×15 · #87290F×10 · #5A412B×6 · #57413A×21 · #46484C×10 · #B43715×17 · #FF4D16×19 · #AE8850×8 · #FF8729×14 · #FFB652×11 · #ECCE88×4 · #FFE8A7×6

## 134. unique_glaive_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina comprida incandescente laranja, com haste cinza/ocre extremamente fina no canvas 64. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 64×64; bbox [29, 16, 50, 35], 21×19; 86 pixels visíveis (2.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 7 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF4D16 (9 px de borda), #FF8729 (8 px de borda), #B43715 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -43.15°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina comprida incandescente laranja, com haste cinza/ocre extremamente fina no canvas 64. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #6D1206×9 · #87290F×10 · #B43715×17 · #FF4D16×19 · #FF8729×14 · #FFB652×11 · #FFE8A7×6

## 135. unique_glaive_2.png
- **Categoria e observação:** ícone completo. Lâmina pontiaguda violeta/rosa clara e haste roxa escura; muitos microtons RGB.
- **Resolução/proporção:** 64×64; bbox [13, 14, 51, 51], 38×37; 219 pixels visíveis (5.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 132 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #160833 (6 px de borda), #170238 (6 px de borda), #320A26 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (132 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 132 tons numa única face.
- **Silhueta/ângulo:** PCA -45.54°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina pontiaguda violeta/rosa clara e haste roxa escura; muitos microtons RGB. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #080719×1 · #1B003B×5 · #170238×6 · #050C11×1 · #150630×1 · #090D17×1 · #19053A×1 · #090E18×1 · #160833×6 · #0A0E1B×1 · #090F1A×1 · #0D0D23×2 · #071019×2 · #1E063A×1 · #0C0F1C×2 · #1F0738×1 · #19093D×6 · #190A36×1 · #190A37×1 · #1B0A36×1 · #0C1219×1 · #0E141C×2 · #320A26×6 · #1F0F39×1 · #620033×7 · #211537×4 · #23173F×1 · #20193F×1 · #660381×2 · #2B1C48×1 · #2C1C46×1 · #6A0389×1 · #262044×2 · #7A0097×1 · #2B2049×2 · #2B214A×1 · #650A85×2 · #66098C×1 · #600B8A×1 · #72049B×2 · #2C214B×1 · #2C2248×1 · #292348×3 · #2F224D×1 · #680C89×5 · #6B0B8B×1 · #2A2648×1 · #2C254E×1 · #332352×1 · #312451×8 · #30254D×1 · #32254E×2 · #2F274C×1 · #342651×1 · #2C294E×1 · #4E1D64×1 · #2D2A4E×2 · #2F2A4D×4 · #322951×1 · #372859×1 · #352955×4 · #2F2C4E×1 · #4F2163×1 · #352B58×1 · #2F2E50×2 · #332D50×1 · #342C58×1 · #362C55×1 · #382C5C×1 · #820DB8×3 · #392D58×1 · #3C3158×1 · #3A3352×1 · #453763×1 · #4A3862×1 · #483964×1 · #493963×1 · #473A67×1 · #4D3D6B×1 · #594673×1 · #604478×1 · #5D4B71×1 · #A53D33×4 · #5B4E77×1 · #624F7D×1 · #AC33DE×3 · #645480×1 · #6E5386×1 · #695887×1 · #586085×1 · #6A5B85×2 · #576283×1 · #706087×1 · #72628D×1 · #74628C×1 · #73658F×1 · #646E91×1 · #766990×1 · #7D6896×1 · #796D91×1 · #62789C×4 · #80709B×1 · #86709C×3 · #85789D×1 · #9279A9×1 · #8A809A×1 · #E16BF6×2 · #E26CF2×1 · #7E92B1×1 · #9D8EB1×2 · #F271F7×1 · #F473FC×2 · #F279FD×1 · #94AAC3×1 · #97ABC1×1 · #F78AFF×1 · #FE8BFF×1 · #9EB1C8×3 · #FE94FF×1 · #9EBDCF×2 · #FEA6FF×1 · #ACC3D7×1 · #FCA9FF×1 · #FFB2FF×3 · #BCCCDB×1 · #FFB5FF×1 · #FEB7FF×1 · #FFCAFF×2 · #FFCEFF×2 · #FED0FF×1 · #FFE0FF×1 · #FEEBFF×1

## 136. unique_glaive_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina pontiaguda violeta/rosa clara e haste roxa escura; muitos microtons RGB. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 64×64; bbox [13, 14, 51, 51], 38×37; 49 pixels visíveis (1.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 32 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #680C89 (5 px de borda), #820DB8 (3 px de borda), #AC33DE (3 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.04°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina pontiaguda violeta/rosa clara e haste roxa escura; muitos microtons RGB. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #170238×1 · #660381×2 · #6A0389×1 · #7A0097×1 · #650A85×2 · #66098C×1 · #600B8A×1 · #72049B×2 · #680C89×5 · #6B0B8B×1 · #4E1D64×1 · #4F2163×1 · #820DB8×3 · #AC33DE×3 · #E16BF6×2 · #E26CF2×1 · #F271F7×1 · #F473FC×2 · #F279FD×1 · #F78AFF×1 · #FE8BFF×1 · #FE94FF×1 · #FEA6FF×1 · #FCA9FF×1 · #FFB2FF×3 · #FFB5FF×1 · #FEB7FF×1 · #FFCAFF×2 · #FFCEFF×2 · #FED0FF×1 · #FFE0FF×1 · #FEEBFF×1

## 137. unique_glaive_sw.png
- **Categoria e observação:** ícone completo. Lâmina branca/verde com núcleo ocre, cabo escuro e detalhe vermelho; desenho fino a 64×64.
- **Resolução/proporção:** 64×64; bbox [13, 14, 50, 51], 37×37; 224 pixels visíveis (5.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 23 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #414646 (26 px de borda), #707A79 (21 px de borda), #161717 (19 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -46.15°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina branca/verde com núcleo ocre, cabo escuro e detalhe vermelho; desenho fino a 64×64. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×7 · #161717×20 · #311309×13 · #4B2215×6 · #AB0C23×5 · #652509×21 · #005103×2 · #6D3421×3 · #D91A2B×6 · #414646×32 · #9B4415×7 · #9C4529×1 · #009906×5 · #707A79×25 · #0AC706×6 · #8C9697×8 · #DE8D22×8 · #20EF1C×10 · #B0BDBE×8 · #F3D23D×5 · #D3DCE0×9 · #F9F88C×2 · #EDF9FF×15

## 138. unique_glaive_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina branca/verde com núcleo ocre, cabo escuro e detalhe vermelho; desenho fino a 64×64. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 64×64; bbox [18, 16, 47, 46], 29×30; 23 pixels visíveis (0.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 4 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #20EF1C (10 px de borda), #0AC706 (6 px de borda), #009906 (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -47.09°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina branca/verde com núcleo ocre, cabo escuro e detalhe vermelho; desenho fino a 64×64. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #005103×2 · #009906×5 · #0AC706×6 · #20EF1C×10

## 139. unique_hammer_1.png
- **Categoria e observação:** atlas UV aparente. Atlas com metais roxos e regiões violeta brilhantes em ilhas distintas.
- **Resolução/proporção:** 64×64; bbox [0, 0, 60, 64], 60×64; 1012 pixels visíveis (24.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 14 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #8777FF (78 px de borda), #3C2B3B (71 px de borda), #6C44ED (58 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 66.5°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com metais roxos e regiões violeta brilhantes em ilhas distintas. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #2A202A×159 · #3B186E×4 · #3C2B3B×241 · #402E89×54 · #572BBD×67 · #5F435B×88 · #6C44ED×106 · #6059F0×11 · #8777FF×132 · #57A5FF×8 · #B78DFF×117 · #74E6FF×6 · #ACFFF8×11 · #FFFFFF×8

## 140. unique_hammer_1_e.png
- **Categoria e observação:** atlas UV aparente / máscara emissiva aparente. Atlas com metais roxos e regiões violeta brilhantes em ilhas distintas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 64×64; bbox [0, 5, 60, 64], 60×59; 524 pixels visíveis (12.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 11 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #8777FF (81 px de borda), #6C44ED (63 px de borda), #B78DFF (55 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 13.2°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com metais roxos e regiões violeta brilhantes em ilhas distintas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #3B186E×4 · #402E89×54 · #572BBD×67 · #6C44ED×106 · #6059F0×11 · #8777FF×132 · #57A5FF×8 · #B78DFF×117 · #74E6FF×6 · #ACFFF8×11 · #FFFFFF×8

## 141. unique_hammer_2.png
- **Categoria e observação:** atlas UV aparente. Atlas com cabeça laranja incandescente e materiais carvão em regiões retangulares.
- **Resolução/proporção:** 64×64; bbox [0, 0, 38, 56], 38×56; 1152 pixels visíveis (28.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 14 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #27221C (72 px de borda), #312C36 (67 px de borda), #23161F (55 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -83.75°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com cabeça laranja incandescente e materiais carvão em regiões retangulares. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #160F10×64 · #23161F×306 · #27221C×132 · #312C36×128 · #BA0E00×20 · #3C3947×64 · #D32000×18 · #4E4B54×62 · #D54100×4 · #E14500×36 · #E65B00×200 · #F36000×70 · #FEA700×24 · #FFBD1E×24

## 142. unique_hammer_2_e.png
- **Categoria e observação:** atlas UV aparente / máscara emissiva aparente. Atlas com cabeça laranja incandescente e materiais carvão em regiões retangulares. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 64×64; bbox [0, 14, 29, 56], 29×42; 396 pixels visíveis (9.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #F36000 (38 px de borda), #E14500 (26 px de borda), #E65B00 (22 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -70.1°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com cabeça laranja incandescente e materiais carvão em regiões retangulares. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #BA0E00×20 · #D32000×18 · #D54100×4 · #E14500×36 · #E65B00×200 · #F36000×70 · #FEA700×24 · #FFBD1E×24

## 143. unique_hammer_sw.png
- **Categoria e observação:** atlas UV aparente. Atlas com materiais brancos/cinza, dourados e pequenos acentos ciano.
- **Resolução/proporção:** 64×64; bbox [0, 0, 64, 64], 64×64; 1267 pixels visíveis (30.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 23 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #DDDBCE (86 px de borda), #B4ACAA (53 px de borda), #8F7E7F (45 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 65.33°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com materiais brancos/cinza, dourados e pequenos acentos ciano. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #171117×4 · #212026×22 · #2B1F2B×197 · #2E2C37×21 · #3D2C34×144 · #45323B×38 · #46343C×3 · #4B3640×72 · #494556×15 · #604248×7 · #38505E×20 · #805556×4 · #AB5130×38 · #498485×21 · #8F7E7F×119 · #CF752B×40 · #49B896×24 · #B4ACAA×111 · #F0B541×39 · #DDDBCE×177 · #71FFDF×23 · #FFEE83×41 · #F5FFE8×87

## 144. unique_hammer_sw_e.png
- **Categoria e observação:** atlas UV aparente / máscara emissiva aparente. Atlas com materiais brancos/cinza, dourados e pequenos acentos ciano. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 64×64; bbox [0, 31, 64, 60], 64×29; 236 pixels visíveis (5.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #AB5130 (38 px de borda), #CF752B (30 px de borda), #F0B541 (29 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 4.81°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com materiais brancos/cinza, dourados e pequenos acentos ciano. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #38505E×10 · #AB5130×38 · #498485×21 · #CF752B×40 · #49B896×24 · #F0B541×39 · #71FFDF×23 · #FFEE83×41

## 145. unique_heavy_crossbow_1_arrow.png
- **Categoria e observação:** ícone completo. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 245 pixels visíveis (23.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 70 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF8A00 (22 px de borda), #131725 (21 px de borda), #FF5D00 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (70 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 70 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 149 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #250030×1 · #1E0423×2 · #290A16×1 · #241125×1 · #131725×35 · #331126×1 · #910300×2 · #352039×13 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #273051×2 · #8C1A0B×2 · #27334A×1 · #45320D×1 · #981A07×2 · #D70E00×2 · #2A3954×3 · #2F3851×1 · #333750×1 · #323754×1 · #2B395A×1 · #2F3A55×1 · #303A59×3 · #2F3C56×1 · #FF0700×2 · #313C59×1 · #543D12×14 · #37405D×3 · #413F5E×1 · #FF1100×2 · #444444×2 · #3F435F×2 · #FF1600×2 · #464661×2 · #AA3801×2 · #B53501×2 · #6D4F18×3 · #A64405×2 · #48617A×2 · #C64F00×2 · #D15100×2 · #896727×7 · #EE5B00×2 · #557D9A×1 · #F85D00×2 · #FF5D00×10 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #969696×2 · #FF8A00×25 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #D8D8D8×1 · #FFF307×12 · #FFFC11×2 · #FFFDDD×14 · #FFFFFF×3

## 146. unique_heavy_crossbow_1_arrow_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 32×32; bbox [6, 6, 25, 25], 19×19; 131 pixels visíveis (12.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 38 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF8A00 (23 px de borda), #FFF307 (10 px de borda), #FF5D00 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 105 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #910300×2 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #8C1A0B×2 · #981A07×2 · #D70E00×2 · #FF0700×2 · #FF1100×2 · #FF1600×2 · #AA3801×2 · #B53501×2 · #A64405×2 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #F85D00×2 · #FF5D00×10 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #FF8A00×25 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×12 · #FFFC11×2 · #FFFDDD×14

## 147. unique_heavy_crossbow_1_firework.png
- **Categoria e observação:** ícone completo. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 255 pixels visíveis (24.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 72 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF8A00 (22 px de borda), #131725 (21 px de borda), #FF5D00 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (72 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 72 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 173 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #250030×1 · #1E0423×2 · #290A16×1 · #241125×1 · #131725×33 · #331126×1 · #171A24×6 · #910300×2 · #222530×10 · #352039×11 · #980C01×2 · #920E00×4 · #6D1717×2 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #273051×2 · #8C1A0B×2 · #841B1B×3 · #27334A×1 · #981A07×2 · #2F364D×5 · #D70E00×2 · #2A3954×3 · #2F3851×1 · #333750×1 · #323754×1 · #2B395A×1 · #2F3A55×1 · #303A59×3 · #2F3C56×1 · #FF0700×2 · #313C59×1 · #37405D×3 · #992929×4 · #413F5E×1 · #FF1100×2 · #3F435F×2 · #FF1600×2 · #B92929×4 · #464661×2 · #AA3801×2 · #B53501×2 · #D62A2A×7 · #A64405×2 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #557D9A×1 · #F85D00×2 · #FF5D00×10 · #5C8189×3 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #FF8A00×25 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #B2CCD1×3 · #FFE104×2 · #FFF307×12 · #FFFC11×2 · #F4F4F4×2 · #FFFDDD×14

## 148. unique_heavy_crossbow_1_firework_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 32×32; bbox [6, 6, 25, 25], 19×19; 131 pixels visíveis (12.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 38 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF8A00 (23 px de borda), #FFF307 (10 px de borda), #FF5D00 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 105 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #910300×2 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #8C1A0B×2 · #981A07×2 · #D70E00×2 · #FF0700×2 · #FF1100×2 · #FF1600×2 · #AA3801×2 · #B53501×2 · #A64405×2 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #F85D00×2 · #FF5D00×10 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #FF8A00×25 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×12 · #FFFC11×2 · #FFFDDD×14

## 149. unique_heavy_crossbow_1_pulling_0.png
- **Categoria e observação:** ícone completo. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 228 pixels visíveis (22.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 80 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #131725 (19 px de borda), #FF8A00 (14 px de borda), #FF5D00 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (80 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 80 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 86 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #130022×1 · #1B002A×1 · #1D002D×1 · #21012A×1 · #250030×1 · #1E0423×2 · #290A16×1 · #241125×1 · #131725×36 · #331126×1 · #910300×2 · #352039×16 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #273051×2 · #2C304A×5 · #8C1A0B×2 · #2B3147×1 · #27334A×1 · #343045×1 · #981A07×2 · #35344B×1 · #2C374E×1 · #D70E00×2 · #2A3954×2 · #2F3851×1 · #333750×1 · #323754×1 · #2D3A4E×2 · #2F3A55×1 · #303A59×3 · #343A54×1 · #313B54×1 · #2F3C56×1 · #2F3C57×1 · #FF0700×2 · #313C59×1 · #303E57×1 · #2F405D×1 · #383F59×1 · #37405D×3 · #413F5E×1 · #FF1100×2 · #3F435F×2 · #FF1600×2 · #464661×2 · #494A65×1 · #AA3801×2 · #B53501×2 · #4C4D68×1 · #A64405×2 · #48617A×6 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #557D9A×1 · #F85D00×2 · #FF5D00×12 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #699BB1×1 · #FF8A00×18 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×4 · #FFFC11×2 · #FFFDDD×13

## 150. unique_heavy_crossbow_1_pulling_0_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [6, 6, 25, 25], 19×19; 117 pixels visíveis (11.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 38 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF8A00 (16 px de borda), #FF5D00 (12 px de borda), #FFFDDD (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 75 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #910300×2 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #8C1A0B×2 · #981A07×2 · #D70E00×2 · #FF0700×2 · #FF1100×2 · #FF1600×2 · #AA3801×2 · #B53501×2 · #A64405×2 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #F85D00×2 · #FF5D00×12 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #FF8A00×18 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×4 · #FFFC11×2 · #FFFDDD×13

## 151. unique_heavy_crossbow_1_pulling_1.png
- **Categoria e observação:** ícone completo. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 232 pixels visíveis (22.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 79 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #131725 (23 px de borda), #FF8A00 (16 px de borda), #FF5D00 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (79 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 79 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 98 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #130022×1 · #1B002A×1 · #1D002D×1 · #21012A×1 · #250030×1 · #1E0423×2 · #290A16×1 · #241125×1 · #131725×36 · #331126×1 · #910300×2 · #352039×16 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #273051×2 · #2C304A×5 · #8C1A0B×2 · #27334A×1 · #343045×1 · #981A07×2 · #223651×1 · #2C374E×1 · #D70E00×2 · #2A3954×2 · #333750×1 · #323754×1 · #2B395A×1 · #2D3A4E×2 · #2F3A55×1 · #2B3B58×1 · #303A59×3 · #343A54×1 · #313B54×1 · #2F3C56×1 · #2F3C57×1 · #FF0700×2 · #313C59×1 · #303E57×1 · #2F405D×1 · #383F59×1 · #37405D×3 · #413F5E×1 · #FF1100×2 · #3F435F×2 · #FF1600×2 · #464661×2 · #494A65×1 · #AA3801×2 · #B53501×2 · #4C4D68×1 · #A64405×2 · #48617A×7 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #557D9A×1 · #F85D00×2 · #FF5D00×12 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #FF8A00×20 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×6 · #FFFC11×2 · #FFFDDD×13

## 152. unique_heavy_crossbow_1_pulling_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [6, 6, 25, 25], 19×19; 121 pixels visíveis (11.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 38 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF8A00 (18 px de borda), #FF5D00 (12 px de borda), #FFFDDD (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 93 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #910300×2 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #8C1A0B×2 · #981A07×2 · #D70E00×2 · #FF0700×2 · #FF1100×2 · #FF1600×2 · #AA3801×2 · #B53501×2 · #A64405×2 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #F85D00×2 · #FF5D00×12 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #FF8A00×20 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×6 · #FFFC11×2 · #FFFDDD×13

## 153. unique_heavy_crossbow_1_pulling_2.png
- **Categoria e observação:** ícone completo. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 244 pixels visíveis (23.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 80 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF8A00 (22 px de borda), #131725 (21 px de borda), #352039 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (80 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 80 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 116 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #130022×1 · #1B002A×1 · #1D002D×1 · #21012A×1 · #250030×1 · #1E0423×2 · #290A16×1 · #241125×1 · #131725×36 · #331126×1 · #910300×2 · #352039×16 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #273051×2 · #2C304A×5 · #8C1A0B×2 · #2B3147×1 · #27334A×1 · #981A07×2 · #223651×1 · #35344B×1 · #D70E00×2 · #2A3954×3 · #2F3851×1 · #333750×1 · #323754×1 · #2B395A×1 · #2D3A4E×2 · #2F3A55×1 · #2B3B58×1 · #303A59×3 · #343A54×1 · #313B54×1 · #2F3C56×1 · #2F3C57×1 · #FF0700×2 · #313C59×1 · #303E57×1 · #2F405D×1 · #383F59×1 · #37405D×3 · #413F5E×1 · #FF1100×2 · #3F435F×2 · #FF1600×2 · #464661×2 · #494A65×1 · #AA3801×2 · #B53501×2 · #A64405×2 · #48617A×7 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #557D9A×1 · #F85D00×2 · #FF5D00×10 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #699BB1×1 · #FF8A00×25 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×12 · #FFFC11×2 · #FFFDDD×14

## 154. unique_heavy_crossbow_1_pulling_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [6, 6, 25, 25], 19×19; 131 pixels visíveis (12.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 38 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF8A00 (23 px de borda), #FFF307 (10 px de borda), #FF5D00 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 105 pixels RGBA diferentes de `unique_heavy_crossbow_1_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #910300×2 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #8C1A0B×2 · #981A07×2 · #D70E00×2 · #FF0700×2 · #FF1100×2 · #FF1600×2 · #AA3801×2 · #B53501×2 · #A64405×2 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #F85D00×2 · #FF5D00×10 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #FF8A00×25 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×12 · #FFFC11×2 · #FFFDDD×14

## 155. unique_heavy_crossbow_1_standby.png
- **Categoria e observação:** ícone completo. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 32×32; bbox [6, 6, 26, 26], 20×20; 216 pixels visíveis (21.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 78 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #131725 (21 px de borda), #FF8A00 (12 px de borda), #352039 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (78 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 78 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #130022×1 · #1B002A×1 · #1D002D×1 · #21012A×1 · #250030×1 · #1E0423×2 · #290A16×1 · #241125×1 · #131725×32 · #331126×1 · #910300×2 · #352039×16 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #273051×2 · #2C304A×5 · #8C1A0B×2 · #2B3147×1 · #343045×1 · #981A07×2 · #223651×1 · #35344B×1 · #2C374E×1 · #D70E00×2 · #2A3954×2 · #2F3851×1 · #333750×1 · #323754×1 · #2B395A×1 · #2D3A4E×2 · #2F3A55×1 · #2B3B58×1 · #303A59×3 · #343A54×1 · #313B54×1 · #2F3C57×1 · #FF0700×2 · #383F59×1 · #37405D×3 · #413F5E×1 · #FF1100×2 · #3F435F×2 · #FF1600×2 · #464661×2 · #494A65×1 · #AA3801×2 · #B53501×2 · #4C4D68×1 · #A64405×2 · #48617A×6 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #557D9A×1 · #F85D00×2 · #FF5D00×8 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #699BB1×1 · #FF8A00×17 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×6 · #FFFC11×2 · #FFFDDD×10

## 156. unique_heavy_crossbow_1_standby_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 32×32; bbox [6, 6, 25, 25], 19×19; 111 pixels visíveis (10.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 38 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FF8A00 (15 px de borda), #FF5D00 (8 px de borda), #FFFDDD (4 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros e corda incandescentes amarelo/laranja; corpo azul-escuro, forte contraste quente/frio. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #910300×2 · #980C01×2 · #920E00×4 · #980F07×2 · #911201×2 · #991401×2 · #A31203×2 · #8C1A0B×2 · #981A07×2 · #D70E00×2 · #FF0700×2 · #FF1100×2 · #FF1600×2 · #AA3801×2 · #B53501×2 · #A64405×2 · #C64F00×2 · #D15100×2 · #EE5B00×2 · #F85D00×2 · #FF5D00×8 · #FF690E×2 · #FF6E00×2 · #FF7A00×2 · #FF8A00×17 · #F59200×2 · #F59400×2 · #FF9200×2 · #F59B00×2 · #FC9900×2 · #FF9900×2 · #FFB100×2 · #FCBA00×2 · #FEC404×2 · #FFE104×2 · #FFF307×6 · #FFFC11×2 · #FFFDDD×10

## 157. unique_heavy_crossbow_2_arrow.png
- **Categoria e observação:** ícone completo. Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 32×32; bbox [5, 5, 26, 26], 21×21; 273 pixels visíveis (26.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 92 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #996C6A (12 px de borda), #182638 (8 px de borda), #583F3E (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (92 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 92 tons numa única face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 130 pixels RGBA diferentes de `unique_heavy_crossbow_2_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0D0E12×6 · #0D0F15×2 · #0F0F17×2 · #110F16×2 · #1D0B20×3 · #131017×2 · #141016×2 · #141018×1 · #00161E×1 · #11121E×1 · #13121A×4 · #001B1D×3 · #18151E×4 · #031B27×1 · #001D23×1 · #13181D×2 · #001E24×1 · #001F24×1 · #001F25×1 · #021F25×1 · #1A191D×4 · #002026×1 · #18192B×2 · #191A25×2 · #002141×1 · #002426×1 · #00252B×1 · #00262C×1 · #00282B×1 · #1D213D×2 · #182638×14 · #1B282D×2 · #202636×2 · #362313×1 · #38281A×1 · #1A2E45×1 · #00393C×1 · #1A3142×4 · #183541×2 · #12383C×4 · #193644×2 · #18364C×1 · #133A47×2 · #45320D×1 · #16404B×2 · #16434B×2 · #543D12×14 · #0C4F53×6 · #0C5051×2 · #444444×2 · #583F3E×8 · #0B554F×2 · #464544×5 · #11555A×2 · #514C3C×16 · #0C6363×2 · #016768×1 · #6D4F18×3 · #006A6D×1 · #116866×1 · #126969×2 · #006E71×1 · #0E6F64×2 · #007273×1 · #127C77×2 · #896727×7 · #048E90×1 · #0E8D83×1 · #06938F×2 · #996C6A×19 · #13938A×1 · #069A8B×8 · #0E9B90×1 · #04A286×1 · #12A391×1 · #00AEA6×1 · #03B1A1×1 · #01B4A1×1 · #969696×2 · #0BCFAF×2 · #AAA679×9 · #15D2BF×1 · #BAA999×10 · #10ECC7×2 · #19F2C3×6 · #15FFD5×1 · #CFD59E×8 · #D8D8D8×1 · #E7DDCE×8 · #9DFCD5×1 · #E4F7B7×2 · #FFFFFF×3

## 158. unique_heavy_crossbow_2_firework.png
- **Categoria e observação:** ícone completo. Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 32×32; bbox [5, 5, 26, 26], 21×21; 273 pixels visíveis (26.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 92 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #996C6A (12 px de borda), #182638 (8 px de borda), #583F3E (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (92 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 92 tons numa única face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 151 pixels RGBA diferentes de `unique_heavy_crossbow_2_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0D0E12×6 · #0D0F15×2 · #0F0F17×2 · #110F16×2 · #1D0B20×3 · #131017×2 · #141016×2 · #141018×1 · #00161E×1 · #11121E×1 · #13121A×4 · #001B1D×3 · #18151E×4 · #031B27×1 · #001D23×1 · #13181D×2 · #001E24×1 · #001F24×1 · #001F25×1 · #021F25×1 · #1A191D×4 · #002026×1 · #171A24×6 · #18192B×2 · #191A25×2 · #002141×1 · #002426×1 · #00252B×1 · #00262C×1 · #00282B×1 · #1D213D×2 · #182638×14 · #222530×10 · #1B282D×2 · #202636×2 · #6D1717×2 · #1A2E45×1 · #00393C×1 · #1A3142×4 · #183541×2 · #12383C×4 · #193644×2 · #18364C×1 · #841B1B×3 · #133A47×2 · #2F364D×5 · #16404B×2 · #16434B×2 · #992929×4 · #0C4F53×6 · #0C5051×2 · #583F3E×8 · #0B554F×2 · #464544×4 · #11555A×2 · #B92929×4 · #514C3C×16 · #D62A2A×7 · #0C6363×2 · #016768×1 · #006A6D×1 · #116866×1 · #126969×2 · #006E71×1 · #0E6F64×2 · #007273×1 · #127C77×2 · #048E90×1 · #0E8D83×1 · #06938F×2 · #996C6A×19 · #13938A×1 · #069A8B×8 · #5C8189×3 · #0E9B90×1 · #04A286×1 · #12A391×1 · #00AEA6×1 · #03B1A1×1 · #01B4A1×1 · #0BCFAF×2 · #AAA679×2 · #15D2BF×1 · #BAA999×10 · #10ECC7×2 · #19F2C3×6 · #B2CCD1×3 · #15FFD5×1 · #CFD59E×4 · #E7DDCE×8 · #9DFCD5×1 · #F4F4F4×2

## 159. unique_heavy_crossbow_2_pulling_0.png
- **Categoria e observação:** ícone completo. Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [5, 5, 26, 26], 21×21; 251 pixels visíveis (24.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 91 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #182638 (10 px de borda), #583F3E (10 px de borda), #514C3C (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (91 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 91 tons numa única face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 78 pixels RGBA diferentes de `unique_heavy_crossbow_2_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0D0E12×6 · #0D0F15×2 · #0F0F17×2 · #110F16×2 · #1D0B20×5 · #131017×2 · #141016×2 · #00161E×1 · #13121A×4 · #001B1D×5 · #1A1513×3 · #18151E×4 · #1D1511×1 · #131629×1 · #031B27×1 · #001D23×1 · #13181D×2 · #001E24×1 · #001F24×1 · #001F25×1 · #021F25×1 · #1A191D×4 · #002026×1 · #18192B×2 · #191A25×2 · #002141×1 · #002426×1 · #00252B×1 · #00262C×1 · #00282B×1 · #1D213D×2 · #182638×10 · #1B282D×2 · #202636×2 · #362313×3 · #122E42×1 · #38281A×1 · #2E283A×4 · #1A2E45×1 · #00393C×1 · #1A3142×4 · #183541×2 · #12383C×4 · #193644×2 · #18364C×1 · #133A47×2 · #16404B×2 · #194147×1 · #16434B×2 · #124B43×1 · #0C4F53×6 · #0C5051×2 · #154E50×1 · #583F3E×10 · #0B554F×2 · #464544×5 · #11555A×2 · #514C3C×17 · #0C6363×2 · #44545A×2 · #475455×1 · #016768×1 · #006A6D×1 · #4B5858×1 · #495958×2 · #126969×2 · #006E71×1 · #0E6F64×2 · #007273×1 · #127C77×2 · #048E90×1 · #06938F×2 · #996C6A×12 · #069A8B×8 · #04A286×1 · #12A391×1 · #08A88F×1 · #00AEA6×1 · #03B1A1×1 · #01B4A1×1 · #0BCFAF×2 · #AAA679×13 · #BAA999×2 · #10ECC7×2 · #19F2C3×6 · #12F6BF×1 · #1AF6C6×1 · #CFD59E×11 · #E7DDCE×7 · #9DFCD5×1 · #E4F7B7×3

## 160. unique_heavy_crossbow_2_pulling_1.png
- **Categoria e observação:** ícone completo. Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [5, 5, 26, 26], 21×21; 255 pixels visíveis (24.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 96 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #583F3E (10 px de borda), #996C6A (8 px de borda), #514C3C (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (96 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 96 tons numa única face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 90 pixels RGBA diferentes de `unique_heavy_crossbow_2_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0D0E12×6 · #0D0F15×2 · #0F0F17×2 · #110F16×2 · #1D0B20×4 · #131017×2 · #141016×2 · #141018×1 · #00161E×1 · #11121E×1 · #13121A×4 · #001B1D×4 · #1A1513×3 · #18151E×4 · #1D1511×1 · #131629×1 · #031B27×1 · #001D23×1 · #13181D×2 · #001E24×1 · #001F24×1 · #001F25×1 · #021F25×1 · #1A191D×4 · #002026×1 · #18192B×2 · #191A25×2 · #002141×1 · #002426×1 · #00252B×1 · #00262C×1 · #00282B×1 · #1D213D×2 · #182638×6 · #1B282D×2 · #202636×2 · #362313×3 · #122E42×1 · #38281A×1 · #2E283A×3 · #1A2E45×1 · #00393C×1 · #1A3142×4 · #183541×2 · #12383C×4 · #193644×2 · #18364C×1 · #133A47×2 · #16404B×2 · #194147×1 · #16434B×2 · #124B43×1 · #0C4F53×6 · #0C5051×2 · #154E50×1 · #583F3E×10 · #0B554F×2 · #464544×5 · #11555A×2 · #3C4D4E×1 · #514C3C×17 · #0C6363×2 · #44545A×4 · #016768×1 · #006A6D×1 · #116866×1 · #495958×2 · #126969×2 · #006E71×1 · #0E6F64×2 · #007273×1 · #127C77×2 · #048E90×1 · #06938F×2 · #996C6A×14 · #069A8B×8 · #0E9B90×1 · #04A286×1 · #12A391×1 · #08A88F×1 · #00AEA6×1 · #03B1A1×1 · #01B4A1×1 · #0BCFAF×2 · #AAA679×13 · #15D2BF×1 · #BAA999×4 · #10ECC7×2 · #19F2C3×6 · #12F6BF×1 · #1AF6C6×1 · #15FFD5×1 · #CFD59E×11 · #E7DDCE×7 · #9DFCD5×1 · #E4F7B7×3

## 161. unique_heavy_crossbow_2_pulling_2.png
- **Categoria e observação:** ícone completo. Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [5, 5, 26, 26], 21×21; 273 pixels visíveis (26.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 100 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #996C6A (12 px de borda), #182638 (8 px de borda), #583F3E (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (100 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 100 tons numa única face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 100 pixels RGBA diferentes de `unique_heavy_crossbow_2_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0D0E12×6 · #0D0F15×2 · #0F0F17×2 · #110F16×2 · #1D0B20×3 · #131017×2 · #141016×2 · #141018×1 · #00161E×1 · #11121E×1 · #13121A×4 · #001B1D×3 · #1A1513×3 · #18151E×4 · #1D1511×1 · #131629×1 · #031B27×1 · #001D23×1 · #13181D×2 · #001E24×1 · #001F24×1 · #001F25×1 · #021F25×1 · #1A191D×4 · #002026×1 · #18192B×2 · #191A25×2 · #002141×1 · #002426×1 · #00252B×1 · #00262C×1 · #00282B×1 · #1D213D×2 · #182638×14 · #1B282D×2 · #202636×2 · #362313×3 · #122E42×1 · #38281A×1 · #2E283A×3 · #1A2E45×1 · #00393C×1 · #1A3142×4 · #183541×2 · #12383C×4 · #193644×2 · #18364C×1 · #133A47×2 · #16404B×2 · #194147×1 · #16434B×2 · #124B43×1 · #0C4F53×6 · #0C5051×2 · #154E50×1 · #583F3E×8 · #0B554F×2 · #464544×5 · #11555A×2 · #3C4D4E×1 · #514C3C×17 · #0C6363×2 · #44545A×3 · #475455×1 · #016768×1 · #006A6D×1 · #4B5858×1 · #116866×1 · #495958×1 · #126969×2 · #006E71×1 · #0E6F64×2 · #007273×1 · #127C77×2 · #048E90×1 · #0E8D83×1 · #06938F×2 · #996C6A×19 · #13938A×1 · #069A8B×8 · #0E9B90×1 · #04A286×1 · #12A391×1 · #08A88F×1 · #00AEA6×1 · #03B1A1×1 · #01B4A1×1 · #0BCFAF×2 · #AAA679×13 · #15D2BF×1 · #BAA999×10 · #10ECC7×2 · #19F2C3×6 · #12F6BF×1 · #1AF6C6×1 · #15FFD5×1 · #CFD59E×11 · #E7DDCE×8 · #9DFCD5×1 · #E4F7B7×3

## 162. unique_heavy_crossbow_2_standby.png
- **Categoria e observação:** ícone completo. Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 32×32; bbox [5, 5, 26, 26], 21×21; 247 pixels visíveis (24.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 93 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #182638 (12 px de borda), #514C3C (8 px de borda), #583F3E (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (93 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 93 tons numa única face.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros turquesa escuros e crânio creme na região frontal; corda rosa/bege e corpo escuro. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0D0E12×2 · #0D0F15×2 · #0F0F17×2 · #1D0B20×5 · #131017×2 · #141016×2 · #141018×1 · #00161E×1 · #11121E×1 · #13121A×4 · #001B1D×5 · #1A1513×3 · #18151E×4 · #1D1511×1 · #131629×1 · #031B27×1 · #001D23×1 · #13181D×2 · #001E24×1 · #001F24×1 · #001F25×1 · #021F25×1 · #1A191D×4 · #002026×1 · #18192B×2 · #191A25×2 · #002141×1 · #002426×1 · #00252B×1 · #00262C×1 · #00282B×1 · #1D213D×2 · #182638×14 · #1B282D×2 · #202636×2 · #362313×3 · #122E42×1 · #38281A×1 · #2E283A×4 · #00393C×1 · #1A3142×4 · #183541×2 · #12383C×4 · #193644×2 · #16404B×2 · #194147×1 · #16434B×2 · #124B43×1 · #0C4F53×6 · #0C5051×2 · #154E50×1 · #583F3E×6 · #0B554F×2 · #464544×5 · #11555A×2 · #3C4D4E×1 · #514C3C×17 · #0C6363×2 · #44545A×4 · #475455×1 · #016768×1 · #006A6D×1 · #4B5858×1 · #116866×1 · #495958×2 · #126969×2 · #006E71×1 · #0E6F64×2 · #007273×1 · #127C77×2 · #048E90×1 · #0E8D83×1 · #06938F×2 · #996C6A×11 · #13938A×1 · #069A8B×8 · #0E9B90×1 · #04A286×1 · #12A391×1 · #00AEA6×1 · #03B1A1×1 · #01B4A1×1 · #0BCFAF×2 · #AAA679×13 · #15D2BF×1 · #BAA999×4 · #10ECC7×2 · #19F2C3×6 · #15FFD5×1 · #CFD59E×11 · #E7DDCE×4 · #9DFCD5×1 · #E4F7B7×3

## 163. unique_heavy_crossbow_sw_arrow.png
- **Categoria e observação:** ícone completo. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 32×32; bbox [5, 5, 25, 25], 20×20; 254 pixels visíveis (24.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 28 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C3651D (22 px de borda), #682507 (18 px de borda), #9DD318 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 134 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×16 · #002C02×12 · #361F28×2 · #4B2215×4 · #682507×32 · #6B2504×3 · #45320D×1 · #005103×16 · #6D3421×3 · #543D12×14 · #444444×2 · #6D4F18×3 · #9E4412×8 · #9C4529×1 · #896727×7 · #009906×8 · #C3651D×26 · #0AC706×4 · #969696×2 · #DD8E21×13 · #9DD318×19 · #F3D63D×13 · #D8D8D8×1 · #C9FF44×16 · #F9F88C×13 · #F0FFCB×8 · #FFFEE5×4 · #FFFFFF×3

## 164. unique_heavy_crossbow_sw_arrow_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda.
- **Resolução/proporção:** 32×32; bbox [9, 9, 23, 23], 14×14; 86 pixels visíveis (8.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9DD318 (18 px de borda), #005103 (16 px de borda), #C9FF44 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 134 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado carregado: haste ocre e ponta clara ocupam o interior; não são parte da corda. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×12 · #005103×16 · #009906×8 · #0AC706×4 · #9DD318×19 · #C9FF44×16 · #F0FFCB×8 · #FFFFFF×3

## 165. unique_heavy_crossbow_sw_firework.png
- **Categoria e observação:** ícone completo. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 32×32; bbox [5, 5, 25, 25], 20×20; 261 pixels visíveis (25.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 31 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C3651D (22 px de borda), #682507 (18 px de borda), #9DD318 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (31 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 31 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 157 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×16 · #171A24×6 · #002C02×12 · #361F28×2 · #222530×10 · #6D1717×2 · #4B2215×4 · #682507×32 · #841B1B×3 · #6B2504×3 · #2F364D×5 · #005103×11 · #6D3421×3 · #992929×4 · #B92929×4 · #D62A2A×7 · #9E4412×8 · #9C4529×1 · #009906×8 · #C3651D×26 · #5C8189×3 · #0AC706×2 · #DD8E21×13 · #9DD318×19 · #B2CCD1×3 · #F3D63D×13 · #C9FF44×14 · #F9F88C×13 · #F4F4F4×2 · #F0FFCB×8 · #FFFEE5×4

## 166. unique_heavy_crossbow_sw_firework_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores.
- **Resolução/proporção:** 32×32; bbox [9, 9, 23, 23], 14×14; 74 pixels visíveis (7.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 7 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9DD318 (18 px de borda), #002C02 (12 px de borda), #005103 (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 145 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado carregado com foguete vermelho/cinza: muda o acento frontal e acrescenta cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×12 · #005103×11 · #009906×8 · #0AC706×2 · #9DD318×19 · #C9FF44×14 · #F0FFCB×8

## 167. unique_heavy_crossbow_sw_pulling_0.png
- **Categoria e observação:** ícone completo. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [5, 5, 25, 25], 20×20; 239 pixels visíveis (23.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 21 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C3651D (22 px de borda), #682507 (18 px de borda), #311309 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 81 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×20 · #002C02×19 · #361F28×2 · #4B2215×10 · #682507×32 · #6B2504×3 · #005103×16 · #6D3421×6 · #9B4415×2 · #9E4412×11 · #009906×10 · #C3651D×28 · #0AC706×5 · #DD8E21×13 · #20EF1C×1 · #9DD318×12 · #F3D63D×13 · #C9FF44×9 · #F9F88C×13 · #F0FFCB×10 · #FFFEE5×4

## 168. unique_heavy_crossbow_sw_pulling_0_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [9, 9, 23, 23], 14×14; 82 pixels visíveis (8.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #002C02 (18 px de borda), #005103 (16 px de borda), #9DD318 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 115 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×19 · #005103×16 · #009906×10 · #0AC706×5 · #20EF1C×1 · #9DD318×12 · #C9FF44×9 · #F0FFCB×10

## 169. unique_heavy_crossbow_sw_pulling_1.png
- **Categoria e observação:** ícone completo. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [5, 5, 25, 25], 20×20; 245 pixels visíveis (23.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C3651D (22 px de borda), #682507 (18 px de borda), #9DD318 (12 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 90 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×21 · #002C02×19 · #361F28×2 · #4B2215×8 · #682507×32 · #6B2504×3 · #005103×16 · #6D3421×7 · #9B4415×2 · #9E4412×11 · #9C4529×2 · #009906×10 · #C3651D×28 · #0AC706×5 · #DD8E21×13 · #20EF1C×1 · #9DD318×14 · #F3D63D×13 · #C9FF44×11 · #F9F88C×13 · #F0FFCB×10 · #FFFEE5×4

## 170. unique_heavy_crossbow_sw_pulling_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [9, 9, 23, 23], 14×14; 86 pixels visíveis (8.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #002C02 (18 px de borda), #005103 (16 px de borda), #9DD318 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 123 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×19 · #005103×16 · #009906×10 · #0AC706×5 · #20EF1C×1 · #9DD318×14 · #C9FF44×11 · #F0FFCB×10

## 171. unique_heavy_crossbow_sw_pulling_2.png
- **Categoria e observação:** ícone completo. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [5, 5, 25, 25], 20×20; 253 pixels visíveis (24.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C3651D (22 px de borda), #682507 (18 px de borda), #9DD318 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 104 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×23 · #002C02×19 · #361F28×2 · #4B2215×10 · #682507×32 · #6B2504×3 · #005103×16 · #6D3421×8 · #9E4412×8 · #9C4529×2 · #009906×8 · #C3651D×27 · #0AC706×5 · #DD8E21×13 · #9DD318×19 · #F3D63D×13 · #C9FF44×17 · #F9F88C×13 · #F0FFCB×11 · #FFFEE5×4

## 172. unique_heavy_crossbow_sw_pulling_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [9, 9, 23, 23], 14×14; 95 pixels visíveis (9.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 7 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9DD318 (18 px de borda), #002C02 (18 px de borda), #005103 (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. 119 pixels RGBA diferentes de `unique_heavy_crossbow_sw_standby_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×19 · #005103×16 · #009906×8 · #0AC706×5 · #9DD318×19 · #C9FF44×17 · #F0FFCB×11

## 173. unique_heavy_crossbow_sw_standby.png
- **Categoria e observação:** ícone completo. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 32×32; bbox [5, 5, 25, 25], 20×20; 233 pixels visíveis (22.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C3651D (22 px de borda), #682507 (16 px de borda), #311309 (14 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×21 · #002C02×19 · #361F28×2 · #4B2215×10 · #682507×32 · #6B2504×3 · #005103×16 · #6D3421×7 · #9B4415×2 · #9E4412×11 · #9C4529×2 · #009906×7 · #C3651D×28 · #0AC706×5 · #DD8E21×11 · #20EF1C×1 · #9DD318×10 · #F3D63D×11 · #C9FF44×11 · #F9F88C×13 · #F0FFCB×7 · #FFFEE5×4

## 174. unique_heavy_crossbow_sw_standby_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado de repouso: sem projétil carregado.
- **Resolução/proporção:** 32×32; bbox [9, 9, 24, 24], 15×15; 76 pixels visíveis (7.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #002C02 (18 px de borda), #005103 (16 px de borda), #9DD318 (9 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros dourados com volumes fortes, corda e incrustações verdes vivas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estado de repouso: sem projétil carregado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×19 · #005103×16 · #009906×8 · #0AC706×5 · #20EF1C×1 · #9DD318×9 · #C9FF44×11 · #F0FFCB×7

## 175. unique_longbow_1.png
- **Categoria e observação:** ícone completo. Membros alaranjados volumosos, com dezenas de variações RGB próximas; corda creme de três cores.
- **Resolução/proporção:** 32×32; bbox [4, 4, 28, 28], 24×24; 176 pixels visíveis (17.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 82 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #ECE7C9 (6 px de borda), #A17562 (6 px de borda), #C0B493 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (82 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 82 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros alaranjados volumosos, com dezenas de variações RGB próximas; corda creme de três cores. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #3D1300×4 · #451603×3 · #4F1409×2 · #4C160A×2 · #4D160B×2 · #46180D×2 · #43190E×2 · #4C1709×2 · #45190B×2 · #4B180B×2 · #4C180A×2 · #4A1909×2 · #4F1A0D×2 · #4D1B0C×2 · #4E1C0E×2 · #4F1C0E×2 · #5B2415×1 · #582715×1 · #672913×2 · #672A16×2 · #692F1A×1 · #812B0D×2 · #7A2D0F×2 · #7F2D0F×2 · #773011×2 · #7F2E10×2 · #7C300F×2 · #802F0E×2 · #7C3012×2 · #7B3112×2 · #70341C×2 · #7F310F×2 · #793314×2 · #853010×2 · #823110×2 · #7F3212×2 · #7F3213×2 · #7A3411×2 · #7A3413×2 · #803216×2 · #7E3315×2 · #84330E×2 · #7C361A×2 · #893314×2 · #803614×2 · #90320D×2 · #8F370D×2 · #883913×2 · #8F3916×2 · #8E3A15×2 · #913A16×2 · #923A17×2 · #8D4122×2 · #924114×2 · #9A4216×2 · #9B431B×2 · #A34C1D×2 · #A54D1D×2 · #B25321×2 · #BB6228×2 · #C56628×2 · #A17562×6 · #D87B2C×2 · #DA7D32×2 · #E37C2C×2 · #DD7F2B×2 · #DF7F2F×2 · #E28329×2 · #E78B2C×2 · #EE8A29×2 · #EB8F2A×2 · #F49629×2 · #F4992C×2 · #F49B21×2 · #F4AD3E×2 · #C0B493×6 · #FBB852×2 · #FAC162×2 · #FDC35F×2 · #FBC373×2 · #FBC76B×2 · #ECE7C9×6

## 176. unique_longbow_1_pulling_0.png
- **Categoria e observação:** ícone completo. Membros alaranjados volumosos, com dezenas de variações RGB próximas; corda creme de três cores. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [4, 4, 28, 28], 24×24; 194 pixels visíveis (18.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 85 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #ECE7C9 (8 px de borda), #281E0B (8 px de borda), #896727 (7 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (85 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 85 tons numa única face.
- **Silhueta/ângulo:** PCA -45.07°; ver categoria antes de interpretar como eixo. 140 pixels RGBA diferentes de `unique_longbow_1.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros alaranjados volumosos, com dezenas de variações RGB próximas; corda creme de três cores. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #3D1300×4 · #451603×2 · #281E0B×9 · #4F1409×2 · #4C160A×2 · #4D160B×2 · #46180D×2 · #43190E×2 · #4C1709×2 · #45190B×2 · #4B180B×2 · #4C180A×2 · #4A1909×2 · #4F1A0D×2 · #4D1B0C×2 · #4E1C0E×2 · #4F1C0E×2 · #582715×1 · #672913×2 · #672A16×2 · #812B0D×2 · #7A2D0F×2 · #7F2D0F×2 · #773011×2 · #7F2E10×2 · #7C300F×2 · #802F0E×2 · #7C3012×2 · #7B3112×2 · #70341C×2 · #7F310F×2 · #793314×2 · #853010×2 · #823110×2 · #7F3212×2 · #7F3213×2 · #7A3411×2 · #7A3413×2 · #803216×2 · #7E3315×2 · #84330E×2 · #7C361A×2 · #893314×2 · #803614×2 · #90320D×2 · #8F370D×2 · #883913×2 · #8F3916×2 · #8E3A15×2 · #913A16×2 · #923A17×2 · #8D4122×1 · #924114×2 · #9A4216×2 · #9B431B×2 · #A34C1D×2 · #A54D1D×2 · #B25321×2 · #896727×8 · #BB6228×2 · #C56628×2 · #A17562×6 · #D87B2C×2 · #DA7D32×2 · #E37C2C×2 · #DD7F2B×2 · #DF7F2F×2 · #E28329×2 · #E78B2C×2 · #EE8A29×2 · #EB8F2A×2 · #F49629×2 · #F4992C×2 · #F49B21×2 · #B1B1B1×1 · #F4AD3E×2 · #C0B493×6 · #FBB852×2 · #FAC162×2 · #FDC35F×2 · #FBC373×2 · #FBC76B×2 · #D8D8D8×1 · #ECE7C9×8 · #FFFFFF×1

## 177. unique_longbow_1_pulling_1.png
- **Categoria e observação:** ícone completo. Membros alaranjados volumosos, com dezenas de variações RGB próximas; corda creme de três cores. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [4, 4, 28, 28], 24×24; 196 pixels visíveis (19.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 85 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #ECE7C9 (8 px de borda), #A17562 (8 px de borda), #281E0B (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (85 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 85 tons numa única face.
- **Silhueta/ângulo:** PCA -45.03°; ver categoria antes de interpretar como eixo. 153 pixels RGBA diferentes de `unique_longbow_1.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros alaranjados volumosos, com dezenas de variações RGB próximas; corda creme de três cores. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #3D1300×4 · #451603×2 · #281E0B×9 · #4F1409×2 · #4C160A×2 · #4D160B×2 · #46180D×2 · #43190E×2 · #4C1709×2 · #45190B×2 · #4B180B×2 · #4C180A×2 · #4A1909×2 · #4F1A0D×2 · #4D1B0C×2 · #4E1C0E×2 · #4F1C0E×2 · #582715×1 · #672913×2 · #672A16×2 · #812B0D×2 · #7A2D0F×2 · #7F2D0F×2 · #773011×2 · #7F2E10×2 · #7C300F×2 · #802F0E×2 · #7C3012×2 · #7B3112×2 · #70341C×2 · #7F310F×2 · #793314×2 · #853010×2 · #823110×2 · #7F3212×2 · #7F3213×2 · #7A3411×2 · #7A3413×2 · #803216×2 · #7E3315×2 · #84330E×2 · #7C361A×2 · #893314×2 · #803614×2 · #90320D×2 · #8F370D×2 · #883913×2 · #8F3916×2 · #8E3A15×2 · #913A16×2 · #923A17×2 · #8D4122×1 · #924114×2 · #9A4216×2 · #9B431B×2 · #A34C1D×2 · #A54D1D×2 · #B25321×2 · #896727×8 · #BB6228×2 · #C56628×2 · #A17562×8 · #D87B2C×2 · #DA7D32×2 · #E37C2C×2 · #DD7F2B×2 · #DF7F2F×2 · #E28329×2 · #E78B2C×2 · #EE8A29×2 · #EB8F2A×2 · #F49629×2 · #F4992C×2 · #F49B21×2 · #B1B1B1×1 · #F4AD3E×2 · #C0B493×6 · #FBB852×2 · #FAC162×2 · #FDC35F×2 · #FBC373×2 · #FBC76B×2 · #D8D8D8×1 · #ECE7C9×8 · #FFFFFF×1

## 178. unique_longbow_1_pulling_2.png
- **Categoria e observação:** ícone completo. Membros alaranjados volumosos, com dezenas de variações RGB próximas; corda creme de três cores. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [4, 4, 28, 28], 24×24; 198 pixels visíveis (19.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 85 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #ECE7C9 (8 px de borda), #C0B493 (8 px de borda), #A17562 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (85 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 85 tons numa única face.
- **Silhueta/ângulo:** PCA -44.99°; ver categoria antes de interpretar como eixo. 176 pixels RGBA diferentes de `unique_longbow_1.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros alaranjados volumosos, com dezenas de variações RGB próximas; corda creme de três cores. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #3D1300×4 · #451603×2 · #281E0B×9 · #4F1409×2 · #4C160A×2 · #4D160B×2 · #46180D×2 · #43190E×2 · #4C1709×2 · #45190B×2 · #4B180B×2 · #4C180A×2 · #4A1909×2 · #4F1A0D×2 · #4D1B0C×2 · #4E1C0E×2 · #4F1C0E×2 · #582715×1 · #672913×2 · #672A16×2 · #812B0D×2 · #7A2D0F×2 · #7F2D0F×2 · #773011×2 · #7F2E10×2 · #7C300F×2 · #802F0E×2 · #7C3012×2 · #7B3112×2 · #70341C×2 · #7F310F×2 · #793314×2 · #853010×2 · #823110×2 · #7F3212×2 · #7F3213×2 · #7A3411×2 · #7A3413×2 · #803216×2 · #7E3315×2 · #84330E×2 · #7C361A×2 · #893314×2 · #803614×2 · #90320D×2 · #8F370D×2 · #883913×2 · #8F3916×2 · #8E3A15×2 · #913A16×2 · #923A17×2 · #8D4122×1 · #924114×2 · #9A4216×2 · #9B431B×2 · #A34C1D×2 · #A54D1D×2 · #B25321×2 · #896727×8 · #BB6228×2 · #C56628×2 · #A17562×8 · #D87B2C×2 · #DA7D32×2 · #E37C2C×2 · #DD7F2B×2 · #DF7F2F×2 · #E28329×2 · #E78B2C×2 · #EE8A29×2 · #EB8F2A×2 · #F49629×2 · #F4992C×2 · #F49B21×2 · #B1B1B1×1 · #F4AD3E×2 · #C0B493×8 · #FBB852×2 · #FAC162×2 · #FDC35F×2 · #FBC373×2 · #FBC76B×2 · #D8D8D8×1 · #ECE7C9×8 · #FFFFFF×1

## 179. unique_longbow_2.png
- **Categoria e observação:** ícone completo. Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege.
- **Resolução/proporção:** 32×32; bbox [5, 5, 27, 27], 22×22; 173 pixels visíveis (16.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 51 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #3D2A39 (11 px de borda), #1B0725 (10 px de borda), #B35070 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (51 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 51 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0E0A12×2 · #170621×2 · #0D0B15×6 · #19072A×2 · #1B0725×11 · #1B0726×2 · #1D072A×2 · #1C0827×2 · #1D082A×2 · #1B0A25×6 · #1B0A29×2 · #1F0928×2 · #1D0A2C×2 · #1B0C26×2 · #1E0B29×2 · #1E0B2B×2 · #1D0C2C×2 · #1E122C×2 · #281C2E×1 · #312134×1 · #2D253F×2 · #312639×1 · #342444×2 · #382634×2 · #38293C×2 · #3D2A37×6 · #3D2A39×15 · #3E2A3C×2 · #3C2C36×2 · #3F2B39×2 · #3F2C3D×2 · #412D38×2 · #422D3B×2 · #412E3B×2 · #462E3F×2 · #3F3146×1 · #44313E×2 · #46313E×2 · #443053×1 · #4B3C55×2 · #60525B×6 · #62545F×8 · #B35070×6 · #706769×11 · #837173×6 · #918285×2 · #90868A×4 · #A19497×2 · #CD8F86×6 · #CBC3C2×8 · #F6CDBF×5

## 180. unique_longbow_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [8, 8, 25, 25], 17×17; 17 pixels visíveis (1.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 3 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #B35070 (6 px de borda), #CD8F86 (6 px de borda), #F6CDBF (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #B35070×6 · #CD8F86×6 · #F6CDBF×5

## 181. unique_longbow_2_pulling_0.png
- **Categoria e observação:** ícone completo. Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [5, 5, 27, 27], 22×22; 184 pixels visíveis (18.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 56 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #3D2A39 (11 px de borda), #CD8F86 (8 px de borda), #B35070 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (56 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 56 tons numa única face.
- **Silhueta/ângulo:** PCA -45.02°; ver categoria antes de interpretar como eixo. 99 pixels RGBA diferentes de `unique_longbow_2.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0E0A12×2 · #170621×2 · #0D0B15×6 · #19072A×2 · #1B0725×9 · #1B0726×2 · #1D072A×2 · #1C0827×2 · #1D082A×2 · #1B0A25×6 · #1B0A29×2 · #1F0928×2 · #1D0A2C×2 · #1B0C26×2 · #1E0B29×2 · #1E0B2B×2 · #1D0C2C×2 · #1E122C×2 · #281E0B×4 · #281C2E×1 · #312134×1 · #2D253F×2 · #312639×1 · #342444×2 · #382634×2 · #38293C×2 · #3D2A37×6 · #3D2A39×15 · #3E2A3C×2 · #3C2C36×2 · #3F2B39×2 · #3F2C3D×2 · #412D38×2 · #422D3B×2 · #412E3B×2 · #462E3F×2 · #3F3146×1 · #44313E×2 · #46313E×2 · #443053×1 · #4B3C55×2 · #60525B×6 · #62545F×8 · #B35070×6 · #706769×11 · #896727×4 · #837173×6 · #918285×2 · #90868A×4 · #A19497×2 · #CD8F86×8 · #B1B1B1×1 · #CBC3C2×8 · #F6CDBF×5 · #D8D8D8×1 · #FFFFFF×1

## 182. unique_longbow_2_pulling_0_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [8, 8, 25, 25], 17×17; 19 pixels visíveis (1.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 3 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #CD8F86 (8 px de borda), #B35070 (6 px de borda), #F6CDBF (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 75 pixels RGBA diferentes de `unique_longbow_2_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #B35070×6 · #CD8F86×8 · #F6CDBF×5

## 183. unique_longbow_2_pulling_1.png
- **Categoria e observação:** ícone completo. Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [5, 5, 27, 27], 22×22; 184 pixels visíveis (18.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 56 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #3D2A39 (11 px de borda), #F6CDBF (8 px de borda), #B35070 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (56 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 56 tons numa única face.
- **Silhueta/ângulo:** PCA -44.98°; ver categoria antes de interpretar como eixo. 109 pixels RGBA diferentes de `unique_longbow_2.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0E0A12×2 · #170621×2 · #0D0B15×6 · #19072A×2 · #1B0725×9 · #1B0726×2 · #1D072A×2 · #1C0827×2 · #1D082A×2 · #1B0A25×6 · #1B0A29×2 · #1F0928×2 · #1D0A2C×2 · #1B0C26×2 · #1E0B29×2 · #1E0B2B×2 · #1D0C2C×2 · #1E122C×2 · #281E0B×4 · #281C2E×1 · #312134×1 · #2D253F×2 · #312639×1 · #342444×2 · #382634×2 · #38293C×2 · #3D2A37×6 · #3D2A39×15 · #3E2A3C×2 · #3C2C36×2 · #3F2B39×2 · #3F2C3D×2 · #412D38×2 · #422D3B×2 · #412E3B×2 · #462E3F×2 · #3F3146×1 · #44313E×2 · #46313E×2 · #443053×1 · #4B3C55×2 · #60525B×6 · #62545F×8 · #B35070×6 · #706769×11 · #896727×3 · #837173×6 · #918285×2 · #90868A×4 · #A19497×2 · #CD8F86×6 · #B1B1B1×1 · #CBC3C2×8 · #F6CDBF×8 · #D8D8D8×1 · #FFFFFF×1

## 184. unique_longbow_2_pulling_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [8, 8, 25, 25], 17×17; 20 pixels visíveis (2.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 3 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #F6CDBF (8 px de borda), #CD8F86 (6 px de borda), #B35070 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 89 pixels RGBA diferentes de `unique_longbow_2_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #B35070×6 · #CD8F86×6 · #F6CDBF×8

## 185. unique_longbow_2_pulling_2.png
- **Categoria e observação:** ícone completo. Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [5, 5, 27, 27], 22×22; 187 pixels visíveis (18.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 56 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #3D2A39 (11 px de borda), #CD8F86 (8 px de borda), #B35070 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (56 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 56 tons numa única face.
- **Silhueta/ângulo:** PCA -44.95°; ver categoria antes de interpretar como eixo. 128 pixels RGBA diferentes de `unique_longbow_2.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0E0A12×2 · #170621×2 · #0D0B15×6 · #19072A×2 · #1B0725×10 · #1B0726×2 · #1D072A×2 · #1C0827×2 · #1D082A×2 · #1B0A25×6 · #1B0A29×2 · #1F0928×2 · #1D0A2C×2 · #1B0C26×2 · #1E0B29×2 · #1E0B2B×2 · #1D0C2C×2 · #1E122C×2 · #281E0B×4 · #281C2E×1 · #312134×1 · #2D253F×2 · #312639×1 · #342444×2 · #382634×2 · #38293C×2 · #3D2A37×6 · #3D2A39×15 · #3E2A3C×2 · #3C2C36×2 · #3F2B39×2 · #3F2C3D×2 · #412D38×2 · #422D3B×2 · #412E3B×2 · #462E3F×2 · #3F3146×1 · #44313E×2 · #46313E×2 · #443053×1 · #4B3C55×2 · #60525B×6 · #62545F×8 · #B35070×8 · #706769×11 · #896727×3 · #837173×6 · #918285×2 · #90868A×4 · #A19497×2 · #CD8F86×8 · #B1B1B1×1 · #CBC3C2×8 · #F6CDBF×6 · #D8D8D8×1 · #FFFFFF×1

## 186. unique_longbow_2_pulling_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [8, 8, 25, 25], 17×17; 22 pixels visíveis (2.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 3 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #CD8F86 (8 px de borda), #B35070 (8 px de borda), #F6CDBF (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 107 pixels RGBA diferentes de `unique_longbow_2_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros vinho/roxo escuro com núcleo cinza claro e curvaturas ornamentadas; corda rosa/bege. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #B35070×8 · #CD8F86×8 · #F6CDBF×6

## 187. unique_longbow_sw.png
- **Categoria e observação:** ícone completo. Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 185 pixels visíveis (18.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 21 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9E4412 (18 px de borda), #311309 (18 px de borda), #C3651D (18 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×20 · #002C02×6 · #4B2215×12 · #682507×8 · #6B2504×8 · #005103×10 · #6D3421×6 · #9B4415×2 · #9E4412×27 · #9C4529×2 · #007804×6 · #009906×2 · #C3651D×18 · #0AC706×10 · #DD8E21×4 · #9DD318×6 · #F3D63D×12 · #C9FF44×12 · #F9F88C×5 · #F0FFCB×5 · #FFFEE5×4

## 188. unique_longbow_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 57 pixels visíveis (5.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C9FF44 (12 px de borda), #005103 (10 px de borda), #0AC706 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×6 · #005103×10 · #007804×6 · #009906×2 · #0AC706×10 · #9DD318×6 · #C9FF44×12 · #F0FFCB×5

## 189. unique_longbow_sw_pulling_0.png
- **Categoria e observação:** ícone completo. Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 197 pixels visíveis (19.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 26 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9E4412 (18 px de borda), #311309 (18 px de borda), #C3651D (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.94°; ver categoria antes de interpretar como eixo. 86 pixels RGBA diferentes de `unique_longbow_sw.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×20 · #281E0B×8 · #002C02×6 · #4B2215×12 · #682507×8 · #6B2504×7 · #005103×10 · #6D3421×6 · #9B4415×2 · #9E4412×27 · #9C4529×2 · #007804×6 · #896727×8 · #009906×2 · #C3651D×16 · #0AC706×10 · #DD8E21×3 · #B1B1B1×1 · #9DD318×6 · #F3D63D×10 · #D8D8D8×1 · #C9FF44×14 · #F9F88C×5 · #F0FFCB×4 · #FFFEE5×2 · #FFFFFF×1

## 190. unique_longbow_sw_pulling_0_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 58 pixels visíveis (5.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C9FF44 (14 px de borda), #005103 (10 px de borda), #0AC706 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 179 pixels RGBA diferentes de `unique_longbow_sw_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio inicial de tensão: comparar segmento da corda e posição do projétil. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×6 · #005103×10 · #007804×6 · #009906×2 · #0AC706×10 · #9DD318×6 · #C9FF44×14 · #F0FFCB×4

## 191. unique_longbow_sw_pulling_1.png
- **Categoria e observação:** ícone completo. Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 195 pixels visíveis (19.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 26 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9E4412 (18 px de borda), #311309 (18 px de borda), #C3651D (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.96°; ver categoria antes de interpretar como eixo. 285 pixels RGBA diferentes de `unique_longbow_sw.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×20 · #281E0B×8 · #002C02×6 · #4B2215×12 · #682507×8 · #6B2504×7 · #005103×8 · #6D3421×6 · #9B4415×2 · #9E4412×27 · #9C4529×2 · #007804×6 · #896727×8 · #009906×2 · #C3651D×16 · #0AC706×10 · #DD8E21×3 · #B1B1B1×1 · #9DD318×6 · #F3D63D×10 · #D8D8D8×1 · #C9FF44×14 · #F9F88C×5 · #F0FFCB×4 · #FFFEE5×2 · #FFFFFF×1

## 192. unique_longbow_sw_pulling_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 56 pixels visíveis (5.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C9FF44 (14 px de borda), #005103 (8 px de borda), #0AC706 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 322 pixels RGBA diferentes de `unique_longbow_sw_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio intermediário de tensão: o vértice da corda avança dentro da silhueta. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×6 · #005103×8 · #007804×6 · #009906×2 · #0AC706×10 · #9DD318×6 · #C9FF44×14 · #F0FFCB×4

## 193. unique_longbow_sw_pulling_2.png
- **Categoria e observação:** ícone completo. Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 195 pixels visíveis (19.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 26 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9E4412 (18 px de borda), #311309 (18 px de borda), #C3651D (16 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.04°; ver categoria antes de interpretar como eixo. 329 pixels RGBA diferentes de `unique_longbow_sw.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #311309×20 · #281E0B×8 · #002C02×6 · #4B2215×12 · #682507×8 · #6B2504×7 · #005103×10 · #6D3421×6 · #9B4415×2 · #9E4412×27 · #9C4529×2 · #007804×4 · #896727×8 · #009906×2 · #C3651D×16 · #0AC706×8 · #DD8E21×3 · #B1B1B1×1 · #9DD318×8 · #F3D63D×10 · #D8D8D8×1 · #C9FF44×14 · #F9F88C×5 · #F0FFCB×4 · #FFFEE5×2 · #FFFFFF×1

## 194. unique_longbow_sw_pulling_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio final de tensão: corda puxada e projétil registrado no desenho.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 56 pixels visíveis (5.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 8 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C9FF44 (14 px de borda), #005103 (10 px de borda), #9DD318 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. 368 pixels RGBA diferentes de `unique_longbow_sw_e.png` (comparação do arquivo inteiro, incluindo RGB transparente).
- **Detalhe/ruído:** Membros dourados/laranja com pequenos ornamentos verdes; corda clara e extremidades verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Estágio final de tensão: corda puxada e projétil registrado no desenho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×6 · #005103×10 · #007804×4 · #009906×2 · #0AC706×8 · #9DD318×8 · #C9FF44×14 · #F0FFCB×4

## 195. unique_longsword_sw.png
- **Categoria e observação:** ícone completo. Lâmina fina azul/branca, guarda pequena azul e ponto rosa; destaque em aresta longa.
- **Resolução/proporção:** 32×32; bbox [4, 6, 28, 28], 24×22; 134 pixels visíveis (13.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #414646 (16 px de borda), #1A4050 (14 px de borda), #0F252E (13 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -41.2°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina fina azul/branca, guarda pequena azul e ponto rosa; destaque em aresta longa. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×1 · #0F252E×17 · #00294C×3 · #990037×1 · #003053×8 · #CF065E×1 · #1A4050×20 · #414646×16 · #07579A×3 · #306480×3 · #1A77D9×2 · #4876B6×6 · #4978B7×1 · #EA44FF×1 · #657A78×8 · #747A97×7 · #A39DBB×12 · #A2A3E3×5 · #DBD3E0×5 · #D6D6FA×3 · #EDF9FF×10 · #E5FDFF×1

## 196. unique_longsword_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina fina azul/branca, guarda pequena azul e ponto rosa; destaque em aresta longa. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [12, 19, 14, 21], 2×2; 4 pixels visíveis (0.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 4 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #EA44FF (1 px de borda), #990037 (1 px de borda), #E5FDFF (1 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 0.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina fina azul/branca, guarda pequena azul e ponto rosa; destaque em aresta longa. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #990037×1 · #CF065E×1 · #EA44FF×1 · #E5FDFF×1

## 197. unique_mace_1.png
- **Categoria e observação:** atlas UV aparente. Atlas com cabeça lilás/cinza, cabo com faixas e regiões claras separadas.
- **Resolução/proporção:** 32×32; bbox [0, 0, 32, 32], 32×32; 369 pixels visíveis (36.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 17 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #C1B3CB (62 px de borda), #9C8DA7 (50 px de borda), #897796 (30 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 63.03°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com cabeça lilás/cinza, cabo com faixas e regiões claras separadas. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #2D283C×1 · #463761×1 · #5E4279×1 · #544B65×43 · #6C5047×1 · #776588×45 · #866758×1 · #8C64AB×1 · #806D93×1 · #897796×57 · #A78571×1 · #9C8DA7×86 · #AEA0B8×11 · #CAAB8A×1 · #C1B3CB×88 · #EFD199×1 · #F1E5F4×29

## 198. unique_mace_2.png
- **Categoria e observação:** atlas UV aparente. Atlas de estrutura cinza e cabeça/corrente azul intensa em ilhas distintas.
- **Resolução/proporção:** 32×32; bbox [0, 0, 32, 30], 32×30; 518 pixels visíveis (50.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 23 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9EA5A7 (54 px de borda), #F4F4F4 (44 px de borda), #556565 (29 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 33.79°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas de estrutura cinza e cabeça/corrente azul intensa em ilhas distintas. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002E5F×5 · #2C2F30×6 · #2E3C3B×1 · #00466B×25 · #463761×1 · #005198×25 · #464A4B×6 · #5E4279×1 · #6C5047×1 · #0071BA×38 · #556565×57 · #64696B×2 · #866758×6 · #8C64AB×1 · #738488×40 · #1F9BC9×31 · #A78571×5 · #5AABE8×26 · #9EA5A7×103 · #CAAB8A×2 · #C7CACB×48 · #EFD199×5 · #F4F4F4×83

## 199. unique_mace_2_e.png
- **Categoria e observação:** atlas UV aparente / máscara emissiva aparente. Atlas de estrutura cinza e cabeça/corrente azul intensa em ilhas distintas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [15, 10, 32, 23], 17×13; 150 pixels visíveis (14.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 6 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #0071BA (16 px de borda), #5AABE8 (10 px de borda), #005198 (9 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 35.12°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas de estrutura cinza e cabeça/corrente azul intensa em ilhas distintas. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002E5F×5 · #00466B×25 · #005198×25 · #0071BA×38 · #1F9BC9×31 · #5AABE8×26

## 200. unique_mace_sw.png
- **Categoria e observação:** atlas UV aparente. Atlas dourado com superfícies vermelho/laranja e acentos verdes/ciano.
- **Resolução/proporção:** 64×64; bbox [0, 0, 64, 63], 64×63; 806 pixels visíveis (19.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 25 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #E2B557 (141 px de borda), #AE8237 (65 px de borda), #F8DD72 (39 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 35.87°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas dourado com superfícies vermelho/laranja e acentos verdes/ciano. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #920001×4 · #212026×6 · #5E150D×4 · #29262C×21 · #2E2C37×29 · #88250E×2 · #3B393B×16 · #B11D07×48 · #494556×5 · #D3250B×36 · #4E4C4E×4 · #1A786B×8 · #D84913×2 · #FF5C22×5 · #009CAF×14 · #AE8237×128 · #70A41B×10 · #C19842×20 · #1ABDD1×8 · #E2B557×274 · #9CDD32×16 · #B4F44C×4 · #F8DD72×100 · #C1F173×10 · #FBE9A2×32

## 201. unique_mace_sw_e.png
- **Categoria e observação:** atlas UV aparente / máscara emissiva aparente. Atlas dourado com superfícies vermelho/laranja e acentos verdes/ciano. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 64×64; bbox [0, 20, 41, 36], 41×16; 133 pixels visíveis (3.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 12 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #D3250B (22 px de borda), #B11D07 (19 px de borda), #009CAF (9 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 14.34°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas dourado com superfícies vermelho/laranja e acentos verdes/ciano. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #5E150D×4 · #88250E×2 · #B11D07×44 · #D3250B×32 · #1A786B×6 · #D84913×2 · #FF5C22×1 · #009CAF×12 · #70A41B×6 · #1ABDD1×6 · #9CDD32×12 · #C1F173×6

## 202. unique_shield_1.png
- **Categoria e observação:** atlas UV aparente. Atlas com faces lilás estampadas e tiras marrons/cinza; não é um escudo plano de inventário.
- **Resolução/proporção:** 64×64; bbox [0, 0, 64, 64], 64×64; 1166 pixels visíveis (28.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 10 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #776588 (87 px de borda), #544B65 (81 px de borda), #9C8DA7 (61 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -67.93°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com faces lilás estampadas e tiras marrons/cinza; não é um escudo plano de inventário. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #2D150C×24 · #2D283C×91 · #49281C×32 · #683022×32 · #7D422C×32 · #544B65×251 · #776588×280 · #9C8DA7×246 · #C1B3CB×148 · #F1E5F4×30

## 203. unique_shield_2.png
- **Categoria e observação:** atlas UV aparente. Atlas com face dourada, componentes cinza, tiras marrons e regiões azuis.
- **Resolução/proporção:** 64×64; bbox [0, 0, 64, 63], 64×63; 1406 pixels visíveis (34.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 19 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #989898 (127 px de borda), #9B5B08 (73 px de borda), #B1B1B1 (69 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA 6.24°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com face dourada, componentes cinza, tiras marrons e regiões azuis. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #2D150C×24 · #002E5F×1 · #49281C×32 · #00466B×18 · #683022×32 · #6C3F05×68 · #424642×2 · #005198×39 · #7D422C×32 · #0071BA×52 · #9B5B08×151 · #1F9BC9×68 · #D1921B×127 · #989898×315 · #5AABE8×59 · #B1B1B1×217 · #FAC758×50 · #E6E6E6×90 · #FEF6E4×29

## 204. unique_shield_2_e.png
- **Categoria e observação:** atlas UV aparente / máscara emissiva aparente. Atlas com face dourada, componentes cinza, tiras marrons e regiões azuis. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 64×64; bbox [7, 53, 43, 63], 36×10; 237 pixels visíveis (5.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 6 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #5AABE8 (27 px de borda), #005198 (25 px de borda), #1F9BC9 (24 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -1.24°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com face dourada, componentes cinza, tiras marrons e regiões azuis. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002E5F×1 · #00466B×18 · #005198×39 · #0071BA×52 · #1F9BC9×68 · #5AABE8×59

## 205. unique_shield_sw.png
- **Categoria e observação:** atlas UV aparente. Atlas com faces vermelho/laranja, molduras douradas, ilhas turquesa e acentos verdes.
- **Resolução/proporção:** 64×64; bbox [0, 0, 64, 64], 64×64; 1443 pixels visíveis (35.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 22 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #AE8237 (155 px de borda), #E2B557 (99 px de borda), #29262C (78 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -86.37°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com faces vermelho/laranja, molduras douradas, ilhas turquesa e acentos verdes. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #2D150C×24 · #920001×146 · #29262C×168 · #49281C×32 · #3B393B×161 · #B11D07×152 · #683022×32 · #D3250B×51 · #4E4C4E×11 · #7D422C×32 · #1A786B×13 · #FF5C22×49 · #009CAF×46 · #AE8237×216 · #70A41B×21 · #1ABDD1×11 · #E2B557×151 · #9CDD32×22 · #FAD86B×45 · #B4F44C×13 · #F8DD72×42 · #C8F57F×5

## 206. unique_shield_sw_e.png
- **Categoria e observação:** atlas UV aparente / máscara emissiva aparente. Atlas com faces vermelho/laranja, molduras douradas, ilhas turquesa e acentos verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 64×64; bbox [0, 0, 32, 64], 32×64; 486 pixels visíveis (11.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 11 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #B11D07 (76 px de borda), #920001 (48 px de borda), #009CAF (38 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -89.53°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Atlas com faces vermelho/laranja, molduras douradas, ilhas turquesa e acentos verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #920001×142 · #B11D07×148 · #D3250B×47 · #1A786B×11 · #FF5C22×36 · #009CAF×44 · #70A41B×17 · #1ABDD1×9 · #9CDD32×18 · #B4F44C×9 · #C8F57F×5

## 207. unique_sickle_1.png
- **Categoria e observação:** ícone completo. Lâmina turquesa/ciano curva, cabo violeta escuro; brilho em segmentos do arco externo.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 96 pixels visíveis (37.5% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 94 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #004439 (1 px de borda), #064C4A (1 px de borda), #11001F (1 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (94 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 94 tons numa única face.
- **Silhueta/ângulo:** PCA -48.55°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina turquesa/ciano curva, cabo violeta escuro; brilho em segmentos do arco externo. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #00022B×1 · #0F0020×1 · #11001F×1 · #130025×1 · #19001E×1 · #180022×1 · #180023×1 · #1A0021×1 · #180029×1 · #000823×1 · #1B002B×1 · #1F0123×1 · #000A26×1 · #000A2B×1 · #22002E×1 · #000C22×1 · #000D29×1 · #000D2E×1 · #000D33×1 · #000E2A×1 · #001024×1 · #00122B×1 · #001137×1 · #001230×1 · #001232×1 · #00132F×1 · #011332×1 · #001337×1 · #321A46×1 · #2E2045×1 · #302345×1 · #2E2544×1 · #2F244D×1 · #2E2547×1 · #342747×1 · #2E2948×1 · #342842×1 · #332846×1 · #352A45×1 · #342A4A×1 · #332E46×1 · #00403A×1 · #373148×1 · #014241×1 · #35324E×1 · #004439×1 · #03443C×1 · #35344D×1 · #3D3349×1 · #004645×1 · #383550×1 · #38364C×1 · #3C354D×1 · #044745×1 · #024845×1 · #044848×1 · #034A41×1 · #04494A×1 · #054A40×1 · #004C43×1 · #014C43×1 · #044C49×1 · #024C4F×1 · #064C4A×1 · #004F48×1 · #045145×1 · #403F4B×1 · #0A504B×1 · #3F4154×1 · #045C54×1 · #086052×1 · #4E535C×1 · #016D8E×1 · #4D5B6D×1 · #076F79×1 · #535A6B×1 · #4F5C6A×1 · #565F6B×1 · #5A5F72×1 · #057A87×1 · #107AA4×1 · #0581A5×2 · #1094B4×1 · #039FAB×1 · #24C9A3×1 · #20D4AA×1 · #31F1A6×2 · #33F2AA×1 · #3AF3A9×1 · #87F5CA×1 · #A7FBD0×1 · #ABFECD×1 · #AFFDD0×1 · #B8FECC×1

## 208. unique_sickle_2.png
- **Categoria e observação:** ícone completo. Cabeça incandescente laranja, cabo vinho escuro curvo; transição de brilho concentrada na lâmina.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 108 pixels visíveis (42.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 58 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #210814 (12 px de borda), #200E17 (6 px de borda), #620000 (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (58 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 58 tons numa única face.
- **Silhueta/ângulo:** PCA -53.44°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça incandescente laranja, cabo vinho escuro curvo; transição de brilho concentrada na lâmina. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1B0910×1 · #210814×13 · #23090C×1 · #23090F×1 · #220A0C×1 · #200C14×1 · #200E17×6 · #201117×1 · #620000×5 · #26110B×1 · #25121A×1 · #281217×1 · #28121A×1 · #27131D×1 · #2A1515×1 · #2A1617×1 · #2D161C×1 · #720500×1 · #2C1A21×1 · #2A1D1E×1 · #331B1A×12 · #342022×1 · #7C0F00×1 · #322C31×1 · #3B2B2F×1 · #423236×4 · #443437×1 · #90250A×1 · #982400×1 · #AA1F01×2 · #9F2307×1 · #A72105×1 · #4E3937×1 · #B82100×2 · #AB2503×1 · #493D3B×2 · #AF2700×1 · #553F3F×2 · #A52D07×3 · #BA2A00×1 · #AC3B0B×2 · #E22E02×1 · #CE3607×1 · #CB3800×1 · #EE2E00×1 · #D23609×3 · #DA3509×1 · #FF2F00×1 · #FF3002×1 · #FF3600×1 · #FF4000×1 · #F38401×2 · #FF940B×1 · #FFAB07×3 · #FFB804×1 · #FED700×2 · #FFEA09×3 · #FFFAC8×1

## 209. unique_sickle_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Cabeça incandescente laranja, cabo vinho escuro curvo; transição de brilho concentrada na lâmina. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 16×16; bbox [4, 0, 16, 8], 12×8; 48 pixels visíveis (18.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 31 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #620000 (5 px de borda), #A52D07 (3 px de borda), #D23609 (3 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 20.72°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça incandescente laranja, cabo vinho escuro curvo; transição de brilho concentrada na lâmina. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #620000×5 · #720500×1 · #7C0F00×1 · #90250A×1 · #982400×1 · #AA1F01×2 · #9F2307×1 · #A72105×1 · #B82100×2 · #AB2503×1 · #AF2700×1 · #A52D07×3 · #BA2A00×1 · #AC3B0B×2 · #E22E02×1 · #CE3607×1 · #CB3800×1 · #EE2E00×1 · #D23609×3 · #DA3509×1 · #FF2F00×1 · #FF3002×1 · #FF3600×1 · #FF4000×1 · #F38401×2 · #FF940B×1 · #FFAB07×3 · #FFB804×1 · #FED700×2 · #FFEA09×3 · #FFFAC8×1

## 210. unique_sickle_sw.png
- **Categoria e observação:** ícone completo. Lâmina curva branca/cinza, guarda ocre/dourada e detalhe verde sobre cabo vermelho.
- **Resolução/proporção:** 16×16; bbox [0, 0, 16, 16], 16×16; 110 pixels visíveis (43.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #682507 (23 px de borda), #9B4415 (12 px de borda), #414646 (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -41.95°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina curva branca/cinza, guarda ocre/dourada e detalhe verde sobre cabo vermelho. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #070707×5 · #4C000B×4 · #161717×3 · #AB0C23×4 · #682507×28 · #D91A2B×2 · #414646×11 · #9B4415×13 · #009906×1 · #059C0D×1 · #707A79×4 · #0AC706×1 · #DE8D22×10 · #B0BDBE×4 · #F3D23D×7 · #D3DCE0×3 · #C9FF44×1 · #F9F88C×3 · #EDF9FF×4 · #FFFEE5×1

## 211. unique_sickle_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Lâmina curva branca/cinza, guarda ocre/dourada e detalhe verde sobre cabo vermelho. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 16×16; bbox [1, 13, 3, 15], 2×2; 4 pixels visíveis (1.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 4 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #009906 (1 px de borda), #0AC706 (1 px de borda), #059C0D (1 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 0.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Lâmina curva branca/cinza, guarda ocre/dourada e detalhe verde sobre cabo vermelho. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #009906×1 · #059C0D×1 · #0AC706×1 · #C9FF44×1

## 212. unique_spear_1.png
- **Categoria e observação:** ícone completo. Ponta azul/branca ornamental e haste azul-escura, com pequeno pomo estrelado.
- **Resolução/proporção:** 32×32; bbox [0, 0, 32, 32], 32×32; 192 pixels visíveis (18.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 106 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #343874 (10 px de borda), #34357B (6 px de borda), #273271 (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (106 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 106 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Ponta azul/branca ornamental e haste azul-escura, com pequeno pomo estrelado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #010012×2 · #00001B×5 · #01001C×1 · #01001D×2 · #01001F×1 · #02001D×1 · #03001B×2 · #03001F×1 · #05001C×2 · #08001E×1 · #170921×1 · #170930×1 · #100C28×4 · #180A2F×1 · #0F0D2C×2 · #190E31×1 · #1C1134×1 · #171636×1 · #1A1636×2 · #1A1A3A×1 · #211C37×2 · #1F1D38×2 · #201E3F×4 · #231E44×1 · #221E49×3 · #262242×2 · #252180×1 · #2B2A44×2 · #27258D×1 · #272685×1 · #272789×1 · #272D6B×1 · #2D2F69×2 · #273271×7 · #373456×2 · #34357B×6 · #343874×10 · #32387D×3 · #3C3F60×7 · #383E85×3 · #3C407C×1 · #374290×1 · #3B4292×1 · #3B4491×2 · #3943AB×1 · #424585×2 · #3A4888×2 · #3B488E×1 · #414988×1 · #43518C×1 · #4250B8×1 · #3B559D×2 · #415997×1 · #3E57BB×2 · #4657B9×2 · #4357C5×2 · #425CA8×1 · #4F58C6×1 · #4160A1×2 · #4468CB×2 · #4D6BB3×2 · #456FB2×2 · #4475C0×1 · #3479D1×3 · #4C7CC1×1 · #4C7DD2×6 · #4A80C5×1 · #4681D2×2 · #5082CC×2 · #4D83CE×1 · #5082D1×1 · #4D84CE×1 · #4F84CF×1 · #5483CC×1 · #4B89DD×1 · #4F8BCD×3 · #538AD1×1 · #5790D6×1 · #5592DE×1 · #5697D3×1 · #66A9EC×2 · #65AFE9×2 · #6EAFF4×2 · #6AB9F6×1 · #77CCF9×1 · #81CEFD×1 · #84D0F8×1 · #7BD2FF×1 · #87D4FE×3 · #91DAFF×1 · #93DEFF×1 · #93E2FF×1 · #A5E6FF×1 · #AAF1F8×1 · #AFF4FF×2 · #ABF6F7×1 · #B3F8F4×1 · #B4F8FF×2 · #B5FDFF×1 · #C1FFFF×1 · #C4FFFF×1 · #C5FFFF×1 · #CAFFFE×1 · #EDFFFF×3 · #EEFFFF×2 · #FEFEFF×1

## 213. unique_spear_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Ponta azul/branca ornamental e haste azul-escura, com pequeno pomo estrelado. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [0, 0, 32, 32], 32×32; 139 pixels visíveis (13.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 79 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #343874 (10 px de borda), #34357B (6 px de borda), #273271 (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Ponta azul/branca ornamental e haste azul-escura, com pequeno pomo estrelado. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #221E49×3 · #252180×1 · #27258D×1 · #272685×1 · #272789×1 · #272D6B×1 · #2D2F69×2 · #273271×7 · #34357B×6 · #343874×10 · #32387D×3 · #3C3F60×2 · #383E85×3 · #3C407C×1 · #374290×1 · #3B4292×1 · #3B4491×2 · #3943AB×1 · #424585×2 · #3A4888×2 · #3B488E×1 · #414988×1 · #43518C×1 · #4250B8×1 · #3B559D×2 · #415997×1 · #3E57BB×2 · #4657B9×2 · #4357C5×2 · #425CA8×1 · #4F58C6×1 · #4160A1×2 · #4468CB×2 · #4D6BB3×2 · #456FB2×2 · #4475C0×1 · #3479D1×3 · #4C7CC1×1 · #4C7DD2×6 · #4A80C5×1 · #4681D2×2 · #5082CC×2 · #4D83CE×1 · #5082D1×1 · #4D84CE×1 · #4F84CF×1 · #5483CC×1 · #4B89DD×1 · #4F8BCD×3 · #538AD1×1 · #5790D6×1 · #5592DE×1 · #5697D3×1 · #66A9EC×2 · #65AFE9×2 · #6EAFF4×2 · #6AB9F6×1 · #77CCF9×1 · #81CEFD×1 · #84D0F8×1 · #7BD2FF×1 · #87D4FE×3 · #91DAFF×1 · #93DEFF×1 · #93E2FF×1 · #A5E6FF×1 · #AAF1F8×1 · #AFF4FF×2 · #ABF6F7×1 · #B3F8F4×1 · #B4F8FF×2 · #B5FDFF×1 · #C1FFFF×1 · #C4FFFF×1 · #C5FFFF×1 · #CAFFFE×1 · #EDFFFF×3 · #EEFFFF×2 · #FEFEFF×1

## 214. unique_spear_2.png
- **Categoria e observação:** ícone completo. Ponta dourada incandescente, haste azul/cinza, guarda e pomo pequenos em tons quentes.
- **Resolução/proporção:** 32×32; bbox [0, 0, 32, 32], 32×32; 157 pixels visíveis (15.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 81 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #20273F (7 px de borda), #19253E (5 px de borda), #19203D (5 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (81 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 81 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Ponta dourada incandescente, haste azul/cinza, guarda e pomo pequenos em tons quentes. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #121B32×1 · #171B2D×2 · #1B1B36×1 · #1B1E34×1 · #1D1F32×1 · #1B1F3A×1 · #1F1F30×1 · #19203D×5 · #1C2039×1 · #222034×1 · #1E233A×1 · #1B2441×1 · #19253E×5 · #1E243E×1 · #20273F×8 · #1E2745×2 · #222841×1 · #222943×1 · #8E100A×12 · #641D17×1 · #801615×1 · #66211E×1 · #622220×1 · #761E15×1 · #692222×1 · #622423×1 · #25344C×1 · #6D241E×1 · #692621×1 · #70251E×1 · #273651×1 · #2C364B×1 · #7A2827×1 · #7E2A24×1 · #313E51×1 · #88303D×1 · #36465F×1 · #86323A×1 · #3B475F×2 · #3B4862×1 · #3B4865×1 · #40485E×1 · #873643×2 · #3E4A6A×1 · #394D63×2 · #8C3846×1 · #414C64×1 · #923B32×1 · #424E64×4 · #8B4234×1 · #48526B×2 · #984439×1 · #91473D×2 · #91483D×1 · #944837×5 · #95483A×1 · #954A3A×1 · #944A3D×1 · #954C44×5 · #595A74×3 · #B5564A×2 · #606B82×1 · #5C6C84×1 · #BF6151×2 · #6E829D×2 · #CF715C×2 · #D77159×1 · #7988A3×5 · #7D8CA8×5 · #FB8C67×1 · #FA926A×1 · #FF9E76×1 · #FFBB89×1 · #BBCCCA×4 · #C9DAD8×2 · #EDE356×2 · #D6E0E2×2 · #F5EC79×4 · #F5F5F5×6 · #FFFAB1×5 · #FFFCD6×1

## 215. unique_spear_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Ponta dourada incandescente, haste azul/cinza, guarda e pomo pequenos em tons quentes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [0, 4, 28, 32], 28×28; 12 pixels visíveis (1.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 4 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #FFFAB1 (5 px de borda), #F5EC79 (4 px de borda), #EDE356 (2 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Ponta dourada incandescente, haste azul/cinza, guarda e pomo pequenos em tons quentes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #EDE356×2 · #F5EC79×4 · #FFFAB1×5 · #FFFCD6×1

## 216. unique_spear_sw.png
- **Categoria e observação:** ícone completo. Ponta branca com gema verde e guarda escura; haste vermelha, pequenas ligações verdes.
- **Resolução/proporção:** 32×32; bbox [0, 0, 32, 32], 32×32; 160 pixels visíveis (15.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 20 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (34 px de borda), #414646 (16 px de borda), #657A78 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Ponta branca com gema verde e guarda escura; haste vermelha, pequenas ligações verdes. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×7 · #161717×36 · #311309×9 · #002C02×7 · #4B2215×5 · #AB0C23×7 · #652509×4 · #005103×8 · #D91A2B×6 · #414646×24 · #009906×2 · #657A78×9 · #747A97×9 · #0AC706×2 · #A39DBB×5 · #20EF1C×1 · #DBD3E0×7 · #C9FF44×3 · #EDF9FF×8 · #F0FFCB×1

## 217. unique_spear_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Ponta branca com gema verde e guarda escura; haste vermelha, pequenas ligações verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [4, 6, 26, 28], 22×22; 24 pixels visíveis (2.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 7 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #005103 (8 px de borda), #002C02 (7 px de borda), #009906 (2 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Ponta branca com gema verde e guarda escura; haste vermelha, pequenas ligações verdes. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #002C02×7 · #005103×8 · #009906×2 · #0AC706×2 · #20EF1C×1 · #C9FF44×3 · #F0FFCB×1

## 218. unique_staff_damage_1.png
- **Categoria e observação:** ícone completo. Cabeça turquesa com gema rosa; cabo ocre e ornamentos ciano nas terminações.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 157 pixels visíveis (15.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #031934 (32 px de borda), #004863 (30 px de borda), #4C260D (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça turquesa com gema rosa; cabo ocre e ornamentos ciano nas terminações. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #031934×44 · #31140A×6 · #67155A×7 · #4C260D×6 · #004863×36 · #804513×1 · #9A3989×8 · #007C79×12 · #BA4FA6×1 · #AE6717×2 · #05AAB8×13 · #E27BCE×5 · #DE9B2F×2 · #1EDEB3×6 · #FFCAD0×5 · #EAFFDE×3

## 219. unique_staff_damage_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Cabeça turquesa com gema rosa; cabo ocre e ornamentos ciano nas terminações. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [18, 6, 26, 14], 8×8; 28 pixels visíveis (2.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 6 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9A3989 (8 px de borda), #67155A (7 px de borda), #E27BCE (2 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça turquesa com gema rosa; cabo ocre e ornamentos ciano nas terminações. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #67155A×7 · #9A3989×8 · #BA4FA6×1 · #E27BCE×5 · #FFCAD0×5 · #EAFFDE×2

## 220. unique_staff_damage_2.png
- **Categoria e observação:** ícone completo. Cristal rosa/violeta grande e guarda dourada, haste roxa e pomo ocre.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 181 pixels visíveis (17.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 77 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #23004C (7 px de borda), #621F00 (5 px de borda), #4A079A (4 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (77 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 77 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cristal rosa/violeta grande e guarda dourada, haste roxa e pomo ocre. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #23004C×7 · #240340×1 · #2F0050×4 · #230649×1 · #2C0862×1 · #3E0C82×2 · #4A079A×9 · #450F90×1 · #4C1B06×3 · #511A05×2 · #5C1800×3 · #4B1D02×2 · #501C02×2 · #511C01×2 · #591C01×3 · #571D0A×3 · #591F00×2 · #5A2006×6 · #582102×2 · #562201×1 · #651E00×2 · #621F00×5 · #5C10AC×1 · #5C2104×2 · #592401×1 · #732104×3 · #682700×2 · #7A2800×2 · #693000×2 · #7C18BA×1 · #7F17BD×1 · #7F19BE×1 · #821BB7×1 · #7D1CBD×1 · #A50FC9×2 · #7C1AD9×7 · #8719C4×1 · #841CC4×1 · #861DBC×1 · #861DC3×1 · #8F1ACD×1 · #821FC3×1 · #8120C1×1 · #891FC4×1 · #823600×2 · #7E3900×2 · #853700×2 · #9E3100×5 · #983300×4 · #AB3000×2 · #AD3500×3 · #B23500×3 · #AE3800×3 · #CB1DE0×3 · #A64600×2 · #E530DC×1 · #D63AE4×4 · #CE6A00×1 · #D47900×2 · #EE61D5×1 · #FB60D9×1 · #D38202×2 · #E58E00×2 · #FF72E3×1 · #E49300×1 · #E59D02×1 · #EB9E02×2 · #FF88F1×3 · #F8C004×3 · #FCC904×2 · #FCCB02×3 · #FED000×3 · #FEDC0F×3 · #FFDF1D×2 · #FFEE7A×5 · #FBF8FA×1 · #FCFBFC×7

## 221. unique_staff_damage_2_e.png
- **Categoria e observação:** máscara emissiva aparente. Cristal rosa/violeta grande e guarda dourada, haste roxa e pomo ocre. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [22, 2, 30, 10], 8×8; 48 pixels visíveis (4.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 30 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #2F0050 (4 px de borda), #CB1DE0 (3 px de borda), #A50FC9 (2 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cristal rosa/violeta grande e guarda dourada, haste roxa e pomo ocre. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #240340×1 · #2F0050×4 · #230649×1 · #2C0862×1 · #3E0C82×2 · #450F90×1 · #5C10AC×1 · #7C18BA×1 · #7F17BD×1 · #7F19BE×1 · #821BB7×1 · #7D1CBD×1 · #A50FC9×2 · #8719C4×1 · #841CC4×1 · #861DBC×1 · #861DC3×1 · #8F1ACD×1 · #821FC3×1 · #8120C1×1 · #891FC4×1 · #CB1DE0×3 · #E530DC×1 · #D63AE4×4 · #EE61D5×1 · #FB60D9×1 · #FF72E3×1 · #FF88F1×3 · #FBF8FA×1 · #FCFBFC×7

## 222. unique_staff_damage_3.png
- **Categoria e observação:** ícone completo. Cabeça clara amarelo/laranja contornada de vinho; haste vermelha/azul estreita.
- **Resolução/proporção:** 32×32; bbox [2, 2, 31, 30], 29×28; 172 pixels visíveis (16.8% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 75 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #330226 (11 px de borda), #00071E (10 px de borda), #13031E (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (75 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 75 tons numa única face.
- **Silhueta/ângulo:** PCA -44.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça clara amarelo/laranja contornada de vinho; haste vermelha/azul estreita. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #00031A×1 · #0C0019×1 · #120115×1 · #000621×2 · #0D0319×1 · #00071E×10 · #170020×1 · #1D0016×1 · #0D0514×1 · #00081D×1 · #13031E×12 · #00091C×3 · #000921×1 · #000A18×2 · #33001E×1 · #300224×1 · #390023×1 · #330226×11 · #2E0423×1 · #2F051F×1 · #2E0524×3 · #3A012B×1 · #370326×1 · #41002B×1 · #410032×1 · #3E032C×1 · #4C0228×4 · #4A032E×2 · #480730×1 · #490A2F×1 · #4E0934×1 · #4A0C32×10 · #66072F×1 · #73042E×1 · #261E33×1 · #710839×2 · #760A2E×4 · #262632×10 · #970934×1 · #940C37×1 · #A10A32×1 · #A00C30×6 · #93113A×1 · #841637×3 · #AE163B×2 · #403651×1 · #3F3756×2 · #3C3B4F×1 · #41395B×1 · #3C3F5B×2 · #42415A×1 · #E9133E×4 · #4A4459×1 · #E71942×2 · #464D52×7 · #CA3139×2 · #A75500×3 · #596375×1 · #5F7181×1 · #708B98×1 · #748B99×1 · #84909D×4 · #F67969×1 · #8FB2BD×1 · #97B7C9×1 · #91BBC7×1 · #F1BC02×3 · #F3BF02×2 · #D1E1E7×3 · #D1E1EA×1 · #FBEF20×3 · #F9F026×2 · #E9F2F7×1 · #FFFFC5×2 · #FFFFC9×1

## 223. unique_staff_damage_3_e.png
- **Categoria e observação:** máscara emissiva aparente. Cabeça clara amarelo/laranja contornada de vinho; haste vermelha/azul estreita. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [23, 3, 29, 9], 6×6; 16 pixels visíveis (1.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 7 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #F1BC02 (3 px de borda), #FBEF20 (3 px de borda), #A75500 (3 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -31.64°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça clara amarelo/laranja contornada de vinho; haste vermelha/azul estreita. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #A75500×3 · #F1BC02×3 · #F3BF02×2 · #FBEF20×3 · #F9F026×2 · #FFFFC5×2 · #FFFFC9×1

## 224. unique_staff_damage_4.png
- **Categoria e observação:** ícone completo. Cabeça preta/roxa com núcleo vermelho; haste lilás fina. É uma das duas exceções com preto puro.
- **Resolução/proporção:** 32×32; bbox [2, 0, 31, 30], 29×30; 211 pixels visíveis (20.6% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 138 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #01040B (6 px de borda), #8C081D (3 px de borda), #000000 (3 px de borda). Preto puro presente em 5 px: exceção real.
- **Sombreamento:** Clusters e microtons locais (138 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 138 tons numa única face.
- **Silhueta/ângulo:** PCA -42.67°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça preta/roxa com núcleo vermelho; haste lilás fina. É uma das duas exceções com preto puro. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #000000×5 · #000001×2 · #000003×1 · #010001×1 · #000108×1 · #000109×1 · #000202×3 · #000208×2 · #000209×1 · #000301×2 · #000302×3 · #010300×2 · #000307×1 · #00030A×1 · #00030B×2 · #00030C×2 · #03020E×1 · #01030B×1 · #000406×2 · #000408×1 · #000409×1 · #02030E×1 · #00040A×2 · #00040B×1 · #01040A×1 · #00040D×1 · #01040B×7 · #00040E×2 · #00050A×1 · #00050D×3 · #00050E×2 · #00050F×3 · #01050D×1 · #00060C×1 · #03050E×1 · #00060D×1 · #00060E×1 · #00070F×1 · #15011E×1 · #030812×1 · #000915×1 · #1F001C×1 · #23001D×1 · #2A0020×1 · #190724×1 · #3B0027×2 · #1D0A26×1 · #1B0D22×1 · #2B0E2A×3 · #6D0019×7 · #5F061C×3 · #950003×1 · #930401×1 · #301E35×1 · #301E38×2 · #311F39×1 · #361D43×1 · #2D2136×1 · #2C2139×1 · #8C081D×6 · #A90110×1 · #2D2237×1 · #2E2339×1 · #A8002D×1 · #2D2436×1 · #34223C×2 · #322435×1 · #362148×1 · #35224A×1 · #2D263A×1 · #34243C×1 · #9C0639×1 · #33253E×1 · #31273E×1 · #3D2349×1 · #352647×1 · #362835×4 · #3B2549×1 · #3B2648×1 · #39274C×1 · #3A274A×1 · #382846×1 · #382946×1 · #392A40×1 · #3C284B×1 · #422652×1 · #3F284C×1 · #382E40×1 · #3D2B4F×3 · #352F42×1 · #332F4A×1 · #3D2C4D×1 · #402D53×1 · #333444×1 · #3A3245×1 · #FD0001×3 · #3D3748×1 · #403754×1 · #44394F×1 · #413C51×1 · #463D50×1 · #474157×1 · #513F62×6 · #49435C×1 · #FF141F×1 · #4C455E×1 · #46475C×1 · #4D485C×1 · #544865×1 · #EF2538×1 · #52506A×1 · #53516E×1 · #56526E×1 · #5A546C×1 · #58566D×1 · #5A566E×1 · #5F5776×2 · #55607E×1 · #625D7A×4 · #666582×1 · #FF3E44×1 · #6A6886×3 · #727295×1 · #74749C×1 · #7D769B×1 · #7A799C×1 · #8381A8×1 · #8587AF×1 · #7691AA×1 · #8C8EB0×1 · #829CB5×4 · #8E9CBE×4 · #81A7BD×1 · #99B7CB×1 · #F9A3A2×2 · #A3BFD2×1 · #C7D4DD×2 · #FEFEEF×2

## 225. unique_staff_damage_4_e.png
- **Categoria e observação:** máscara emissiva aparente. Cabeça preta/roxa com núcleo vermelho; haste lilás fina. É uma das duas exceções com preto puro. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [18, 6, 26, 13], 8×7; 33 pixels visíveis (3.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 15 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #8C081D (6 px de borda), #3B0027 (2 px de borda), #6D0019 (1 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -31.33°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça preta/roxa com núcleo vermelho; haste lilás fina. É uma das duas exceções com preto puro. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #3B0027×2 · #6D0019×7 · #5F061C×3 · #950003×1 · #930401×1 · #8C081D×6 · #A90110×1 · #A8002D×1 · #9C0639×1 · #FD0001×3 · #FF141F×1 · #EF2538×1 · #FF3E44×1 · #F9A3A2×2 · #FEFEEF×2

## 226. unique_staff_damage_5.png
- **Categoria e observação:** ícone completo. Cristal verde com guarda preta/roxa, haste azul escura e pomo verde. Outra exceção com preto puro.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 133 pixels visíveis (13.0% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 46 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #004824 (8 px de borda), #161530 (7 px de borda), #020103 (5 px de borda). Preto puro presente em 4 px: exceção real.
- **Sombreamento:** Clusters e microtons locais (46 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 46 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cristal verde com guarda preta/roxa, haste azul escura e pomo verde. Outra exceção com preto puro. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #000000×4 · #000004×2 · #020103×5 · #020012×4 · #0A0029×3 · #060130×5 · #2C0045×3 · #3E0051×1 · #400055×1 · #3F0058×1 · #161530×7 · #131D26×1 · #1B232D×3 · #192430×1 · #6C148E×2 · #01421E×3 · #302F63×8 · #2A3545×2 · #004725×4 · #004824×8 · #2F384C×5 · #004F22×2 · #005122×3 · #373F4F×1 · #036314×2 · #4D4F6A×3 · #524D90×7 · #585B7A×2 · #06842C×1 · #AE44C5×3 · #08862C×7 · #048D2A×1 · #088D2A×1 · #09932F×4 · #6D7093×1 · #08A625×6 · #7B80A4×1 · #8891B6×2 · #E571E5×1 · #58DC3D×2 · #FFABFF×1 · #75ED4D×1 · #81E867×1 · #82EF66×1 · #84F065×1 · #C3FFBB×5

## 227. unique_staff_damage_5_e.png
- **Categoria e observação:** máscara emissiva aparente. Cristal verde com guarda preta/roxa, haste azul escura e pomo verde. Outra exceção com preto puro. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 53 pixels visíveis (5.2% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 18 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #004824 (8 px de borda), #004725 (4 px de borda), #09932F (4 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cristal verde com guarda preta/roxa, haste azul escura e pomo verde. Outra exceção com preto puro. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #01421E×3 · #004725×4 · #004824×8 · #004F22×2 · #005122×3 · #036314×2 · #06842C×1 · #08862C×7 · #048D2A×1 · #088D2A×1 · #09932F×4 · #08A625×6 · #58DC3D×2 · #75ED4D×1 · #81E867×1 · #82EF66×1 · #84F065×1 · #C3FFBB×5

## 228. unique_staff_damage_6.png
- **Categoria e observação:** ícone completo. Cristal azul intenso/branco, anel lilás e haste marrom; brilhos locais claros.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 146 pixels visíveis (14.3% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 51 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #251831 (16 px de borda), #463850 (16 px de borda), #1A0044 (8 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (51 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 51 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cristal azul intenso/branco, anel lilás e haste marrom; brilhos locais claros. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #0B000D×1 · #100014×8 · #0E0129×1 · #150030×1 · #1B0217×1 · #15013D×1 · #12042A×1 · #17013F×1 · #1A0044×8 · #1A0049×2 · #1C0051×2 · #1A0348×1 · #290F1F×2 · #291020×2 · #2B1220×1 · #1A1264×1 · #2B1421×1 · #1D1266×3 · #251831×23 · #181765×2 · #192180×1 · #19247F×1 · #38242A×1 · #1D2C8F×5 · #1F3099×2 · #4A3035×2 · #493236×2 · #463850×20 · #203DA2×4 · #4B3C49×4 · #224BAD×1 · #224CA6×2 · #68493D×4 · #2954B7×1 · #2361C4×2 · #635A61×2 · #716678×4 · #2C75DA×3 · #3184E1×1 · #807980×1 · #3A93F0×1 · #979093×3 · #489EFE×1 · #A1A0A1×2 · #55B3FE×3 · #78D9FF×1 · #8FF7FB×2 · #F3E3C0×2 · #D3FEF4×1 · #FBFDD3×2 · #FFFBF1×2

## 229. unique_staff_damage_6_e.png
- **Categoria e observação:** máscara emissiva aparente. Cristal azul intenso/branco, anel lilás e haste marrom; brilhos locais claros. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [17, 2, 30, 15], 13×13; 58 pixels visíveis (5.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 30 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #1A0044 (8 px de borda), #1D2C8F (5 px de borda), #1D1266 (3 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cristal azul intenso/branco, anel lilás e haste marrom; brilhos locais claros. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #0E0129×1 · #150030×1 · #15013D×1 · #12042A×1 · #17013F×1 · #1A0044×8 · #1A0049×2 · #1C0051×2 · #1A0348×1 · #1A1264×1 · #1D1266×3 · #181765×2 · #192180×1 · #19247F×1 · #1D2C8F×5 · #1F3099×2 · #203DA2×4 · #224BAD×1 · #224CA6×2 · #2954B7×1 · #2361C4×2 · #2C75DA×3 · #3184E1×1 · #3A93F0×1 · #489EFE×1 · #55B3FE×3 · #78D9FF×1 · #8FF7FB×2 · #D3FEF4×1 · #FFFBF1×2

## 230. unique_staff_damage_sw.png
- **Categoria e observação:** ícone completo. Cabeça circular cinza/ciano, cabo azul e pomo claro; acentos ciano pequenos.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 134 pixels visíveis (13.1% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #161717 (21 px de borda), #414646 (20 px de borda), #657A78 (10 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça circular cinza/ciano, cabo azul e pomo claro; acentos ciano pequenos. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #161717×23 · #00294C×9 · #313434×9 · #414646×21 · #07579A×9 · #1A77D9×9 · #657A78×14 · #029AA1×2 · #747A97×5 · #26AE91×4 · #A39DBB×7 · #00F4FF×7 · #00FFC8×1 · #DBD3E0×2 · #EDF9FF×9 · #F0FFFC×3

## 231. unique_staff_damage_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Cabeça circular cinza/ciano, cabo azul e pomo claro; acentos ciano pequenos. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [2, 6, 26, 30], 24×24; 17 pixels visíveis (1.7% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 5 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #00F4FF (7 px de borda), #26AE91 (4 px de borda), #F0FFFC (2 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça circular cinza/ciano, cabo azul e pomo claro; acentos ciano pequenos. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #029AA1×2 · #26AE91×4 · #00F4FF×7 · #00FFC8×1 · #F0FFFC×3

## 232. unique_staff_heal_1.png
- **Categoria e observação:** ícone completo. Cabeça com asas/pétalas rosas claras, guarda violeta e cabo marrom; pomo rosa.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 158 pixels visíveis (15.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 16 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #E27BCE (22 px de borda), #9A3989 (16 px de borda), #2F0B49 (11 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters discretos, faces finas com poucos degraus; leitura de luz alto/esquerda, adaptada ao material. Sem dithering regular evidente. Número de RGB total não é contagem por face.
- **Silhueta/ângulo:** PCA -44.9°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça com asas/pétalas rosas claras, guarda violeta e cabo marrom; pomo rosa. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #1B0A19×17 · #44080D×5 · #2F0B49×20 · #44220B×4 · #7A130F×5 · #511C8A×8 · #7B33B6×9 · #AB3523×6 · #7D4C18×4 · #9A3989×17 · #AF78DE×2 · #E27BCE×27 · #F29EE2×6 · #EEC860×2 · #FFCAD0×14 · #EAFFDE×12

## 233. unique_staff_heal_1_e.png
- **Categoria e observação:** máscara emissiva aparente. Cabeça com asas/pétalas rosas claras, guarda violeta e cabo marrom; pomo rosa. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 76 pixels visíveis (7.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 5 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #E27BCE (24 px de borda), #9A3989 (17 px de borda), #FFCAD0 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA -44.87°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça com asas/pétalas rosas claras, guarda violeta e cabo marrom; pomo rosa. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #9A3989×17 · #E27BCE×27 · #F29EE2×6 · #FFCAD0×14 · #EAFFDE×12

## 234. unique_staff_heal_2.png
- **Categoria e observação:** ícone completo. Cabeça cinza com duas aletas douradas, cabo cinza e pomo dourado.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 219 pixels visíveis (21.4% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 86 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #595D79 (17 px de borda), #834A1B (8 px de borda), #773F17 (6 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (86 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 86 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça cinza com duas aletas douradas, cabo cinza e pomo dourado. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #14122B×1 · #13132C×1 · #13132D×2 · #14132D×1 · #301E07×2 · #292138×1 · #39210E×4 · #2A213C×1 · #262337×1 · #39260F×4 · #38270E×2 · #3A2613×2 · #3D2712×5 · #2C283F×1 · #46260D×2 · #45270C×2 · #432B12×2 · #322B4B×2 · #322E47×1 · #303247×5 · #3A304C×1 · #37314D×1 · #35324C×1 · #373349×1 · #39334B×1 · #38334E×1 · #3A334C×1 · #3B3350×3 · #3A344C×1 · #5A3110×2 · #3A354D×1 · #3B3650×1 · #3A3855×1 · #653412×2 · #3C3A52×1 · #683613×7 · #3C3D5A×1 · #403C60×1 · #403E5E×1 · #413E5C×2 · #413F57×1 · #773F17×6 · #823E18×2 · #774419×12 · #7C481C×2 · #84471F×2 · #4F5167×4 · #804A20×2 · #834A1B×8 · #864A21×2 · #4D5371×2 · #834C21×2 · #844D1D×2 · #874D21×2 · #595D79×22 · #5D6477×1 · #6C6881×1 · #6C6982×1 · #6D6982×1 · #706B89×1 · #A0692C×6 · #6A7585×1 · #BD7F2F×6 · #86909E×1 · #9497A9×1 · #8E9BA9×2 · #959BAC×1 · #9C9FB0×1 · #99A2AE×1 · #A4AAB7×2 · #A5B3C1×2 · #ADB5BF×1 · #DDB44D×4 · #AFC0CC×2 · #E5BD54×4 · #B7D0D5×7 · #F1D261×2 · #EFD667×2 · #F7E170×2 · #FFEC7D×2 · #FFED7B×2 · #FFED7D×2 · #E0EBF0×9 · #FFEE7E×2 · #FFEE81×3 · #FFEF8E×2

## 235. unique_staff_heal_sw.png
- **Categoria e observação:** ícone completo. Cabeça circular ocre/dourada com gema verde, haste vermelha e pomo laranja.
- **Resolução/proporção:** 32×32; bbox [2, 2, 30, 30], 28×28; 173 pixels visíveis (16.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 46 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #9B4415 (15 px de borda), #9C4514 (10 px de borda), #652707 (9 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Clusters e microtons locais (46 RGB totais). Tendência de highlights superiores/esquerdos; sem padrão de dithering regular evidente na inspeção. Não equivale a 46 tons numa única face.
- **Silhueta/ângulo:** PCA -45.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça circular ocre/dourada com gema verde, haste vermelha e pomo laranja. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Sem alpha suave, blur ou contorno preto grosso. Evitar ruído aleatório; preservar a silhueta na escala nativa.
- **Hex reais e contagens:** #4C000B×7 · #632307×7 · #AB0C23×7 · #672406×1 · #652509×1 · #672508×1 · #682507×5 · #682508×15 · #6B2504×2 · #652707×11 · #692607×2 · #D91A2B×7 · #9C4412×1 · #9B4415×18 · #9E4412×3 · #9C4514×10 · #9D4513×1 · #9D4514×1 · #9E4514×2 · #9E4515×1 · #A14514×1 · #B8581B×4 · #009906×3 · #059C0D×1 · #0AC706×2 · #D9871F×4 · #D88825×3 · #DB8826×2 · #DB8923×2 · #DD8D24×2 · #DE8D22×6 · #DD8E21×3 · #0ECF06×1 · #F3D23D×6 · #F3D63D×6 · #F2D73C×1 · #F5D840×2 · #F3DA40×1 · #C9FF44×1 · #FFE5F3×1 · #F9F88C×5 · #FDF795×3 · #FDF896×1 · #FEF898×1 · #FCFA95×2 · #FFFEE5×6

## 236. unique_staff_heal_sw_e.png
- **Categoria e observação:** máscara emissiva aparente. Cabeça circular ocre/dourada com gema verde, haste vermelha e pomo laranja. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada.
- **Resolução/proporção:** 32×32; bbox [20, 9, 23, 12], 3×3; 9 pixels visíveis (0.9% do canvas). Espessuras de componentes só são medidas nas seções explícitas do guia; não inferidas pela bbox.
- **Paleta:** 6 RGB visíveis. Atribuições de materiais conforme observação; rampas medidas de madeira, metal, couro, corda e penas em `palette.json`.
- **Contorno:** Cores mais frequentes na fronteira: #009906 (3 px de borda), #0AC706 (2 px de borda), #059C0D (1 px de borda). Nenhum pixel preto puro; borda selecionada colorida, sem conclusão de contorno fechado a partir apenas da contagem.
- **Sombreamento:** Máscara de elementos claros; iluminação volumétrica incompleta. Não interpretar cores restantes como rampa integral da arma.
- **Silhueta/ângulo:** PCA 0.0°; ver categoria antes de interpretar como eixo. Sem delta de estado aplicável.
- **Detalhe/ruído:** Cabeça circular ocre/dourada com gema verde, haste vermelha e pomo laranja. Somente os elementos aparentemente luminosos estão presentes nesta camada; a geometria faltante deve vir da textura pareada. Os highlights pertencem a faces/junções/pontas e às partes luminosas descritas.
- **Anti-padrões:** Preservar a categoria do arquivo; não aplicar diagonal/bbox de ícone a atlas ou camada parcial.
- **Hex reais e contagens:** #009906×3 · #059C0D×1 · #0AC706×2 · #0ECF06×1 · #C9FF44×1 · #FFE5F3×1
