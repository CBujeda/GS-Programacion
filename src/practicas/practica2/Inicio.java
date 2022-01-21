package practicas.practica2;
import java.util.Scanner;

public class Inicio {

	public static boolean[][] genTable(int x, int y) {
		boolean[][] t = new boolean[y][x];
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
		boolean mode = false; // false modo usuario normal
		       //mode = true;  // true modo usuario especial
		//------------COMPROBANTES--------------
		boolean vivas = false; //Dicha variable combrueba si hay celulas vivas en cada generacion
		
		//------------Variables de entrada--------
		String eStr = "";
		int eInt = 0;
		//--------INTRODUCCION DE DATOS-------	
		while(true) {
			boolean[] compr = new boolean[9];
			eStr = "";
			eInt = 0;
			int x = 0;
			int y = 0;
			int gens = 0;
			for(int i = 0; i< 3; i++) {
				while(true) {
					if(i == 0) {System.out.println("Introduce el numero de celdas en x");
					}else if(i == 1) {System.out.println("Introduce el numero de celdas en y");
					}else if(i == 2) {System.out.println("Numero de generaciones?");}
					eInt = sc.nextInt();
					if(eInt >= 0) {
						if(i == 0) {x = eInt;
						}else if(i == 1) {y = eInt;
						}else if(i == 2) {gens = eInt;}
						break;
					}
				}
			}
			if(x > 0 && y > 0) {
				if(gens > 0) {
					if(mode == false) {
						
						System.out.println("Generando primera generacion");
						boolean[][] t1 = genTable(x,y);
						boolean[][] t2 = t1;
						//Visor.array(genTable(x,y), 1);
						for(int i = 0; i< gens;i++) {
							for(int j = 0; j < t1.length; j++) {
								for(int r = 0; r < t1[j].length; r++) {
									
									for(int d = 0; d < compr.length; d++) {
										compr[d] = true;
									}
									compr[5] = false;
									// Lados
									if((j-1) < 0) {   // comprobador arriba						
										compr[7] = false; // Lado 8
										compr[6] = false; // Esquina 7
										compr[8] = false; // Esquina 9
									}
									if(j + 1 > t1.length) { //comprobador abajo 
										compr[1] = false; // Lado 2
										compr[0] = false; // Esquina 1
										compr[2] = false; // Esquina 3
									}
									if(r-1 < 0) { //comprobador izqierda
										compr[3] = false; // Lado 4
										compr[6] = false; // Esqina 7
										compr[0] = false; // Esqina 1
									}
									if(r+1 > t1[j].length) {  //comprobador derecha
										compr[5] = false; // Lado 6
										compr[8] = false; // Esquina 9 
										compr[2] = false; // Esquina 3
									} 
									
									for(int d = 0; d < compr.length; d++) {
										if(compr[d] == true) {
											if(d == 1){
												if(t1[j + 1][r - 1] == true) { compr[0] = true;
												} else { compr[0] = false; }
											}else if(d == 2){
												if(t1[j + 1][r] == true) { compr[1] = true;
													} else { compr[1] = false; }
											}if(d == 3){
												if(t1[j + 1][r + 1] == true) { compr[2] = true;
												} else { compr[2] = false; }
											}if(d == 4){
												if(t1[j][r - 1] == true) { compr[3] = true;
												} else { compr[3] = false; }
											}if(d == 6){
												if(t1[j][r + 1] == true) { compr[5] = true;
												} else { compr[5] = false; }
											}if(d == 7){
												if(t1[j - 1][r - 1] == true) { compr[6] = true;
												} else { compr[6] = false; }
											}if(d == 8){
												if(t1[j - 1][r] == true) { compr[7] = true;
												} else { compr[7] = false; }
											}if(d == 9){
												if(t1[j - 1][r + 1] == true) { compr[8] = true;
												} else { compr[8] = false; }
												
											}
										}
									}
								}	
							}
						}
					}else if (mode == true){
						System.out.println("Vienvenid@ Al modo especial");
						System.out.println("1- Crear la primera generacion. ,.");
						//-------------------X--Y---GEN-
						Visor.array(genTable(10,10), 1);
					}	
				} else {
					System.out.println("Ya que no hubo una primera generacion no nacio ninguna celula");
				}			
			} else {
				if(gens > 0) {
					System.out.println("Al no tener espacio no nacio ninguna celula");
				} else {
					System.out.println("Al no tener ni espacio ni tiempo ninguna celula nacio");
				}			
			}
			System.out.println("Quieres salir o continuar? S/C");
			while(true) {
				eStr = sc.next();
				if(eStr.equalsIgnoreCase("C") || eStr.equalsIgnoreCase("S")) {break;}
				System.out.println("Valor invalido");
			}
			if(eStr.equalsIgnoreCase("S")) {break;}
			
		}

	}	
}