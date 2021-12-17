package trimestre_1.Tarea7;

public class Tarea7_2 {

	/**
	 * Pre: 
	 * Post: Programa Java con un método llamado
	 * 		 average(double [] tabla) que devuelva un
	 * 		 dato de tipo double, que indique la media
	 * 		 de los valores de los elementos de la tabla
	 * 		 pasada como parámetro.
	 */
	private static void mostrar(double[] t) { // mostrar tabla
		for(int i=0;i < t.length;i++) {
			System.out.print(" " + t[i] + " |");
		}
	}
	
	private static void average(double[] tabla) { // haz la media
		double suma = 0; 
		mostrar(tabla);
		for(int i = 0; i < tabla.length; i++ ) {
		suma = suma + tabla[i];	
		}
		suma = suma/tabla.length;
		System.out.println("\n Media:");
		System.out.println(suma); //muestra la media
	}
	
	public static void main(String[] arg) {
		double[] a = new double[5];
		for(int i = 0;i < a.length;i++) {
			a[i] = i;
		}
		average(a);
		
	}
}
