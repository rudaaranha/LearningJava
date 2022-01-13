/*
 * A primeira característica do vetor, como já dito, é o tamanho.
 * Vamos ver uma propriedade simples desse objeto abaixo.
 *
 * Ao fazer o sout com "Total de casas de N" + n.
 *
 * Ao adicionar o n. (n ponto), esse ponto vai me mostrar todas as características disponíveis do meu objeto
 *
 * No caso do vetor n, só existe a característica length(tamanho)
 *
 */

public class Aula14_2_VetoresExemplo1 {
    public static void main(String[] args) {
        //Criação da variável composta
        int n[] = {3, 2, 8, 7, 5, 4};

        //mostrar na tela a variável n utilizando uma estrutura de repetição.
        for (int c=0; c<=5; c++) { //para um contador c de 0 até 5 com incremento de 1 em 1
            //ou seja c dentro do loop vai ser: 0, 1, 2, 3, 4 e 5.

            //ainda dentro do loop fazer o sout de n na posição c. ou seja, n na posição 0, depois n na posição 1 e assim por diante.
            System.out.printf("Na posição %d, temos o valor %d. \n", c, n[c]);
        }

        //comando para mostrar o tamanho de n(característica do objeto n)
        System.out.printf("O total de casas de n é %d \n", n.length);
    }
}

