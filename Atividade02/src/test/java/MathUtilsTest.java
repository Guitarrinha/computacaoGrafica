import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import utils.MathUtils;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class MathUtilsTest {
    public static class Vec2Test {
        @Test
        public void testAdicionar() {
            MathUtils.Vec2 vec1 = new MathUtils.Vec2(3.0, 4.0);
            MathUtils.Vec2 vec2 = new MathUtils.Vec2(1.0, 2.0);
            MathUtils.Vec2 result = vec1.adicionar(vec2);
            assertEquals(4.0, result.getX(), 0.001);
            assertEquals(6.0, result.getY(), 0.001);
        }

        @Test
        public void testSubtrair() {
            MathUtils.Vec2 vec1 = new MathUtils.Vec2(3.0, 4.0);
            MathUtils.Vec2 vec2 = new MathUtils.Vec2(1.0, 2.0);
            MathUtils.Vec2 result = vec1.subtrair(vec2);
            assertEquals(2.0, result.getX(), 0.001);
            assertEquals(2.0, result.getY(), 0.001);
        }

        @Test
        public void testMultiplicar() {
            MathUtils.Vec2 vec = new MathUtils.Vec2(3.0, 4.0);
            MathUtils.Vec2 result = vec.multiplicar(2.0);
            assertEquals(6.0, result.getX(), 0.001);
            assertEquals(8.0, result.getY(), 0.001);
        }

        @Test
        public void testProdutoEscalar() {
            MathUtils.Vec2 vec1 = new MathUtils.Vec2(3.0, 4.0);
            MathUtils.Vec2 vec2 = new MathUtils.Vec2(1.0, 2.0);
            double result = vec1.produtoEscalar(vec2);
            assertEquals(11.0, result, 0.001);
        }

        @Test
        public void testProdutoVetorial() {
            MathUtils.Vec2 vec1 = new MathUtils.Vec2(3.0, 4.0);
            MathUtils.Vec2 vec2 = new MathUtils.Vec2(1.0, 2.0);
            double result = vec1.produtoVetorial(vec2);
            assertEquals(2.0, result, 0.001);
        }

        @Test
        public void testComprimento() {
            MathUtils.Vec2 vec = new MathUtils.Vec2(3.0, 4.0);
            double result = vec.comprimento();
            assertEquals(5.0, result, 0.001);
        }

        @Test
        public void testNormalizar() {
            MathUtils.Vec2 vec = new MathUtils.Vec2(3.0, 4.0);
            MathUtils.Vec2 result = vec.normalizar();
            assertEquals(0.6, result.getX(), 0.001);
            assertEquals(0.8, result.getY(), 0.001);
        }

        @Test
        public void testAnguloEntre() {
            MathUtils.Vec2 vec1 = new MathUtils.Vec2(1.0, 0.0);
            MathUtils.Vec2 vec2 = new MathUtils.Vec2(0.0, 1.0);
            double result = vec1.anguloEntre(vec2);
            assertEquals(Math.PI / 2, result, 0.001);
        }
    }

    public static class Vec3Test {
        @Test
        public void testAdicionar() {
            MathUtils.Vec3 vec1 = new MathUtils.Vec3(3.0, 4.0, 5.0);
            MathUtils.Vec3 vec2 = new MathUtils.Vec3(1.0, 2.0, 3.0);
            MathUtils.Vec3 result = vec1.adicionar(vec2);
            assertEquals(4.0, result.getX(), 0.001);
            assertEquals(6.0, result.getY(), 0.001);
            assertEquals(8.0, result.getZ(), 0.001);
        }

        @Test
        public void testSubtrair() {
            MathUtils.Vec3 vec1 = new MathUtils.Vec3(3.0, 4.0, 5.0);
            MathUtils.Vec3 vec2 = new MathUtils.Vec3(1.0, 2.0, 3.0);
            MathUtils.Vec3 result = vec1.subtrair(vec2);
            assertEquals(2.0, result.getX(), 0.001);
            assertEquals(2.0, result.getY(), 0.001);
            assertEquals(2.0, result.getZ(), 0.001);
        }

        @Test
        public void testMultiplicar() {
            MathUtils.Vec3 vec = new MathUtils.Vec3(3.0, 4.0, 5.0);
            MathUtils.Vec3 result = vec.multiplicar(2.0);
            assertEquals(6.0, result.getX(), 0.001);
            assertEquals(8.0, result.getY(), 0.001);
            assertEquals(10.0, result.getZ(), 0.001);
        }

        @Test
        public void testProdutoEscalar() {
            MathUtils.Vec3 vec1 = new MathUtils.Vec3(3.0, 4.0, 5.0);
            MathUtils.Vec3 vec2 = new MathUtils.Vec3(1.0, 2.0, 3.0);
            double result = vec1.produtoEscalar(vec2);
            assertEquals(26.0, result, 0.001);
        }

        @Test
        public void testProdutoVetorial() {
            MathUtils.Vec3 vec1 = new MathUtils.Vec3(3.0, 4.0, 5.0);
            MathUtils.Vec3 vec2 = new MathUtils.Vec3(1.0, 2.0, 3.0);
            MathUtils.Vec3 result = vec1.produtoVetorial(vec2);
            assertEquals(-2.0, result.getX(), 0.001);
            assertEquals(4.0, result.getY(), 0.001);
            assertEquals(-2.0, result.getZ(), 0.001);
        }

        @Test
        public void testComprimento() {
            MathUtils.Vec3 vec = new MathUtils.Vec3(3.0, 4.0, 5.0);
            double result = vec.comprimento();
            assertEquals(7.071, result, 0.001);
        }

        @Test
        public void testNormalizar() {
            MathUtils.Vec3 vec = new MathUtils.Vec3(3.0, 4.0, 5.0);
            MathUtils.Vec3 result = vec.normalizar();
            assertEquals(0.424, result.getX(), 0.001);
            assertEquals(0.566, result.getY(), 0.001);
            assertEquals(0.707, result.getZ(), 0.001);
        }

        @Test
        public void testAnguloEntre() {
            MathUtils.Vec3 vec1 = new MathUtils.Vec3(1.0, 0.0, 0.0);
            MathUtils.Vec3 vec2 = new MathUtils.Vec3(0.0, 1.0, 0.0);
            double result = vec1.anguloEntre(vec2);
            assertEquals(Math.PI / 2, result, 0.001);
        }
    }

    public static class Vec4Test {
        @Test
        public void testAdicionar() {
            MathUtils.Vec4 vec1 = new MathUtils.Vec4(1.0, 2.0, 3.0, 4.0);
            MathUtils.Vec4 vec2 = new MathUtils.Vec4(5.0, 6.0, 7.0, 8.0);
            MathUtils.Vec4 result = vec1.adicionar(vec2);
            assertEquals(6.0, result.getX(), 0.001);
            assertEquals(8.0, result.getY(), 0.001);
            assertEquals(10.0, result.getZ(), 0.001);
            assertEquals(12.0, result.getW(), 0.001);
        }

        @Test
        public void testSubtrair() {
            MathUtils.Vec4 vec1 = new MathUtils.Vec4(1.0, 2.0, 3.0, 4.0);
            MathUtils.Vec4 vec2 = new MathUtils.Vec4(5.0, 6.0, 7.0, 8.0);
            MathUtils.Vec4 result = vec1.subtrair(vec2);
            assertEquals(-4.0, result.getX(), 0.001);
            assertEquals(-4.0, result.getY(), 0.001);
            assertEquals(-4.0, result.getZ(), 0.001);
            assertEquals(-4.0, result.getW(), 0.001);
        }

        @Test
        public void testMultiplicar() {
            MathUtils.Vec4 vec = new MathUtils.Vec4(1.0, 2.0, 3.0, 4.0);
            MathUtils.Vec4 result = vec.multiplicar(2.0);
            assertEquals(2.0, result.getX(), 0.001);
            assertEquals(4.0, result.getY(), 0.001);
            assertEquals(6.0, result.getZ(), 0.001);
            assertEquals(8.0, result.getW(), 0.001);
        }

        @Test
        public void testProdutoEscalar() {
            MathUtils.Vec4 vec1 = new MathUtils.Vec4(1.0, 2.0, 3.0, 4.0);
            MathUtils.Vec4 vec2 = new MathUtils.Vec4(5.0, 6.0, 7.0, 8.0);
            double result = vec1.produtoEscalar(vec2);
            assertEquals(70.0, result, 0.001);
        }

        @Test
        public void testComprimento() {
            MathUtils.Vec4 vec = new MathUtils.Vec4(1.0, 2.0, 3.0, 4.0);
            double result = vec.comprimento();
            assertEquals(5.477, result, 0.001);
        }

        @Test
        public void testNormalizar() {
            MathUtils.Vec4 vec = new MathUtils.Vec4(1.0, 2.0, 3.0, 4.0);
            MathUtils.Vec4 result = vec.normalizar();
            assertEquals(0.182, result.getX(), 0.001);
            assertEquals(0.365, result.getY(), 0.001);
            assertEquals(0.547, result.getZ(), 0.001);
            assertEquals(0.730, result.getW(), 0.001);
        }

        @Test
        public void testAnguloEntre() {
            MathUtils.Vec4 vec1 = new MathUtils.Vec4(1.0, 0.0, 0.0, 0.0);
            MathUtils.Vec4 vec2 = new MathUtils.Vec4(0.0, 1.0, 0.0, 0.0);
            double result = vec1.anguloEntre(vec2);
            assertEquals(Math.PI / 2, result, 0.001);
        }
    }

    public static class Mat2Test {

        @Test
        public void testMultiply() {
            double[][] values1 = {{1, 2}, {3, 4}};
            double[][] values2 = {{5, 6}, {7, 8}};
            MathUtils.Mat2 mat1 = new MathUtils.Mat2(values1);
            MathUtils.Mat2 mat2 = new MathUtils.Mat2(values2);
            MathUtils.Mat2 result = mat1.multiplicar (mat2);
            double[][] expected = {{19, 22}, {43, 50}};

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }

        @Test
        public void testDeterminant() {
            double[][] values = {{1, 2}, {3, 4}};
            MathUtils.Mat2 mat = new MathUtils.Mat2(values);
            double result = mat.determinante();
            assertEquals(-2.0, result, 0.001);
        }

        @Test
        public void testSomar() {
            double[][] values1 = {{1, 2}, {3, 4}};
            double[][] values2 = {{5, 6}, {7, 8}};
            MathUtils.Mat2 mat1 = new MathUtils.Mat2(values1);
            MathUtils.Mat2 mat2 = new MathUtils.Mat2(values2);
            MathUtils.Mat2 result = mat1.somar(mat2);
            double[][] expected = {{6, 8}, {10, 12}};

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }

        @Test
        public void testSubtrair() {
            double[][] values1 = {{1, 2}, {3, 4}};
            double[][] values2 = {{5, 6}, {7, 8}};
            MathUtils.Mat2 mat1 = new MathUtils.Mat2(values1);
            MathUtils.Mat2 mat2 = new MathUtils.Mat2(values2);
            MathUtils.Mat2 result = mat1.subtrair(mat2);
            double[][] expected = {{-4, -4}, {-4, -4}};

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }
    }

    public static class Mat3Test {
        @Test
        public void testMultiply() {
            double[][] values1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            double[][] values2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
            MathUtils.Mat3 mat1 = new MathUtils.Mat3(values1);
            MathUtils.Mat3 mat2 = new MathUtils.Mat3(values2);
            MathUtils.Mat3 result = mat1.multiplicar(mat2);
            double[][] expected = {{30, 24, 18}, {84, 69, 54}, {138, 114, 90}};

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }

        @Test
        public void testTranspose() {
            double[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            MathUtils.Mat3 mat = new MathUtils.Mat3(values);
            MathUtils.Mat3 result = mat.transposta();
            double[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }

        @Test
        public void testDeterminant() {
            double[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            MathUtils.Mat3 mat = new MathUtils.Mat3(values);
            double result = mat.determinante();
            assertEquals(0.0, result, 0.001);
        }

        @Test
        public void testAdd() {
            double[][] values1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            double[][] values2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
            MathUtils.Mat3 mat1 = new MathUtils.Mat3(values1);
            MathUtils.Mat3 mat2 = new MathUtils.Mat3(values2);
            MathUtils.Mat3 result = mat1.adicionar(mat2);
            double[][] expected = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }

        @Test
        public void testSubtract() {
            double[][] values1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            double[][] values2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
            MathUtils.Mat3 mat1 = new MathUtils.Mat3(values1);
            MathUtils.Mat3 mat2 = new MathUtils.Mat3(values2);
            MathUtils.Mat3 result = mat1.subtrair(mat2);
            double[][] expected = {{-8, -6, -4}, {-2, 0, 2}, {4, 6, 8}};

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }
    }

    public static class Mat4Test {

        @Test
        public void testMultiplicar() {
            double[][] values1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
            double[][] values2 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
            MathUtils.Mat4 mat1 = new MathUtils.Mat4(values1);
            MathUtils.Mat4 mat2 = new MathUtils.Mat4(values2);
            MathUtils.Mat4 result = mat1.multiplicar(mat2);
            double[][] expected = {{120, 100, 80, 60}, {344, 292, 240, 188}, {568, 484, 400, 316}, {792, 676, 560, 444}};

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }

        @Test
        public void testAdicionar() {
            double[][] values1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
            double[][] values2 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
            MathUtils.Mat4 mat1 = new MathUtils.Mat4(values1);
            MathUtils.Mat4 mat2 = new MathUtils.Mat4(values2);
            MathUtils.Mat4 result = mat1.adicionar(mat2);
            double[][] expected = {{17, 17, 17, 17}, {17, 17, 17, 17}, {17, 17, 17, 17}, {17, 17, 17, 17}};

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }

        @Test
        public void testSubtrair() {
            double[][] values1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
            double[][] values2 = {{16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
            MathUtils.Mat4 mat1 = new MathUtils.Mat4(values1);
            MathUtils.Mat4 mat2 = new MathUtils.Mat4(values2);
            MathUtils.Mat4 result = mat1.subtrair(mat2);
            double[][] expected = {{-15, -13, -11, -9}, {-7, -5, -3, -1}, {1, 3, 5, 7}, {9, 11, 13, 15}};

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    assertEquals(expected[i][j], result.get(i, j), 0.001);
                }
            }
        }
    }
}
