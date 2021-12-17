package trimestre_1.tarea1;
import java.util.Scanner;

/**
 * 
 * @author USUARIO
 * Implementa un programa Java que PREGUNTE al usuario por dos
 * números enteros (x, y) y muestre por pantalla la suma, resta,
 * multiplicación, división y resto de ambos, con el siguiente formato:
 */
public class Tarea1_5 {

	public static void main(String[] arg) {
	Scanner entrada = new Scanner(System.in);
	int var1 = entrada.nextInt();
	int var2 = entrada.nextInt();
	System.out.println("--------------------------------------------");
	System.out.println(var1 + var2);
	System.out.println(var1 - var2);
	System.out.println(var1 * var2);
	System.out.println(var1 / var2);
	System.out.println(var1 % var2);
	}
}
