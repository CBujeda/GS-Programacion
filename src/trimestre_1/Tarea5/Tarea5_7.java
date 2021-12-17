package trimestre_1.Tarea5;
import java.util.Scanner;


public class Tarea5_7 {
	/**
	 * Pre:
	 * Post: Programa Java que detecta si el
	 * 		 número entero introducido por el
	 * 		 usuario es un “Número Feo”. Los
	 * 		 números feos son aquellos enteros
	 * 		 positivos cuyos únicos factores
	 * 		 primos son 2, 3 o 5. Por convención
	 * 		 el 1 está incluido. Los primeros 10 números
	 * 		 feos son los siguientes: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12.
	 */
	
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double resto = 0;
		while(true) {			//Bucle 1
			resto = num%2;
			if(resto !=0) {		//comprobacion resto
				break;
			}else {
				num /=2;
			}	
		}
		while(true) {			//Bucle 2
			resto = num%3;
			if(resto !=0) {		//comprobacion resto
				break;
			}else {
				num /=3;
			}	
		}
		while(true) {			//Bucle 3
			resto = num%5;
			if(resto !=0) {		//comprobacion resto
				break;
			}else {
				num /=5;
			}	
		}
		if(num == 1) {
			System.out.println("Es feo");
		}
		
	}
}
