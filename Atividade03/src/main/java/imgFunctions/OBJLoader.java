package imgFunctions;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OBJLoader {
    private List<float[]> vertices;
    private List<float[]> normais;
    private List<float[]> coordenadasTextura;
    private List<int[]> faces;

    /**
     * Cria uma instância de OBJLoader e carrega um arquivo OBJ especificado.
     *
     * @param caminhoArquivo O caminho para o arquivo OBJ a ser carregado.
     */
    public OBJLoader(@NotNull String caminhoArquivo) {
        vertices = new ArrayList<>();
        normais = new ArrayList<>();
        coordenadasTextura = new ArrayList<>();
        faces = new ArrayList<>();
        carregarOBJ(caminhoArquivo);
    }

    /**
     * Carrega um arquivo OBJ e extrai dados como vértices, normais, coordenadas de textura e faces.
     * Os dados são armazenados nas listas correspondentes para uso posterior.
     *
     * @param caminhoArquivo O caminho para o arquivo OBJ a ser carregado.
     */
    private void carregarOBJ(@NotNull String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.startsWith("#")) {
                    continue;  // Ignora linhas que começam com "#" (comentários no arquivo OBJ)
                }
                String[] partes = linha.split("\\s+");
                if (partes.length == 0) {
                    continue; // Ignora linhas em branco ou sem conteúdo
                }
                if (partes[0].equals("v")) {
                    // Se a linha começa com "v", então estamos lendo informações de vértices.
                    // As coordenadas x, y e z dos vértices são extraídas de partes[1], partes[2] e partes[3].
                    // Os valores são convertidos para float e adicionados à lista de vértices.
                    try {
                        float x = Float.parseFloat(partes[1]);
                        float y = Float.parseFloat(partes[2]);
                        float z = Float.parseFloat(partes[3]);
                        vertices.add(new float[]{x, y, z});
                    } catch (NumberFormatException e) {
                        // Tratamento de exceção se ocorrer erro de conversão
                        System.err.println("Erro ao converter coordenadas de vértices: " + linha);
                    }
                } else if (partes[0].equals("vn")) {
                    // Se a linha começa com "vn", então estamos lendo informações de normais.
                    // As coordenadas nx, ny e nz das normais são extraídas de partes[1], partes[2] e partes[3].
                    // Os valores são convertidos para float e adicionados à lista de normais.
                    try {
                        float nx = Float.parseFloat(partes[1]);
                        float ny = Float.parseFloat(partes[2]);
                        float nz = Float.parseFloat(partes[3]);
                        normais.add(new float[]{nx, ny, nz});
                    } catch (NumberFormatException e) {
                        // Tratamento de exceção se ocorrer erro de conversão
                        System.err.println("Erro ao converter coordenadas de normais: " + linha);
                    }
                } else if (partes[0].equals("vt")) {
                    // Se a linha começa com "vt", então estamos lendo informações de coordenadas de textura (UV).
                    // As coordenadas u e v são extraídas de partes[1] e partes[2].
                    // Os valores são convertidos para float e adicionados à lista de coordenadas de textura.
                    try {
                        float u = Float.parseFloat(partes[1]);
                        float v = Float.parseFloat(partes[2]);
                        coordenadasTextura.add(new float[]{u, v});
                    } catch (NumberFormatException e) {
                        // Tratamento de exceção se ocorrer erro de conversão
                        System.err.println("Erro ao converter coordenadas de textura: " + linha);
                    }
                } else if (partes[0].equals("f")) {
                    // Se a linha começa com "f", então estamos lendo informações de faces.
                    // As informações de índices de vértices de uma face são encontradas nas partes seguintes.
                    // Cada índice de vértice é extraído, convertido para um valor inteiro e subtraído por 1
                    // para ajustar à indexação baseada em 0. Os índices da face são adicionados à lista de faces.
                    int[] face = new int[partes.length - 1];
                    for (int i = 1; i < partes.length; i++) {
                        String[] indices = partes[i].split("/");
                        try {
                            int indiceVertice = Integer.parseInt(indices[0]) - 1;
                            face[i - 1] = indiceVertice;
                        } catch (NumberFormatException e) {
                            // Tratamento de exceção se ocorrer erro de conversão
                            System.err.println("Erro ao converter índice de vértice em uma face: " + linha);
                        }
                    }
                    faces.add(face);
                }
            }
        } catch (IOException e) {
            // Tratamento de exceção se ocorrer erro ao abrir o arquivo
            e.printStackTrace();
        }
    }

    public List<float[]> getVertices() {
        return vertices;
    }

    public List<float[]> getNormais() {
        return normais;
    }

    public List<float[]> getCoordenadasTextura() {
        return coordenadasTextura;
    }

    public List<int[]> getFaces() {
        return faces;
    }
}