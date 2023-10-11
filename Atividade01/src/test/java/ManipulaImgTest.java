import imgFunctions.ManipulaImg;
import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.image.BufferedImage;

public class ManipulaImgTest {

    @Test
    public void testGeradorDegrade() {
        int width = 800;
        int height = 600;
        BufferedImage result = ManipulaImg.geradorDegrade(width, height);

        // Verifica se a imagem não é nula
        assertNotNull(result);

        // Verifica se a largura e a altura da imagem correspondem aos parâmetros passados
        assertEquals(width, result.getWidth());
        assertEquals(height, result.getHeight());
    }

    @Test
    public void testgeradorCirculo() {
        int width = 800;
        int height = 600;
        BufferedImage result = ManipulaImg.geradorCirculo(width, height);

        // Verifica se a imagem não é nula
        assertNotNull(result);

        // Verifica se a largura e a altura da imagem correspondem aos parâmetros passados
        assertEquals(width, result.getWidth());
        assertEquals(height, result.getHeight());
    }

    @Test
    public void testgeradorQuadrado() {
        int width = 800;
        int height = 600;
        BufferedImage result = ManipulaImg.geradorQuadrado(width, height);

        // Verifica se a imagem não é nula
        assertNotNull(result);

        // Verifica se a largura e a altura da imagem correspondem aos parâmetros passados
        assertEquals(width, result.getWidth());
        assertEquals(height, result.getHeight());
    }
}
