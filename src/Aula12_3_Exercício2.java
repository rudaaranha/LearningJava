import javax.swing.JOptionPane;

/*
 * O JOptionPane permite utilizar janelas já prontas do swing. Sem que seja preciso criar e editar as janelas.
 */

public class Aula12_3_Exercício2 {
    public static void main(String[] args) {
        int n, contador=0, par=0, impar=0, maior=0, media=0, somatorio=0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: \n (0 interrompe)"));
            somatorio += n;
            if (n==0) {
                break;
            }
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (n>100) {
                maior++;
            }
            contador++;
            media = somatorio/contador;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "Resultado final \n ----------------------------- " +
                "\n" + "Total de Valores: " + contador + "\nSoma dos Valores: " + somatorio + "\nTotal de Pares: "
                + par + "\nTotal de Ímpares: " + impar + "\nAcima de 100: " + maior + "\nMédia dos Valores: " + media);
        }
}

