package trimestre_1.Tarea8;

import java.util.Scanner;

public class Tarea8_5 {
	
	
	
	/**
	 * Pre:
	 * Post: método Java llamado mayorYmenor, el cual
	 * 		 recibe como parámetro una tabla de Strings
	 * 		 y muestra por pantalla el String con mayor
	 * 		 longitud y el String con menor longitud.
	 */
	private static void mayorYmenor(String[] t ) {
		int mayor = 0;
		int menor = 0;
		int normal = 0;
		
		for(int i = 0; i < t.length; i++) {
			normal = t[i].length();
			System.out.print(normal + " | ");
			if(normal > mayor) {
				mayor = normal;
			}
		}
		menor = mayor;
		for(int i = 0; i < t.length; i++) {
			
			if(menor > normal) {
				menor = normal;
			}
		}
		System.out.println("Numero menor: " + menor + "Numero mayor: " + mayor);
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
		mayorYmenor(a);
	}
}
