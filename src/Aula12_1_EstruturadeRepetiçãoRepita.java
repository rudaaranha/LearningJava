/*
 * O repita é a segunda estrutura de repetição.
 * A sua diferença para o enquanto(while) é que ao invés de aparecer no incio, o comando de loop aparece no fim do código
 *
 * Tal situação acarreta em outra diferença do while. No while, a condição para que o laço continue precisa ser verdadeira
 * ou seja while (c<4), enquanto c for menor que 4, o laço vai continuar.
 *
 * Já no repita seria repeat (c>=4). enquanto c não for maior ou igual a 4, o laço vai se repetir. ou até que c>=4, o laço vai se repetir.
 *
 * Utilizando o exemplo da cambalhota, introduzido na aula11:
 *
 *Inicio
 *  cc <- 0
 *  Repita
 *      cambalhota
 *      cc <- c + 1
 *  até (cc>=4)
 * FimAlgoritmo
 *
 * Esse é o algoritmo do repita, porém ele não funciona assim em java.
 * O real funcionamento do repita em java seria:
 *
 Inicio
 *  cc <- 0
 *  Faça  // o comando para faça é "do"
 *      cambalhota
 *      cc <- c + 1
 *  Enquanto (cc<4) //aqui também será usado o while
 * FimAlgoritmo
 *
 * Uma leitura literal do programa da cambalhota seria:
 * Faça uma "cambalhota" enquanto a variável cc não for maior ou igual a 4.
 *
 * abaixo o exemplo funcionando:
 */
public class Aula12_1_EstruturadeRepetiçãoRepita {
    public static void main(String[] args) {
        int cc = 0;
        do {
            System.out.println("Cambalhota " + (cc+1));
            cc++;
        } while (cc<4);
    }
}
