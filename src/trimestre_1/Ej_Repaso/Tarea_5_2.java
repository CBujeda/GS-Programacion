package trimestre_1.Ej_Repaso;
import java.util.Scanner;

public class Tarea_5_2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();	
		String compare = "";
		int cont = 0;
		for(int i = 0; i < txt.length(); i++) {
			if(!compare.contains(txt.substring(i, i+1))){
				for(int j = 0; j < txt.length(); j++) {
					if(txt.substring(i, i+1).equals(txt.substring(j, j+1))) {
						cont ++;
					}
				}
				System.out.println(txt.substring(i, i+1) + ": " + cont + " | ");
				cont = 0;
			}
			compare = compare + txt.substring(i, i+1);
		}
	}
}
