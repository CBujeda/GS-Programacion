package trimestre_1.Tarea2;
import java.util.Scanner;

public class Tarea2_4 {
	/**
	 * pre:
	 * post: Pide 2 numeros y mostrara por consola
	 * 		 Todos los numeros entre estos dos
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Num1:");
		int num1 = sc.nextInt();
		System.out.print("Num2:");
		int num2 = sc.nextInt();
		//while(num1 != (num2 + 1)) {
		num1 = num1 + 1;
		while(num1 < num2) {
			System.out.print(num1 + " ");
			num1++;
		}
	}
}
