import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula15_6_Fatorial2 {
    private JPanel panel;
    private JSpinner txtN;
    private JButton btnFat;
    private JLabel lblFormula;
    private JLabel lblResultado;

    public Aula15_6_Fatorial2() {
        btnFat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aula15_5_Fatorial f = new Aula15_5_Fatorial();

                //calculando o fatorial do spinner
                f.setValor(Integer.parseInt(txtN.getValue().toString()));

                //mostrando a fórmula
                lblFormula.setText(f.getFormula());

                //mostrando o resultado do fatorial
                lblResultado.setText(Integer.toString(f.getFatorial()));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula15_6_Fatorial2().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
