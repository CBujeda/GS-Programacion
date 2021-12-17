package trimestre_1.Tarea8;

import java.util.Scanner;

public class Tarea8_3 {
	/**
	 * Pre:
	 * Post: Programa java con m�todo llamado estadisticasTabla,
	 * 		 el cual recibe una tabla de enteros y muestra por pantalla:
	 * 		 el n�mero de enteros positivos, el n�mero de enteros negativos,
	 * 	 	 el n�mero de 0s, el n�mero de enteros pares y el n�mero de enteros impares.
	 */
	private static void estadisticasTabla(int[] t) {
		int[] estad = new int [3];	//Tabla que almacenara las estadisticas
		for(int i = 0; i < t.length;i++) {	//tabla de comprobantes
			if(t[i] == 0) {estad[(2 - 1)]++;}
			if(t[i] < 0) {estad[(1 - 1)]++;}
			if(t[i] > 0) {estad[(3 - 1)]++;}
		}
		System.out.print(" - | 0 | + |");
		mostrar(estad);
		
	}
	
	private static void mostrar(int[] t) {//Muestra la tabla
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
		int [] a = new int [cels];
		for(int i = 0; i < a.length; i++) {
			System.out.print("Celda " + (i + 1) + " :");
			a[i] = sc.nextInt();
		}
		mostrar(a);
		estadisticasTabla(a);
	}
}
