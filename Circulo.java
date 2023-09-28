package aula6;

public class Circulo extends FiguraPlana {
	private double raio;

	Circulo(double raio){
		this.raio = raio;
	}
	
	@Override
	double area() {
		return Math.PI * (raio * raio);
	}

	@Override
	double perimetro() {
		return Math.PI * 2 * raio;
	}

	

}