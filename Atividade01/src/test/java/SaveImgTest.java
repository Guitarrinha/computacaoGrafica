import imgFunctions.ManipulaImg;
import imgFunctions.SaveImg;
import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SaveImgTest {
    @Test
    public void testSalvarImagem() {
        int width = 800;
        int height = 600;
        BufferedImage image = ManipulaImg.geradorDegrade(width, height);
        String formato = "png";
        String nome_arquivo = "imagem_degradê.png";

        // Chama a função para salvar a imagem
        SaveImg.salvarImagem(image, formato, nome_arquivo);

        // Verifica se o arquivo foi criado com sucesso
        assertTrue(new File(nome_arquivo).exists());

        //verifica se o formato do arquivo corresponde ao formato especificado
        String arquivoFormato = nome_arquivo.substring(nome_arquivo.lastIndexOf('.') + 1);
        assertEquals(formato, arquivoFormato);
    }
}
