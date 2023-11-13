package utils;
import java.util.Arrays;

public class MathUtils {
    // Classe interna para representar um vetor 2D (vec2)
    public static class Vec2 {
        private double[] data;

        /**
         * Construtor para criar um vetor 2D com coordenadas (x, y).
         *
         * @param x A coordenada x do vetor.
         * @param y A coordenada y do vetor.
         */
        public Vec2(double x, double y) {
            data = new double[]{x, y};
        }

        /**
         * Obtém a coordenada x do vetor.
         *
         * @return A coordenada x do vetor.
         */
        public double getX() {
            return data[0];
        }

        /**
         * Obtém a coordenada y do vetor.
         *
         * @return A coordenada y do vetor.
         */
        public double getY() {
            return data[1];
        }

        /**
         * Soma este vetor com outro vetor 2D.
         *
         * @param other O vetor a ser somado a este vetor.
         * @return Um novo vetor que é a soma deste vetor com o outro vetor.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public Vec2 adicionar(Vec2 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return new Vec2(data[0] + other.data[0], data[1] + other.data[1]);
        }

        /**
         * Subtrai outro vetor 2D deste vetor.
         *
         * @param other O vetor a ser subtraído deste vetor.
         * @return Um novo vetor que é a subtração deste vetor com o outro vetor.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public Vec2 subtrair(Vec2 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return new Vec2(data[0] - other.data[0], data[1] - other.data[1]);
        }

        /**
         * Multiplica este vetor por um escalar.
         *
         * @param escalar O escalar pelo qual o vetor será multiplicado.
         * @return Um novo vetor que é o resultado da multiplicação deste vetor pelo escalar.
         */
        public Vec2 multiplicar(double escalar) {
            return new Vec2(data[0] * escalar, data[1] * escalar);
        }

        /**
         * Calcula o produto escalar entre este vetor e outro vetor.
         *
         * @param other O vetor com o qual o produto escalar será calculado.
         * @return O valor do produto escalar entre os dois vetores.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public double produtoEscalar(Vec2 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return data[0] * other.data[0] + data[1] * other.data[1];
        }

        /**
         * Calcula o produto vetorial entre este vetor e outro vetor.
         *
         * @param other O vetor com o qual o produto vetorial será calculado.
         * @return O valor do produto vetorial entre os dois vetores.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public double produtoVetorial(Vec2 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return data[0] * other.data[1] - data[1] * other.data[0];
        }

        /**
         * Calcula o comprimento (magnitude) deste vetor.
         *
         * @return O comprimento (magnitude) do vetor.
         */
        public double comprimento() {
            return Math.sqrt(data[0] * data[0] + data[1] * data[1]);
        }

        /**
         * Normaliza este vetor, transformando-o em um vetor de comprimento 1 na mesma direção.
         * Se o vetor for um vetor de comprimento zero, um vetor nulo é retornado.
         *
         * @return Um novo vetor normalizado.
         */
        public Vec2 normalizar() {
            double len = comprimento();
            if (len != 0) {
                return new Vec2(data[0] / len, data[1] / len);
            }
            return new Vec2(0, 0); // Lidar com vetores de comprimento zero
        }

        /**
         * Calcula o ângulo entre este vetor e outro vetor em radianos.
         *
         * @param other O vetor com o qual o ângulo será calculado.
         * @return O ângulo entre os dois vetores em radianos.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         * @throws ArithmeticException Se um dos vetores tiver comprimento zero.
         */
        public double anguloEntre(Vec2 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            double produtoEscalar = produtoEscalar(other);
            double magnitude1 = comprimento();
            double magnitude2 = other.comprimento();

            if (magnitude1 == 0 || magnitude2 == 0) {
                throw new ArithmeticException("Um dos vetores tem comprimento zero.");
            }

            double cossenoTheta = produtoEscalar / (magnitude1 * magnitude2);
            if (cossenoTheta > 1.0) {
                cossenoTheta = 1.0; // Lidar com arredondamento inadequado que pode causar cossenoTheta > 1.
            } else if (cossenoTheta < -1.0) {
                cossenoTheta = -1.0; // Lidar com arredondamento inadequado que pode causar cossenoTheta < -1.
            }
            return Math.acos(cossenoTheta);
        }

