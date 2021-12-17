package trimestre_1.examenProgramacion;

import java.util.Scanner;

/**
 * Programa javael cual respecto a una tabla salarios
 * y un numero de fila elegida obtienes el maximo valor
 * de dicha fila.
 */
public class Ejercicio_3 {
	
	/**
	 * Pre:
	 * Post: Ordena la tabla de menor a mayor
	 * 		 y saca el ultimo valor de la fila designada
	 */
	public static void maxFila(int[][] t, int fila){
		int temp = 0;
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				for(int k = j + 1; k < t[i].length;k++) {
					if(t[i][j] > t[i][k]) {
						temp = t[i][j];
						t[i][j] = t[i][k];
						t[i][k] = temp;
					}
				}
			}
		}
		System.out.println(t[fila][t[fila].length-1]);
	}
	
	/**
	 * Pre:
	 * Post: Crea la tabla salarios y solicita el numero de fila
	 * 		 Llama al metodo max fila
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int salarios[][] = { {700, 900, 1300, 800, 790, 850},
				{1000,950,1080,1070,1200,1100}, 
				{1300,930,1200,1170,1000,1000},
				{1500,1950,1880,1978,2200,2100}};
		int fila;
		System.out.print("Fila:");
		while(true) {
			fila = sc.nextInt();
			if(fila > 0 ) {
				if(fila < salarios.length) {
				break;	
				}
			}
			System.out.print("Indica un valor valido:");
		}
		maxFila(salarios, fila);	
	}
}
