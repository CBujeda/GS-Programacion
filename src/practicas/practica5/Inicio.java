package practicas.practica5;

import java.util.ArrayList;
import java.util.Scanner;

import trimestre_3.mysql.prueba.MySQLAccess;

public class Inicio {
	
	/**
	 * Pre:
	 * Post: Metodo el cual solicita una entrada al usuario de tipo string
	 */
	public static String sc() {
		Scanner sc  = new Scanner(System.in);
		String dato = sc.nextLine();
		return dato;
	}
	
	/**
	 * Pre: 
	 * Post:  Metodo el cual solicita una entrada al usuario de tipo int
	 */
	public static int scInt() {
		Scanner scInt  = new Scanner(System.in);
		int dato = 0;
		while(true) {
			try {
				System.out.print("[ENTERO]> ");
				dato = scInt.nextInt();
				break;
			}catch (Exception e) {
				System.out.println("[ADVERTENCIA] Valor erroneo");
			}
		}
		return dato;
	}
	
	/**
	 * Pre:
	 * Post: Metodo principal el cual ejecuta todas las acciones del programa asi como
	 * 		 el menu principal
	 */
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
				AddData.inicio(imgs,stats);
			}
		}
	}
}
