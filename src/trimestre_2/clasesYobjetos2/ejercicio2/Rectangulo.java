package trimestre_2.clasesYobjetos2.ejercicio2;

public class Rectangulo {
	
	private double b;
	private double h;
	
	public Rectangulo() {
		
	}
	public Rectangulo(double b, double h) {
		this.b = b;
		this.h = h;
		
	}
	
	
	public double area() {
		return this.b * this.h;
	}
	
	public double perimetro() {
		return (this.b *2) + (this.h*2);
	}
}
