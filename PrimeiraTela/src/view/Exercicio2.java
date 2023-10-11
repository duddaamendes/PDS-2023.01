package view;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfoDados = new JLabel("Informe os dados");
		lblInfoDados.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblInfoDados.setBounds(97, 23, 239, 37);
		contentPane.add(lblInfoDados);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(63, 91, 71, 30);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNome.setBounds(144, 96, 212, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSobrenome.setBounds(63, 141, 116, 30);
		contentPane.add(lblSobrenome);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nome = txtNome.getText();
				String Sobrenome = txtSobrenome.getText();
				
				JOptionPane.showMessageDialog(null, "O nome é:"+Nome+" "+Sobrenome);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(144, 196, 134, 30);
		contentPane.add(btnNewButton);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(192, 150, 164, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
	}

}
