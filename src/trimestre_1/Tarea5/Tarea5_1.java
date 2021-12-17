package trimestre_1.Tarea5;
import java.util.Scanner;

public class Tarea5_1 {
	
	/**
	 * Pre:
	 *	Post: programa Java que acepta 4 enteros por parte del usuario 
	 *		  y muestra por la consola la palabra “Igual”
	 *			 si los 4 enteros son iguales. 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		//Operaciones de inicio
		int input = sc.nextInt(); // 1 Solicitud
		int data = input;		  // dato de respaldo
		int igu = 0;			  // Contador
		for(int i = 1; i <= 3; i++) {	 //bucle
			if(input == data) {			//Comparaciones de igualdades
				igu++;					//aumenta el el contador
				data = input;			//actualizacion del dato de respaldo
			}
			input = sc.nextInt();
		}
		if(igu == 3) {					// Si el contador es igual al maximo 			
			System.out.println("Igual");//		del bucle devuelve el igual
		}
	}
}
