package visao;

import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import modelo.Pessoa;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PopUpEdicao extends JFrame {

    private JPanel contentPane;
    private JTextField txtNomeNovo;
    private JLabel lblTelefone;
    private JTextField txtTelefoneNovo;
    private JLabel lblCpfNovo;
    private JTextField txtCpfNovo;
    private JLabel lblPeso;
    private JTextField txtPesoNovo;
    private JLabel lblAltura;
    private JTextField txtAlturaNovo;
    private JLabel lblIdade;
    private JTextField txtIdadeNovo;

    public PopUpEdicao(Pessoa pessoaSelecionada, JanelaParaPopUp janela) {
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 403, 259);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(43, 15, 46, 14);
        contentPane.add(lblNome);

        txtNomeNovo = new JTextField();
        txtNomeNovo.setBounds(43, 33, 305, 20);
        txtNomeNovo.setColumns(10);

        lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(43, 64, 74, 14);
        contentPane.add(lblTelefone);

        txtTelefoneNovo = new JTextField();
        txtTelefoneNovo.setBounds(43, 80, 145, 20);
        txtTelefoneNovo.setColumns(10);

        lblCpfNovo = new JLabel("CPF:");
        lblCpfNovo.setBounds(203, 64, 46, 14);
        contentPane.add(lblCpfNovo);

        txtCpfNovo = new JTextField();
        txtCpfNovo.setBounds(203, 80, 145, 20);
        txtCpfNovo.setColumns(10);

        lblPeso = new JLabel("Peso:");
        lblPeso.setBounds(43, 110, 46, 14);
        contentPane.add(lblPeso);

        txtPesoNovo = new JTextField();
        txtPesoNovo.setBounds(43, 125, 95, 20);
        txtPesoNovo.setColumns(10);

        lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(148, 110, 46, 14);
        contentPane.add(lblAltura);

        txtAlturaNovo = new JTextField();
        txtAlturaNovo.setBounds(148, 125, 95, 20);
        txtAlturaNovo.setColumns(10);

        lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(253, 110, 46, 14);
        contentPane.add(lblIdade);

        txtIdadeNovo = new JTextField();
        txtIdadeNovo.setBounds(253, 125, 95, 20);
        txtIdadeNovo.setColumns(10);

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	pessoaSelecionada.setNome(txtNomeNovo.getText());
            	long cpfLong = Long.parseLong(txtCpfNovo.getText());
            	
            	
            	pessoaSelecionada.setCpf(cpfLong);
            	janela.atualizarDadosPessoa(pessoaSelecionada);
            	dispose();
            }
        });
        btnAtualizar.setBounds(148, 156, 95, 23);
        contentPane.add(btnAtualizar);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		txtNomeNovo.setText("");
        		txtCpfNovo.setText("");
        		txtTelefoneNovo.setText("");
        		txtIdadeNovo.setText("");
        		txtPesoNovo.setText("");
        		txtAlturaNovo.setText("");
        	}
        });
        btnLimpar.setBounds(43, 156, 95, 23);
        contentPane.add(btnLimpar);

        JButton Cancelar = new JButton("Cancelar");
        Cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        Cancelar.setBounds(253, 156, 95, 23);
        contentPane.add(Cancelar);
        
        txtNomeNovo.setText(pessoaSelecionada.getNome());
        txtCpfNovo.setText(String.valueOf(pessoaSelecionada.getCpf()));
        txtTelefoneNovo.setText(String.valueOf(pessoaSelecionada.getTelefone()));
        txtIdadeNovo.setText(String.valueOf(pessoaSelecionada.getIdade()));
        txtPesoNovo.setText(String.valueOf(pessoaSelecionada.getPeso()));
        txtAlturaNovo.setText(String.valueOf(pessoaSelecionada.getAltura()));
    }
}