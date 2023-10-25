package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Investimento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDepositoMensal;
	private JTextField txtNumMeses;
	private JTextField txtJurosMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		lblDepositoMensal.setBounds(71, 11, 98, 14);
		contentPane.add(lblDepositoMensal);
		
		txtDepositoMensal = new JTextField();
		txtDepositoMensal.setBounds(39, 36, 150, 20);
		contentPane.add(txtDepositoMensal);
		txtDepositoMensal.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		lblNumMeses.setBounds(75, 59, 77, 14);
		contentPane.add(lblNumMeses);
		
		txtNumMeses = new JTextField();
		txtNumMeses.setBounds(39, 84, 150, 20);
		contentPane.add(txtNumMeses);
		txtNumMeses.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Juros ao mês %:");
		lblNewLabel.setBounds(71, 112, 81, 14);
		contentPane.add(lblNewLabel);
		
		txtJurosMes = new JTextField();
		txtJurosMes.setBounds(39, 130, 150, 20);
		contentPane.add(txtJurosMes);
		txtJurosMes.setColumns(10);
		
		JLabel lblTotalInvestido = new JLabel("Total investido + juros R$:");
		lblTotalInvestido.setBounds(45, 160, 136, 14);
		contentPane.add(lblTotalInvestido);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ola");
				String DepositoMes = txtDepositoMensal.getText();
				String NumMeses = txtNumMeses.getText();
				String JurosMes = txtJurosMes.getText();
				
				double DepositoC = Double.parseDouble(DepositoMes);
				int NumMesesC = Integer.parseInt(NumMeses);
				double JuroMesC = Double.parseDouble(JurosMes);
				
				Investimento calc = new Investimento(NumMesesC, DepositoC, JuroMesC);
				
				double total = calc.calculaTotal();
				
				JOptionPane.showMessageDialog(null, "O total investido + juros R$ fica "+total);
			}
		});
		btnCalcular.setBounds(71, 177, 89, 23);
		contentPane.add(btnCalcular);
	}
}
