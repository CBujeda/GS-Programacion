package trimestre_1.Tarea4;
import java.util.Scanner;

public class Tarea4_7 {

	/**
	 * Pre:
	 * Post: Programa Java que pregunta al usuario
	 * 		 por un numero entero y muestre por 
	 * 		 pantalla su tabla de multiplicar
	 * 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < 10; i++) {
			System.out.println(num + " x " + (i + 1) + 
					" = " + " " + (num * (i + 1)));
		}
	}
}