        @Override
        public String toString() {
            return Arrays.toString(data);
        }
    }


    // Classe interna para representar um vetor 3D (vec3)
    public static class Vec3 {
        public double[] data;

        /**
         * Construtor para criar um vetor 3D com coordenadas (x, y, z).
         *
         * @param x A coordenada x do vetor.
         * @param y A coordenada y do vetor.
         * @param z A coordenada z do vetor.
         */
        public Vec3(double x, double y, double z) {
            data = new double[]{x, y, z};
        }

        /**
         * Obtém a coordenada x do vetor.
         *
         * @return A coordenada x do vetor.
         */
        public double getX() {
            return data[0];
        }

        /**
         * Obtém a coordenada y do vetor.
         *
         * @return A coordenada y do vetor.
         */
        public double getY() {
            return data[1];
        }

        /**
         * Obtém a coordenada z do vetor.
         *
         * @return A coordenada z do vetor.
         */
        public double getZ() {
            return data[2];
        }

        /**
         * Soma este vetor com outro vetor 3D.
         *
         * @param other O vetor a ser somado a este vetor.
         * @return Um novo vetor que é a soma deste vetor com o outro vetor.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public Vec3 adicionar(Vec3 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return new Vec3(data[0] + other.data[0], data[1] + other.data[1], data[2] + other.data[2]);
        }

        /**
         * Subtrai outro vetor 3D deste vetor.
         *
         * @param other O vetor a ser subtraído deste vetor.
         * @return Um novo vetor que é a subtração deste vetor com o outro vetor.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public Vec3 subtrair(Vec3 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return new Vec3(data[0] - other.data[0], data[1] - other.data[1], data[2] - other.data[2]);
        }

        /**
         * Multiplica este vetor por um escalar.
         *
         * @param escalar O escalar pelo qual o vetor será multiplicado.
         * @return Um novo vetor que é o resultado da multiplicação deste vetor pelo escalar.
         */
        public Vec3 multiplicar(double escalar) {
            return new Vec3(data[0] * escalar, data[1] * escalar, data[2] * escalar);
        }

        public Vec3 dividir(double t) {
            return new Vec3(data[0] / t, data[1] / t, data[2] / t);
        }

        /**
         * Calcula o produto escalar entre este vetor e outro vetor.
         *
         * @param other O vetor com o qual o produto escalar será calculado.
         * @return O valor do produto escalar entre os dois vetores.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public double produtoEscalar(Vec3 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return data[0] * other.data[0] + data[1] * other.data[1] + data[2] * other.data[2];
        }

        /**
         * Calcula o produto vetorial entre este vetor e outro vetor.
         *
         * @param other O vetor com o qual o produto vetorial será calculado.
         * @return Um novo vetor que é o resultado do produto vetorial entre este vetor e o outro vetor.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public Vec3 produtoVetorial(Vec3 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            double x = data[1] * other.data[2] - data[2] * other.data[1];
            double y = data[2] * other.data[0] - data[0] * other.data[2];
            double z = data[0] * other.data[1] - data[1] * other.data[0];
            return new Vec3(x, y, z);
        }

        /**
         * Calcula o comprimento (magnitude) deste vetor.
         *
         * @return O comprimento (magnitude) do vetor.
         */
        public double comprimento() {
            return Math.sqrt(data[0] * data[0] + data[1] * data[1] + data[2] * data[2]);
        }

