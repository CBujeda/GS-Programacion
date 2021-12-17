package trimestre_1.Tarea8;

import java.util.Scanner;

public class Tarea8_4 {
	/**
	 * Pre:
	 * Post: Programa java con método llamado copiarTabla, el cual
	 *  	 recibe como parámetro una tabla de Strings, y devuelve una nueva tabla 
	 *  	 con los elementos en orden inverso.
	 */
	private static void copiarTabla(String[] t) { 
		String[] invers = new String[t.length];
		int inv = 0;
		System.out.println("Cargando datos..");
		for(int i = (t.length - 1); i >= 0;i--) {
			System.out.print("PD: " + i + " | ");
			invers[inv] = t[i];
		inv++;
		}
		System.out.println();
		System.out.println("Proceso finalizado:");
		mostrar(invers);
	}
	
	private static void mostrar(String[] t) {//Muestra la tabla
		System.out.println();
		for(int i=0;i < t.length;i++) {
			System.out.print(" " + t[i] + " |");
		}
		System.out.println();
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de celdas: ");
		int cels = sc.nextInt();
		String [] a = new String [cels];
		for(int i = 0; i < a.length; i++) {
			System.out.print("Celda " + (i + 1) + " :");
			a[i] = sc.nextLine();
		}
		mostrar(a);
		copiarTabla(a);
	}
}
