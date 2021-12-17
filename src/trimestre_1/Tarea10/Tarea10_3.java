package trimestre_1.Tarea10;
import java.util.Scanner;

/**
 * 
 * Progama java en el cual introduces un numero el cual se multiplicara
 * Con todas las celdas de la tabla
 */
public class Tarea10_3 {
	
	/**
	 * Pre:
	 * Post: Introduce un numero y lo multiplicara a los valores de la rabal 2D
	 * 	 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int t[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		System.out.println("Numero: ");
		int multi = sc.nextInt();
		System.out.println("Multiplicando..");
		for(int i = 0; i < t.length; i++) {	
			for(int j = 0; j < t[i].length;j++) {
				t[i][j] = t[i][j] * multi; // multiplica datos
				System.out.print(t[i][j] + "  |");
			}
			System.out.println();
		}
	}
}
