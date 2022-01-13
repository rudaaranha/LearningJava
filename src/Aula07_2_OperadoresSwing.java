import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula07_2_OperadoresSwing {
    private JPanel panel1;
    private JTextField txtNum;
    private JTextField txtDen;
    private JButton btnDividir;
    private JLabel lblDiv;
    private JLabel lblRes;

    public Aula07_2_OperadoresSwing() {
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(txtNum.getText());
                int den = Integer.parseInt(txtDen.getText());
                float div = num / den;
                float res = num % den;
                lblDiv.setText(Float.toString(div));
                lblRes.setText(Float.toString(res));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula07_2_OperadoresSwing().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
