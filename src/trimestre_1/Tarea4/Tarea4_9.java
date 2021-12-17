package trimestre_1.Tarea4;
import java.util.Scanner;

public class Tarea4_9 {
	
	/**
	 * Pre:
	 * Post: Programa Java que pregunta al usuario
	 * 		 por 10 números enteros y muestre por
	 * 		 pantalla el número total de veces que
	 * 		 el usuario ha introducido el 0, el número
	 * 		 total de enteros mayores que 0 introducidos
	 * 		 y el número total de enteros menores que 0 introducidos. 
	 * 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num;
		int zero = 0;
		int may = 0;
		int men = 0;
		for(int i = 0; i < 10; i++) {
			num = sc.nextInt();
			if(num == 0) {zero++;
			}else if(num < 0) {men++;
			}else if(num > 0) {may++;
			}
		}
		System.out.println("Ceros: " + zero);
		System.out.println("Mayores: " + may);
		System.out.println("Menores: " + men);
	}
}
