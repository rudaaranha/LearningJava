/*
 * Vamos ver mais um exemplo de uso de vetores
 * Um vetor mês é criado
 *
 * String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
 *
 * Assim, um vetor com 12 posições é criado já que existem 12 meses
 *
 * Podemos criar outro vetor, que chamaremos de tot[]
 * int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 * o vetor tot vai mostrar quantos dias cada mês tem
 *
 * Vai ser criado na memórias algo como:
 *
 *       |-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|
 * mes[] | Jan | Fev | Mar | abr | Mai | Jun | Jul | Ago | Set | Out | Nov | Dez |
 *       |-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|
 * tot[] | 31  | 28  | 31  | 30  | 31  | 30  | 31  | 31  | 30  | 31  | 30  | 31  |
 *       |-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|
 *
 * Por fim vai ser feito um for do tipo...
 *
 * for (int i=0; i<mes[].length; i++) {  //ao invés de fazer i<=mes[].length-1, foi feito só o i<mes[].length
 *      System.out.println(mes[i]+" tem "+ tot[i]+" dias.");
 * }
 *
 * Desafio... fazer fevereiro com 29 dias em anos bissextos.
 * Anos bissextos são aqueles cujo resto da divisão por 4 é 0.
 */

import java.util.Scanner;

public class Aula14_4_VetoresExemplo3 {
    public static void main(String[] args) {

        //Comando para ler o ano atual a partir do teclado
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o ano atual? ");
        int anoatual = teclado.nextInt();

        //declarando as variáveis mês e tot(número de dias de cada mês)
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //Comando que declara o mês de fevereiro com 29 dias em anos bissextos
        if (anoatual % 4 == 0) {
            tot[1] = 29;
        }

        //Comando para mostrar na tela os meses e os total de dias conforme o ano.
        for (int i = 0; i < mes.length; i++) {
            System.out.printf("O mês de %s tem %d dias. \n", mes[i], tot[i]);
        }
    }
}
