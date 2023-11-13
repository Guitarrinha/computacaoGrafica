package imgFunctions;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ManipulaImg {

    /**
     * Gera uma imagem de degradê com as dimensões especificadas.
     *
     * @param width A largura da imagem de degradê.
     * @param height A altura da imagem de degradê.
     *
     * @return Uma BufferedImage representando a imagem de degradê gerada.
     */
    public static BufferedImage geradorDegrade(int width, int height) {
        //Cria imagem de acordo com o tamanho passado nas variaveis
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //Obtem um objeto Graphics2d para desenhar na imagem
        Graphics2D g2d = image.createGraphics();

        //Cria o degrade na imagem
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                float red = (float) x / width; //cor vermelha baseada na posicao X
                float green = (float) y / height; //cor verde baseada na posicao y
                float blue = 0.5f; //Componente de cor azul é fixa
                Color color = new Color(red, green, blue);
                image.setRGB(x, y, color.getRGB()); //define a cor do pixel na imagem
            }
        }

        //libera memoria e recursos do objeto Graphics2d
        g2d.dispose();

        //retorna a imagem criada
        return image;
    }

    /**
     * Gera uma imagem com um círculo azul sobre um fundo branco, com as dimensões especificadas.
     *
     * @param width A largura da imagem.
     * @param height A altura da imagem.
     *
     * @return Uma BufferedImage representando a imagem com o círculo azul.
     */
    public static BufferedImage geradorCirculo(int width, int height) {
        //Cria imagem de acordo com o tamanho passado nas variaveis
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //Obtem um objeto Graphics2d para desenhar na imagem
        Graphics2D g2d = image.createGraphics();

        //preenche o fundo da imagem de branco
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        //desenha um círculo azul na imagem
        g2d.setColor(Color.BLUE);
        g2d.fillOval(100, 100, 200, 200);

        //libera memoria e recursos do objeto Graphics2d
        g2d.dispose();

        //retorna a imagem criada
        return image;
    }

    /**
     * Gera uma imagem com um quadrado vermelho sobre um fundo branco, com as dimensões especificadas.
     *
     * @param width A largura da imagem.
     * @param height A altura da imagem.
     * @return Uma BufferedImage representando a imagem com o quadrado vermelho.
     */
    public static BufferedImage geradorQuadrado(int width, int height) {
        //Cria imagem de acordo com o tamanho passado nas variaveis
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //Obtem um objeto Graphics2d para desenhar na imagem
        Graphics2D g2d = image.createGraphics();
        //preenche o fundo da imagem de branco
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        //desenha um círculo quadrado na imagem
        g2d.setColor(Color.RED);
        g2d.fillRect(100, 100, 300, 300);

        //libera memoria e recursos do objeto Graphics2d
        g2d.dispose();

        //retorna a imagem criada
        return image;
    }
}
