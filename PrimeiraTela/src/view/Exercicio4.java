package view;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalcGasolina;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecoGasolina;
	private JLabel lblNewLabel_1;
	private JTextField txtPrecoTotal;
	private JLabel lblNewLabel;
	private JButton btnLimpar;
	private JButton btnSair;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 283);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 164, 210));
		contentPane.setForeground(new Color(164, 164, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrecoGasolina = new JTextField();
		txtPrecoGasolina.setBounds(250, 90, 86, 25);
		contentPane.add(txtPrecoGasolina);
		txtPrecoGasolina.setColumns(10);
		
		JLabel lblPrecoGasolina = new JLabel("Preço gasolina (litro):");
		lblPrecoGasolina.setForeground(new Color(66, 66, 132));
		lblPrecoGasolina.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecoGasolina.setBounds(40, 75, 193, 56);
		contentPane.add(lblPrecoGasolina);
		
		lblNewLabel_1 = new JLabel("Preço total:");
		lblNewLabel_1.setForeground(new Color(66, 66, 132));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(40, 142, 117, 40);
		contentPane.add(lblNewLabel_1);
		
		txtPrecoTotal = new JTextField();
		txtPrecoTotal.setBounds(160, 150, 86, 25);
		contentPane.add(txtPrecoTotal);
		txtPrecoTotal.setColumns(10);
		
		lblNewLabel = new JLabel("Informe os valores (R$)");
		lblNewLabel.setForeground(new Color(66, 66, 132));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(28, 22, 342, 57);
		contentPane.add(lblNewLabel);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrecoGasolina.setText("");
				txtPrecoTotal.setText("");
			}
		});
		btnLimpar.setForeground(new Color(66, 66, 132));
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBackground(new Color(164, 164, 210));
		btnLimpar.setBounds(10, 195, 113, 31);
		contentPane.add(btnLimpar);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSair.setForeground(new Color(66, 66, 132));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSair.setBackground(new Color(164, 164, 210));
		btnSair.setBounds(133, 195, 113, 31);
		contentPane.add(btnSair);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PrecoGasolina = txtPrecoGasolina.getText();
				float precoGasolinaC = Float.valueOf(PrecoGasolina);
				
				String PrecoTotal = txtPrecoTotal.getText();
				float precoTotalC = Float.valueOf(PrecoTotal);
				
				CalcGasolina calc = new CalcGasolina();
				
				float calcTotal = calc.Litros(precoGasolinaC, precoTotalC);
				
				String totalFormatado = String.format("%.2f", calcTotal);
				
				JOptionPane.showMessageDialog(null, "O cliente pode colocar "+ totalFormatado+" litros.");
			}
		});
		btnCalcular.setForeground(new Color(66, 66, 132));
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBackground(new Color(164, 164, 210));
		btnCalcular.setBounds(257, 195, 113, 31);
		contentPane.add(btnCalcular);
	}
}
