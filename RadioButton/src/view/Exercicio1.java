package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalcRetangulo;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JRadioButton rdbtnArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 322, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(39, 11, 46, 14);
		panel.add(lblNewLabel);
		
		txtBase = new JTextField();
		txtBase.setBounds(39, 33, 86, 20);
		panel.add(txtBase);
		txtBase.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(182, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(180, 33, 86, 20);
		panel.add(txtAltura);
		txtAltura.setColumns(10);
		
		rdbtnArea = new JRadioButton("Area");
		rdbtnArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(rdbtnArea);
		rdbtnArea.setBounds(55, 79, 109, 23);
		panel.add(rdbtnArea);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perimetro");
		rdbtnPerimetro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(rdbtnPerimetro);
		rdbtnPerimetro.setBounds(166, 79, 109, 23);
		panel.add(rdbtnPerimetro);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResultado.setBounds(35, 113, 234, 14);
		panel.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String altura = txtAltura.getText();
				Float alturaF = Float.valueOf(altura);
				
				String base = txtBase.getText();
				Float baseF = Float.valueOf(base);
				
				CalcRetangulo calc = new CalcRetangulo();
				
				Float area = calc.Area(baseF, alturaF);
				Float perimetro = calc.Perimetro(baseF, alturaF);
				
				if(rdbtnArea.isSelected()) {
					lblResultado.setText("A área do retangulo é: "+area);
				} else if (rdbtnPerimetro.isSelected()) {
					lblResultado.setText("O perimetro do retangulo é: "+perimetro);
				}
				
			}
		});
		btnCalcular.setBounds(60, 138, 179, 23);
		panel.add(btnCalcular);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSair.setBounds(60, 164, 89, 23);
		panel.add(btnSair);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText("");
				txtAltura.setText("");
			}
		});
		btnLimpar.setBounds(150, 164, 89, 23);
		panel.add(btnLimpar);
		
	}
}
