/*
 * último tipo de estrutura de repetição é a repetição com variável de controle.
 *
 * Variável de controle é aquela que controla o fluxo de repetição
 *
 * Essa estrutura de repetição já serve para delimitar os valores de início e de fim do laço.
 * Ela já ve dizendo que vai começar num valor e terminar em determinado valor
 * Utilizando o exemplo das cambalhotas das aulas anteriores, teriamos algo do tipo
 * cc<-0 até 3, passo 1. O passo 1 quer dizer que o salto automático que vai ser feito.
 *
 * A estrutura de repetição com variável de controle já faz o laço automático e o
 * incremento ou decremento automaticamente, sem precisar de um contador.
 *
 * O incremento pode ser difente de 1 e para isso é só modificar o parâmetro passo.
 *
 * Fazendo esse exemplo na forma de algoritmo:
 *
 * Inicio
 *  Para cc <- 0 até 3 passo 1 faça
 *      Cambalhota
 *  FimPara
 * FimAlgoritmo
*/

public class Aula13_1_RepetiçãocomVariáveldeControle {
    public static void main(String[] args) {
        for (int cc=0; cc<=3; cc++) {
            System.out.println("Cambalhota " + (cc+1));
        }
    }
}

/*
 * O int cc = 0; poderia ser feito fora do for, mas é uma atribuição feita dentro da estrutura
 *lendo de forma literal seria...
 *
 * Para cc igual a 0(int cc=0;), enquanto cc for menor ou igual a 3(cc<=3;), eu vou somar mais 1(cc++ ou cc+=1 ou cc=cc+1)
 *
 * Em java o incremento tem que ser declarado
 *
 * A estrutura feita com o for no exemplo acima é igual a feita abaixo com while.
 *
 * int cc = 0;
 * while (cc<4) {
 *      System.out.println("Cambalhota");
 *      c++;
 * }
 *
 * em java, o for é um enquanto simplificado
 */