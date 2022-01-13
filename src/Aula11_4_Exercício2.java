import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Aula11_4_Exercício2 {
    private JPanel panel;
    private JSpinner spinFat;
    private JLabel lblFatorial;
    private JLabel lblCalc;

    public Aula11_4_Exercício2() {
        spinFat.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int n = Integer.parseInt(spinFat.getValue().toString());
                int fatorial = 1;
                int c = n;
                String cal = ""; //string vazia pois tem que ter o número do fatorial + o x de multiplicação

                while(c>=1) {
                    fatorial *= c;  //fatorial = fatorial * c
                    lblCalc.setText(c + " x" );
                    cal += (c + "x"); // cal = cal * (c + "x")
                    c--;  //diminui 1 em c até que ele seja 1. não pode ser 0
                }
                lblCalc.setText(cal + "1");
                lblFatorial.setText(Integer.toString(fatorial));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula11_4_Exercício2().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
