package modelo;

public class Pagamento {
	public float aVista (float oleo, float comb) {
		float valorTot = oleo+comb;
		float desc = valorTot*0.10f;
		float result = valorTot-desc;
		return result;
	}
	
	public float aPrazo (float oleo, float comb, int dias) {
		float valorTot = oleo+comb;
		float desc = valorTot*0.10f;
		float result = valorTot+desc;
		return result;
	}
	
	public float aPrazoTrinta (float oleo, float comb) {
		float valorTot = oleo+comb;
		return valorTot;
	}

}
