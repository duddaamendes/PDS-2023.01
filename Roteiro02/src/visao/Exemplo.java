package visao;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import modelo.Cidade;
import modelo.EstacoesAno;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class Exemplo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	// Cria ArrayList de Cidades
	ArrayList<Cidade> listaCidades = new ArrayList<Cidade>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplo frame = new Exemplo();
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
	public Exemplo() {
		//chama o método carregarCidades que cria os objetos do tipo cidade
		// e adiciona no arraylist listaCidades
		carregarCidades();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Combobox com item tipo String", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(83, 40, 392, 114);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Cria combobox para armazenar String
		JComboBox<String> comboBoxString = new JComboBox<String>();
		//Opções foram adicionadas pelo windowbuilder (propriedade Model do componente combobox)
		comboBoxString.setModel(new DefaultComboBoxModel<String>(new String[] {"Opcao 1", "Opcao 2", "Opcao 3"}));
		comboBoxString.setBounds(20, 46, 171, 22);
		panel.add(comboBoxString);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Pega a posicao do item selecionado no comboBoxString
				int posicao = comboBoxString.getSelectedIndex();
				// Pega o item selecionado no comboBoxString
				String item = (String) comboBoxString.getSelectedItem();
				// Mostra mensagem com a posicao e item selecionado
				JOptionPane.showMessageDialog(null, "Posicao: "+posicao+" item selecionado: "+item);
				
				
			}
		});
		btnNewButton.setBounds(236, 46, 89, 23);
		panel.add(btnNewButton);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Combobox com item tipo Objeto de Classe", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(83, 165, 392, 114);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista Cidades");
		lblNewLabel.setBounds(20, 21, 107, 14);
		panel_1.add(lblNewLabel);
		
		//Cria combobox para listar as cidades
		JComboBox<Cidade> comboBoxCidade = new JComboBox<Cidade>();
		comboBoxCidade.setBounds(20, 46, 171, 22);
		// Percorre a listaCidades e adiciona os elementos da lista no comboboxCidade
		for(int i=0; i< listaCidades.size(); i++) {
			comboBoxCidade.addItem(listaCidades.get(i));
		}
		panel_1.add(comboBoxCidade);
		
		JButton btnNewButton_1 = new JButton("Mostrar");
		btnNewButton_1.setBounds(236, 46, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Pega o item selecionado do comboBoxCidade
				Cidade cidadeSelecinada = (Cidade) comboBoxCidade.getSelectedItem();
				//mostra item na tela (chama o método toString da classe Cidade)
				JOptionPane.showMessageDialog(null, "Cidade selecionada: " + cidadeSelecinada.getNome());
			}
		});
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Combobox com item tipo Enum", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(83, 284, 392, 114);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox<EstacoesAno> comboBoxEstacaoAno = new JComboBox<EstacoesAno>();
		comboBoxEstacaoAno.setBounds(20, 46, 171, 22);
		panel_2.add(comboBoxEstacaoAno);
		//Adiciona as constantes do enum EstacaoAno  no comboBoxEstacaoAno
		comboBoxEstacaoAno.addItem(EstacoesAno.VERAO);
		comboBoxEstacaoAno.addItem(EstacoesAno.INVERNO);
		comboBoxEstacaoAno.addItem(EstacoesAno.OUTONO);
		comboBoxEstacaoAno.addItem(EstacoesAno.PRIMAVERA);
		
		JLabel lblNewLabel_1 = new JLabel("Estações do ano");
		lblNewLabel_1.setBounds(20, 21, 107, 14);
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Mostrar");
		btnNewButton_2.setBounds(236, 46, 89, 23);
		panel_2.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Pega o item selecionado do comboBoxCidade
				EstacoesAno estacaoSelecionada = (EstacoesAno) comboBoxEstacaoAno.getSelectedItem();
				//mostra item na tela (chama o método toString da classe Cidade)
				JOptionPane.showMessageDialog(null, "Estação Selecionada: "+estacaoSelecionada);
			}
		});
		
		
	
		
	}

	private void carregarCidades() {
		//Cria lista de cidades e coloca dentro de um ArrayList
				Cidade c1 = new Cidade();
				c1.setCodigo(1);
				c1.setNome("Gaspar");
				listaCidades.add(c1);
				
				Cidade c2 = new Cidade();
				c2.setCodigo(2);
				c2.setNome("Blumenau");
				listaCidades.add(c2);
		
	}
}
