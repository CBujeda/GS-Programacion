package examenes.prog3Ev.ejercicio4;

import java.util.Scanner;

public class Inicio {
	
	public static void tablaMultiplicar(int multi) {tablaMultiplicar(0, multi);}
	public static void tablaMultiplicar(int num, int multi) {
		if(num <= 100) {
			int var = num * multi;
			System.out.println(num + " x " + multi + " = " + var );
			tablaMultiplicar(num+2,multi);
		}
	}
	
	
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
