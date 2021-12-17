package trimestre_1.Tarea4;
import java.util.Scanner;

public class Tarea4_4 {

	/**
	 * Pre: 
	 * Post: Programa Java que pregunta al usuario por 2 
	 * 		 numeros, y muestra por pantalla todos los numeros 
	 * 		 situados entre ambos
	 * 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Num1: ");
		int ia = sc.nextInt();
		System.out.print("Num2: ");
		int ib = sc.nextInt();
		System.out.println("---------------------------");
		for(int i = ia; i < (ib + 1); i++) {
			System.out.print(i + " ");
		}
		
		
		
	}
}
