package modelo;

public enum EstacoesAno {
	
	PRIMAVERA(1, "Primavera"), VERAO(2, "Verão"), OUTONO(3, "Outono"), INVERNO(4, "Inverno");
	
	private int codigo;
	private String descricao;
	
	private EstacoesAno(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.descricao;
	}

}
