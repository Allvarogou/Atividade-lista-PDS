package atividadefome;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fome extends JFrame {
    private JPanel painelConteudo;
    private JTextField campoPeso;
    private JLabel labelResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    fome frame = new fome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public fome() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        painelConteudo = new JPanel();
        painelConteudo.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(painelConteudo);
        painelConteudo.setLayout(null);

        JLabel labelTitulo = new JLabel("Restaurante Fomelândia");
        labelTitulo.setBounds(165, 11, 150, 14);
        painelConteudo.add(labelTitulo);

        campoPeso = new JTextField();
        campoPeso.setBounds(81, 72, 86, 20);
        painelConteudo.add(campoPeso);
        campoPeso.setColumns(10);

        JLabel labelPeso = new JLabel("Peso (kg):");
        labelPeso.setBounds(25, 75, 80, 14);
        painelConteudo.add(labelPeso);

        JLabel labelPreco = new JLabel("Preço por quilo: R$ 9,95");
        labelPreco.setBounds(25, 36, 150, 14);
        painelConteudo.add(labelPreco);

        labelResultado = new JLabel("");
        labelResultado.setBounds(191, 111, 150, 14);
        painelConteudo.add(labelResultado);

        JButton botaoCalcular = new JButton("Calcular");
        botaoCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pesoStr = campoPeso.getText();
                double peso = Double.parseDouble(pesoStr);
                double valorTotal = peso * 9.95;
                labelResultado.setText(String.format("Total: R$ %.2f", valorTotal));
            }
        });
        botaoCalcular.setBounds(147, 136, 89, 23);
        painelConteudo.add(botaoCalcular);
    }
}
