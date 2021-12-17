package trimestre_1.Ej_Repaso;
import java.util.Scanner;

public class Tarea_5 {
	// No funciona ir a 5_2 sugerencia de profesor
	private static void mostrar(int[] t) {
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " | ");
		}
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		int[]cont = new int [txt.length()];
		String info = "";
		for(int i = 0; i < txt.length();i++) {
			System.out.println(txt.substring(i, i+1));
			for(int j = 0; j < txt.length(); j++) {
				if(txt.substring(i, i+1).equals(txt.substring(j, j+1))) {
					cont[i]++;
					txt = txt.substring(0, j) + txt.substring((j + 1), txt.length());
					System.out.println(txt);
				}
			}
			info = txt.substring(i, i+1) + ":" + cont[i];
			System.out.println();	
		}
		mostrar(cont);
		System.out.println(info);
	}
}
