package trimestre_2.clasesYobjetos2.ejercicio1;

public class Triangulo {

	private double b;
	private double y;
	private double j;
	private double h;
	
	public Triangulo() {
		
	}
	
	public Triangulo(double b,double y,double j,double h) {
		this.b = b;
		this.y = y;
		this.j = j;
		this.h = h;	
	}
	
	public double area() {
		double area = 0;
		area = (this.b*this.h)/2;
		return area;
	}
	public double perimetro() {
		double a = 0;
		a = this.b + this.y + this.j;
		return a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getJ() {
		return j;
	}

	public void setJ(double j) {
		this.j = j;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	
	
}
