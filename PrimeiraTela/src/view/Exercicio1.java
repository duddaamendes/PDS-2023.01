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
		setBounds(100, 100, 345, 204);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 164, 210));
		contentPane.setForeground(new Color(164, 164, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTempF = new JLabel("Temperatura (F):");
		lblTempF.setForeground(new Color(66, 66, 132));
		lblTempF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTempF.setBounds(10, 47, 158, 37);
		contentPane.add(lblTempF);
		
		textTempF = new JTextField();
		textTempF.setBounds(178, 55, 137, 25);
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
		btnCalcular.setBounds(112, 105, 118, 33);
		contentPane.add(btnCalcular);
	}

}
