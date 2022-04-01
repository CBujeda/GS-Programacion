package practicas.practica5;

import java.util.Scanner;

public class Inicio {
	
	public static String sc() {
		Scanner sc  = new Scanner(System.in);
		String dato = sc.nextLine();
		return dato;
	}
	
	public static void main(String[] arg) {
		
		String[] stats = new String[6];
		
		Animations.ajustar(stats);
		System.out.print("Ajuste la pantalla posteriormente pulse Enter ");
		sc();
		while(true) {
			Screen.limpiador(Screen.rAlto()+4);
			String dat = sc();
			if(dat.equalsIgnoreCase("exit")) {
				break;
			}
		}
	}
}
