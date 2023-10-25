package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton frame = new RadioButton();
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
	public RadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnOpcao1 = new JRadioButton("Opção1");
		buttonGroup.add(rdbtnOpcao1);
		rdbtnOpcao1.setBounds(35, 36, 109, 23);
		contentPane.add(rdbtnOpcao1);
		
		JRadioButton rdbtnOpcao2 = new JRadioButton("Opição2");
		buttonGroup.add(rdbtnOpcao2);
		rdbtnOpcao2.setBounds(35, 62, 109, 23);
		contentPane.add(rdbtnOpcao2);
		
		JRadioButton rdbtnOpcao3 = new JRadioButton("Opção3");
		buttonGroup.add(rdbtnOpcao3);
		rdbtnOpcao3.setBounds(35, 88, 109, 23);
		contentPane.add(rdbtnOpcao3);
		
		JRadioButton rdbtnOpcao4 = new JRadioButton("Opção4");
		buttonGroup.add(rdbtnOpcao4);
		rdbtnOpcao4.setBounds(35, 114, 109, 23);
		contentPane.add(rdbtnOpcao4);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnOpcao1.isSelected()) {
					JOptionPane.showMessageDialog(null, "Opção 1 selecionada!");
					
				}else if(rdbtnOpcao2.isSelected()) {
					JOptionPane.showMessageDialog(null, "Opção 2 selecionada!");
					
				}else if(rdbtnOpcao3.isSelected()) {
					JOptionPane.showMessageDialog(null, "Opção 3 selecionada!");
					
				}else if(rdbtnOpcao4.isSelected()) {
					JOptionPane.showMessageDialog(null, "Opção 4 selecionada!");
					
				}
			}
		});
		btnVerificar.setBounds(35, 157, 89, 23);
		contentPane.add(btnVerificar);
	}
}
