package aula6;

public class Quadrado extends FiguraPlana {
	private double lado;
	Quadrado(double lado){
		this.lado = lado;
	}
	@Override
	double area() {
		return lado * lado;
	}

	@Override
	double perimetro() {
		return lado * 4;
	}

	
}
