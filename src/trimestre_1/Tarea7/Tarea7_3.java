package trimestre_1.Tarea7;
import java.util.Scanner;
public class Tarea7_3 {

	/**
	 * Pre:
	 * Post: programa Java con un m�todo llamado contains(String[]
	 * 		 tabla, String cadena) que devuelva TRUE, s� o solo s�,
	 * 		 alguno de los elementos de la tabla pasada como par�metro
	 * 		 es igual al valor de la variable �cadena�.
	 */
	
	private static void contains(String[] tabla, String Cadena) {
		for(int i = 0; i< tabla.length; i++) {
			if(Cadena.equals(tabla[i])) {
				System.out.println("TRUE en la celda " + i);
				
			}else{
				System.out.println("false");
			}	
		}	
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Longitud: ");
		int l = sc.nextInt();
		sc.nextLine();
		System.out.print("Cadena: ");
		String cadena = sc.nextLine();
		
		String[] tabla = new String[l];
		System.out.println();
		for(int i = 0; i < tabla.length;i++) {
			
			System.out.print("Celda" + i + ":");
			tabla[i] = sc.nextLine();

		}
		contains(tabla, cadena);
	}
}
