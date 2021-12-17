package trimestre_1.Ej_Repaso;
import java.util.Scanner;

/**
 *  programa Java que pregunta al usuario por
 *  dos Strings y los compara lexicográficamente.
 *  Dos Strings son lexicográficamente iguales si
 *  tienen la misma longitud y contienen los mismos
 *  caracteres en las mismas posiciones.
 */
public class Tarea_1 {

	/**
	 * Pre:
	 * Post: Comprueba si son iguales los dos strings
	 * 		 No tiene en cuenta las Mayus y la Minus
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("TXT1: ");
		String txt1 = sc.nextLine();
		System.out.print("TXT2: ");
		String txt2 = sc.nextLine();
		if(txt1.equalsIgnoreCase(txt2)) {
			System.out.println("Son iguales lexicográficamente ");
		}else {
			System.out.println("No son iguales lexicográficamente ");
		}
	}
}
