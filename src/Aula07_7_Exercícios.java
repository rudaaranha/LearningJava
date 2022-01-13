import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Aula07_7_Exercícios {
    private JPanel panel1;
    private JSpinner txtValor;
    private JButton btnCalc;
    private JLabel lblResto;
    private JLabel lblCubo;
    private JLabel lblRaizq;
    private JLabel lblRaizc;
    private JLabel lblAbs;
    private JLabel lblTxt1;
    private JLabel lblTxt2;
    private JLabel lblTxt3;
    private JLabel lblTxt4;
    private JLabel lblTxt5;

    public Aula07_7_Exercícios() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTxt1.setText("Resto da divisão por 2: ");
                lblTxt2.setText("Elevado ao Cubo: ");
                lblTxt3.setText("Raiz Quadrada: ");
                lblTxt4.setText("Raiz Cúbica: ");
                lblTxt5.setText("Valor Absoluto: ");
                int valor = Integer.parseInt(txtValor.getValue().toString()); //comando para pegar número adicionado na calculadora
                int resto = valor % 2;  //cálculo do resto
                double cubo = (double) Math.pow(valor, 3); //cálculo do valor ao cubo
                double raizq = (double) Math.sqrt(valor); //cálculo da Raiz quadrada do valor
                double raizc = (double) Math.cbrt(valor); //cálculo da raiz cúbica do valor
                int abs = Math.abs(valor); //valor absoluto da variável valor
                lblResto.setText(Integer.toString(resto));
                lblCubo.setText(String.format("%.2f", cubo));  //String.format a forma de transformar o valor númerico para string com possibilidade de formatação.
                lblRaizq.setText(String.format("%.2f", raizq));
                lblRaizc.setText(String.format("%.2f", raizc));
                lblAbs.setText(Integer.toString(abs));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula07_7_Exercícios().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
