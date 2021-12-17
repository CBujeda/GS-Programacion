package trimestre_1.Tarea6;
import java.util.Scanner;

public class Tarea6_3 {
	/*
	 * Pre:
	 * Post: Programa Java que solicite al usuario
	 * 		 un entero N y escriba el siguiente patrón por pantalla: ********
	 * 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int i = 0;
		int i2 = 0;
		int inp2 = inp;
		while(i < inp) {
				while(i2 < inp2) {
					System.out.print("*");
					i2++;
				}
			System.out.println("");
			i2 = 0;
			inp2--;
			i++;
		}
	}
}
