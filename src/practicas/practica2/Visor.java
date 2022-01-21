package practicas.practica2;
import java.util.ArrayList;

public class Visor {

	public static void array (Boolean [][] t, int gen) {
		System.out.println("Generacion: " + gen);
		System.out.print("_");
		for(int i = 0; i < (t[0].length); i++) {
			System.out.print("___");
		}
		System.out.println();
		for(int i = 0; i < t.length; i++) {
			System.out.print("|" );
			for(int j = 0; j < t[i].length;  j++) {
				if(t[i][j] == true) {
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
