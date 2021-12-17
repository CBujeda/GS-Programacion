package trimestre_1.Ej_Repaso;
import java.util.Scanner;
/**
 * Programa java el cual introduces dos valores y te
 * devuelve la concatenacion de ambos
 */

public class Tarea_2 {
	
	/**
	 * Pre:
	 * Post: Pide dos strings y devuelve su concatenacion
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("TXT1: ");
		String txt1 = sc.nextLine();
		System.out.print("TXT2: ");
		String txt2 = sc.nextLine();
		String concatenacion = txt1 + txt2;
		System.out.println(concatenacion);
	}
}
