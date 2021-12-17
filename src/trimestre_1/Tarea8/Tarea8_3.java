package trimestre_1.Tarea8;

import java.util.Scanner;

public class Tarea8_3 {
	/**
	 * Pre:
	 * Post: Programa java con método llamado estadisticasTabla,
	 * 		 el cual recibe una tabla de enteros y muestra por pantalla:
	 * 		 el número de enteros positivos, el número de enteros negativos,
	 * 	 	 el número de 0s, el número de enteros pares y el número de enteros impares.
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
