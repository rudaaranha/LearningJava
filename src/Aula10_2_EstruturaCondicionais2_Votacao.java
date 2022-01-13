import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Aula10_2_EstruturaCondicionais2_Votacao {
    private JPanel panel;
    private JTextField txtAno;
    private JButton btnVoto;
    private JLabel lblVoto;
    private JLabel lblIdade;

    public Aula10_2_EstruturaCondicionais2_Votacao() {
        btnVoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Comando que mostra o ano atual
                Calendar calendario = Calendar.getInstance();
                int anoatual = calendario.get(Calendar.YEAR);

                //Comando que recebe o ano de nascimento a partir do teclado
                int anonasc = Integer.parseInt(txtAno.getText());

                //idade atual da pessoa
                int idade = anoatual - anonasc;
                lblIdade.setText(Integer.toString(idade));

                //Condições para votar de acordo com a idade da pessoa
                if (18<=idade && idade<=70) {
                    lblVoto.setText("Voto Obrigatório");
                } else if ((16<=idade && idade<18) || (idade>70)) {
                    lblVoto.setText("Voto Opcional!");
                } else {
                    lblVoto.setText("Menor de idade. Não vota!");
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula10_2_EstruturaCondicionais2_Votacao().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
