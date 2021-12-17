package trimestre_1.examenProgramacion;

import java.util.Scanner;

/**
 * Programa java el cual Muestra una tabla y sus mejores numeros
 */
public class Ejercicio_1 {

	/**
	 * Pre:
	 * Post: Ordena la tabla de mayor a menor para luego mostrar
	 * 		 Los mejores numeros
	 */
	private static void orden(int t[], int m) {
		int temp = 0;
		for(int i = 0; i < t.length; i++) {
			for(int j = i; j < t.length; j++) {
				if(t[i] < t[j]) {
					temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}
		//Mostrar Mejores
		System.out.println("\n-------MEJORES--------");
		for(int i = 0; i < m; i++) {
			System.out.print(t[i] + " ");
		}
		
	}
	
	/**
	 * Pre:
	 * Post:Muestra la tabla
	 */
	public static void mostrar(int[] t) {
		System.out.println("---------LISTA----------");
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " ");
		}
	}
	
	/**
	 * Pre:
	 * Post: Pide los valores de una tabla, y pide el numero de mejores
	 * 		 Posteriormente llama a los metodos mostar y orden
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int cols = 2;
		int m = 2;
		System.out.print("Numero de filas:");	
		while(true) {
			cols = sc.nextInt();
			if(cols > 0) {
				break;
			}
			System.out.print("Indica un valor valido:");
		}
		int[] t = new int [cols];
		for(int i = 0; i < t.length; i++) {
			System.out.print("N" + (i+1) + ":");	
			t[i] = sc.nextInt();
		}
		System.out.print("Mejores:");
		while(true) {
			m = sc.nextInt();
			if(m > 0) {
				break;
			}
			System.out.print("Indica un valor valido:");
		}
		mostrar(t);
		orden(t, m);
		
	}
}
