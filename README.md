# Archery Plus

Projeto de mod para expandir a arquearia no Minecraft com arcos, flechas e aljavas.

**Estado atual:** **0.1.0** com arco recurvo, arco longo, arco vanilla e aljavas
de couro, ferro, ouro, diamante e netherita. Texturas originais em pixel art,
roda medieval com ampliação suave do setor apontado e modelo de aljava nas costas
feito no Blockbench. O modelo acompanha o preenchimento da aljava equipada.
Melhorias de material preservam flechas, seleção e nome personalizado.
Inclui slot de equipamento, menu por H, roda por R e zoom automático.
Os arcos usam a munição selecionada na aljava fora do criativo.

A bancada de arquearia está disponível como bloco decorativo de **2 × 2 × 1**,
sem interface. Ela aparece na aba criativa **Archery Plus** ou pode ser obtida
com `/give @s archery_plus:archery_workbench`. Deixe dois blocos livres no chão
e dois acima; a frente fica voltada para o jogador. Quebrar qualquer parte
remove a bancada inteira e devolve um item no modo sobrevivência.

## Documentação

- [Visão e escopo do mod](docs/lore.md).
- [Mini tutorial: configurar, executar e depurar](docs/desenvolvimento.md).
- [Arquitetura e APIs confirmadas](docs/arquitetura.md).
- [Testes do MVP, medições e roteiro manual](docs/testes-mvp.md).
- [Análise, lacunas e ideias](docs/analise.md).
- [Inspirações visuais](docs/inspirations/README.md).
- [Texturas, materiais e modelo nas costas](docs/visuais.md).
- [Fontes das texturas, paletas e reprodução da arte](tools/textures/README.md).

## Ambiente

| Componente | Versão configurada |
| --- | --- |
| Minecraft | 26.1.2 |
| NeoForge | 26.1.2.111 |
| Java para compilar e executar o jogo | JDK 25, 64 bits |
| Gradle Wrapper | 9.2.1 |
| ModDevGradle | 2.0.147 |

Com o JDK e `JAVA_HOME` configurados, execute na raiz, pelo PowerShell:

```powershell
.\gradlew.bat build
.\gradlew.bat runGameTestServer
.\gradlew.bat runClient
```

Para depurar no IntelliJ IDEA, importe como projeto Gradle e use **Debug** na
configuração **Archery Plus - Client** gerada pelo ModDevGradle. Veja o tutorial
para configurar o JDK, posicionar breakpoints e testar o servidor.

## Origem

Baseado no [MDK-26.1.2-ModDevGradle](https://github.com/NeoForgeMDKs/MDK-26.1.2-ModDevGradle).
Consulte também a [documentação do NeoForge](https://docs.neoforged.net/) e a do
[ModDevGradle](https://github.com/neoforged/ModDevGradle).

`TEMPLATE_LICENSE.txt` documenta a licença do template. A licença declarada para
o mod é `All Rights Reserved`.
