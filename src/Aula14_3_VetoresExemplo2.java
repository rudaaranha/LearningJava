/*
 * Fazendo uso do n.length. n.length mostra a característica comprimento do meu vetor...
 */

public class Aula14_3_VetoresExemplo2 {
    public static void main(String[] args) {
        int n[] = {3, 2, 8, 7, 5, 4};

        //o contador pode ir até c<=n.length-1. O length tem que ter o -1 porque n.length=6 e eu quero ir de 0 até 5.
        //de 0 até n.length seria 7 números.
        for (int c=0; c<=n.length-1; c++)
            System.out.printf("Na posição %d, temos o valor %d \n", c, n[c]);
        System.out.println("Total de casas de N: " + n.length);
    }
}

/*
 * A vantagem de usar o c<=n.length-1 é que não importa o tamanho do vetor ou se ele for modificado no futuro, o programa
 * Vai continuar rodando do mesmo jeito.
*/
