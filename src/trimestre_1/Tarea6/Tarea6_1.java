package trimestre_1.Tarea6;
import java.util.Scanner;

public class Tarea6_1 {

	/**
	 * Pre:
	 * Post: programa Java que solicita al 
	 * 		 usuario un número entero positivo
	 * 		 y escribe dicho número con letra
	 * 		 por pantalla. Únicamente debe mostrar
	 * 		 los nombres de los números del 0 al 9,
	 * 		 el resto los mostrará con el nombre “Otros”.
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero entero: ");
		int num1 = sc.nextInt();
		System.out.println("---------");
		if(num1 == 0) {System.out.println("Cero");	//Comprobaciones de numeros
		}else if(num1 == 1) {System.out.println("Uno");
		}else if(num1 == 2) {System.out.println("Dos");
		}else if(num1 == 3) {System.out.println("Tres");
		}else if(num1 == 4) {System.out.println("Cuatro");
		}else if(num1 == 5) {System.out.println("Cinco");
		}else if(num1 == 6) {System.out.println("Seis");
		}else if(num1 == 7) {System.out.println("Siete");
		}else if(num1 == 8) {System.out.println("Ocho");
		}else if(num1 == 9) {System.out.println("Nueve");
		}else {System.out.println("Otros");}
		
	}
}
