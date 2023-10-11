package imgFunctions;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SaveImg {

    /**
     * Salva uma imagem em um arquivo no formato especificado.
     *
     * @param imagem A imagem a ser salva, representada como uma BufferedImage.
     * @param formato O formato do arquivo (por exemplo, "png", "jpg", "gif").
     * @param nome_arquivo O nome do arquivo no qual a imagem será salva.
     */
    public static void salvarImagem(BufferedImage imagem, String formato, String nome_arquivo) {
        try {
            File arquivo = new File(nome_arquivo);
            ImageIO.write(imagem, formato, arquivo);
            System.out.println("Imagem salva com sucesso em " + nome_arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
