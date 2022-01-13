/*
* O comando break é o de interrupção do laço.
* Ele vai funcionar de um modo contrário ao continue.
* Enquanto o continue força o programa a recomeçar o laço a partir do ponto do continue,
* o break vai forçar o laço a terminar a partir daquele ponto. No momento que houver um break, o programa será interrompido
*
* Continuando o exemplo anterior
 */

public class Aula11_3_Break {
    public static void main(String[] args) {
         int cc = 0;
         while (cc<10) {
             cc++;
             if (cc == 2 || cc == 3 || cc == 4) {
                 continue;
             }
             if (cc == 7) {
                 break;
             }
             System.out.println("Cambalhota " + cc);
         }
    }
}
