package trimestre_1.Tarea5;
import java.util.Scanner;

public class Tarea5_3 {
	
	/**
	 * Pre:
	 * Post: programa Java que solicita al 
	 * 		 usuario una cadena de caracteres 
	 * 		 (String) y muestra por pantalla 
	 * 		 dicha cadena sin el último caracter.
	 */
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		txt = txt.substring(0, txt.length()-1);	// Quita la ultima letra
		System.out.println(txt);
		
	}
}
