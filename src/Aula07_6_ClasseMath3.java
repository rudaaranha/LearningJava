/*
* ---------------Números Aleatórios -------------------
*
* O java possui suporte para geradores de números.
*
* Para gerar números em java existe o método random que pertence à classe Math.
*
* O comando Math.random() vai gerar um número aleatório entre 0 e 1.0
*
* O comando Math.random() vai gerar um tipo primitivo double.
*
* Para conseguir um número entre 5 e 10 por exemplo, é possível usando o random, mas por meio de forma alternativa
* pelo comando 5 + Math.random() * (10 - 5);
*
* (10 - 5) é o intervalo que a pessoa deseja. e antes do comando Math, vem o menor número, nesse caso 5
* Ao resolver o comando, temos que (10 - 5) = 5 -> primeira parte da equação a ser resolvida.
* Depois esse 5 será será multiplicado pelo número random que nó máximo será 1. ou seja, deste cálculo, o resultado
* máximo será 5 e o mínimo será um valor infinitesimal maior que 0. ou seja, ao somar com o primeiro 5, teremos algo
* acima de 5 e no máximo 10.
*/

public class Aula07_6_ClasseMath3 {
    public static void main(String[] args) {
        double ale = Math.random();
        int n = (int) (15 + ale * (50 - 15));
        //double ex = 5 + Math.random() * (10 - 5);
        System.out.println(n);
        //System.out.println(ex);
    }
}
