package trimestre_1.ED;
import java.util.Scanner;
/**
 * 
 * Das dos valores y te da la suma y la resta de estos
 *
 */
public class Inicio {
	/**
	 * Pre:
	 * Post: Das dos valores y devuelve la suma y la resta
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
			System.out.println("Suma: " + math.suma(num1, num2));
			System.out.println("Resta: " + math.resta(num1, num2));
		
		
	}
}
