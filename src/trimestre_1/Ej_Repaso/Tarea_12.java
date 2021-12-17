package trimestre_1.Ej_Repaso;
import java.util.Scanner;
/**
 * Programa java que muestra los elementos comunes de dos
 * tablas de enteros
 */

public class Tarea_12 {
	
	/**
	 * Pre:
	 * Post: Mustra una tabla de enteros
	 */
	private static void mostrar(int[] t) {
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " | ");
		}
	}
	
	/**
	 * Pre:
	 * Post: Compara las dos tablas y muestra los comunes y sus posiciones
	 */
	private static void compare(int[] t1, int[] t2) {
		System.out.println();
		for(int i = 0; i < t1.length; i++) {
			for(int j = 0; j < t2.length; j++) {
				if(t1[i] == t2[j]) {
					System.out.println("(P:" + i + ") DT1: " + t1[i] + " = "
							+ "(P:" + j + ") DT2: " + t2[j]); // P = Posicion DT2 = Valor
				}
				
			}
		}
	}
	
	/**
	 * Pre:
	 * Post: Pide al usuario crear dos tablas las cuales las enviara a
	 * 		 los metodos de mostrar y comparar
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Celdas T1:");
		int cels = sc.nextInt();
		int[] t1 = new int [cels];
		System.out.print("Celdas T2:");
		cels = sc.nextInt();
		int[] t2 = new int [cels];
		System.out.println("\nTabla 1: ");
		for(int i = 0; i < t1.length; i++) {
			System.out.print("T1 D" + i + ": ");
			t1[i] = sc.nextInt();
		}
		mostrar(t1);
		System.out.println("\nTabla 2:");
		for(int i = 0; i < t2.length; i++) {
			System.out.print("T2 D" + i + ": ");
			t2[i] = sc.nextInt();
		}
		mostrar(t2);
		compare(t1,t2);
		
		
	}
}
