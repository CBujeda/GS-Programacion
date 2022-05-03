package practicas.practica6;

import java.util.Scanner;

public class Inicio {
	
	/**
	 * Pre: 
	 * Post: Metodo el cual Solicita un dato int y lo devuelve
	 */
	public static int scInt() {
		Scanner sc = new Scanner(System.in);
		int data = 0;
		try {
			data = sc.nextInt();
		} catch (Exception e) {
			System.out.println("[ERROR] [Solicitud int] ("+e.toString()+")");
			System.out.print("Reescribe el dato: ");
			data = scInt();
		}
		return data;
	}

	/**
	 * Pre: 
	 * Post: Metodo el cual solicita un dato String y lo devuelve
	 */
	public static String scStr() {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		if(data.equalsIgnoreCase("")) {
			data = scStr();
		}
		return data;
	}

	/**
	 * Pre: 
	 * Post: Metodo el cual hace una pausa de los milisegundos que le indiquen
	 */
	public static void sleep(int milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Pre: 
	 * Post: Metodo el cual hace tantos espacios cono se le indiquen
	 */
	public static void spaces(int lines) {
		for(int i = 0; i < lines; i++) {
			System.out.println();
		}
	}

	/**
	 * Pre: 
	 * Post: Metodo el cual hace tantos puntos como se le indiquen
	 */
	public static void puntos(int cantidad) {
		for(int i = 0; i < cantidad; i++) {
			System.out.print(".");
			sleep(15);
		}
	}

	/**
	 * Pre: 
	 * Post: Metodo inicial el cual llama a principal
	 */
	public static void main(String[] main) {
		
		System.out.println(
				"  __    ____  ___   ___   ___   _     ____  ___  _____  ___  \r\n"
				+ " / /\\  | |_  | |_) / / \\ | |_) | | | | |_  | |_)  | |  / / \\ \r\n"
				+ "/_/--\\ |_|__ |_| \\ \\_\\_/ |_|   \\_\\_/ |_|__ |_| \\  |_|  \\_\\_/ ");
		sleep(1000);
		System.out.print("Iniciando");
		puntos(50);
		System.out.println();
		Principal.inicio();
	}
}
