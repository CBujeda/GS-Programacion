package trimestre_1.Ej_Repaso;
import java.util.Scanner;

/**
 * Programa java el cual te pide dos valores y verificara
 * que el primer valor desde el final contenga el segundo valor 
 */
public class Tarea_4 {
	
	/**
	 * Pre:
	 * Post: Pide dos strings y compara si el segundo
	 * 		 esta al final del primero
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("TXT: ");
		String txt1 = sc.nextLine();
		System.out.print("TXT2: ");
		String txt2 = sc.nextLine();
		if(txt1.substring((txt1.length()-txt2.length()), txt1.length()).equals(txt2)) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
	}
}
