package trimestre_1.Ej_Repaso;
import java.util.Scanner;
/**
 * Escribe un programa Java que encuentre el segundo
 *  elemento más largo de un array de Strings.
 */
public class Tarea_11 {
	
	/**
	 * Pre:
	 * Post: Mustra una tabla de strings
	 */
	private static void mostrar(String[] t) {
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " | ");
		}
	}
	
	/**
	 * Pre:
	 * Post: Comprueba el segundo mas largo
	 */
	private static void comprobar(String[] t) {
		String mayor = t[0];
		for(int i = 0; i < t.length; i++) {
			if(t[i].length() > mayor.length()) {
				if(i == (t.length - 1)) {
					System.out.println("---> " + mayor);
				}
					mayor = t[i];
					
			}
			System.out.println(mayor);
			
		}
		
	}
	
	/**
	 * Pre:
	 * Post: Creas una tabla y despues llama a los metodos
	 * 		 que la comprueba y la muestra
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int nceldas = sc.nextInt();
		
		String[] t= new String[nceldas];
		sc.nextLine();
		for(int i = 0; i < t.length; i++) {
			System.out.print("D" + i + ": ");
			t[i] = sc.nextLine();
			
		}

		mostrar(t);
		comprobar(t);
		
	}
}
