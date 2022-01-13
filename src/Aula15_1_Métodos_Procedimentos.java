/*
 * O java não possui uma palavra específica para funções como tem no Python(def), por exemplo.
 *
 * O java chama as funções de métodos. A identificação é feita através do retorno do método dentro do código.
 *
 * Será mostrado como realizar em java os procedimentos semelhantes as funções das outras linguaguens.
 *
 * Lembrando que procedimentos em algoritmos não retornam valor.
 * E para fazer isso em java, é necessária uma palavra específica chamada void.
 *
 * Assim, criando em java uma função soma entre dois números, ou seja uma soma s = a + b, temos:
 *
 * void soma (int a, int b) {
 *      int s = a + b;
 *      System.out,println(s);
 * }
 *
 * soma(5,2);
 *
 * Algumas considerações podem ser feitas.
 *
 * A palavra void indica que não vai ter retorno, ou seja, A palavra void que vai indicar que soma é um procedimento.
 * Como "a" e "b" são variáveis, é necessário indicar o tipo de variável, nesse caso int.
 * De forma direta, neste exemplo: a=5 e b=2.
 *
 * void soma (int a, int b) {   vai indicar o procedimento (ou função) que pode ser usada em outros códigos
 *
 * soma(5,2); é o comando para utilizar o procedimento(função) soma, que nesse caso vai retornar o valor de s = 5 + 2.
 */

public class Aula15_1_Métodos_Procedimentos {

    static void soma (int a, int b) {
        int s = a + b;
        System.out.printf("A soma é %d. \n", s);
    }

    public static void main(String[] args) {
        soma(5,4);
    }
}

/*
 * Por fim, foi necessário adicionar a palavra static antes do void para tornar nosso método, ou procedimento, estático.
 *
 * A necessidade de adicionar a palavra static se deu, pois, o método main é estático.
 * Um método estático, é um método que serve para classe e não para uma instância, ou seja,
 * Não é possível chamar um procedimento dentro de um método estático, se tal procedimento não for estático.
 *
 * Ao tornar um método estático, ele se torna funcional apenas dentro da classe.
 * Ele não faz parte de um instanciamento de objetos.
 *
 * Lembrando que nesse exemplo, o método main vai ser executado antes do procedimento soma.
 * Se por acaso o procedimento soma não for chamado dentro do procedimento main, ele não será executado.
 */