package trimestre_2.clasesYobjetos.ejercicio2;

import java.util.Scanner;
	
	/**
	 * Programa java el cual calcula el ICM de uno o mas
	 * individuos 
	 */
public class Ejercicio2 {

	/**
	 * Pre:
	 * Post: Metodo el cual crea objetos para calcular el ICM
	 * 		 de uno o mas individuos.
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad de cuentas:");
		int p = sc.nextInt();
		Persona[] c = new Persona[p];
		
		String nombre;
		int edad;
		String dni;
		String sexo;
		int peso;
		int altura;
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("Persona " + (i+1) + ":");
			System.out.print("-> Nombre:");
			nombre = sc.next();
			System.out.print("-> Edad:");
			edad = sc.nextInt();
			System.out.print("-> Sx:");
			sexo = sc.next();
			System.out.print("-> DNI:");
			System.out.println("--->Generando..");
			dni = "**********";
			System.out.println("---->DNI: " + dni);
			System.out.print("-> Peso:");
			peso = sc.nextInt();
			System.out.print("-> Altura:");
			altura = sc.nextInt();
			c[i] = new Persona(nombre, edad, dni, sexo, peso, altura);
		}
		System.out.println("--------------------");
		for(int i = 0; i < c.length; i++) {
			c[i].show();
			System.out.println("--------------------");
		}
		
		
	}
}
