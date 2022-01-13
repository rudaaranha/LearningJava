/*
 * Vai ser criado um método que vai retornar uma String contador
 *
 * A palavra public foi adicionada como um indicativo de que a função contador pode ser usada por qualquer um em qualquer lugar
 *
 * Se por acaso, no lugar do public fosse private, a função contador não poderia ser usada no exemplo Aula15_4_UsandoContador
 *
 * explicando o public static void main(String[] args) {}:
 *
 * public torna o método público, onde qualquer um pode utilizá-lo e static vai tornar o método estático,
 * ou seja, não é preciso transformá-lo em objeto para poder utilizá-lo
 *
 * void significa que o método não vai retornar um valor
 * main é o método
 *
 *String[] args indica que args é um vetor do tipo String
 */

public class Aula15_3_Métodos_Funções2 {

    //Criação de uma string contador que vai inicio(i) até o fim(f). tem que ser static para ser usado no método main
    public static String contador(int i, int f) {

        //A variável string s começa vazia
        String s = "";

        //para o contador de i até f, some mais 1 em c
        for (int c = i; c <= f; c++) {

            //s = s + c + " ";
            s += c + " ";
        }
        return s;
    }
}
