package trimestre_1.Tarea5;
import java.util.Scanner;

public class Tarea5_1_2 {
	
	/**
	 *programa Java que acepte 4 enteros por parte del usuario 
	 *y muestre por la pantalla la palabra “Igual” si los 4 enteros son iguales. 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		//Operaciones de inicio
		int input = sc.nextInt();
		int data = input;
		boolean iguales = true;
		for(int i = 1; i <= 3; i++) {
			if(input == data) {
				System.out.println("input = " + input);
				data = input;
			} else {
				iguales = false;
				break;
			}
			input = sc.nextInt();
		} System.out.println("¿Iguales? -> " + iguales);
	}
}
