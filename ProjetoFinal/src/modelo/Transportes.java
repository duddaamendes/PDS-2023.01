package modelo;

public enum Transportes {
	SELECIONE (1, "Selecione"), AVIAO (2, "Avião"), ALUGUELC (3, "Alguel de carro"), TRANP (4, "Trasporte público"), BARCO (5, "Barco"), TRANSLADO (6, "Translado"), TAXI (6, "Táxi");
	
	private int codigo;
	private String descricao;
	
	private Transportes(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
}
