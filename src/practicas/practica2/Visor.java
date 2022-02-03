package practicas.practica2;

public class Visor {
	
	/**
	 * Pre:
	 * Post: Dicho metodo añade el numero de 
	 * 		 lineas de se le indican
	 */
	public static void limpiar(int max) {
		for(int i = 0; i < max ; i++) {
			System.out.println();
		}
	}
	
	/**
	 * Pre:
	 * Post: Dicho metodo muestra un array de booleans
	 */
	public static void array (boolean [][] t, int gen) {
		System.out.println("Generacion: " + gen);
		System.out.print("_");
		for(int i = 0; i < (t[0].length); i++) {
			System.out.print("___");
		}
		System.out.println();
		for(int i = 0; i < t.length; i++) {
			System.out.print("|" );
			for(int j = 0; j < t[i].length;  j++) {
				if(t[i][j] == true) {
					System.out.print(" * ");
				}else{
					System.out.print("   ");
					//System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
