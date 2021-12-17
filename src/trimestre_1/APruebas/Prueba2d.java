package trimestre_1.APruebas;

import java.util.Scanner;

public class Prueba2d {

	private static void mostrar(String[][] t) {
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				System.out.print("| " + t[i][j] + " |");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String[][] t = new String [5][5];
		
		for(int i = 0; i <t.length; i++) {
			for(int j = 0; j < t[i].length;j++) {
				t[i][j] = sc.nextLine();
			}
			System.out.println("----------------");
		}
		mostrar(t);
	}
}
