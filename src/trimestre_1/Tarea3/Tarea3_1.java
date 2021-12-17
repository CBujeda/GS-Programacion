package trimestre_1.Tarea3;
import java.util.Scanner;

public class Tarea3_1 {
	/**
	 * pre:
	 * post:El metodo cuadrado devuelve el cuadrado 
	 * 		de un numero en double previamente introducido
	 */
	private static double cuadrado(double a) {
		return a * a;
	}
	
	
	/**
	 * pre:
	 * post:El metodo main solicita un numero de tipo 
	 * 		double para mostrar su cuadrado por pantalla
	 * 		si se diera el caso que la introducion es 
	 * 		menor que 0 termina el programa
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		double i = 20;
		double input;
		while(i > 0) {			
			input = sc.nextDouble();
			i = input;
			if(i > 0) {								//Condicion de respuesta a menor a 0
				input = cuadrado(input);
				System.out.println("-----------");
				System.out.println(input);
			}else {
				System.out.println("---------------------------");
				System.out.println(i + " no es un valor valido");
			}			
		}
	}
}
