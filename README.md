# Archery Plus

Projeto de mod para expandir a arquearia no Minecraft com arcos, flechas e aljavas.

**Estado atual:** MVP **0.1.0** implementado: recurvo, arco longo, aljava de ferro,
slot de equipamento, menu por H, roda por R e zoom automático. O arco vanilla e
os novos arcos usam somente a munição selecionada na aljava fora do criativo.
As validações manuais de interface, controles e multiplayer estão pendentes com
o usuário; consulte o roteiro e as evidências abaixo.

## Documentação

- [Visão e escopo do mod](docs/lore.md).
- [Mini tutorial: configurar, executar e depurar](docs/desenvolvimento.md).
- [Arquitetura e APIs confirmadas](docs/arquitetura.md).
- [Testes do MVP, medições e roteiro manual](docs/testes-mvp.md).
- [Análise, lacunas e ideias](docs/analise.md).
- [Inspirações visuais](docs/inspirations/README.md).

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
