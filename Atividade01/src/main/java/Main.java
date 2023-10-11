import imgFunctions.SaveImg;

import java.awt.image.BufferedImage;

import static imgFunctions.ManipulaImg.*;
import static imgFunctions.SaveImg.salvarImagem;

public class Main {
    public static void main(String[] args) {
        // Gera e salve uma imagem de degradê
        BufferedImage gradientImage = geradorDegrade(800, 600);
        salvarImagem(gradientImage, "png", "gradient.png");

        // Gera e salve uma imagem de um círculo
        BufferedImage circleImage = geradorCirculo(400, 400);
        salvarImagem(circleImage, "png", "circle.png");

        // Gera e salve uma imagem de um quadrado
        BufferedImage squareImage = geradorQuadrado(500, 500);
        salvarImagem(squareImage, "png", "square.png");
    }

}
