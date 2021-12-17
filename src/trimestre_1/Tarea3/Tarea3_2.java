package trimestre_1.Tarea3;
import java.util.Scanner;

public class Tarea3_2 {
	/**
	 * Pre:
	 * Post:El programa leera los numeros a 
	 * 		introducir y dira si es negativo 
	 * 		o postivo hasta que introduzcas un 0
	 * 
	 */
	
	private static void ticket( double imput) { //el metodo ticket se encarga de comprobar
		if(imput > 0) {
			System.out.println("El numero es mayor a 0");		
		}else if(imput < 0) {
			System.out.println("El numero es menor a 0");
		}else {
			System.out.println("El numero es 0");
		}
		
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		double imput = 1;
		int i = 0;
		while(i < 1) {
			if(imput == 0) {
				i = 1;
			}else {
				imput = sc.nextDouble();
				ticket(imput);
			}
		}
	}
}
