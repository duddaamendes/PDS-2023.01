package view;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 314);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 164, 210));
		contentPane.setForeground(new Color(164, 164, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfoDados = new JLabel("Informe os dados");
		lblInfoDados.setForeground(new Color(66, 66, 132));
		lblInfoDados.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblInfoDados.setBounds(95, 28, 244, 37);
		contentPane.add(lblInfoDados);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(66, 66, 132));
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(63, 91, 71, 30);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNome.setBounds(144, 96, 212, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setForeground(new Color(66, 66, 132));
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSobrenome.setBounds(63, 141, 116, 30);
		contentPane.add(lblSobrenome);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(new Color(66, 66, 132));
		btnCadastrar.setBackground(new Color(164, 164, 210));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nome = txtNome.getText();
				String Sobrenome = txtSobrenome.getText();
				
				JOptionPane.showMessageDialog(null, "O nome é:"+Nome+" "+Sobrenome);
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCadastrar.setBounds(162, 202, 122, 30);
		contentPane.add(btnCadastrar);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(192, 150, 164, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtSobrenome.setText("");
			}
		});
		btnLimpar.setForeground(new Color(66, 66, 132));
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBackground(new Color(164, 164, 210));
		btnLimpar.setBounds(33, 202, 119, 30);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setForeground(new Color(66, 66, 132));
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFechar.setBackground(new Color(164, 164, 210));
		btnFechar.setBounds(291, 202, 119, 30);
		contentPane.add(btnFechar);
	}
}
