package trimestre_1.tarea1;
import java.util.Scanner;
/**
 * 
 * @author Clara
 * Implementa un programa Java que PREGUNTE al usuario por dos
 * números enteros (x, y) y muestre por pantalla la suma de ambos.
 */
public class Tarea1_4 {


		

	public static void main(String[] arg) {
	System.out.print("Num1: ");

	Scanner entrada = new Scanner(System.in);
	int var1 = entrada.nextInt();

	
	System.out.println(" + ");
	
	System.out.print("Num2: ");
	int var2 = entrada.nextInt();

	
	
	System.out.println("----------------------------------------");
	System.out.println(" ");
	int var3 = var1 + var2;
	System.out.println("= " + var3);
	
	
	

		
	}
	
}
