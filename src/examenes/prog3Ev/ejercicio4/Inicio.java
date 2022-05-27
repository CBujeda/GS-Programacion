package examenes.prog3Ev.ejercicio4;

import java.util.Scanner;

/**
 * Clase la cual muestra la tabla de multiplicar en pares de un numero dado 
 */
public class Inicio {
	
	/**
	 * Pre:
	 * Post: Método recursivo el cual saca la tabla 
	 * 		 de multiplicar solo de números pares de un numero dado
	 */
	public static void tablaMultiplicar(int multi) {tablaMultiplicar(0, multi);}
	public static void tablaMultiplicar(int num, int multi) {
		if(num <= 100) {
			int var = num * multi;
			System.out.println(num + " x " + multi + " = " + var );
			tablaMultiplicar(num+2,multi);
		}
	}
	
	/**
	 * Pre:
	 * Post: Método el cual solicita un número y posteriormente
	 * 		 mostrara la tabla de multiplicar de dicho número de solo los pares 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int data = 2;
		System.out.print("Dato a multiplicar en pares: ");
		try {
			 data = sc.nextInt();
		}catch(Exception e) {
			System.out.println("tipo de dato erroneo");
			System.out.println("Dato default 2");
		}
		tablaMultiplicar(data);
	}
}
