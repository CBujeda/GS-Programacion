package trimestre_1.Tarea8;

import java.util.Scanner;

public class Tarea8_2 {

	/**
	 * Pre:
	 * Post: Programa java con método llamado incrementarValores,
	 * 		 el cual recibe una tabla y un valor numérico, y devuelve
	 * 		 todos los elementos de la tabla multiplicados por dicho
	 * 		 valor, excepto el primero y el último.
	 */
	
	private static void mostrar(int[] t) {//Muestra la tabla
		System.out.println();
		for(int i=0;i < t.length;i++) {
			System.out.print(" " + t[i] + " |");
		}
		System.out.println();
	}
	
	private static void incrementarValores(int[] t, int inc) {
		for(int i = 1; i < (t.length - 1);i++) {
			t[i] = t[i] * inc;
		}
		mostrar(t);
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de celdas: ");
		int cels = sc.nextInt();
		int [] a = new int [cels];
		for(int i = 0; i < a.length; i++) {
			System.out.print("Celda " + (i + 1) + " :");
			a[i] = sc.nextInt();
		}
		System.out.println("Incremental: ");
		int incremental = sc.nextInt();
		incrementarValores(a,incremental);
	}
}
