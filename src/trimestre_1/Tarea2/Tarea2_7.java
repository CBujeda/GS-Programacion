package trimestre_1.Tarea2;
import java.util.Scanner;

public class Tarea2_7 {
	/**
	 * pre: 
	 * Post: Pide un numero y muestra la tabla de multipicar de este 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa numero a multiplicar: ");
		int var = sc.nextInt();
		int i = 0;
		System.out.println("-----------------------------");
		while( i <= 10) {
			System.out.println(var + " x " + i + " = " + (var * i));
			i++;
		}
	}
}
