package trimestre_1.Tarea7;
import java.util.Scanner;
public class Tarea7_6 {
	/**
	 * Pre:
	 * Post: programa Java con un método llamado
	 * 		 insertElement(int[] tabla, int num, int index)
	 * 		 que devuelve “tabla”, insertando el valor de “num” en el

	 * 		 índice “index” pasado por parámetro. Como ya conocemos, las tablas
	 * 		 tienen una longitud máxima que se indica al crearlas.
	 * 		 Por lo tanto, para añadir este nuevo elemento deberemos
	 * 		 desplazar el resto una posición hacia abajo. Es decir, si queremos
	 * 		 almacenar num=2 en index=3, los elementos en la posición desde 3 hasta
	 * 		 tabla.length deberán desplazarse para dejar hueco al nuevo elemento.
	 */
	
	private static void mostrar(int[] t) {//Muestra la tabla
		for(int i=0;i < t.length;i++) {
			System.out.print(" " + t[i] + " |");
		}
	}
	
	private static void insertElement(int[] tabla, int num, int index) { //Movedor
		for(int i = (tabla.length - 1); i > index; i--) {// Mover celda
			tabla[i] = tabla[i-1];	
		}
		tabla[index] = num;

		mostrar(tabla);
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de celdas:"); 
		int ncel = sc.nextInt(); // Numero de celdas?
		int[] a = new int[ncel];
		int num;
		int index;
		/*
		for(int i = 0; i < a.length;i++) {
			a[i] = (i+1);
		}
		*/
		while(true) {
			System.out.println();	//solicitudes de datos
			System.out.print("Numero: ");
			num = sc.nextInt();
			System.out.print("Posicion: ");
			index = sc.nextInt();
			insertElement(a,num,(index - 1));
			
		}
	}
}
