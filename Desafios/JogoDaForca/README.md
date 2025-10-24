# Requisitos faltantes

## Requisito 1.1: Leitura das Palavras
- O sistema deve carregar uma lista de palavras a partir de um arquivo de texto (palavras.txt). ✅
- Cada linha do arquivo representa uma palavra distinta ✅
- Caso o arquivo não exista ou esteja vazio, o jogo não deve iniciar e uma mensagem de erro deve ser exibida ✅

## Requisito 1.2: Seleção da Palavra Secret
- O jogo deve escolher aleatoriamente uma palavra da lista carregada ✅
- A palavra escolhida deve ser convertida para letras minúscula ❌

## Requisito 1.3: Mecânica de Jogo
- A cada interação do jogo a console deve ser limpa para gerar a sensação de tela atualizada. ✅
- O jogador inicia com 6 vidas. ✅
- A cada rodada, o jogador deve digitar uma letra. ✅
- Letras repetidas não devem ser aceitas novamente. Caso isto ocorra o jogador deve ser alertado e solicitado a
digitar outra letra.
- Se a letra estiver na palavra, ela é exibida nas posições corretas conforme a palavra.
- Se a letra não estiver na palavra, o jogador perde uma vida, e um novo desenho da forca deve ser exibido.

## Requisito 1.4: Fim de Jogo
- O jogo termina quando:
- O jogador acerta todas as letras da palavra (vitória).
- O jogador perde todas as vidas (derrota).
- Ao final do jogo, deve ser exibida:
- A palavra secreta.
- Uma mensagem de vitória ou derrota e o estado de como estava a forca.

## Requisito 1.5: Exibição da Forca
- A cada erro, uma nova parte da forca deve ser exibida, até completar o desenho ao fim das 6 tentativas. A forca
deve ser desenhada utilizando caracteres de texto simular ao conceito de Art ASCII.

## Requisito 1.6: Interface de Texto
- O jogo deve funcionar em um terminal/console.
- A tela deve ser limpa a cada nova jogada para atualizar a exibição do estado atual do jogo.

## Requisito 1.7: Informações Visuais Durante o Jogo
- Durante o jogo, deve ser exibido:
- Quantidade de vidas restantes.
- Letras já tentadas.



