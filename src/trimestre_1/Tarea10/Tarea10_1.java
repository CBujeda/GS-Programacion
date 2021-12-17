package trimestre_1.Tarea10;
import java.util.Scanner;

	/**
	 * 
	 * Tenemos la siguiente tabla multidimensional, la cual
	 *  almacena por cada una de sus filas el salario trimestral
	 *
	 */
public class Tarea10_1 {
	
	/**
	 * Pre:
	 * Post: Muestra las tablas y suma los valores de la tabla 2D
	 */
	private static void mostrar(int[][] t, String[] t2) {
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
	 * Post: Creo tablas e introduzco variables
	 */
	public static void main(String[] arg) {
		int[][] t = { {700, 900, 1300} , {1000, 950, 1080}, {1300, 930, 1200} };//Tabla 2D
		String[] t2 = {"Javier Marías","Antonio Muñoz","Isabel Allende"};//Tabla 1D
		mostrar(t, t2);//Muestro Tabla

	}
}
