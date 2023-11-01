package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calcular;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimeiroNumero;
	private JTextField txtSegundoNumero;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Primeiro número inteiro:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		txtPrimeiroNumero = new JTextField();
		contentPane.add(txtPrimeiroNumero);
		txtPrimeiroNumero.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo número inteiro:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		txtSegundoNumero = new JTextField();
		contentPane.add(txtSegundoNumero);
		txtSegundoNumero.setColumns(10);
		
		JRadioButton rdbtnAdicao = new JRadioButton("+ Adiação");
		buttonGroup.add(rdbtnAdicao);
		rdbtnAdicao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(rdbtnAdicao);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JRadioButton rdbtnSub = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSub);
		rdbtnSub.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(rdbtnSub);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JRadioButton rdbtnMult = new JRadioButton("x Multiplicação");
		buttonGroup.add(rdbtnMult);
		rdbtnMult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(rdbtnMult);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JRadioButton rdbtnDiv = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDiv);
		rdbtnDiv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(rdbtnDiv);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numUm = txtPrimeiroNumero.getText();
				int numUmF = Integer.valueOf(numUm);
				
				String numDois = txtSegundoNumero.getText();
				int numDoisF = Integer.valueOf(numDois);
				
				Calcular calc = new Calcular();
				
				int soma = calc.adicao(numUmF, numDoisF);
				int subtracao = calc.subtracao(numUmF, numDoisF);
				int multiplicacao = calc.multiplicacao(numDoisF, numUmF);
				float divisao = calc.divisao(numUmF, numDoisF);
				
				if (rdbtnAdicao.isSelected()) {
					lblResposta.setText("O resultado da soma é: "+soma);
				} else if (rdbtnSub.isSelected()) {
					lblResposta.setText("O resultado da subtração é: "+subtracao);
				} else if (rdbtnMult.isSelected()) {
					lblResposta.setText("O resultado da multiplicação é: "+multiplicacao);
				} else if (rdbtnDiv.isSelected()) {
					lblResposta.setText("O resultado da divisao é: "+divisao);
				}
			}
		});
		contentPane.add(btnCalcular);
		
		
		contentPane.add(lblResposta);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.add(btnSair);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrimeiroNumero.setText("");
				txtSegundoNumero.setText("");
				lblResposta.setText("");
			}
		});
		contentPane.add(btnLimpar);
		
	}

}
