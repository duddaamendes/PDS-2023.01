package model;

public class CalcRetangulo {
	public float Perimetro(float altura, float base) {
		float calcPerimetro = 2f*(base+altura);
		return calcPerimetro;
	}
	
	public float Area(float altura, float base) {
		float calcArea = base*altura;
		return calcArea;
	}
}
