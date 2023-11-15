package modelo;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PessoaJTableModel extends AbstractTableModel{

	private ArrayList<Pessoa> lista;
	private String[] colunas ={"Nome", "CPF", "Telefone","Idade", "Peso", "Altura"};
	
	public PessoaJTableModel(ArrayList<Pessoa> lista) {
		this.lista=lista;
	}
	
	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
	    Pessoa p = lista.get(rowIndex);
	    switch (columnIndex) {
	        case 0:
	            return p.getNome();
	        case 1:
	            return p.getCpf();
	        case 2:
	            return p.getTelefone();
	        case 3:
	            return p.getIdade();
	        case 4:
	            return p.getPeso();
	        case 5:
	            return p.getAltura();
	        default:
	            return null;
	    }
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}