        /**
         * Normaliza este vetor, transformando-o em um vetor de comprimento 1 na mesma direção.
         * Se o vetor for um vetor de comprimento zero, um vetor nulo é retornado.
         *
         * @return Um novo vetor normalizado.
         */
        public Vec3 normalizar() {
            double len = comprimento();
            if (len != 0) {
                return new Vec3(data[0] / len, data[1] / len, data[2] / len);
            }
            return new Vec3(0, 0, 0); // Lidar com vetores de comprimento zero
        }

        /**
         * Calcula o ângulo entre este vetor e outro vetor em radianos.
         *
         * @param other O vetor com o qual o ângulo será calculado.
         * @return O ângulo entre os dois vetores em radianos.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         * @throws ArithmeticException Se um dos vetores tiver comprimento zero.
         */
        public double anguloEntre(Vec3 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            double produtoEscalar = produtoEscalar(other);
            double magnitude1 = comprimento();
            double magnitude2 = other.comprimento();

            if (magnitude1 == 0 || magnitude2 == 0) {
                throw new ArithmeticException("Um dos vetores tem comprimento zero.");
            }

            double cossenoTheta = produtoEscalar / (magnitude1 * magnitude2);
            if (cossenoTheta > 1.0) {
                cossenoTheta = 1.0; // Lidar com arredondamento inadequado que pode causar cossenoTheta > 1.
            } else if (cossenoTheta < -1.0) {
                cossenoTheta = -1.0; // Lidar com arredondamento inadequado que pode causar cossenoTheta < -1.
            }
            return Math.acos(cossenoTheta);
        }

        @Override
        public String toString() {
            return Arrays.toString(data);
        }
    }

    // Classe interna para representar um vetor 4D (vec4)
    public static class Vec4 {
        private double[] data;

        /**
         * Construtor para criar um vetor 4D com coordenadas (x, y, z, w).
         *
         * @param x A coordenada x do vetor.
         * @param y A coordenada y do vetor.
         * @param z A coordenada z do vetor.
         * @param w A coordenada w do vetor.
         */
        public Vec4(double x, double y, double z, double w) {
            data = new double[]{x, y, z, w};
        }

        /**
         * Obtém a coordenada x do vetor.
         *
         * @return A coordenada x do vetor.
         */
        public double getX() {
            return data[0];
        }

        /**
         * Obtém a coordenada y do vetor.
         *
         * @return A coordenada y do vetor.
         */
        public double getY() {
            return data[1];
        }

        /**
         * Obtém a coordenada z do vetor.
         *
         * @return A coordenada z do vetor.
         */
        public double getZ() {
            return data[2];
        }

        /**
         * Obtém a coordenada w do vetor.
         *
         * @return A coordenada w do vetor.
         */
        public double getW() {
            return data[3];
        }

        /**
         * Soma este vetor com outro vetor 4D.
         *
         * @param other O vetor a ser somado a este vetor.
         * @return Um novo vetor que é a soma deste vetor com o outro vetor.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public Vec4 adicionar(Vec4 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return new Vec4(data[0] + other.data[0], data[1] + other.data[1], data[2] + other.data[2], data[3] + other.data[3]);
        }

        /**
         * Subtrai outro vetor 4D deste vetor.
         *
         * @param other O vetor a ser subtraído deste vetor.
         * @return Um novo vetor que é a subtração deste vetor com o outro vetor.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public Vec4 subtrair(Vec4 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return new Vec4(data[0] - other.data[0], data[1] - other.data[1], data[2] - other.data[2], data[3] - other.data[3]);
        }

        /**
         * Multiplica este vetor por um escalar.
         *
         * @param escalar O escalar pelo qual o vetor será multiplicado.
         * @return Um novo vetor que é o resultado da multiplicação deste vetor pelo escalar.
         */
        public Vec4 multiplicar(double escalar) {
            return new Vec4(data[0] * escalar, data[1] * escalar, data[2] * escalar, data[3] * escalar);
        }

        /**
         * Calcula o produto escalar entre este vetor e outro vetor.
         *
         * @param other O vetor com o qual o produto escalar será calculado.
         * @return O valor do produto escalar entre os dois vetores.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         */
        public double produtoEscalar(Vec4 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            return data[0] * other.data[0] + data[1] * other.data[1] + data[2] * other.data[2] + data[3] * other.data[3];
        }

