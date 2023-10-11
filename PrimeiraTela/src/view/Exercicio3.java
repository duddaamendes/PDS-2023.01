package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalcRetangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe os valores do retângulo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 28, 365, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBase.setBounds(70, 90, 65, 25);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAltura.setBounds(70, 133, 71, 25);
		contentPane.add(lblAltura);
		
		txtBase = new JTextField();
		txtBase.setBounds(149, 96, 165, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setText("");
		txtAltura.setBounds(149, 139, 165, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Altura = txtAltura.getText();
				float altuaConvertida = Float.valueOf(Altura);
				
				String Base = txtBase.getText();
				float baseConvertida = Float.valueOf(Base);
				
				CalcRetangulo calc = new CalcRetangulo();
				
				float calcPerimetro = calc.Perimetro(altuaConvertida, baseConvertida);
				float calcArea = calc.Area(altuaConvertida, baseConvertida);
				
				JOptionPane.showMessageDialog(null, "O valor do perímetro é "+calcPerimetro+" e da área é "+calcArea);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(121, 183, 113, 31);
		contentPane.add(btnNewButton);
	}

}
