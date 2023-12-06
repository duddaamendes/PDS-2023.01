package modelo;

public enum Status {
	SELECIONE (1, "Selecione"), RESERVADO (2, "Reservado"), ACONFIRMACAO (3, "Aguardado confirmação"), CONFIRMADO (4, "Confirmado"), NPAGO (5, "Não pago"), PAGO (6, "Pago");
	
	private int codigo;
	private String descricao;
	
	private Status(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}

}