        /**
         * Calcula o comprimento (magnitude) deste vetor.
         *
         * @return O comprimento (magnitude) do vetor.
         */
        public double comprimento() {
            return Math.sqrt(data[0] * data[0] + data[1] * data[1] + data[2] * data[2] + data[3] * data[3]);
        }

        /**
         * Normaliza este vetor, transformando-o em um vetor de comprimento 1 na mesma direção.
         * Se o vetor for um vetor de comprimento zero, um vetor nulo é retornado.
         *
         * @return Um novo vetor normalizado.
         */
        public Vec4 normalizar() {
            double len = comprimento();
            if (len != 0) {
                return new Vec4(data[0] / len, data[1] / len, data[2] / len, data[3] / len);
            }
            return new Vec4(0, 0, 0, 0); // Lidar com vetores de comprimento zero
        }

        /**
         * Calcula o ângulo entre este vetor e outro vetor em radianos.
         *
         * @param other O vetor com o qual o ângulo será calculado.
         * @return O ângulo entre os dois vetores em radianos.
         * @throws IllegalArgumentException Se o vetor 'other' for nulo.
         * @throws ArithmeticException Se um dos vetores tiver comprimento zero.
         */
        public double anguloEntre(Vec4 other) {
            if (other == null) {
                throw new IllegalArgumentException("O vetor 'other' não pode ser nulo.");
            }
            double produtoEscalar = produtoEscalar(other);
            double magnitude1 = comprimento();
            double magnitude2 = other.comprimento();

            if (magnitude1 == 0 || magnitude2 == 0) {
                throw new ArithmeticException("Um dos vetores tem comprimento zero.");
            }

            double cossenoTheta = produtoEscalar / (magnitude1 * magnitude2);
            if (cossenoTheta > 1.0) {
                cossenoTheta = 1.0; // Lidar com arredondamento inadequado que pode causar cossenoTheta > 1.
            } else if (cossenoTheta < -1.0) {
                cossenoTheta = -1.0; // Lidar com arredondamento inadequado que pode causar cossenoTheta < -1.
            }
            return Math.acos(cossenoTheta);
        }

        @Override
        public String toString() {
            return Arrays.toString(data);
        }
    }


    // Classe interna para representar uma matriz 2x2 (mat2)
    public static class Mat2 {
        private double[][] dados;

        public Mat2(double[][] valores) {
            dados = valores;
        }

        public double obter(int linha, int coluna) {
            return dados[linha][coluna];
        }

