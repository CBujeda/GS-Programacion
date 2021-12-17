package trimestre_1.Tarea7;

public class Tarea7_5 {
	
	/**
	 * Pre:
	 * Post: Programa Java con un método llamado
	 * 		 copyArray(String[] tabla, String[] tabla2)
	 * 		 que devuelva “tabla2” con los mismos valores de
	 * 		 “tabla”. Es decir, el programa debe
	 * 		 copiar el contenido de una tabla en otra.
	 */
	
	private static void mostrar(String[] t) {//Muestra la tabla
		for(int i=0;i < t.length;i++) {
			System.out.print(" " + t[i] + " |");
		}
	}
	
	private static void copyArray(String[] tabla, String[] tabla2) {//Copia la tabla
		for(int i = 0; i< tabla.length;i++) {
			tabla2[i] = tabla[i];
		}
		System.out.println("Tabla Original:");
		mostrar(tabla);// Muestro tabla original
		System.out.println();
		System.out.println("Tabla Copiada:");
		mostrar(tabla2); // Muestro tabla copiada
	}
	
	public static void main(String[] arg) {
		int celd = 7; //Asigno el numero de celdas
		String[] a = new String[celd];	//Creo las tablas
		String[] b = new String[celd];
		for(int i = 0; i < a.length;i++) {// Simplemente relleno las celdas con algo
			a[i] = Integer.toString(i*10); // Pongo un valor a las celdas(Transformo i a String)
		}
		copyArray(a,b);// llamo al copiador de tablas

		
	}

}
