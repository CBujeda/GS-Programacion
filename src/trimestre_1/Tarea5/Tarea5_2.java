package trimestre_1.Tarea5;
import java.util.Scanner;

public class Tarea5_2 {
	
	/**
	 * Pre: 
	 * Post: 	programa Java que solicita al usuario 
	 * 			dos números reales y muestra TRUE o FALSE 
	 * 			dependiendo de si ambos están entre 0.0 y 1.0.
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		if(num1 > 0.0 && num1 > 0.0 && num1 < 1.0 && num1 < 1.0 ) {
				System.out.print(true);
		}else {
			System.out.print(false);
		}
	}
}
