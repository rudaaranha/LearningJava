/*
 * Mudando o fluxo de um laço
 * Mudar o fluxo de um laço é mudar a ordem de uma repetição
 * Para isto existem alguns comandos. O primeiro é o comando continue
 *
 * Dentro de um laço podem existir vários comandos.
 * Quando há um continue dentro de um código, este vai ignorar o comando abaixo dele e vai executar o laço mais uma vez.
 *
 * continuando o exemplo anterior
 */

public class Aula11_2_Continue {
    public static void main(String[] args) {
        int cc = 0;
        while (cc < 10) {  //enquanto cc for menor que 10...
            cc++;  //cc = cc + 1
            if (cc == 5 || cc == 7){ //se cc for igual a 5 ou igual a 7, continue
                continue; //quando o cc for igual a 5 ou igual a 7, o print não será executado.
            }
            System.out.println("Cambalhota " + cc);
        }
    }
}

/*quando o cc for igual a 5 ou igual a 7, o comando print não será executado por estar abaixo do continue e o laço vai começar outra volta
*assim, os número 5 e 7 não vão aparecer no print.
*O continue interrompe o fluxo natural e recomeça o fluxo daquele ponto.
 */