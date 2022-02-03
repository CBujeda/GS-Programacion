package practicas.practica2;
import java.util.Scanner;
import java.util.ArrayList;
public class Inicio {

	/**
	 * Pre: 
	 * Post: Generador de la tabla inicial crea una 
	 * 		 tabla booleana en el cual de forma aleatoria
	 * 		 se generaran un maximo del 20% de celulas (true)
	 */
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
	
	/**
	 * Pre:
	 * Post: Metodo principal el cual contiene las condiciones
	 * 		 , las tablas y arrayList del programa ademas muestra 
	 * 		 dicho programa
	 */
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Tripleta> lista = new ArrayList<Tripleta>();
		//------------Variables de entrada--------
				String eStr = "";
				int eInt = 0;
		//------------CONFIGURACION-----------
		boolean mode = false; 
		int prueba = 0; 
		while(true) {
			System.out.println("Desea usar el modo de prueba?");
			System.out.println("S para iniciarlo cualquier otra tecla para salir");
			eStr = sc.next();
			if(eStr.equalsIgnoreCase("S")) {
				mode = true;
				System.out.println("----------MODO PRUEBA---------");
				System.out.println("- 0 = Preba de cuadrado ");
				System.out.println("- 1 = Prueba de tres");
				System.out.println("- 2 = Prueba de Cuadrado doble");
				System.out.println("Si se pulsa cualquier otra tecla modo normal");
				
				prueba = sc.nextInt();
				Visor.limpiar(10);
				break;
			}else {
				mode = false;
				break;
			}
		}
		
		boolean coloniaExtinta = false;
		
		if(mode == true) {
			if(prueba != 0 && prueba != 1 && prueba != 2) {
				System.out.println("ERROR LA OPCION DE MODO NO ES VALIDA");
				System.out.println("Se usara la opcion de modo false para ejercer la ejecucion");
				System.out.println("mode = false");
				mode = false;
			}
		}
		
		//--------INTRODUCCION DE DATOS-------	
		while(true) {
			boolean[] compr = new boolean[8];
			eStr = "";
			eInt = 0;
			int x = 0;
			int y = 0;
			int gens = 0;
			if(mode == true) {
				gens = 30;
				x = 20;
				y = 20;
			}
			if(mode == false) {
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
			} else {
				System.out.println("Cargando modo de pruebas....");
			}
			if(x > 0 && y > 0) {
				if(gens > 0) {
						System.out.println("Generando primera generacion");			
						boolean[][] t1 = null;
						if(mode == true) {
							if(prueba == 0) {
								 t1 = Generador_Pruebas.celsCuatro();
							}else if(prueba == 1) {
								 t1 = Generador_Pruebas.celsTres();
							}else if(prueba == 2) {
								 t1 = Generador_Pruebas.celsDobleCuadrado();
							}
						} else {
							 t1 = genTable(x,y); 
						}
						//Igualo t2 a t1
						boolean[][] t2 = new boolean[t1.length][t1[0].length];
						for(int g = 0; g < t1.length; g++) {
							for(int h = 0; h < t1[g].length; h++) {
								t2[g][h] = t1[g][h];
							}
						}
						int vivCels = 0;
						// Bucle de generaciones
						for(int i = 0; i< gens;i++) {
							vivCels = 0;
							// Actualizo t1
							for(int g = 0; g < t1.length; g++) {
								for(int h = 0; h < t1[g].length; h++) {
									t1[g][h] = t2[g][h];
									if(t1[g][h] == true) {vivCels++;}		
								}
							}
							// Rompedor si las celulas vivas son 0
							if(vivCels == 0) {
								System.out.println("Al haber 0 celulas vivas se interrumpio el programa");
								System.out.println("Colonia Extingida");
								coloniaExtinta = true;
								break;
							}
							// Tripleta añadir
							if(i == 0) {
								lista.add(new Tripleta(i,vivCels,0));
							}else {
								lista.add(new Tripleta(i,vivCels,lista.get(lista.size()-1).getAutomatas()));
							}
							
							
							// Muestro t1
							Visor.array(t1, i);
							
							// Recorredor de tablas
							for(int j = 0; j < t1.length; j++) {
								for(int r = 0; r < t1[j].length; r++) {
									// Dicho for evita errores de pase
									for(int z = 0; z < compr.length; z++) {
										compr[z] = false;
									}
									// Validador de celdas y automatas
									if(Validador.esCeldaValida((j + 1), (r - 1), t1)) { // Celda 1
										if(t1[j + 1][r - 1] == true) {compr[0] = true;
										} else { compr[0] = false;}
									} else { compr[0] = false;}

									if(Validador.esCeldaValida(j + 1, r, t1)) { // Cleda 2
										if(t1[j + 1][r] == true) {compr[1] = true;
										} else { compr[1] = false;}	
									} else { compr[1] = false; }
									
									if(Validador.esCeldaValida(j + 1, r + 1, t1)) { // celda 3
										if(t1[j + 1][r + 1] == true) {compr[2] = true;
										} else { compr [2] = false;}
									} else { compr[2] = false;}
									
									if(Validador.esCeldaValida(j, r - 1 , t1)) { // celda 4
										if(t1[j][r - 1] == true) {compr[3] = true;
										} else { compr[3] = false; }
									} else { compr[3] = false; }

									if(Validador.esCeldaValida(j, r + 1, t1)) { // celda 6
										if(t1[j][r + 1] == true) {compr[4] = true;
										} else { compr[4] = false;}
									} else { compr[4] = false;}
									
									if(Validador.esCeldaValida(j - 1, r - 1, t1)) { // celda 7
										if(t1[j - 1][r - 1] == true) {compr[5] = true;
										} else { compr[5] = false;}
									} else { compr[5] = false;}

									if(Validador.esCeldaValida(j - 1, r, t1)) { // celda 8
										if(t1[j - 1][r] == true) {compr[6] = true;
										} else { compr[6] = false;}
									} else { compr[6] = false;}

									if(Validador.esCeldaValida(j - 1, r + 1, t1)) { // celda 9
										if(t1[j - 1][r + 1] == true) {compr[7] = true;
										} else { compr[7] = false;}
									} else {compr[7] = false;}
									
									//contador de automatas:
									int totAut = 0;
									for(int z = 0; z < compr.length; z++) {
										if(compr[z] == true) {totAut++;}	
									}
									
									// Condiciones
									if(t1[j][r] == true) {
										if(totAut < 2) {
											t2[j][r] = false;
										}else if(totAut >= 2 && totAut <= 3) {
											t2[j][r] = true;
										}else if(totAut > 3) {
											t2[j][r] = false;
										}
										
									}else if(t1[j][r] == false) {
										if(totAut == 3) {
											t2[j][r] = true;
										}
									}										
								}
							}	
							
						}// fin for i
						//Muestra supervivientes
						if(coloniaExtinta == false) {
							System.out.println("Sobrevivieron " + lista.get(lista.size()-1).getAutomatas() + " celulas");
						}
						
						//Mostrar Tripleta
						System.out.println("Mostrando Datos finales");
						System.out.println("Gen | Cels | Cels Anteriores");
						for(int tri = 0; tri < lista.size(); tri++) {
							System.out.println(lista.get(tri).getGen() 
									            + " " + lista.get(tri).getAutomatas() 
									            + " " + lista.get(tri).getAutomatas_anteriores());
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