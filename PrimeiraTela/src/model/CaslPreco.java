package model;

public class CaslPreco {
	public float PrecoPago (float totQuilo) {
		float valorPago = (totQuilo-0.7f)*9.45f;
		return valorPago;
	}
}
