import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Aula10_4_Exercício_Triângulos {
    private JPanel panel;
    private JSlider txtA;
    private JSlider txtB;
    private JSlider txtC;
    private JButton btnVerificar;
    private JLabel lblTriangulo;
    private JLabel lblTipo;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;

    public Aula10_4_Exercício_Triângulos() {
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variáveis que vão receber os lados do triângulo
                int a, b, c, soma;
                a = txtA.getValue();
                b = txtB.getValue();
                c = txtC.getValue();

                //Condição para saber se o triângulo existe
                if ((a>b+c) || (b>a+c) || (c>a+b)) {
                    lblTriangulo.setText("Não Forma um triângulo!");
                    lblTipo.setText("-");
                } else {
                    lblTriangulo.setText("Forma um triângulo!");

                    // condição dentro da condição para determinar o tipo do triângulo
                    if ((a == b) && (a == c)) {
                        lblTipo.setText("Triângulo Equilátero");
                    } else if ((a != b) && (a != c) && (b != c))  {
                        lblTipo.setText("Triangulo Escaleno");
                    }
                    else {
                        lblTipo.setText("Triângulo Isósceles");
                    }
                }
            }
        });
        txtA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(String.valueOf(txtA.getValue()));
            }
        });
        txtB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(String.valueOf(txtB.getValue()));
            }
        });
        txtC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(String.valueOf(txtC.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula10_4_Exercício_Triângulos().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
