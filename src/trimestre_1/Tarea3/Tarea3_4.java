package trimestre_1.Tarea3;
import java.util.Scanner;

public class Tarea3_4 {
	
	/**
	 * MINIJUEGO!
	 * 
	 * Pre:
	 * Post: Este programa crea un numero random, 
	 * 		 seguidamente te pedira que adivines 
	 * 		 el numero random si te equivocas el 
	 * 		 programa te dara una pista de si es 
	 * 		 mayor o menor el numero. Cuando 
	 * 		 adivines el numero terminara el programa.
	 * 		 A parte el programa guardara el numero
	 * 		 de intentos para posteriormente mostrarlo
	 */  
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int random = (int) (((double) Math.random()*10 + 1) 
				+ ((double) Math.random()*10 + 1));
		int i = 0;
		int input = 0;
		int num = 0;
		while(i < 1) {			//bucle
			input = sc.nextInt();
			if(random < input) {
				System.out.println("El numero " + input +" es demasiado grande" );
				num++;
			}else if(random > input) {
				System.out.println("El numero " + input +" es demasiado pequeño" );
				num++;
			}else if (random == input) {	//Finalizacion del bucle
				num++;
				System.out.println("-----------------------------------------");
				System.out.println("El numero " + input + " introducido es correcto");
				System.out.println("Lo consegiste unicamente en " + num + " intentos");
				i++;
			}

		}
		
	}
}
