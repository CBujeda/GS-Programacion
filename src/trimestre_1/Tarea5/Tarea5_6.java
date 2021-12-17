package trimestre_1.Tarea5;
import java.util.Scanner;

public class Tarea5_6 {
	/**
	 * Pre:
	 * Post: programa Java que solicite al
	 * 		 usuario una cadena de caracteres
	 * 		 (String) y muestre por pantalla dicha
	 * 		 cadena, pero con el primer y último
	 * 		 carácter cambiados de posición.
	 */

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		int largo = txt.length(); // Variable largo (Simplemente hecha para acortar el print)
		System.out.println(txt.subSequence((largo - 1), largo) + 
				txt.substring(1,(largo-1)) + txt.substring(0,1));
		
		
		
	}
}
