import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Aula14_7_Exercício {
    private JPanel panel;
    private JSpinner spinVetor;
    private JButton btnAdicionar;
    private JButton btnRemover;
    private JButton btnOrdenar;
    private JList listVetor;
    private JLabel lblVetor;

    public Aula14_7_Exercício() {

        //Criação do vetor[] com 5 posições
        int vetor[] = new int[5];

        //configurando a lista
        DefaultListModel lista = new DefaultListModel();
        final int[] selecionado = {0};

        listVetor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                //comando para linkar o click do mouse na lista com a mudança na posição do vetor(label)
                selecionado[0] = listVetor.getAnchorSelectionIndex();
                lblVetor.setText(Integer.toString(selecionado[0]));
            }
        });

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //botão adicionar

                //adicionar o valor do spin na lista na posição selecionada pelo mouse
                vetor[selecionado[0]] = Integer.parseInt(spinVetor.getValue().toString());

                //remover todos os componentes da lista para não ficarem duplicados na posição
                lista.removeAllElements();

                for (int c = 0; c < vetor.length; c++) {
                    lista.addElement(vetor[c]);

                }
                listVetor.setModel(lista);
            }
        });
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comando para tornar um valor em determinada posição sendo 0
                vetor[selecionado[0]] = 0;
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++) {
                    lista.addElement(vetor[c]);
                }
                listVetor.setModel(lista);
            }
        });
        btnOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //comando para ordenar os número em ordem crescente
                Arrays.sort(vetor);
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++) {
                    lista.addElement(vetor[c]);
                }
                listVetor.setModel(lista);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("app");      //Código necessário para que o programa consiga rodar
        frame.setContentPane(new Aula14_7_Exercício().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
