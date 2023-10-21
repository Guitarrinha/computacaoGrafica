# Biblioteca MathUtils

A biblioteca MathUtils é uma biblioteca Java que fornece classes para manipulação de vetores 2D, vetores 3D, vetores 4D, matrizes 2x2, matrizes 3x3 e matrizes 4x4. Essas classes são úteis para realizar operações matemáticas comuns, como adição, subtração, multiplicação, cálculo de produtos escalares, produtos vetoriais, comprimento de vetores, normalização e cálculo de ângulos entre vetores.

## Índice

- [Introdução](#introdução)
- [Classe Vec2 (Vetor 2D)](#classe-vec2-vetor-2d)
- [Classe Vec3 (Vetor 3D)](#classe-vec3-vetor-3d)
- [Classe Vec4 (Vetor 4D)](#classe-vec4-vetor-4d)
- [Classe Mat2 (Matriz 2x2)](#classe-mat2-matriz-2x2)
- [Classe Mat3 (Matriz 3x3)](#classe-mat3-matriz-3x3)
- [Classe Mat4 (Matriz 4x4)](#classe-mat4-matriz-4x4)

## Introdução

O projeto MathUtils foi criado para facilitar operações matemáticas comuns em aplicações que envolvem geometria e álgebra linear. Ele fornece classes para representar e manipular vetores 2D, vetores 3D, vetores 4D, matrizes 2x2, matrizes 3x3 e matrizes 4x4.

## Classe Vec2 (Vetor 2D)

A classe `Vec2` representa um vetor 2D com coordenadas (x, y). Ela oferece métodos para realizar operações comuns, como adição, subtração, multiplicação por escalar, cálculo de produtos escalares, produtos vetoriais, cálculo do comprimento do vetor, normalização e cálculo do ângulo entre vetores.

Exemplo de uso:

```java
Vec2 vetor1 = new Vec2(3.0, 4.0);
Vec2 vetor2 = new Vec2(1.0, 2.0);

Vec2 soma = vetor1.adicionar(vetor2);

double produtoEscalar = vetor1.produtoEscalar(vetor2);

double comprimento = vetor1.comprimento();

Vec2 normalizado = vetor1.normalizar();
```

## Classe Vec3 (Vetor 3D)

A classe Vec3 representa um vetor 3D com coordenadas (x, y, z). Ela oferece métodos semelhantes à classe Vec2 para realizar operações comuns em vetores 3D, como adição, subtração, multiplicação por escalar, cálculo de produtos escalares, produtos vetoriais, cálculo do comprimento e normalização.

Exemplo de uso:

````java
Vec3 vetor1 = new Vec3(1.0, 2.0, 3.0);
Vec3 vetor2 = new Vec3(3.0, 2.0, 1.0);

Vec3 soma = vetor1.adicionar(vetor2);

double produtoEscalar = vetor1.produtoEscalar(vetor2);

Vec3 produtoVetorial = vetor1.produtoVetorial(vetor2);

double comprimento = vetor1.comprimento();

Vec3 normalizado = vetor1.normalizar();
````

## Classe Vec4 (Vetor 4D)

A classe Vec4 representa um vetor 4D com coordenadas (x, y, z, w). Ela oferece métodos semelhantes às classes Vec2 e Vec3 para realizar operações comuns em vetores 4D, como adição, subtração, multiplicação por escalar, cálculo de produtos escalares, cálculo de comprimento, normalização e cálculo de ângulos entre vetores.

Exemplo do uso:

````java
Vec4 vetor1 = new Vec4(1.0, 2.0, 3.0, 4.0);
Vec4 vetor2 = new Vec4(2.0, 3.0, 4.0, 5.0);

Vec4 soma = vetor1.adicionar(vetor2);

double produtoEscalar = vetor1.produtoEscalar(vetor2);

double comprimento = vetor1.comprimento();

Vec4 normalizado = vetor1.normalizar();
````

## Classe Mat2 (Matriz 2x2)

A classe Mat2 representa uma matriz 2x2 com valores numéricos. Ela fornece métodos para realizar operações comuns em matrizes 2x2, como multiplicação, cálculo da transposição, cálculo do determinante, adição e subtração.

Exemplo do uso:

````java
Mat2 matriz1 = new Mat2(1.0, 2.0, 3.0, 4.0);
Mat2 matriz2 = new Mat2(5.0, 6.0, 7.0, 8.0);

Mat2 soma = matriz1.adicionar(matriz2);

Mat2 produto = matriz1.multiplicar(matriz2);

double determinante = matriz1.determinante();

Mat2 transposta = matriz1.transposta();
````

## Classe Mat3 (Matriz 3x3)

A classe Mat3 representa uma matriz 3x3 com valores numéricos. Ela oferece métodos semelhantes à classe Mat2 para realizar operações comuns em matrizes 3x3, como multiplicação, cálculo da transposição, cálculo do determinante, adição e subtração.

Exemplo do uso:

````java
Mat3 matriz1 = new Mat3(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
Mat3 matriz2 = new Mat3(9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0);

Mat3 soma = matriz1.adicionar(matriz2);

Mat3 produto = matriz1.multiplicar(matriz2);

double determinante = matriz1.determinante();
        
Mat3 transposta = matriz1.transposta();
````

## Classe Mat4 (Matriz 4x4)

A classe Mat4 representa uma matriz 4x4 com valores numéricos. Ela oferece métodos semelhantes às classes Mat2 e Mat3 para realizar operações comuns em matrizes 4x4.

Exemplo do uso:

````java
Mat4 matriz1 = new Mat4(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0);
Mat4 matriz2 = new Mat4(16.0, 15.0, 14.0, 13.0, 12.0, 11.0, 10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0);

Mat4 soma = matriz1.adicionar(matriz2);

Mat4 produto = matriz1.multiplicar(matriz2);

double determinante = matriz1.determinante();

Mat4 transposta = matriz1.transposta();

````
