package trimestre_1.Tarea5;
import java.util.Scanner;

public class Tarea5_8 {
	/**
	 * Pre:
	 * Post: Programa Java que genera números
	 * 		 randoms entre N y M (incluidos).
	 * 		 Los valores de N y M son números
	 * 		 enteros introducidos por el usuario.
	 * 
	 */
	
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();//Dato1
		double num2 = sc.nextDouble();//Dato2
		System.out.println(Math.floor(Math.random()*(num2-num1+1)+num1)); //Dato Random
	
		
	}
}

// Nota Bibliografia: http://chuwiki.chuidiang.org/index.php?title=Generar_n%C3%BAmeros_aleatorios_en_Java