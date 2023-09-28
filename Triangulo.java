package aula6;

public class Triangulo extends FiguraPlana {
	private double base;
	private double altura;
	private double lado;
	Triangulo(double base, double altura, double lado){
		this.base = base;
		this.altura =  altura;
		this.lado = lado;
	}
	@Override
	double area() {
		return (base * altura) / 2;
	}

	@Override
	double perimetro() {
		return lado * 3;
	}

}
