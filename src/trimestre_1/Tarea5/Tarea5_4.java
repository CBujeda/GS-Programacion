package trimestre_1.Tarea5;
import java.util.Scanner;

public class Tarea5_4 {

	/**
	 * Pre:
	 * Post: programa Java que solicita al usuario
	 * 		 una cadena de caracteres (String) y
	 * 		 muestre por pantalla la longitud de esta.
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		System.out.println("Hay " + txt.length() + " letras");
	}
}
