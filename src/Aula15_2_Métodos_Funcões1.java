/*
 * Funções são rotinas que retornam valor
 *
 * As funções são muito parecidas com os procedimentos, porém já no seu algoritmo, ele determina o tipo do retorno
 * Sendo mais claro, as funções pré-determinam se o retorno vai ser um int, float, string, etc.
 *
 * Considerando o mesmo exemplo anterior, onde foi criado o procedimento soma, vamos fazer a função soma.
 *
 * Nela, ao invés de colocar o comando System.out.print para escrever o valor de s,
 * vamos apenas escrever return s. Uma vez que funções retornam valores.
 *
 * Outra diferença entre o procedimento e a função é que para chamar a função no programa principal,
 * é preciso criar uma variável para ela. por exemplo: sm = soma(5,2);
 *
 * Assim, a variável s, da soma, tem escopo local, enquanto a variável sm tem escopo global.
 *
 * Vamos para o exemplo em java baixo:
 *
 * int soma (int a, int b) {  //diferente do procedimento, no lugar do void, declaramos o tipo da função que vai ser retornada(int)
 *      int s = a + b;
 *      return s;
 * }
 *
 * int sm = soma(5,2);
 * System.out.print(sm);
 *
 * Ainda é preciso adicionar o static, dessa vez antes do int, para tornar a função estática.
 *
 * O resultado da soma vai ser mostrado pelo System.out.print no método(código) principal e não na função, já que há retorno de valor
 * diferente do que acontece no procedimento, que já vai mostrar o valor da soma dentro do próprio código.\
 *
 * Sendo a funções boas práticas de programação por fazer apenas o método de cálculo e não fazer coisas como mostrar resultado.
 */

public class Aula15_2_Métodos_Funcões1 {

    //Função soma
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    //Método principal
    public static void main(String[] args) {
        int sm = soma(5,2);
        System.out.printf("A soma é %d", sm);
    }
}
