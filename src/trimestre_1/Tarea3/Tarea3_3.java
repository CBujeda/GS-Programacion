package trimestre_1.Tarea3;
import java.util.Scanner;

public class Tarea3_3 {
	/**
	 * Pre:
	 * Post: Lee todos los valores numericos que
	 * 		 introduzcas hasta que introduzcas un 
	 * 		 numero negativo entonces el programa
	 * 		 te mostrara cuantos numeros has introducido
	 */
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int nums = 0;
		double input = 0;
		while(i < 1) {
			input = sc.nextDouble();
			if(input < 0) {
				i++;
				System.out.println(nums);
			}else {
				nums++;
			}
			
		}
	}
}
