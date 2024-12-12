package gasol;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela1 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel painelConteudo;
    private JTextField campoValor;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	tela1 frame = new tela1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public tela1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        painelConteudo = new JPanel();
        painelConteudo.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(painelConteudo);
        painelConteudo.setLayout(null);

        JLabel labelTitulo = new JLabel("Posto de Gasolina");
        labelTitulo.setBounds(165, 11, 104, 14);
        painelConteudo.add(labelTitulo);

        campoValor = new JTextField();
        campoValor.setBounds(147, 80, 86, 20);
        painelConteudo.add(campoValor);
        campoValor.setColumns(10);

        JLabel labelValor = new JLabel("Valor");
        labelValor.setBounds(173, 55, 46, 14);
        painelConteudo.add(labelValor);

        JLabel labelPrecoGasolina = new JLabel("Preço da Gasolina: 5,00");
        labelPrecoGasolina.setBounds(143, 36, 142, 14);
        painelConteudo.add(labelPrecoGasolina);

        JLabel labelResultado = new JLabel("");
        labelResultado.setBounds(191, 111, 109, 14);
        painelConteudo.add(labelResultado);

        JLabel labelQuantidade = new JLabel("Quantidade de gasolina:");
        labelQuantidade.setBounds(133, 111, 152, 14);
        painelConteudo.add(labelQuantidade);

        JButton botaoCalcular = new JButton("Calcular");
        botaoCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sValor = campoValor.getText();
                float valor = Float.parseFloat(sValor);
                valor = (valor / 5);
                if (valor >= 1) {
                    labelResultado.setText(String.format("%.3f L", valor));
                } else {
                    labelResultado.setText(String.format("%.2f ml", valor));
                }
            }
        });
        botaoCalcular.setBounds(147, 136, 89, 23);
        painelConteudo.add(botaoCalcular);
    }
}
