import java.util.Scanner;

/*
 *
 * Veja o exemplo abaixo:
 * Inicio
 *  Leia(N1, N2)     //definição das variáveis N1 e N2
 *  M <- (N1 + N2) / 2      //M vai ser a média entre N1 e N2
 *  Escreva(M)             //Função print
 *  Se (M > 9) então       //Condição simples. Se M > 9 encreva parabéns. não há senão
 *      Escreva("Parabéns")
 *  FimSe     //fim da condição
 * FimAlgoritmo
*/
public class Aula09_1_EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número (n1): ");
        float n1 = teclado.nextFloat();   //retorna o n1 a partir do teclado
        System.out.print("Digite o segundo número (n2): ");
        float n2 = teclado.nextFloat();  //retorna o n2 a partir do teclado

        float m = (n1 + n2)/ 2;   //média aritmética de N1 e N2
        System.out.println("Sabendo que m é a média entre n1 e n2...");
        System.out.println("Sua média foi " + m);

        if (m>7) {      //condição baseada na média
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
        else {
            System.out.println("Que pena. Você precisa estudar mais!");
        }
    }
}
