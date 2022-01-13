/*
 *Existem 3 estruturas de repetição: Enquanto, repita e o para.
 *
 * As estruturas de repetição vão facilitar o processo de repetição de código
 *
 * Repetição com teste lógico no início:
 * Uma das formas de existência das estruturas de repetição é através de um contador.
 * O contador vai rodar o programa até que um número de vezes pré-determinado seja atingido, numa forma de looping.
 * O número de repetições está normalmente atrelado a uma condição.
 *
 * Vamos para um exemplo... Chamado cambalhota
 *
 * inicio
 *  CC <- 0   //A varaável CC é o contador de cambalhotas e vai ser inicialmente igual a 0
 *  Enquanto (CC < 4) faça  //Comando condicional para execução do loop vinculado à variável CC. Não é if e sim while
 *      cambalhota //comando a ser realizado pelo loop enquanto estiver dentro da condição de execução (CC < 4)
 *      CC <- CC + 1   //Comando necessário para avançar o contador. Ou seja, CC passa de 0 pra 1, depois pra 2 no loop seguinte, até ser 4 e finalizar o loop.
 *  FimEnquanto  //Fechar o loop
 * FimAlgoritmo  //Fim do algoritmo
 *
 * Para executar o algoritmo acima em java:
*/

public class Aula11_1_EstruturasdeRepetição {
    public static void main(String[] args) {
        int CC = 0;
        while (CC < 4) {
            System.out.println("Cambalhota " + (CC+1)); // o +CC serve para mostrar em qual "Cambalhota" está
            CC++;  //O ++ é o incremento automático. funciona como um CC=CC+1
        }   // Essa chave é o FimEnquanto
        System.out.println("Fim");
    }
}

