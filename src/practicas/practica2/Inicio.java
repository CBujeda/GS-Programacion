package practicas.practica2;
import java.util.Scanner;

public class Inicio {

	public static Boolean[][] genTable(int x, int y) {
		Boolean[][] t = new Boolean[y][x];
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				int a = (int) Math.round(Math.random()*100);
				if(a > 20) {
					t[i][j] = false; 
				}else{
					t[i][j] = true;
				}
			}
		}
		return t;
	}
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		//------------CONFIGURACION-----------
		Boolean mode = false; // false modo usuario normal
		       //mode = true;  // true modo usuario especial
		//--------INTRODUCCION DE DATOS-------
		
		
		//-------------------X--Y---GEN-
		if(mode == true) {
			System.out.println("Vienvenid@ Al modo especial");
			System.out.println("1- Crear la primera generacion. ,.");
			Visor.array(genTable(10,10), 1);
		}
		
	}
	
	
}