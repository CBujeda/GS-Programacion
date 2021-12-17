package trimestre_1.Tarea2;
import java.util.Scanner;

public class Tarea2_9 {
	/**
	 * Pre:
	 * Post: Muesta el numero de 0s y el numero
	 * 		 de mayores y menores que 0 entre 10
	 *  	 numeros previamente introducidos
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		//VARIABLES
		int cont0 = 0;
		int cmen = 0;
		int cmay = 0;
		int n1;
		int i = 0;
		
		//Programa
		while(i < 10) {
			System.out.print(i + ": "); n1 = sc.nextInt();
			if (n1 == 0) {cont0++;}
			if (n1 > 0) {cmay++;}
			if (n1 < 0) {cmen++;}	
			i++;
		}
		System.out.println("NºMenores: " + cmen + " NºCeros: " 
				+ cont0 + " NºMayores: " + cmay);
	}
}
