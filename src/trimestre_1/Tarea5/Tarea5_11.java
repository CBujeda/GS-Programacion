package trimestre_1.Tarea5;
import java.util.Scanner;

public class Tarea5_11 {
	/**
	 * Pre:
	 * Post: Programa java que pide al usuario un texto
	 * 		 el cual el programa lo devuelve con la posicion 
	 * 		 invertida 
	 */
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		int i = 0;
		while(i< txt.length()) {
		System.out.print(txt.substring((txt.length()-i-1), (txt.length()-i)));
		i++;	
		}
		
		
	}

}
