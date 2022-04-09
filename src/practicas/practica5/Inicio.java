package practicas.practica5;

import java.util.ArrayList;
import java.util.Scanner;

import trimestre_3.mysql.prueba.MySQLAccess;

public class Inicio {
	
	public static String sc() {
		Scanner sc  = new Scanner(System.in);
		String dato = sc.nextLine();
		return dato;
	}
	
	public static void main(String[] arg) {
		String[] stats = new String[6];
		Screen.view(Animations.charge(), stats);
		SqlAccess bd = new SqlAccess();
		ArrayList<String[]> imgs = null;
		try {
			imgs = bd.getImg();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Screen.space();
		
		Animations.ajustar(stats);
		System.out.print("Ajuste la pantalla posteriormente pulse Enter ");
		sc();
		for(int i = 0; i < 10; i++) {	
			Screen.view(imgs.get(1), stats);
			Screen.sleep(100);
			Screen.space();
			Screen.view(imgs.get(2), stats);
			Screen.sleep(100);
			Screen.space();
		}
		
		while(true) {
			Screen.space();
			Screen.viewComment(imgs.get(3), stats, "Elije una opcion");
			String dat = sc();
			if(dat.equalsIgnoreCase("3")) {
				break;
			} else if (dat.equalsIgnoreCase("1")) {
				Game.start(imgs, stats);
			} else if (dat.equalsIgnoreCase("2")) {
				
			}
		}
	}
}
