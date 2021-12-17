package trimestre_1.APruebas;

import java.util.Scanner;

public class Tabla2D {
	private static void mostrar(int[][] t) {
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j< t[i].length;j++ ) {
					System.out.print(t[i][j] + " |");
			}
			System.out.println();
		}
	}
	
	private static void introMulti() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		int a = sc.nextInt();
		System.out.print("Columnas: ");
		int b = sc.nextInt();
		int[][] t = new int[a][b];
		for(int i = 0; i < t.length; i++) {
			System.out.println("Fila: " + i);
			for(int j = 0; j< t[i].length;j++ ) {
				System.out.print("C" + j + ":");
				// FILAS COLUMNAS
				t[i][j] = sc.nextInt();
				
			}
		}
		mostrar(t);
	}

	public static void main(String[] arg) {
		introMulti();
	}
}
