package trimestre_1.Ej_Repaso;
import java.util.Scanner;

/**
 * Progra a java el cual quita las "b" y las "ac" de un texto 
 */
public class Tarea_4_4 {
	
	/**
	 * Pre:
	 * Post: Pide un string del cual eliminara
	 * 		 las "b" y las "ac" con dos for y substring
	 */
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		String salida = txt;

		for(int i = 0; i < (salida.length()); i++) {
			System.out.print((salida.substring(i, (i+1))));
			if((salida.substring(i, (i+1))).equals("b")) {
				salida  = salida.substring(0,i) + salida.substring((i + 1) , salida.length());
			}
		}
		System.out.println();
		for(int i = 0; i < (salida.length() - 1); i++) {
			System.out.print((salida.substring(i, (i+2))) + "-");
			if((salida.substring(i, (i+2))).equals("ac")) {
				salida  = salida.substring(0,i) + salida.substring((i + 2) , salida.length());
			}

		}
		System.out.println("\n"
				+ "---------------------------\n"
				+ "Texto Saliente: \n"
				+ salida);	
	}

}
