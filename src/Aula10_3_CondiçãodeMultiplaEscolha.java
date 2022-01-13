import java.util.Scanner;

/*
 *------------------Condição de Múltipla Escolha--------------------
 * A condição de múltipla escolha serve para testar uma única expressão e múltiplos valores dela.
 *
 * Segue o exemplo das pernas abaixo: classificação pelo número de pernas
 *
 * Inicio
 *  Leia(pernas)
 *  Escolha(pernas) //escolha é o comando switch
 *      Caso 1  //case. comando do tipo do switch
 *          tipo <- "Sací"
 *      Caso2
 *          tipo <- "Bípede"
 *      Caso 4
 *          tipo <- "Quadrúpede"
 *      Caso 6, 8
 *          tipo <- "Aranha"
 *      OutroCaso //default. caso nenhum case acima seja escolhido, o escolhido será o default.
 *          tipo <- "ET"
 *  FimEscolha
 *  Escreva(tipo)
 * FimAlgorítmo
 *
 * O comando break serve para dizer que caso a condição seja atendida, o programa deve ser finalizado.
 * como o caso default é o último, ele não precisa do break, embora possa ser colocado
 *
 */
public class Aula10_3_CondiçãodeMultiplaEscolha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas o animal possui? ");
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.printf("Os animais que possuem %d pernas são os(as) %ss. \n", pernas, tipo);
    }
}
