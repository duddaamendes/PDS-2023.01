package modelo;

public enum Acomodacoes {
	SELECIONE (1, "Selecione"), POUSADA (2, "Pousada"), HOTEL (3, "HOTEL"), RESORT (4, "Resort"), HOSTEL (5, "Hostel"), ALBERGUE (6, "Albergue");
	
	private int codigo;
	private String descricao;
	
	private Acomodacoes(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
}
