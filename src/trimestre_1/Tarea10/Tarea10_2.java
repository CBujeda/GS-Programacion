package trimestre_1.Tarea10;

/**
 * 
 * Muestra por pantalla la tabla dada ordenada de menor a mayor 
 *
 */
public class Tarea10_2 {
	
	/**
	 * Pre:
	 * Post: Muestra la tabla de saldo
	 */
	private static void mostrarSaldo(int[][] t, String[] t2) {
		int valor = 0;
		for(int i = 0; i < t.length; i++) {
			System.out.print(t2[i] + " => "); 
			valor = 0;
			for(int j = 0; j< t[i].length;j++ ) {
					System.out.print(t[i][j]); // Muestro el valor de la tabla 2D
					if(j != (t[i].length - 1)) { // pongo el +
						System.out.print(" + ");
					}
					valor = t[i][j] + valor; // Mustro 
			}
			System.out.print(" = " + valor + "€");
			System.out.println();
		}
	}
	
	/**
	 * Pre:
	 * Post: Ordena la tabla de menor a mayor
	 */
	private static int[][] menor(int t[][]) {
		int temp = 0;
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < (t[i].length-1);j++) {
				if(t[i][j] > t[i][j + 1]) {
					temp = t[i][j];
					t[i][j] = t[i][j + 1];
					t[i][j + 1] = temp;
				}
			}
		}
		return(t);
	}
	
	/**
	 * Pre:
	 * Post: Crea las tablas 2D y 1D y llama a los metodos
	 */
	public static void main(String[] arg) {
		int[][] t = { {700, 900, 1300} , {1000, 950, 1080}, {1300, 930, 1200} };//Tabla 2D
		String[] t2 = {"Javier Marías","Antonio Muñoz","Isabel Allende"};//Tabla 1D
		//Muestro Tabla
		mostrarSaldo(menor(t), t2);
	}
}
