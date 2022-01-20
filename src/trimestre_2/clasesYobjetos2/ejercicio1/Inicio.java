package trimestre_2.clasesYobjetos2.ejercicio1;
import java.util.Scanner;

public class Inicio {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Creando nuevo triangulo");
		System.out.println("base");
		double b = sc.nextDouble();
		System.out.println("Lado2");
		double y = sc.nextDouble();
		System.out.println("Lado3");
		double j = sc.nextDouble();
		System.out.println("Altura");
		double h = sc.nextDouble();
		
		Triangulo tri = new Triangulo(b,y,j,h);
		System.out.println("La area del triangulo es = " + tri.area());
		System.out.println("El perimetro del triangulo es = " + tri.perimetro());
		
	}
}
