package trimestre_1.Tarea4;
import java.util.Scanner;

public class Tarea4_8 {

	/**
	 * Pre:
	 * Post: Programa Java que pregunta al usuario 
	 * 		 por 10 numeros enteros y muestra por 
	 * 		 pantalla el numero mayor y el menor 
	 * 		 de todos los introducidos
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int may = num;
		int men = num;
		for(int i = 0; i < 10; i++) {
			num = sc.nextInt();
			if(may < num) {
				may = num;
			}else if(num < men) {
				men = num;
			}
		}
		System.out.println("----------------------------");
		System.out.println("Menor:" + men + " Mayor: " + may);
	}
}
