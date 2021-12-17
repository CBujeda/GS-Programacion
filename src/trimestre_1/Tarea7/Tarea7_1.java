package trimestre_1.Tarea7;

public class Tarea7_1 {
	/**
	 * Pre:
	 * Post: Programa Java con un método
	 * 		 llamado sum(int [] tabla) que muestra por
	 * 		 pantalla el resultado de sumar todos los
	 * 		 elementos de la tabla pasada como parámetro.
	 */
	
	private static int sum(int[] tabla) {
		int suma = 0;
		for(int i=0;i < tabla.length;i++) {
			System.out.print(" " + tabla[i] + " |");
			suma = suma + tabla[i];
		}
		System.out.println();
		return suma;
		
	}

	public static void main(String[] arg){
		int [] a = new int[5];
		//a[0] = 10; a[1] = 20; a[2] = 30; a[3] = 40; a[4] = 50;
		
		for(int i =0; i<a.length;i++) {
			a[i] = i;
			
		}
		
		System.out.println( sum(a));
	}
}
