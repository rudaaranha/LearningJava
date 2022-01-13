/*
 * Existem também maneiras de fazer o tratamento de vetores.
 *
 * O modo de colocar os vetores em ordem é através de uma classe específica, a classe Arrays
 * Assim, devemos escrever o comando:
 *
 * Arrays.sort(num);
 *
 * Sendo num um vetor qualquer.
 *
 * Também é possível fazer uma busca por um valor em específico dentro de um vetor e mostrar sua posição
 * Para isto, vamos usar a classe Arrays com o método binarySearch(); como mostrado abaixo:
 *
 * int pos = Arrays.binarySearch(num, 1);   //quero encontrar a posição do valor 1 dentro do vetor num[]
 * System.out.println(pos);
 *
 * Ao usar este comando, o valor a ser encontrado é chamado de chave(key).
 *
 * Se por acaso um valor que não existe for procurado, ele vai aparecer como numa posição negativa.
 *
 * Por fim é possível realizar um preenchimento automático de um vetor, que vamos chamar de num1[], com um determinado valor
 * vamos preencher o vetor num1[], que vai ter 5 posições, com o valor 0. E para isto vamos usar o seguinte comando:
 *
 * int num1[] = int[5]; //comando para criar o vetor num1[] com 5 posições
 * Arrays.fill(num1, 0); //o número 0 é a chave que deve ser usada para preencher o vetor num1[]
 *
 * pode ser útil quando queremos que o valor inicial em cada posição do vetor seja 0, por exemplo.
 *
 * Utilizando o mesmo exemplo anterior com o vetor int num[] = {3, 5, 1, 8, 4};
 */

import java.util.Arrays;

public class Aula14_6_ColocandoosVetoresemOrdem {
    public static void main(String[] args) {

        //Declarando um vetor chamado num[]
        int num[] = {3, 5, 1, 8, 4};

        //Encontrando a posição do valor 1 dentro do vetor num[]
        int pos = Arrays.binarySearch(num, 1);
        System.out.printf("O valor 1 do vetor num[] está na posição %d \n", pos);

        //Pedindo para um valor que não existe ser encontrado.
        int pos1 = Arrays.binarySearch(num, 7);
        System.out.printf("O valor 7 do vetor num[] está na posição %d \n", pos1);

        //Colocando o vetor num[] em ordem usando a classe Arrays
        Arrays.sort(num);

        //Laço para mostrar todos os valores do vetor num[]
        System.out.println("O vetor num[] possui os seguintes valores: ");
        for (int valor: num) {
            System.out.printf("%d ", valor);
        }

        System.out.println("");

        //Criando o vetor num1[] com 5 posições e preenchendo o mesmo somente com o valor 0.
        int num1[] = new int[5];
        Arrays.fill(num1,0);
        for (int v: num1) {
            System.out.print(v + " ");
        }
    }
}

//pesquisar futuramente sobre busca binária.