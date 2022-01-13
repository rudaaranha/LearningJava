/*
 *-----------OPERADOR TERNÁRIO-----------
 * O operador ternário é um operador como os aritméticos, os lógicos e relacionais.
 * É um operador específico para fazer comparações. Por exemplo,
 *
 * Considerando que:
 * Se n1 for maior que n2. Maior vai ser igual a n1, senão maior vai ser igual a n2. Fim
 *
 * Em java existe o operador ternário que ajuda a escrever essa expressão de forma simplificada.
 *
 * O operador ternário é escrito como uma interrogação seguida de dois pontos (?:).
 * assim,
 *
 * maior = n1>n2?n1:n2
 *
 * Entendendo a expressão:
 * maior vai receber o que está antes ou depois dos dois pontos (n1 ou n2). Maior vai receber n1 ou n2.
 * E vai depender do que está antes da interrogação (n1>n2).
 * Se n1 foi maior que n2, maior recebe n1. Senão vai receber n2.
 *
 * O operador ternário funciona através de 3 componentes, o que vem antes da interrogação, o que vem depois dela
 * e o que vêm depois dos dois pontos. São 3 operadores. O primeiro, que vem antes da interrogação, é sempre uma expressão.
 * O segundo operador, depois da interrogação, será atribuído caso a expressão seja verdadeira.
 * Por fim, após os dois pontos, terá o terceiro operador que será atribuído caso a expressão falsa.
 *
 * O objetivo do Operador Ternário é atribuir um valor ou outro para uma mesma variável.
 */

public class Aula08_1_OperadorTernárioeOperadoresRelacionais {
    public static void main(String[] args) {
        int n1, n2, maior, menor, operacao;
        n1 = 4;
        n2 = 8;
        maior = (n2>n1)?n2:n1;
        menor = (n2<n1)?n2:n1;
        operacao = (n1>n2)?n1+n2:n2-n1;
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(operacao);
    }
}

/*
*-----------Operadores Relacionais-----------
*|----|------------------|--------|-------|
*| >  |     Maior que    | 5 > 2  | true  |
*|----|------------------|--------|-------|
*| <  |     Menor que    | 4 < 1  | false |
*|----|------------------|--------|-------|
*| >= | Maior ou igual a | 8 >= 3 | true  |
*|----|------------------|--------|-------|
*| <= | Menor ou igual a | 6 <= 6 | true  |
*|----|------------------|--------|-------|
*| == |      Igual a     | 9 == 8 | false |    // apenas um igual (=) é atribuição.
*|----|------------------|--------|-------|
*| != |   Diferente de   | 4 != 5 | true  |
*|----|------------------|--------|-------|
*
* ----------Comparando String----------------
*/