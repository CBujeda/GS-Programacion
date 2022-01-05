package practicas.practica1;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] arg) {
		/*--------------------
		 * CONFIGURACION
		 * -------------------
		 */
		boolean cargas = false; // si desea ver las tablas de datos que se usan poner a true
		//--------------------
		
		Scanner sc = new Scanner(System.in);
		//Utiles.genPlayer();
		System.out.println("Iniciando programa.....");
		System.out.println("Iniciando genracion de datos...");
		Liga[] l = Generator.genLiga();
		

		System.out.println("Datos generados");
		System.out.println("-------------------------------------");
		System.out.println("         PROGRAMA DE GESTION         ");
		System.out.println("-------------------------------------");
		// Estos menus son numericos no funcionaran si se introducen otros caracteres
		String menu99;
		while(true) {
			System.out.println("---    MENU DE PRINCIPAL    ---");
			System.out.println("-> 1 - Ayuda \n"
							 + "-> 2 - Ver datos \n"
							 + "-> 3 - Menu de gestion \n"
							 + "-> 4 - Salir");
			int menu1 = -1;
			menu1 = sc.nextInt();
			if(menu1 == 1) {
				help();
				System.out.println("Introduce cualquier valor para salir");
				sc.nextLine();
				menu99 = sc.nextLine();
				limpiar();
			}else if(menu1 == 2){
				System.out.println("Cargando.....");
				System.out.println("-----------------------------");
				Show.all(l);
				System.out.println("-----------------------------");
			}else if(menu1 == 3) {
				limpiar();
				while(true) {
					System.out.println("------------------------------------------ \n");
					System.out.println("---    MENU DE GESTION    ---");
					System.out.println("---> 1 Visualizar clasificación ordenada por puntos");
					System.out.println("---> 2 Visualizar los 5 máximos goleadores");
					System.out.println("---> 3 Visualizar los 5 jugadores con más expulsiones");
					System.out.println("---> 4 Obtener los 3 equipos más goleadores");
					System.out.println("---> 5 Volver al menu principal");
					int menu2 = -1;
					menu2 = sc.nextInt();
					if(menu2 == 1) {
						Show.equipos(Organizador.clasificacion(l, cargas));
						System.out.println("\n Introduce cualquier valor para salir");
						sc.nextLine();
						menu99 = sc.nextLine();
						limpiar();
					}else if(menu2 == 2) {
						Show.jugadores(Organizador.goleadores(l, cargas), 5);
						System.out.println("\n Introduce cualquier valor para salir");
						sc.nextLine();
						menu99 = sc.nextLine();
						limpiar();
					}else if(menu2 == 3) {
						Show.jugadores(Organizador.expulsiones(l, cargas), 5);
						System.out.println("\n Introduce cualquier valor para salir");
						sc.nextLine();
						menu99 = sc.nextLine();
						limpiar();
					}else if(menu2 == 4) {
						Organizador.equipoGol(l, cargas);
						
					}else if(menu2 == 5) {
						limpiar();
						break;
					}else {
						System.out.println("Solo puedes usar las siguientes opciones:");
					}
					
					
					
					
					
				}
			}else if(menu1 == 4) {
				System.out.println("Cerrando programa....");
				break;
			}else {
				limpiar();
				System.out.println("Debe usar una de las siguientes opciones:");
			}
			
			
		}	
		//System.out.println(Generator.genNombre());
	}

	/**
	 * Pre:
	 * Post: Este metodo muestra por consola la ayuda del programa
	 */
	
	public static void help() {
		limpiar();
		System.out.println("Bienvenid@ a la seccion de ayuda");
		System.out.println("Menu Principal");
		System.out.println("-> 1 - Ayuda  =  Accedes a la seccion de ayuda\n"
				 + "-> 2 - Ver datos = Muestra una visualizacion general de los datos\n"
				 + "-> 3 - Menu de gestion = Muestra el Menu de gestion \n"
				 + "-> 4 - Salir = Finaliza el programa");
		System.out.println("Menu de Gestion");

		
	}
	
	/**
	 * Pre:
	 * Post: Este metodo limpiar se encarga de añadir 10 lineas vacias
	 */
	public static void limpiar() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}
