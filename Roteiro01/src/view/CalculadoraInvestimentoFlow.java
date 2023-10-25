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
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CalculadoraInvestimentoFlow extends JFrame {

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
					CalculadoraInvestimentoFlow frame = new CalculadoraInvestimentoFlow();
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
	public CalculadoraInvestimentoFlow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 2, 0, 0));
		
		JPanel panel_11 = new JPanel();
		contentPane.add(panel_11);
		panel_11.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 11, 52, 22);
		panel_11.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ajuda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaSobre janela = new JanelaSobre();
				janela.setVisible(true);
				
				//JOptionPane.showMessageDialog(null, "CalcInvest - Calculadora de Investimentos\n"
				//		+ "Versão: 1.0\n"
				//		+ "Autor(a): Maria Eduarda Mendes\n"
				//		+ "Contato: maria.m10@aluno.ifsc.edu.br");
			}
		});
		mnNewMenu.add(mntmSobre);
		
		JPanel panel_10 = new JPanel();
		contentPane.add(panel_10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		panel_3.add(lblDepositoMensal);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtDepositoMensal = new JTextField();
		panel.add(txtDepositoMensal);
		txtDepositoMensal.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		panel_4.add(lblNumMeses);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtNumMeses = new JTextField();
		panel_1.add(txtNumMeses);
		txtNumMeses.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		panel_5.add(lblJurosMes);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtJurosMes = new JTextField();
		panel_2.add(txtJurosMes);
		txtJurosMes.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTotal = new JLabel("Total investido + juros R$:");
		panel_6.add(lblTotal);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		contentPane.add(panel_9);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		panel_9.add(btnCalcular);
	}

}
