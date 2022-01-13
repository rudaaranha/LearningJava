import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula07_4_ClasseMath1 {
    private JPanel panel1;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnCalc;
    private JLabel lblDiv;
    private JLabel lblRes;

    public Aula07_4_ClasseMath1() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                float div = n1 / n2;
                double raiz = Math.sqrt(div); //Solução que eu usei
                //float raiz = (float) Math.sqrt(div); //Outra forma de fazer a raiz quadrada
                lblDiv.setText(Float.toString(div));
                lblRes.setText(Double.toString(raiz)); //Solução que eu usei
                //lblRes.setText(Float.toString(raiz)); //Outra forma de fazer a raiz quadrada
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula07_4_ClasseMath1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
