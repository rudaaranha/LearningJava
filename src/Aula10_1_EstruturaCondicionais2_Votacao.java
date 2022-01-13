import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;

/*
 *inicio
 *  leia(ano de nascimento)
 *  idade = anoatual-nascimento
 *  se (idade<16) entao
 *      escreva("Não vota")
 *  senao
 *      se (idade>=16 e idade i<18) ou (idade >70) entao
 *          escreva("Opcional")
 *      senao
 *          escreva("Voto Obrigatório")
 *      FimSe
 *  FimSe
 * Fim
*/

public class Aula10_1_EstruturaCondicionais2_Votacao {
    public static void main(String[] args) {
        //Comando que mostra o ano atual
        Calendar calendario = Calendar.getInstance();
        int anoatual = calendario.get(Calendar.YEAR);

        System.out.println("Programa que determina obrigatoriedade de votação.");

        //Comando que recebe o ano de nascimento a partir do teclado
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int anonasc = teclado.nextInt();

        //idade atual da pessoa
        int idade = anoatual - anonasc;
        System.out.printf("Você tem %d anos. \n", idade);

        //Condições para votar conforme a idade da pessoa
        if (18<=idade && idade<=70) {
            System.out.println("Voto Obrigatório!");
        } else if ((16<=idade && idade<18) || (idade>70)) {
            System.out.println("Voto Opcional!");
        } else {
            System.out.println("Menor de idade. Não vota!");
        }
    }
}
