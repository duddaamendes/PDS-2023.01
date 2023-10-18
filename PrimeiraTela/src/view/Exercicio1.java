package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalcTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTempF;
	private JButton btnLimpar;
	private JButton btnSair;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 249);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 164, 210));
		contentPane.setForeground(new Color(164, 164, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTempF = new JLabel("Temperatura (F):");
		lblTempF.setForeground(new Color(66, 66, 132));
		lblTempF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTempF.setBounds(25, 55, 158, 37);
		contentPane.add(lblTempF);
		
		textTempF = new JTextField();
		textTempF.setBounds(190, 60, 137, 25);
		contentPane.add(textTempF);
		textTempF.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setForeground(new Color(66, 66, 132));
		btnCalcular.setBackground(new Color(164, 164, 210));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pegar a temperatura digitada no componente de texto
				String TemperaturaF = textTempF.getText();
				
				// converter a temperatura de string para float
				float tempConvertidaF = Float.valueOf(TemperaturaF);
				
				// criar o objeto da classe CalcTemperatura
				CalcTemperatura conv = new CalcTemperatura();
				
				// chamar o método conversao
				float tempC = conv.ConversaoFtoC(tempConvertidaF);
				// para deixar a resposta com apenas duas casas decimais
				String tempFormatada = String.format("%.2f", tempC);
				
				// mostrar temperatura convertida
				JOptionPane.showMessageDialog(null, "Temperatura convertida: "+tempFormatada);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBounds(72, 115, 221, 33);
		contentPane.add(btnCalcular);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTempF.setText("");
			}
		});
		btnLimpar.setForeground(new Color(66, 66, 132));
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBackground(new Color(164, 164, 210));
		btnLimpar.setBounds(190, 155, 103, 33);
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
		btnSair.setBounds(72, 155, 103, 33);
		contentPane.add(btnSair);
		
		lblNewLabel = new JLabel("Informe:");
		lblNewLabel.setForeground(new Color(66, 66, 132));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(129, 11, 97, 37);
		contentPane.add(lblNewLabel);
	}

}