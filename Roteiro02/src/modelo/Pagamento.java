package modelo;

public class Pagamento {
	public float aVista (float oleo, float comb) {
		float valorTot = oleo+comb;
		return valorTot;
	}
	
	public float aPrazo (float oleo, float comb, int dias) {
		float valorTot = oleo+comb;
		float parcela = valorTot/dias;
		return parcela;
	}

}
