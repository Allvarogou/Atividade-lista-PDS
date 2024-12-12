package nome;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel painelConteudo;
    private JTextField campoNome;
    private JTextField campoSobrenome;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Tela frame = new Tela();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Tela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        painelConteudo = new JPanel();
        painelConteudo.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(painelConteudo);
        painelConteudo.setLayout(null);

        campoNome = new JTextField();
        campoNome.setBounds(137, 73, 86, 20);
        painelConteudo.add(campoNome);
        campoNome.setColumns(10);

        campoSobrenome = new JTextField();
        campoSobrenome.setBounds(137, 116, 86, 20);
        painelConteudo.add(campoSobrenome);
        campoSobrenome.setColumns(10);

        JLabel labelNomeCompleto = new JLabel("");
        labelNomeCompleto.setBounds(68, 131, 255, 14);
        painelConteudo.add(labelNomeCompleto);

        JLabel labelNome = new JLabel("Nome");
        labelNome.setBounds(152, 61, 46, 14);
        painelConteudo.add(labelNome);

        JLabel labelSobrenome = new JLabel("Sobrenome");
        labelSobrenome.setBounds(147, 104, 81, 14);
        painelConteudo.add(labelSobrenome);

        JLabel labelInstrucoes = new JLabel("Insira seu Nome e Sobrenome");
        labelInstrucoes.setBounds(115, 25, 215, 14);
        painelConteudo.add(labelInstrucoes);

        JButton botaoMostrarNome = new JButton("Mostrar");
        botaoMostrarNome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String sobrenome = campoSobrenome.getText();
                labelNomeCompleto.setText(nome + " " + sobrenome);
            }
        });
        botaoMostrarNome.setBounds(137, 156, 89, 23);
        painelConteudo.add(botaoMostrarNome);
    }
}
