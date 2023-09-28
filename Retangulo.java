package aula6;

public class Retangulo extends FiguraPlana {
	private double lado;
	Retangulo(double lado){
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
