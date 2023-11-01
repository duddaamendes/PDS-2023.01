package model;

public class Calcular {
	public int adicao (int a, int b) {
		int calcAdicao = a+b;
		return calcAdicao;
	}
	public int subtracao (int a, int b) {
		int calcSubtracao = a-b;
		return calcSubtracao;
	}
	public int multiplicacao (int a, int b) {
		int calcMultiplicacao = a*b;
		return calcMultiplicacao;
	}
	public float divisao (int a, int b) {
		float aFor = Float.valueOf(a);
		float bFor = Float.valueOf(b);
		float calcDivisao = aFor/bFor;
		return calcDivisao;
	}

}
