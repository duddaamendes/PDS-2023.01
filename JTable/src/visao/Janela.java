package visao;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import modelo.Pessoa;
import modelo.PessoaJTableModel;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnNewButton_2;
	private JTextField txtTelefone;
	private JTextField txtIdade;
	private JLabel lblPeso;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JLabel lblAtura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 202, 447, 152);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				txtNome.setText(pessoaSelecionada.getNome());
				txtCPF.setText(String.valueOf(pessoaSelecionada.getCpf()));
				txtTelefone.setText(String.valueOf(pessoaSelecionada.getTelefone()));
				txtIdade.setText(String.valueOf(pessoaSelecionada.getIdade()));
				txtPeso.setText(String.valueOf(pessoaSelecionada.getIdade()));
				txtAltura.setText(String.valueOf(pessoaSelecionada.getAltura()));		
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(54, 11, 46, 14);
		contentPane.add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(54, 28, 400, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(260, 55, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(260, 70, 194, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar pessoa a tabela");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf= txtCPF.getText();
				String telefone = txtTelefone.getText();
				String idade = txtIdade.getText();
				String peso = txtPeso.getText();
				String altura = txtAltura.getText();
				
				Long cpfF = Long.parseLong(cpf);
            	Long telF = Long.parseLong(telefone);
            	Integer idadeF = Integer.parseInt(idade);
            	Float pesoF = Float.parseFloat(peso);
            	Float altF = Float.parseFloat(altura);
            	
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(cpfF);
				p.setTelefone(telF);
				p.setIdade(idadeF);
				p.setPeso(pesoF);
				p.setAltura(altF);
				
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton.setBounds(94, 139, 299, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton_1.setBounds(94, 168, 95, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa p = listaPessoas.get(table.getSelectedRow());
				String nome = txtNome.getText();
				String cpf= txtCPF.getText();
				String telefone = txtTelefone.getText();
				String idade = txtIdade.getText();
				String peso = txtPeso.getText();
				String altura = txtAltura.getText();
				
				Long cpfF = Long.parseLong(cpf);
				Long tel = Long.parseLong(telefone);
				Integer id = Integer.parseInt(idade);
				Float pesoF = Float.parseFloat(peso);
				Float alt = Float.parseFloat(altura);
				
				p.setNome(nome);
				p.setCpf(cpfF);
				p.setTelefone(tel);
				p.setIdade(id);
				p.setPeso(pesoF);
				p.setAltura(alt);
				
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton_2.setBounds(199, 168, 95, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(54, 55, 69, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(54, 70, 191, 20);
		contentPane.add(txtTelefone);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(320, 108, 134, 20);
		contentPane.add(txtIdade);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(320, 95, 46, 14);
		contentPane.add(lblIdade);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setBounds(54, 95, 46, 14);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(54, 108, 111, 20);
		contentPane.add(txtPeso);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(186, 108, 120, 20);
		contentPane.add(txtAltura);
		
		lblAtura = new JLabel("Altura");
		lblAtura.setBounds(186, 95, 46, 14);
		contentPane.add(lblAtura);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(304, 168, 89, 23);
		contentPane.add(btnFechar);
	}
	
	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtTelefone.setText("");
		txtIdade.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
	}
}