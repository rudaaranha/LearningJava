import java.util.Scanner;

public class Aula12_2_Exercício1 {
    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in); //comando que permite o import do teclado
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt(); //recebe um número a partir do teclado
            s += n; //s = s + n\
            System.out.println("Quer continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.printf("A soma de todos os valores é %d", s);
    }
}
