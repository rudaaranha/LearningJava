/*
 *------Variáveis Compostas---------
 *
 * As variáveis compostas podem ser vetores ou matrizes
 * Inicialmente vamos apenas tratar das variáveis compostas unidimensionais: os vetores.
 *
 * Um vetor é declarado dentro da área var. assim,
 *
 * var
 *  n: vetor[0..3] de inteiro
 *
 * o que vai resultar numa estrutura assim:
 *
 * n
 * |---|---|---|---|
 * |   |   |   |   |
 * |---|---|---|---|
 *   0   1   2   3
 *
 * Em java, a primeira posição é sempre 0
 * Uma variável composta (n), com 4 casas (0, 1, 2, 3). Sendo possível atribuir 4 valores para a mesma variável.
 * Para atribuir valores para n, devemos utilizar algumas instruções:
 *
 * inicio
 *  n[0]<-3  //vai ser adicionado o valor 3 no índice 0 da variável n. de forma análoga
 *  n[1]<-5
 *  n[2]<-8
 *  n[3]<-2
 *
 * assim...
 *
 * n
 * |---|---|---|---|
 * | 3 | 5 | 8 | 2 |
 * |---|---|---|---|
 *   0   1   2   3
 *
 * Para fazer em java, segue o exemplo abaixo
 */
class Aula14_1_Vetores01 {
    public static void main(String[] args) {
        //comando para criar o vetor (ou variável composta unidimensional)
        int n[] = new int[4]; //outra forma seria criar direto já declarando os valores como mostrado abaixo.
        //int n[] = {3, 5, 8, 2}; //neste caso não precisa do new

        //A forma tradicional é fazer o int e utilizar o new e declarar os valores um por um, como mostrado abaixo.
        n[0] = 3;
        n[1] = 5;
        n[2] = 8;
        n[3] = 2;

        //mostrar na tela
        System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[2]);
        System.out.println(n[3]);
    }
}

/*
 * Tem que declarar o tipo de variável(int). O colchete depois da variável n simboliza a abertura dos índices.
 * Sendo igual a new int com, nesse caso, 4 posições. Ao utilizar a palavra new, um novo objeto foi criado.
 * Está forma explicada acima é o modo de criar um vetor
 *
 * para atribuir valores para a variável composta é simples e direta: n[0] = 3;
 *
 * o vetor n, por ser um objeto, possui características, propriedades, atributos, funções e métodos.
 * Ele tem possibilidades, coisas que ele tem e coisas que ele faz.
 *
 * A primeira característica do vetor seria o tamanho. Nesse nosso exemplo, o tamanho seria 4.
 */