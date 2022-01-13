import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Aula08_4_Exercício1_VerificadorIdade {
    private JPanel panel1;
    private JTextField txtAno;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JLabel lblSit;
    private JLabel lblVoto;

    public Aula08_4_Exercício1_VerificadorIdade() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano = Integer.parseInt(txtAno.getText());
                Calendar calendario = Calendar.getInstance();
                int anoatual = calendario.get(Calendar.YEAR);
                int idade = anoatual - ano;
                String sit = (idade>=18)?"Maior de idade":"Menor de idade";
                String voto = ((idade>=16 && idade<18) || (idade>70))?"Opcional":"Não é opcional";
                lblIdade.setText(Integer.toString(idade));
                lblSit.setText(sit);
                lblVoto.setText(voto);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula08_4_Exercício1_VerificadorIdade().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
