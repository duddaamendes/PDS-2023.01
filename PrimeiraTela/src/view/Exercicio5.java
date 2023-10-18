package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CaslPreco;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPesoPrato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 297);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 164, 210));
		contentPane.setForeground(new Color(164, 164, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe:");
		lblNewLabel.setForeground(new Color(66, 66, 132));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(85, 29, 141, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblPesoPrato = new JLabel("Peso do prato (kg):");
		lblPesoPrato.setForeground(new Color(66, 66, 132));
		lblPesoPrato.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPesoPrato.setBounds(15, 78, 188, 46);
		contentPane.add(lblPesoPrato);
		
		txtPesoPrato = new JTextField();
		txtPesoPrato.setBounds(195, 90, 86, 25);
		contentPane.add(txtPesoPrato);
		txtPesoPrato.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor p/ kg: R$ 9,45");
		lblNewLabel_1.setForeground(new Color(66, 66, 132));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(76, 126, 134, 38);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSair.setForeground(new Color(66, 66, 132));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSair.setBackground(new Color(164, 164, 210));
		btnSair.setBounds(30, 213, 113, 31);
		contentPane.add(btnSair);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPesoPrato.setText("");
			}
		});
		btnLimpar.setForeground(new Color(66, 66, 132));
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBackground(new Color(164, 164, 210));
		btnLimpar.setBounds(153, 213, 113, 31);
		contentPane.add(btnLimpar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pesoPrato = txtPesoPrato.getText();
				float pesoPratoC = Float.valueOf(pesoPrato);
				
				CaslPreco calc = new CaslPreco();
				
				float calcPreco = calc.PrecoPago(pesoPratoC);
				
				String precoFormatado = String.format("%.2f", calcPreco);
				
				JOptionPane.showMessageDialog(null, "O valor a ser pago no prato é R$"+precoFormatado);
			}
		});
		btnCalcular.setForeground(new Color(66, 66, 132));
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBackground(new Color(164, 164, 210));
		btnCalcular.setBounds(30, 175, 236, 31);
		contentPane.add(btnCalcular);
	}

}
