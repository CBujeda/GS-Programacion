package trimestre_1.Tarea4;

public class Tarea4_6 {
	
	/**
	 * Pre:
	 * Post: Programa Java que muestra
	 * 		 los números impares entre 0 y 100
	 */
	
	public static void main(String[] arg) {
		for(int i = 0; i < 101; i++) {
			if(i%2 != 0) {
				System.out.print(i + " ");
			}	
		}	
	}
}
