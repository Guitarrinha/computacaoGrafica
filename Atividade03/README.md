# ATIVIDADE 03
# Projeto OBJLoader

O projeto OBJLoader é uma biblioteca Java que permite carregar arquivos no formato OBJ e extrair informações como vértices, normais, coordenadas de textura e faces. Ele fornece uma classe chamada `OBJLoader` que simplifica o processo de leitura de arquivos OBJ e a recuperação dos dados associados.

## Utilização

Para utilizar a classe `OBJLoader`, siga estas etapas:

1. Adicione a classe `OBJLoader` ao seu projeto Java.
2. Crie uma instância de `OBJLoader`, passando o caminho para o arquivo OBJ que deseja carregar como parâmetro do construtor.

   ```java
   OBJLoader objLoader = new OBJLoader("caminho/do/seu/arquivo.obj");
   
   //A classe OBJLoader carregará o arquivo OBJ especificado e armazenará os dados em listas.
   List<float[]> vertices = objLoader.getVertices();
   List<float[]> normais = objLoader.getNormais();
   List<float[]> coordenadasTextura = objLoader.getCoordenadasTextura();
   List<int[]> faces = objLoader.getFaces();
   ```
## Requisitos

* Java 8 ou posterior