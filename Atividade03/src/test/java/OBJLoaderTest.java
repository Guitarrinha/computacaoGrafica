import imgFunctions.OBJLoader;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OBJLoaderTest {
    private OBJLoader objLoader;

    @Before
    public void setUp() {
        String caminhoArquivoOBJ = "src/main/java/Bar_chair_2.obj";
        objLoader = new OBJLoader(caminhoArquivoOBJ);
    }

    @Test
    public void testVertices() {
        List<float[]> vertices = objLoader.getVertices();
        assertNotNull(vertices);
        assertNotEquals(0, vertices.size());
    }

    @Test
    public void testNormais() {
        List<float[]> normais = objLoader.getNormais();
        assertNotNull(normais);
        assertNotEquals(0, normais.size());
    }

    @Test
    public void testCoordenadasTextura() {
        List<float[]> coordenadasTextura = objLoader.getCoordenadasTextura();
        assertNotNull(coordenadasTextura);
        assertNotEquals(0, coordenadasTextura.size());
    }

    @Test
    public void testFaces() {
        List<int[]> faces = objLoader.getFaces();
        assertNotNull(faces);
        assertNotEquals(0, faces.size());
    }
}
