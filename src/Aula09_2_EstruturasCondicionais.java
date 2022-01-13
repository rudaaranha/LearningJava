import java.util.Calendar;
import java.util.Scanner;

//Exemplo de condição composta

public class Aula09_2_EstruturasCondicionais {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();  //importa o calendário atual
        int anoatual = calendario.get(Calendar.YEAR); //comando para retornar apenas o ano atual
        Scanner teclado = new Scanner(System.in);   //classe para imput
        System.out.print("Digite o seu ano de nascimento: ");
        int nascimento = teclado.nextInt(); // comando para retornar um valor a partir do teclado
        int idade = anoatual - nascimento;  //idade a partir do ano de nascimento da pessoa
        System.out.printf("Você tem %d anos. \n", idade);
        if (idade >= 18) {    //condição baseada na idade da pessoa
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Você é menor de idade!");
        }
        System.out.println("FIM!");
    }
}
