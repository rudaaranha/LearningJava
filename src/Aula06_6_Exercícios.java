import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Aula06_6_Exercícios {
    private JPanel panel1;
    private JSpinner txtAn;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JLabel lblAnat;

    public Aula06_6_Exercícios() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar calendario = Calendar.getInstance();
                int anoAtual = calendario.get(Calendar.YEAR); //coloca o ano como um inteiro na variável
                lblAnat.setText(Integer.toString(anoAtual));

                int an = Integer.parseInt(txtAn.getValue().toString());
                int id = calendario.get(Calendar.YEAR) - an;
                lblIdade.setText(Integer.toString(id));
            }
        });
    }

    private void createUIComponents() {

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula06_6_Exercícios().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
