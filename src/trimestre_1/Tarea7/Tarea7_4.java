package trimestre_1.Tarea7;
import java.util.Scanner;

public class Tarea7_4 {
	/**
	 * Pre:
	 * Post: Programa Java con un método llamado
	 * 		 indexContains(String[] tabla, String cadena)
	 * 		 que devuelva el índice de la tabla cuyo valor
	 * 		 es igual al valor de “cadena”. En caso de no
	 * 		 haber ningún valor igual, devuelve -1
	 */
	private static void indexContains(String[] tabla, String Cadena) {
		for(int i = 0; i< tabla.length; i++) {
			if(Cadena.equals(tabla[i])) {
				System.out.println("Indice: " + i);
				
			}else{
				System.out.println("-1");
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
		indexContains(tabla, cadena);
	}

}
