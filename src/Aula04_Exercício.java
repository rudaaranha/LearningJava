import java.awt.*;
import java.util.Date;
import java.util.Locale;

/*
 * Exercício Aula 04 -
 * Mostre na tela a hora e data atuais, a linguagem e a resolução do sistema.
 */
public class Aula04_Exercício {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.printf("A hora do sistema é %s. \n", relogio.toString()); //imprime a data e hora

        Locale idioma = Locale.getDefault();
        System.out.printf("Seu sistema está em %s. \n", idioma.getDisplayLanguage()); //getDisplayLanguage imprime o idioma(português) do sistema

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " +d.width + "X" + d.height); //mostra a resoução largura x altura da tela
    }
}
