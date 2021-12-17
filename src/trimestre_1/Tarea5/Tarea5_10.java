package trimestre_1.Tarea5;
import java.util.Scanner;

public class Tarea5_10 {
	/**
	 * Pre:
	 * Post: Programa que suma todos digitos de un 
	 * 		 numero entre ellos
	 */
	
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		int i = 0;
		int data = 0;
		int salida = 0;
		while(i< num1.length()) {

		String process = num1.substring(0+i,1+i);
		data = Integer.parseInt(process);
		salida = data + salida;	
		i++;
		}
		System.out.print("-----------");
		System.out.println(salida);
		
		
		
	}
}
