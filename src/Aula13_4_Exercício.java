import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula13_4_Exercício {

    private JPanel panel;
    private JSlider sliInicio;
    private JSlider sliFim;
    private JSlider sliPasso;
    private JButton btnContar;
    private JTextField txtResp;
    private JLabel lblInicio;
    private JLabel lblFim;
    private JLabel lblPasso;
    private JList listResp;

    public Aula13_4_Exercício() {
        sliInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblInicio.setText(String.valueOf(sliInicio.getValue()));
            }
        });
        sliFim.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblFim.setText(String.valueOf(sliFim.getValue()));
            }
        });
        sliPasso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblPasso.setText(String.valueOf(sliPasso.getValue()));
            }
        });
        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inicio, fim, passo;
                inicio = sliInicio.getValue();
                fim = sliFim.getValue();
                passo = sliPasso.getValue();

                //Comando para criar o objeto lista
                DefaultListModel lista = new DefaultListModel();

                for (int resp = inicio; resp <= fim; resp += passo) {
                    //adiciona à lista os valores da variável resposta dentro do laço
                    lista.addElement(resp);
                }

                //mostra a listra criada ao fim do laço
                listResp.setModel(lista);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula13_4_Exercício().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
