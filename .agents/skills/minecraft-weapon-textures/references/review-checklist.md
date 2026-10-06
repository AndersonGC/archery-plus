# Checklist de revisão

- [ ] Destino identificado: sprite, atlas UV ou máscara emissiva; canvas coincide com o recurso/modelo.
- [ ] PNG RGBA no tamanho nativo escolhido; alpha somente 0 ou 255; background transparente.
- [ ] Paleta extraída de pixels visíveis; hex com procedência verificável. Materiais identificados pela região e função, não por hue sozinho.
- [ ] Família básica: 5–30 cores totais como referência; objetivo dos exemplos ≤24. Unique usa sua referência, sem teto básico imposto.
- [ ] Madeira 3–4, metal 4–6, couro 3–5, corda 1–3 e penas 2–3 disponíveis; cada face fina usa apenas 2–3 degraus.
- [ ] Rampa escuro→claro monotônica em Y′; salto visual suficiente; sem interpolação automática de RGB.
- [ ] Outline selecionado de 1 px e cor do material; sem preto puro no perfil básico, halo ou borda grossa.
- [ ] Luz predominante alto/esquerda; metal tem brilho curto, couro/madeira brilhos mais contidos. Material emissivo está separado.
- [ ] Corda 1 px (máximo 2 px localmente), haste 3–5 px e ponta 4–7 px horizontais no perfil 32×32. Registrar onde foi feita a seção; não confundir com largura perpendicular.
- [ ] Arco/besta bbox 18–26 px; flecha/haste 24–28 px, com margem legível. São objetivos de desenho, não exigências para atlas ou cópias existentes.
- [ ] Diagonal funcional correta; haste a 45° quando desejado. Eixo PCA foi tratado como diagnóstico, sem girar a besta com base só nele.
- [ ] Silhueta reconhecível em 1×; sem ruído aleatório, vazios involuntários ou pixels soltos. Ornamentos/UV/emissivos podem ter ilhas intencionais.
- [ ] Sem dithering automático, blur, antialias, alpha suave ou fundo quadriculado incorporado.
- [ ] Highlights pequenos e em arestas/junções; verificar objetivo ≤20% por material, excetuando corda e emissivo. Percentual deve ser revisado visualmente, não tomado como evidência de iluminação.
- [ ] Animações preservam paleta, encaixe da mão e registro do canvas; mudanças de corda/membros são intencionais.
- [ ] Validador executado, erros corrigidos e avisos explicados; revisão visual em 1× e NEAREST sobre fundos claro/escuro concluída.
- [ ] PNG final, prancha e medidas entregues; integração em jogo foi solicitada e verificada quando aplicável.
