package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import modelo.Combustiveis;
import modelo.Combustivel;
import modelo.Oleo;
import modelo.Pagamento;

import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PostoCombustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtQuantFrascoML;
	private JTextField txtQuantFrascoL;
	private JTextField txtQuantLitros;
	private JTextField txtOleoDisel;
	private JTextField txtGasComum;
	private JTextField txtGasAditivada;
	private JTextField txtEtanol;
	private JTextField txtPrecoFrascoML;
	private JTextField txtPrecoFrascoL;
	private JTextField txtDias;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostoCombustivel frame = new PostoCombustivel();
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
	public PostoCombustivel() {
		setTitle("Posto de Combustivel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][grow][grow]"));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tabela de Preco Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setToolTipText("");
		contentPane.add(panel, "cell 0 0,grow");
		panel.setLayout(new MigLayout("", "[][][][grow]", "[][][][]"));
		
		JLabel lblNewLabel = new JLabel("Oleo Disel");
		panel.add(lblNewLabel, "cell 1 0");
		
		txtOleoDisel = new JTextField();
		panel.add(txtOleoDisel, "cell 3 0,growx");
		txtOleoDisel.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gas. Comum");
		panel.add(lblNewLabel_1, "cell 1 1");
		
		txtGasComum = new JTextField();
		panel.add(txtGasComum, "cell 3 1,growx");
		txtGasComum.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gas. Aditivada");
		panel.add(lblNewLabel_2, "cell 1 2");
		
		txtGasAditivada = new JTextField();
		panel.add(txtGasAditivada, "cell 3 2,growx");
		txtGasAditivada.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Etanol");
		panel.add(lblNewLabel_3, "cell 1 3");
		
		txtEtanol = new JTextField();
		panel.add(txtEtanol, "cell 3 3,growx");
		txtEtanol.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1, "cell 1 0,grow");
		panel_1.setLayout(new MigLayout("", "[][][][]", "[][][][][]"));
		
		JLabel lblNewLabel_4 = new JLabel("Frasco 500ml");
		panel_1.add(lblNewLabel_4, "cell 2 1");
		
		txtPrecoFrascoML = new JTextField();
		panel_1.add(txtPrecoFrascoML, "cell 3 1,alignx center");
		txtPrecoFrascoML.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Frasco 1L");
		panel_1.add(lblNewLabel_5, "cell 2 3");
		
		txtPrecoFrascoL = new JTextField();
		panel_1.add(txtPrecoFrascoL, "cell 3 3,alignx left");
		txtPrecoFrascoL.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_2, "cell 0 1 2 1,grow");
		panel_2.setLayout(new MigLayout("", "[][][][][][][grow][][][][][][][][]", "[][][]"));
		
		JLabel lblNewLabel_7 = new JLabel("Quantidade");
		panel_2.add(lblNewLabel_7, "cell 6 0,alignx center");
		
		JLabel lblValorAPagar = new JLabel("Valor a Pagar");
		panel_2.add(lblValorAPagar, "cell 9 0");
		
		JLabel lblNewLabel_9 = new JLabel("Total Oleo");
		panel_2.add(lblNewLabel_9, "cell 13 0");
		
		JLabel lblNewLabel_6 = new JLabel("Frasco de 500ml");
		panel_2.add(lblNewLabel_6, "cell 1 1 5 1,alignx right");
		
		JLabel lblValorFrascoML = new JLabel("-");
		panel_2.add(lblValorFrascoML, "cell 9 1,alignx center");
		
		JLabel lblTotalOleo = new JLabel("-");
		panel_2.add(lblTotalOleo, "cell 13 1,alignx center");
		
		
		txtQuantFrascoML = new JTextField();
		txtQuantFrascoML.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String precoFrascoML = txtPrecoFrascoML.getText();
				String quantFrascoML = txtQuantFrascoML.getText();
				
				Float precoFrascoMLF = Float.valueOf(precoFrascoML);
				Float quantFrascoMLF = Float.valueOf(quantFrascoML);
				
				Oleo calc = new Oleo();
				
				float calculoML = calc.frascoML(precoFrascoMLF, quantFrascoMLF);

				lblValorFrascoML.setText(""+calculoML);
				
				
			}
		});
		panel_2.add(txtQuantFrascoML, "cell 6 1,alignx center");
		txtQuantFrascoML.setColumns(10);
		
		
		
		JLabel lblNewLabel_18 = new JLabel("Frasco de 1L");
		panel_2.add(lblNewLabel_18, "cell 1 2 5 1,alignx right");
		
		JLabel lblValorFrascoL = new JLabel("-");
		panel_2.add(lblValorFrascoL, "cell 9 2,alignx center");
		
		txtQuantFrascoL = new JTextField();
		txtQuantFrascoL.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String precoFrascoL = txtPrecoFrascoML.getText();
				String quantFrascoL = txtQuantFrascoML.getText();
				
				Float precoFrascoLF = Float.valueOf(precoFrascoL);
				Float quantFrascoLF = Float.valueOf(quantFrascoL);
				
				Oleo calc = new Oleo();
				
				float calculoL = calc.frascoML(precoFrascoLF, quantFrascoLF);

				lblValorFrascoL.setText(""+calculoL);
				
				String precoFrascoML = txtPrecoFrascoML.getText();
				String quantFrascoML = txtQuantFrascoML.getText();
				
				Float precoFrascoMLF = Float.valueOf(precoFrascoML);
				Float quantFrascoMLF = Float.valueOf(quantFrascoML);
				
				
				float calculoML = calc.frascoML(precoFrascoMLF, quantFrascoMLF);

				float totalOleo = calculoML+calculoL;
				
				lblTotalOleo.setText(""+totalOleo);
				
			}
		});
		panel_2.add(txtQuantFrascoL, "cell 6 2,alignx center");
		txtQuantFrascoL.setColumns(10);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_3, "cell 0 2,grow");
		panel_3.setLayout(new MigLayout("", "[][][][][grow][grow]", "[][][]"));
		
		JLabel lblNewLabel_12 = new JLabel("Combustivel");
		panel_3.add(lblNewLabel_12, "cell 1 0");
		
		JComboBox<Combustiveis> comboBox = new JComboBox<Combustiveis>();
		panel_3.add(comboBox, "cell 4 0,growx");
		comboBox.addItem(Combustiveis.DIESEL);
		comboBox.addItem(Combustiveis.ADITIVADA);
		comboBox.addItem(Combustiveis.COMUM);
		comboBox.addItem(Combustiveis.ETANOL);
		
		JLabel lblNewLabel_13 = new JLabel("Quantidade Litros:");
		panel_3.add(lblNewLabel_13, "cell 1 1");
		
		JLabel lblTotalCombustivel = new JLabel("-");
		panel_3.add(lblTotalCombustivel, "cell 4 2,alignx center");
		
		txtQuantLitros = new JTextField();
		txtQuantLitros.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String oleoDisel = txtOleoDisel.getText();
				String gasComum = txtGasComum.getText();
				String gasAditivada = txtGasAditivada.getText();
				String Etanol = txtEtanol.getText();
				String quantLitros = txtQuantLitros.getText();
				
				Float oleoDiselF = Float.valueOf(oleoDisel);
				Float gasComumF = Float.valueOf(gasComum);
				Float gasAditivadaF = Float.valueOf(gasAditivada);
				Float etanolF = Float.valueOf(Etanol);
				Float quantLitrosF = Float.valueOf(quantLitros);
				
				Combustivel calcC = new Combustivel();
				
				int posicao = comboBox.getSelectedIndex();
				
				
				if (posicao==0) {
					float totalCob = calcC.total(oleoDiselF, quantLitrosF);
					lblTotalCombustivel.setText(""+totalCob);
				} else if (posicao==1) {
					float totalCob = calcC.total(gasComumF, quantLitrosF);
					lblTotalCombustivel.setText(""+totalCob);
				} else if (posicao==2) {
					float totalCob = calcC.total(gasAditivadaF, quantLitrosF);
					lblTotalCombustivel.setText(""+totalCob);
				} else if (posicao==3) {
					float totalCob = calcC.total(etanolF, quantLitrosF);
					lblTotalCombustivel.setText(""+totalCob);
				}
				
			}
		});
		panel_3.add(txtQuantLitros, "cell 4 1,growx");
		txtQuantLitros.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Total Combustivel:");
		panel_3.add(lblNewLabel_14, "cell 1 2");
		

		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_4, "cell 1 2,grow");
		panel_4.setLayout(new MigLayout("", "[][][grow]", "[][][]"));
		
		JRadioButton rdbtAVista = new JRadioButton("À vista");
		buttonGroup.add(rdbtAVista);
		panel_4.add(rdbtAVista, "cell 0 0");
		
		JLabel lblNewLabel_16 = new JLabel("Dias:");
		panel_4.add(lblNewLabel_16, "cell 1 0,alignx trailing");
		
		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 2 0,alignx left");
		txtDias.setColumns(10);
		
		JRadioButton rdbtnAPrazo = new JRadioButton("À prazo");
		buttonGroup.add(rdbtnAPrazo);
		panel_4.add(rdbtnAPrazo, "cell 0 1");
		
		JLabel lblNewLabel_15 = new JLabel("Total a pagar");
		panel_4.add(lblNewLabel_15, "cell 0 2,alignx right");
		
		JLabel lblTotalPagar = new JLabel("-");
		panel_4.add(lblTotalPagar, "cell 1 2");
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5, "cell 0 3 2 1,alignx center,aligny top");
		panel_5.setLayout(new MigLayout("", "[][][][][][][][][][][][][][]", "[][]"));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String totComb = lblTotalCombustivel.getText();
				String totOleo = lblTotalOleo.getText();
				String dias = txtDias.getText();
				
				Float totCombF = Float.valueOf(totComb);
				Float totOleoF = Float.valueOf(totOleo);
				Integer diasF = Integer.valueOf(dias);
				
				Pagamento calc = new Pagamento();
				
				if(rdbtAVista.isSelected()) {
					Float resp = calc.aVista(totCombF, totOleoF);
					lblTotalPagar.setText(""+resp);
					
				}else if(rdbtnAPrazo.isSelected()) {
					Float resp = calc.aPrazo(totCombF, totOleoF, diasF);
					lblTotalPagar.setText(""+resp);
				}
				
			}
		});
		panel_5.add(btnCalcular, "cell 3 1,alignx center,aligny center");
		
		JButton btnNovoCalculo = new JButton("Novo Calculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOleoDisel.setText("");
				txtGasComum.setText("");
				txtGasAditivada.setText("");
				txtEtanol.setText("");
				txtPrecoFrascoML.setText("");
				txtPrecoFrascoL.setText("");
				txtQuantFrascoML.setText("");
				txtQuantFrascoL.setText("");
				lblValorFrascoML.setText("-");
				lblValorFrascoL.setText("-");
				lblTotalOleo.setText("-");
				txtQuantLitros.setText("");
				lblTotalCombustivel.setText("-");
				txtDias.setText("");
				lblTotalPagar.setText("-");
			}
		});
		panel_5.add(btnNovoCalculo, "cell 6 1,alignx center,aligny center");
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panel_5.add(btnFechar, "cell 9 1,alignx center,aligny center");
	}

}
