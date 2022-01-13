import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula09_3_EstruturaCondicionais {
    private JPanel panel;
    private JTextField txtValor;
    private JButton btnVerificar;
    private JLabel lblResultado;

    public Aula09_3_EstruturaCondicionais() {
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(txtValor.getText());  //comando para receber o valor digitado
                int res = valor % 2;  //para saber se é par ou impar ter o valor do resto quando dividido por 2
                if (res == 0) {   //se o resto da divisão do valor por 2 for igual a 0, o valor é par
                    lblResultado.setText("O valor digitado é par.");
                }
                else {       //senão ele é ímpar
                    lblResultado.setText("O valor digitado é ímpar.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula09_3_EstruturaCondicionais().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
