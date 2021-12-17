package trimestre_1.Tarea6;
import java.util.Scanner;

public class Tarea6_2 {
	/**
	 * Pre:
	 * Post: Escribe un programa Java que muestre los números
	 *  	 del 1 al 110, con 11 números por línea. El programa
	 *  	 deberá escribir por pantalla “Coza” en lugar de los
	 *  	 números múltiplos de 3, “Loza” en lugar de los números
	 *  	 múltiplos de 5, “Woza” en lugar de los números múltiplos
	 *  	 de 7 y “CozaLoza” en lugar de los números múltiplos de 3
	 *  	 y 5. El resultado debe   ser similar al siguiente:
	 *  	  1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
	 *  	  Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
	 *  	  23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
	 *  	 ......
	 */
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int once = 1;
		for(int i = 1; i< 111;i++){

			if(i%3 == 0 & i%5 == 0 ) {System.out.print("CozaLoza  ");//Condiciones pa saber multiplos
			}else if(i%3 == 0) {System.out.print("Corza ");
			}else if(i%5 == 0){System.out.print("Lorza ");
			}else if(i%7 == 0) {System.out.print("Worza ");
			}else {System.out.print(i + " ");}
			if(i == 11*once) {System.out.println();once++;}//cada 11 tira una pa abajo
			
		}
		
		
		
	}
}
