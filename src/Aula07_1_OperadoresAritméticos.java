/*
Em java, Os cálculos são feitos por uma classe específica, a classe Math. já vimos que para atribuição usa-se o símbolo de = e para soma o símbolo de +
*
* Os operadores aritméticos são:
*
* |---|---------------|-------|-----|
* | + |     Adição    | 5 + 2 |  7  |
* |---|---------------|-------|-----|
* | - |   Subtração   | 5 - 2 |  3  |
* |---|---------------|-------|-----|
* | * | Multiplicação | 5 * 2 | 10  |
* |---|---------------|-------|-----|
* | / |    Divisão    | 5 / 2 | 2.5 |
* |---|---------------|-------|-----|
* | % |     Resto     | 5 % 2 |  1  |
* |---|---------------|-------|-----|

Lembrando que o símbolo + pode ser também concatenação além de adição.
*/
public class Aula07_1_OperadoresAritméticos {
    public static void main(String[] args) {
      int n1 = 3;
      int n2 = 5;
      float m = (n1 + n2)/2; //esse "+" aqui quer dizer adição. A ordem de resolução das operações respeita as leis matemáticas
        System.out.println("A média é igual a " + m);  //já esse "+" quer dizer concatenação
    }
}
