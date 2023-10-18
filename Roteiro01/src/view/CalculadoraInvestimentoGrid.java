package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Investimento;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraInvestimentoGrid extends JFrame {

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
					CalculadoraInvestimentoGrid frame = new CalculadoraInvestimentoGrid();
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
	public CalculadoraInvestimentoGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		contentPane.add(lblDepositoMensal);
		
		txtDepositoMensal = new JTextField();
		contentPane.add(txtDepositoMensal);
		txtDepositoMensal.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		contentPane.add(lblNumMeses);
		
		txtNumMeses = new JTextField();
		contentPane.add(txtNumMeses);
		txtNumMeses.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		contentPane.add(lblJurosMes);
		
		txtJurosMes = new JTextField();
		contentPane.add(txtJurosMes);
		txtJurosMes.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total investido + juros R$:");
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		contentPane.add(lblNewLabel_2);
		
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
		contentPane.add(btnCalcular);
	}

}
