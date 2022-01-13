import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;

public class Aula05_2_Exercício {
    private JButton btnIdioma;
    private JButton btnHora;
    private JButton btnResolucao;
    private JLabel lblHora;
    private JPanel panel2;
    private JLabel lblResolucao;
    private JLabel lblIdioma;

    public Aula05_2_Exercício() {
        btnHora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                lblHora.setText(relogio.toString());
            }
        });
        btnIdioma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale idioma = Locale.getDefault();
                lblIdioma.setText(idioma.getDisplayLanguage());
            }
        });
        btnResolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();
                lblResolucao.setText(d.width + "X" + d.height);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula05_2_Exercício().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
