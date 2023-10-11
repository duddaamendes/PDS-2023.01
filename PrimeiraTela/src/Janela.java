import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setTitle("Primeira janela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(164, 164, 210));
		contentPane.setForeground(new Color(164, 164, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOlaMundo = new JLabel("Olá, mundo!");
		lblOlaMundo.setForeground(new Color(66, 66, 132));
		lblOlaMundo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "O foco está no JLabel");
			}
		});
		lblOlaMundo.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblOlaMundo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOlaMundo.setBounds(125, 11, 164, 62);
		contentPane.add(lblOlaMundo);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setForeground(new Color(66, 66, 132));
		btnFechar.setBackground(new Color(164, 164, 210));
		btnFechar.setAutoscrolls(true);
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Para fechar a tela
				setVisible(false);
			}
		});
		btnFechar.setBounds(161, 151, 117, 33);
		contentPane.add(btnFechar);
		
		txtNome = new JTextField();
		txtNome.setBounds(161, 98, 175, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(66, 66, 132));
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(92, 100, 71, 14);
		contentPane.add(lblNome);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//pegar texto digitado no JtextField (txtNome) 
				String nome = txtNome.getText();
				
				//Mostrar o nome na tela, usando JOptionPane
				JOptionPane.showMessageDialog(null, "O nome digitado é: "+nome);
			}
		});
		btnValidar.setForeground(new Color(66, 66, 132));
		btnValidar.setBackground(new Color(164, 164, 210));
		btnValidar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnValidar.setBounds(25, 151, 117, 32);
		contentPane.add(btnValidar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(164, 164, 210));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
			}
		});
		btnLimpar.setForeground(new Color(66, 66, 132));
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBounds(290, 151, 117, 33);
		contentPane.add(btnLimpar);
	}
}
