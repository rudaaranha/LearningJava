/*
*Além das funções já citadas, a classe Math apresenta funções de arredondamento.
*
* |-------|---------------------------|-----------------|----|
* |  abs  |      Valor absoluto       |  Math.abs(-10)  | 10 |  // Mostra o valor absoluto de um número. o valor absoluto de -10 é 10
* |-------|---------------------------|-----------------|----|
* | floor |    Arredonda para baixo   | Math.floor(3.9) | 3  | // Arredonda para baixo, independente se está mais próximo do valor acima
* |-------|---------------------------|-----------------|----|
* |  ceil |    Arredonda para cima    | Math.ceil(4.2)  | 5  | //Arredonda para cima, independente se está mais próximo do valor abaixo
* |-------|---------------------------|-----------------|----|
* | round | Arredonda aritmeticamente | Math.round(5.6) | 6  | //Faz o arredondamento aritmético. se fosse (5.4), o valor seria 5.
* |-------|---------------------------|-----------------|----|
*
*/

public class Aula07_5_ClasseMath2 {
    public static void main(String[] args) {
        float v = 8.3f;
        float v1 = Math.abs(v);
        float v2 = (float) Math.floor(v);
        float v3 = (float) Math.ceil(v);
        float v4 = Math.round(v);
        System.out.printf("Os tipos de arredondamento para o valor %.2f são: \n", v);
        System.out.printf("Absoluto: %.2f. \n", v1);
        System.out.printf("Arredondado para baixo: %.2f. \n", v2);
        System.out.printf("Arredondado para cima: %.2f. \n", v3);
        System.out.printf("Arredondado aritméticamente: %.2f \n", v4);
    }
}
