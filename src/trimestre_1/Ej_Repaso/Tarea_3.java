package trimestre_1.Ej_Repaso;
import java.util.Scanner;

/**
 * Programa java en el cual introduces dos valores y
 * busca en el segundo valor si el primero esta
 */
public class Tarea_3 {

	/**
	 * Pre:
	 * Post: Pide dos valores y con un bucle
	 * 		 buscamos el primero en el segundo
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("TXT: ");
		String txt1 = sc.nextLine();
		System.out.print("texto largo: ");
		String txt2 = sc.nextLine();
		boolean very= false;
		for(int i = 0; i < (txt2.length()-txt1.length()); i++) {
			if((txt2.substring(i, (i + txt1.length()))).equals(txt1)) {
				very = true;
			}
		}
		if(very == true) {
			System.out.println("Si lo contiene");
		}else {
			System.out.println("No lo contiene");
		}
	}
}
