package trimestre_1.APruebas;

import java.util.Random;
import java.util.Scanner;

public class MgaSimplejava {
	private static void limpiar() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
	
	private static void mostrar(String[][] t, String tipo, int puser, int puntosPc) {
		System.out.println("Eres: " + tipo + " | "
				+ "Puntos: " + puser + " | "
				+ " Puntos PC:" + puntosPc
				+ "\n\n");
		System.out.print(" ");
		for(int d = 0; d < t.length; d++) {
			System.out.print("-" + d + "-");
		}
		System.out.println();
		for(int i = 0; i < t.length; i++) {
			System.out.print(i);
			for(int j = 0; j < t[i].length; j++) {
				System.out.print(" " + t[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static String[][] ctablero(int alt, int anc){
		String[][] t = new String[alt][anc];
		// linea 1 5
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++) {
				if(i == 0 ) {
					t[i][j] = "O";
				}else if( i == t.length - 1){
					t[i][j] = "X";
				}else {
					t[i][j] = "-";
				}
			}
		}
		return t;
	}
	
	
	public static void main(String[] arg) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Configura tu minijuego: ");
		System.out.print("Altura:");
		int alt = sc.nextInt();
		System.out.print("Anchura:");
		int anc = sc.nextInt();
		if(anc > 10 || alt > 10 || anc < 5 || alt < 5) {
			while(true) {
					System.out.println("La altura y anchura debe comprender entre 5 y 10");
					System.out.print("Altura:");
					alt = sc.nextInt();
					System.out.print("Altura:");
					anc = sc.nextInt();
					if(anc < 10 || alt < 10 || anc > 5 || alt > 5) { break;}
			}
		}
		System.out.println("Deseas ser (X) o (O)");
		sc.nextLine();
		String tipo = sc.nextLine();
		
		if(!tipo.equalsIgnoreCase("x") ) {
			if( !tipo.contentEquals("o")) {
				while(true) {
					System.out.println("Elige entre (X) o (O)");
					tipo = sc.nextLine();
						if(tipo.equalsIgnoreCase("x") || tipo.contentEquals("o")) { break;}
				}
			}
		}
		String[][] tablero = new String [alt][anc];
		tablero = ctablero(alt,anc);
		int x = -1;
		int y = -1;
		int puntosUse = 0;
		int puntosPc = 0;
		int pcx = -1;
		int pcy = -1;
		
		while(true) {
			limpiar();
			mostrar(tablero, tipo, puntosUse,puntosPc);
			//System.out.println("Te toca mover pieza: ");
			while(true) {
				//System.out.println("Elije pieza:");
				x = (int) (Math.random()*tablero[1].length);
				y = (int) (Math.random()*tablero.length);
				if(tablero[y][x].equalsIgnoreCase(tipo)) {
					tablero[y][x] = "-";
					break;
				}else {
					//System.out.println("En la posicion " + x + " " + y + " no hay una pieza tuya");
				}
			}
			while(true) {
			//System.out.println("Elije celda a mover:");
			x = (int) (Math.random()*tablero[1].length);
			y = (int) (Math.random()*tablero.length);
				if(tablero[y][x].equalsIgnoreCase(tipo)) {
					//System.out.println("No puedes comerte a ti mismo");
				}else {
					if(tipo.equalsIgnoreCase("x")) {
						if(tablero[y][x].equalsIgnoreCase("o")) {puntosUse++;}
					}
					if(tipo.equalsIgnoreCase("o")) {
						if(tablero[y][x].equalsIgnoreCase("x")) {puntosUse++;}
					}
					if(tipo.equalsIgnoreCase("x")) {tablero[y][x] = "X";}
					if(tipo.equalsIgnoreCase("o")) {tablero[y][x] = "O";}
					break;
				}
			}
				pcx = (int) (Math.random()*tablero[1].length);
				pcy = (int) (Math.random()*tablero.length);
				//System.out.println("XPC" + pcx + "YPC" + pcy );
				if(tablero[pcy][pcx].equalsIgnoreCase(tipo)) {
					puntosPc++;	
				}
				if(tipo.equalsIgnoreCase("x")) {tablero[pcy][pcx] = "O";}
				if(tipo.equalsIgnoreCase("o")) {tablero[pcy][pcx] = "X";}
				
				Thread.sleep(10);
		}
	}
}
