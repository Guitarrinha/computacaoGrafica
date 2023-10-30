import imgFunctions.OBJLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivoOBJ = "src/main/java/Bar_chair_2.obj";

        OBJLoader objLoader = new OBJLoader(caminhoArquivoOBJ);

        List<float[]> vertices = objLoader.getVertices();
        List<float[]> normais = objLoader.getNormais();
        List<float[]> coordenadasTextura = objLoader.getCoordenadasTextura();
        List<int[]> faces = objLoader.getFaces();

        System.out.println("Vértices:");
        for (int i = 0; i < vertices.size(); i++) {
            float[] vertice = vertices.get(i);
            System.out.println("Vértice " + i + ": (" + vertice[0] + ", " + vertice[1] + ", " + vertice[2] + ")");
        }

        System.out.println("Normais:");
        for (int i = 0; i < normais.size(); i++) {
            float[] normal = normais.get(i);
            System.out.println("Normal " + i + ": (" + normal[0] + ", " + normal[1] + ", " + normal[2] + ")");
        }

        System.out.println("Coordenadas de Textura:");
        for (int i = 0; i < coordenadasTextura.size(); i++) {
            float[] coordenada = coordenadasTextura.get(i);
            System.out.println("Coordenada " + i + ": (" + coordenada[0] + ", " + coordenada[1] + ")");
        }

        System.out.println("Faces:");
        for (int i = 0; i < faces.size(); i++) {
            int[] face = faces.get(i);
            System.out.print("Face " + i + ": ");
            for (int j = 0; j < face.length; j++) {
                System.out.print(face[j] + " ");
            }
            System.out.println();
        }
    }
}
