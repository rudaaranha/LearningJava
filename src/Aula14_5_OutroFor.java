/*
 * Existe outro tipo de for que facilita muito o uso. O for it (para cada...).
 * usando o exemplo visto anteriormente...
 *
 * um vetor pode ser declarado da seguinte forma
 *e ao invés de fazer o for mais tradicional, que já tinha sido visto anteriormente, como ilustrado abaixo:
 * int num[] = {3, 5, 1, 8, 4};
 * for (i=0; i<=4; i++) {
 *      System.out.println(num[i]);
 * }
 *
 * Podemos fazer usando o for it. Para o mesmo exemplo acima. vejamos:
 *
 * int num[] = {3, 5, 1, 8, 4};
 * for (int valor: num) {
 *      System.out.println(valor)
 * }
 *
 * O for it é usado exclusivamente para vetores, como uma forma de diminuir o tamanho do código
 * Em vetores muito grandes, o for it é muito útil.
 *
 * a leitura do código seria: para uma variável inteira que vai receber o valor dentro de cada passagem do vetor num.
 *
 * O for it pode ser identificado pela presença dos : dentro do for, e não ;
 * além de possuir 2 elementos e não 3.
 *
 * Lembrando que se o vetor for inteiro, a variável tem que ser inteira (nesse caso, a variável valor)
 * se o vetor for string, a variável tem que ser string
 *
 * Assim, a variável valor vai ser alimentada com um dos elementos de num, começando do primeiro elemento
 * e indo até o último.
 *
 * Vamos fazer outro exemplo na prática
 */

public class Aula14_5_OutroFor {
    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        for (double valor: v) {  //para cada elemento de v, coloque dentro de valor
            System.out.print(valor + " ");
        }
    }
}
