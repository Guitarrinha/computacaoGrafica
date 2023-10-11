# Atividade 1

# Pacote `imgFunctions`

O pacote `imgFunctions` é uma biblioteca Java que fornece funções para gerar, manipular e salvar imagens. Atualmente, ele oferece funcionalidades para criar imagens degradê, imagens com um círculo azul, imagens com um quadrado vermelho e também para salvar essas imagens em arquivos nos formatos desejados.

## Funções Disponíveis

### `geradorDegrade(int width, int height)`

Esta função gera uma imagem de degradê com as dimensões especificadas.

- Parâmetros:
    - `width`: A largura da imagem de degradê.
    - `height`: A altura da imagem de degradê.

### `geradorCirculo(int width, int height)`

Esta função gera uma imagem com um círculo azul sobre um fundo branco, com as dimensões especificadas.

- Parâmetros:
    - `width`: A largura da imagem.
    - `height`: A altura da imagem.

### `geradorQuadrado(int width, int height)`

Esta função gera uma imagem com um quadrado vermelho sobre um fundo branco, com as dimensões especificadas.

- Parâmetros:
    - `width`: A largura da imagem.
    - `height`: A altura da imagem.

### `salvarImagem(BufferedImage imagem, String formato, String nome_arquivo)`

Esta função permite salvar uma imagem em um arquivo no formato especificado.

- Parâmetros:
    - `imagem`: A imagem a ser salva, representada como uma BufferedImage.
    - `formato`: O formato do arquivo (por exemplo, "png", "jpg", "gif").
    - `nome_arquivo`: O nome do arquivo no qual a imagem será salva.

## Como Usar

Para usar este pacote, siga as etapas mencionadas anteriormente e, para salvar uma imagem, utilize a função `salvarImagem`. Por exemplo:

```java
BufferedImage minhaImagem = ManipulaImg.geradorDegrade(800, 600);
SaveImg.salvarImagem(minhaImagem, "png", "imagem_degradê.png");