package aula6;

import java.util.ArrayList;
import java.util.Iterator;

public class TesteFiguraPlana {
	public static void main(String[] args) {
		ArrayList<FiguraPlana> figuras = new ArrayList<>();
		Circulo c1 = new Circulo(5.0);
		Triangulo t1 = new Triangulo(5.0, 6.0, 7.0);
		Quadrado q1 = new Quadrado(8.0);
		Retangulo r1 = new Retangulo(4.0);
		figuras.add(c1);
		figuras.add(t1);
		figuras.add(q1);
		figuras.add(r1);
		for (FiguraPlana f : figuras) {
			System.out.println("area: " + f.area());
			System.out.println("perimetro: " + f.perimetro());
		}
	}
}
