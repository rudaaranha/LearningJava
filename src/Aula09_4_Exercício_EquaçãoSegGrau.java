import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.awt.event.ComponentAdapter;

public class Aula09_4_Exercício_EquaçãoSegGrau {
    private JPanel panel;
    private JSpinner txtB;
    private JSpinner txtA;
    private JSpinner txtC;
    private JLabel lblB;
    private JLabel lblA;
    private JLabel lblC;
    private JButton btnCalc;
    private JLabel lblDelta;
    private JLabel lblTipo;
    private JLabel lblDeltares;
    private JLabel lblTipores;

    public Aula09_4_Exercício_EquaçãoSegGrau() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a, b, c, delta;
                a = Integer.parseInt(txtA.getValue().toString());  //recebe as variáveis a, b, c pelo teclado.
                b = Integer.parseInt(txtB.getValue().toString());
                c = Integer.parseInt(txtC.getValue().toString());

                lblDelta.setText("Δ = ");
                lblTipo.setText("Tipo = ");

                delta = (int) ((Math.pow(b, 2)) - (4 * a * c));
                lblDeltares.setText(Integer.toString(delta));

                if (delta >= 0) {
                    lblTipores.setText("Existem raízes Reais.");
                }
                else {
                    lblTipores.setText("Não existem raízes Reais.");
                }

            }
        });
    txtA.addComponentListener(new ComponentAdapter() { } );
        txtA.addChangeListener(new ChangeListener() {   //Changelistener do spinner para mudar o label A com a mudança no valor do spinner
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(txtA.getValue().toString());
            }
        });
        txtB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(txtB.getValue().toString());
            }
        });
        txtC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(txtC.getValue().toString());
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula09_4_Exercício_EquaçãoSegGrau().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
