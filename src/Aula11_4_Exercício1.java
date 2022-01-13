//exemplo da cambalhota feito pelo swing

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula11_4_Exercício1 {
    private JPanel panel;
    private JButton btnContar;
    private JLabel lblContagem;

    public Aula11_4_Exercício1() {
        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cc = 0;  //cc é uma variável inteira
                String contagem = "";  //já contagem é uma variável string vazia. para funcionar no swing, eu preciso que a variável seja uma string
                    while (cc<5) {
                        contagem += (cc+1) + "  "; //contagem = contagem + (cc+1) + ""
                        cc++; //cc++ é cc=cc+1
                    }
                lblContagem.setText(contagem); //leitura da contagem pelo label. contagem tem que ser string
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula11_4_Exercício1().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
