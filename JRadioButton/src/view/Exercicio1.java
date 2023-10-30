package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalcRetangulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{212, 212, 0};
		gbl_contentPane.rowHeights = new int[]{27, 27, 27, 27, 27, 27, 27, 27, 27, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBase.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBase = new GridBagConstraints();
		gbc_lblBase.fill = GridBagConstraints.BOTH;
		gbc_lblBase.insets = new Insets(0, 0, 5, 5);
		gbc_lblBase.gridx = 0;
		gbc_lblBase.gridy = 0;
		contentPane.add(lblBase, gbc_lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblAltura = new GridBagConstraints();
		gbc_lblAltura.fill = GridBagConstraints.BOTH;
		gbc_lblAltura.insets = new Insets(0, 0, 5, 0);
		gbc_lblAltura.gridx = 1;
		gbc_lblAltura.gridy = 0;
		contentPane.add(lblAltura, gbc_lblAltura);
		
		txtBase = new JTextField();
		GridBagConstraints gbc_txtBase = new GridBagConstraints();
		gbc_txtBase.fill = GridBagConstraints.BOTH;
		gbc_txtBase.insets = new Insets(0, 0, 5, 5);
		gbc_txtBase.gridx = 0;
		gbc_txtBase.gridy = 1;
		contentPane.add(txtBase, gbc_txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		GridBagConstraints gbc_txtAltura = new GridBagConstraints();
		gbc_txtAltura.fill = GridBagConstraints.BOTH;
		gbc_txtAltura.insets = new Insets(0, 0, 5, 0);
		gbc_txtAltura.gridx = 1;
		gbc_txtAltura.gridy = 1;
		contentPane.add(txtAltura, gbc_txtAltura);
		txtAltura.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 2;
		contentPane.add(panel_1, gbc_panel_1);
		
		JRadioButton rdbtnArea = new JRadioButton("Area");
		rdbtnArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnArea.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup_1.add(rdbtnArea);
		GridBagConstraints gbc_rdbtnArea = new GridBagConstraints();
		gbc_rdbtnArea.fill = GridBagConstraints.BOTH;
		gbc_rdbtnArea.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnArea.gridx = 0;
		gbc_rdbtnArea.gridy = 3;
		contentPane.add(rdbtnArea, gbc_rdbtnArea);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perimetro");
		rdbtnPerimetro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnPerimetro.setHorizontalAlignment(SwingConstants.CENTER);
		buttonGroup_1.add(rdbtnPerimetro);
		GridBagConstraints gbc_rdbtnPerimetro = new GridBagConstraints();
		gbc_rdbtnPerimetro.fill = GridBagConstraints.BOTH;
		gbc_rdbtnPerimetro.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnPerimetro.gridx = 1;
		gbc_rdbtnPerimetro.gridy = 3;
		contentPane.add(rdbtnPerimetro, gbc_rdbtnPerimetro);
		
		JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 4;
		contentPane.add(panel_7, gbc_panel_7);
		
		JPanel panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.insets = new Insets(0, 0, 5, 0);
		gbc_panel_6.gridx = 1;
		gbc_panel_6.gridy = 4;
		contentPane.add(panel_6, gbc_panel_6);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblResposta.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblResposta = new GridBagConstraints();
		gbc_lblResposta.gridwidth = 2;
		gbc_lblResposta.fill = GridBagConstraints.BOTH;
		gbc_lblResposta.insets = new Insets(0, 0, 5, 0);
		gbc_lblResposta.gridx = 0;
		gbc_lblResposta.gridy = 5;
		contentPane.add(lblResposta, gbc_lblResposta);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 6;
		contentPane.add(panel_4, gbc_panel_4);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 6;
		contentPane.add(panel_5, gbc_panel_5);
		
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
					lblResposta.setText("A área do retangulo é: "+area);
				} else if (rdbtnPerimetro.isSelected()) {
					lblResposta.setText("O perimetro do retangulo é: "+perimetro);
				}
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.gridwidth = 2;
		gbc_btnCalcular.fill = GridBagConstraints.BOTH;
		gbc_btnCalcular.insets = new Insets(0, 0, 5, 0);
		gbc_btnCalcular.gridx = 0;
		gbc_btnCalcular.gridy = 7;
		contentPane.add(btnCalcular, gbc_btnCalcular);
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.fill = GridBagConstraints.BOTH;
		gbc_btnSair.insets = new Insets(0, 0, 0, 5);
		gbc_btnSair.gridx = 0;
		gbc_btnSair.gridy = 8;
		contentPane.add(btnSair, gbc_btnSair);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText("");
				txtAltura.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnLimpar = new GridBagConstraints();
		gbc_btnLimpar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpar.gridx = 1;
		gbc_btnLimpar.gridy = 8;
		contentPane.add(btnLimpar, gbc_btnLimpar);
	}

}
