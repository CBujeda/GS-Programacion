package trimestre_1.tarea1;
import java.util.Scanner;
/**
 * Implementa un programa Java que PREGUNTE al usuario por un número
 *entero (x) y muestre por pantalla su tabla de multiplicar,
 */
public class Tarea1_6 {
	/*
	 * Pre: ---
	 * Post: Tabla multiplicar
	 */
	public static void main(String[] arg ) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Num: ");
		int var1 = entrada.nextInt();
		System.out.println("-------------------");
		System.out.println(var1 * 1);
		System.out.println(var1 * 2);
		System.out.println(var1 * 3);
		System.out.println(var1 * 4);
		System.out.println(var1 * 5);
		System.out.println(var1 * 6);
		System.out.println(var1 * 7);
		System.out.println(var1 * 8);
		System.out.println(var1 * 9);
		System.out.println(var1 * 10);
		
		
	}
}
