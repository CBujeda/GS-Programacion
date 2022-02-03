package practicas.practica2;

public class Generador_Pruebas {

	/**
	 * Pre:
	 * Post: Devuelve una tabla predefinida con 
	 * 		 forma de cuadrado
	 */
	public static boolean[][] celsCuatro() {
		int x = 4;
		int y = 4;
		boolean[][] t = new boolean[y][x];
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				t[i][j] = false;
			}
		}
		t[1][1] = true;
		t[1][2] = true;
		t[2][1] = true;
		t[2][2] = true;
		
		return t;
	}
	
	/**
	 * Pre:
	 * Post: Devuelve una tabla predefinida con 
	 * 		 forma de una fila de tres
	 */
	public static boolean[][] celsTres() {
		int x = 5;
		int y = 5;
		boolean[][] t = new boolean[y][x];
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				t[i][j] = false;
			}
		}
		t[2][1] = true;
		t[2][2] = true;
		t[2][3] = true;
		
		return t;
	}
	
	/**
	 * Pre:
	 * Post: Devuelve una tabla predefinida con 
	 * 		 forma de dos cuadrados
	 */
	public static boolean[][] celsDobleCuadrado() {
		int x = 6;
		int y = 6;
		boolean[][] t = new boolean[y][x];
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				t[i][j] = false;
			}
		}
		t[1][1] = true;
		t[1][2] = true;
		t[2][1] = true;
		t[2][2] = true;
		
		t[3][3] = true;
		t[3][4] = true;
		t[4][3] = true;
		t[4][4] = true;
		return t;
	}
}