        // Método para multiplicar duas matrizes 2x2
        public Mat2 multiplicar(Mat2 outra) {
            double[][] resultado = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    resultado[i][j] = dados[i][0] * outra.dados[0][j] + dados[i][1] * outra.dados[1][j];
                }
            }
            return new Mat2(resultado);
        }

        public Mat2 transposta() {
            double[][] resultado = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    resultado[i][j] = dados[j][i];
                }
            }
            return new Mat2(resultado);
        }

        public double determinante() {
            return dados[0][0] * dados[1][1] - dados[0][1] * dados[1][0];
        }

        public Mat2 somar(Mat2 outra) {
            double[][] resultado = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    resultado[i][j] = dados[i][j] + outra.dados[i][j];
                }
            }
            return new Mat2(resultado);
        }

        public Mat2 subtrair(Mat2 outra) {
            double[][] resultado = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    resultado[i][j] = dados[i][j] - outra.dados[i][j];
                }
            }
            return new Mat2(resultado);
        }

        public double get(int linha, int coluna) {
            return dados[linha][coluna];
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (double[] linha : dados) {
                sb.append(Arrays.toString(linha)).append("\n");
            }
            return sb.toString();
        }
    }

    // Classe interna para representar uma matriz 3x3 (mat3)
    public static class Mat3 {
        private double[][] data;

        /**
         * Construtor para criar uma matriz 3x3 com os valores fornecidos.
         *
         * @param values Uma matriz 3x3 representando os valores da matriz.
         * @throws IllegalArgumentException Se 'values' não for uma matriz 3x3 válida.
         */
        public Mat3(double[][] values) {
            if (values == null || values.length != 3 || values[0].length != 3 || values[1].length != 3 || values[2].length != 3) {
                throw new IllegalArgumentException("A matriz 'values' deve ser uma matriz 3x3 válida.");
            }
            data = values;
        }

        /**
         * Obtém o valor na linha e coluna especificadas da matriz.
         *
         * @param row A linha da matriz.
         * @param col A coluna da matriz.
         * @return O valor na posição (row, col) da matriz.
         * @throws IndexOutOfBoundsException Se 'row' ou 'col' estiverem fora dos limites da matriz.
         */
        public double get(int row, int col) {
            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                throw new IndexOutOfBoundsException("Índices de linha e coluna estão fora dos limites da matriz.");
            }
            return data[row][col];
        }

        /**
         * Multiplica esta matriz por outra matriz 3x3.
         *
         * @param other A matriz a ser multiplicada por esta matriz.
         * @return Uma nova matriz 3x3 que é o resultado da multiplicação.
         * @throws IllegalArgumentException Se 'other' não for uma matriz 3x3 válida.
         */
        public Mat3 multiplicar(Mat3 other) {
            if (other == null || other.data.length != 3 || other.data[0].length != 3 || other.data[1].length != 3 || other.data[2].length != 3) {
                throw new IllegalArgumentException("A matriz 'other' deve ser uma matriz 3x3 válida.");
            }
            double[][] result = new double[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    double sum = 0;
                    for (int k = 0; k < 3; k++) {
                        sum += data[i][k] * other.data[k][j];
                    }
                    result[i][j] = sum;
                }
            }
            return new Mat3(result);
        }

        /**
         * Calcula a matriz transposta desta matriz 3x3.
         *
         * @return Uma nova matriz 3x3 que é a transposta desta matriz.
         */
        public Mat3 transposta() {
            double[][] result = new double[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    result[i][j] = data[j][i];
                }
            }
            return new Mat3(result);
        }

        /**
         * Calcula o determinante desta matriz 3x3.
         *
         * @return O valor do determinante da matriz.
         */
        public double determinante() {
            double det = 0;
            for (int i = 0; i < 3; i++) {
                det += (data[0][i] * (data[1][(i + 1) % 3] * data[2][(i + 2) % 3] - data[1][(i + 2) % 3] * data[2][(i + 1) % 3]));
            }
            return det;
        }

        /**
         * Soma esta matriz com outra matriz 3x3.
         *
         * @param other A matriz a ser somada a esta matriz.
         * @return Uma nova matriz 3x3 que é o resultado da soma.
         * @throws IllegalArgumentException Se 'other' não for uma matriz 3x3 válida.
         */
        public Mat3 adicionar(Mat3 other) {
            if (other == null || other.data.length != 3 || other.data[0].length != 3 || other.data[1].length != 3 || other.data[2].length != 3) {
                throw new IllegalArgumentException("A matriz 'other' deve ser uma matriz 3x3 válida.");
            }
            double[][] result = new double[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    result[i][j] = data[i][j] + other.data[i][j];
                }
            }
            return new Mat3(result);
        }

        /**
         * Subtrai outra matriz 3x3 desta matriz.
         *
         * @param other A matriz a ser subtraída desta matriz.
         * @return Uma nova matriz 3x3 que é o resultado da subtração.
         * @throws IllegalArgumentException Se 'other' não for uma matriz 3x3 válida.
         */
        public Mat3 subtrair(Mat3 other) {
            if (other == null || other.data.length != 3 || other.data[0].length != 3 || other.data[1].length != 3 || other.data[2].length != 3) {
                throw new IllegalArgumentException("A matriz 'other' deve ser uma matriz 3x3 válida.");
            }
            double[][] result = new double[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    result[i][j] = data[i][j] - other.data[i][j];
                }
            }
            return new Mat3(result);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (double[] row : data) {
                sb.append(Arrays.toString(row)).append("\n");
            }
            return sb.toString();
        }
    }


    // Classe interna para representar uma matriz 4x4 (mat4)
    public static class Mat4 {
        private double[][] dados;

        /**
         * Construtor para criar uma matriz 4x4 com os valores fornecidos.
         * @param valores Uma matriz 4x4 representando os valores da matriz.
         * @throws IllegalArgumentException Se os valores não formarem uma matriz 4x4 válida.
         */
        public Mat4(double[][] valores) {
            if (valores.length != 4 || valores[0].length != 4) {
                throw new IllegalArgumentException("A matriz deve ser 4x4.");
            }
            dados = valores;
        }

        /**
         * Obtém o valor da matriz em uma posição específica.
         * @param linha A linha desejada.
         * @param coluna A coluna desejada.
         * @return O valor na posição especificada.
         * @throws IndexOutOfBoundsException Se os índices estiverem fora dos limites da matriz.
         */
        public double obter(int linha, int coluna) {
            if (linha < 0 || linha >= 4 || coluna < 0 || coluna >= 4) {
                throw new IndexOutOfBoundsException("Índices fora dos limites da matriz.");
            }
            return dados[linha][coluna];
        }

        /**
         * Multiplica esta matriz por outra matriz 4x4.
         * @param outra A matriz a ser multiplicada.
         * @return O resultado da multiplicação.
         * @throws IllegalArgumentException Se a outra matriz não for 4x4.
         */
        public Mat4 multiplicar(Mat4 outra) {
            if (outra.dados.length != 4 || outra.dados[0].length != 4) {
                throw new IllegalArgumentException("A outra matriz deve ser 4x4.");
            }
            double[][] resultado = new double[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    double soma = 0;
                    for (int k = 0; k < 4; k++) {
                        soma += dados[i][k] * outra.dados[k][j];
                    }
                    resultado[i][j] = soma;
                }
            }
            return new Mat4(resultado);
        }

        /**
         * Calcula a transposta desta matriz.
         * @return A matriz transposta.
         */
        public Mat4 transposta() {
            double[][] resultado = new double[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    resultado[i][j] = dados[j][i];
                }
            }
            return new Mat4(resultado);
        }

        /**
         * Soma esta matriz com outra matriz 4x4.
         * @param outra A matriz a ser somada.
         * @return O resultado da adição.
         * @throws IllegalArgumentException Se a outra matriz não for 4x4.
         */
        public Mat4 adicionar(Mat4 outra) {
            if (outra.dados.length != 4 || outra.dados[0].length != 4) {
                throw new IllegalArgumentException("A outra matriz deve ser 4x4.");
            }
            double[][] resultado = new double[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    resultado[i][j] = dados[i][j] + outra.dados[i][j];
                }
            }
            return new Mat4(resultado);
        }

        /**
         * Subtrai esta matriz de outra matriz 4x4.
         * @param outra A matriz a ser subtraída.
         * @return O resultado da subtração.
         * @throws IllegalArgumentException Se a outra matriz não for 4x4.
         */
        public Mat4 subtrair(Mat4 outra) {
            if (outra.dados.length != 4 || outra.dados[0].length != 4) {
                throw new IllegalArgumentException("A outra matriz deve ser 4x4.");
            }
            double[][] resultado = new double[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    resultado[i][j] = dados[i][j] - outra.dados[i][j];
                }
            }
            return new Mat4(resultado);
        }

        public double get(int linha, int coluna) {
            return dados[linha][coluna];
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (double[] linha : dados) {
                sb.append(Arrays.toString(linha)).append("\n");
            }
            return sb.toString();
        }
    }

}
