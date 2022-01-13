import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula08_Exercício2_JogodoGênio {
    private JPanel panel1;
    private JSpinner txtValor;
    private JButton btnPalpite;
    private JLabel lblPalpite;

    public Aula08_Exercício2_JogodoGênio() {
        btnPalpite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(txtValor.getValue().toString());
                int genio = (int) (1 + Math.random() * (6 - 1));  //comando que faz um número random entre 1 e 5
                String palpite = (valor == genio)?"ACERTOU!":"ERROU! Pensei em " + genio;
                lblPalpite.setText(palpite);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula08_Exercício2_JogodoGênio().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
