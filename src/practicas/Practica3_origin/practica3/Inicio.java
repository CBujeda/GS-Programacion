package practicas.Practica3_origin.practica3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.ArrayList;

public class Inicio {
	
	/**
	 * Pre:
	 * Post: Dicho metodo muestra el menu principal
	 */
	public static void menu() {
		System.out.println("--------------------");
		System.out.println("- 1 = Tarea1");
		System.out.println("- 2 = Tarea2");
		System.out.println("- 3 = Tarea3");
		System.out.println("- 4 = Salir");
		System.out.println("--------------------");
	}
	
	/**
	 * Pre:
	 * Post: dicho metodo muestra un menu y devuelve la ruta que
	 * 		 habremos elejido de forma manual o automatica
	 */
	public static String ruta(){
		Scanner sc = new Scanner(System.in);
		String eStr = "";
		String ruta = "";
		while(true) {	
			System.out.println("Desea usar el modo manual o automatico? (Introduccion de direccion)");
			System.out.println("M/A");
			eStr = sc.nextLine();
			if(eStr.equalsIgnoreCase("M")) { // Opcion de introduccion manual
				sc.nextLine(); // nos saltamos la primera linea
				while(true) {
					System.out.print("Ruta: ");
					eStr = sc.nextLine();
					if(new File(eStr).exists()) {
						ruta = eStr;
						break;
					}else {
						System.out.println("Dicho fichero no existe");
					}	
				}	
				break;
			}else if (eStr.equalsIgnoreCase("A")) { // Opcion de busqueda automatica del archivo
				File directory = new File("C:\\eclip\\");
				String[] d = directory.list();
				System.out.println("Ficheros disponibles: ");
				for(int i = 0; i < d.length; i++) { // Visualiza los ficheros existentes
					System.out.println(i + " > "+ d[i]);
				}		
				System.out.println("Elija un fichero de la lista: ");
				boolean compr = false;
				while(true) {
					eStr = sc.nextLine();
					for(int i = 0; i < d.length; i++) {
						if(eStr.equalsIgnoreCase(Integer.toString(i))) { //Verificamos que exista el archivo
							compr = true;
						}
					}
					if(compr == true) {
						for(int i = 0; i < d.length; i++) {
							if(eStr.equalsIgnoreCase(Integer.toString(i))) { // elejimos el archivo
								System.out.println("Ha elegido el fichero: " + d[i]);
								ruta = "C:\\eclip\\" + d[i]; //ruta = al fichero seleccionado
							}	
						}				
						break;
					}else {
						System.out.println("El valor introducido no es valido");
						System.out.print("Elija otra Opcion: ");
					}
				}
				break;
			}
		}
		return ruta;
	}
	
	/**
	 * Pre:
	 * Post: Dicho metodo muestra un array con el objeto UsuarioBici
	 */
	public static void vewArray (ArrayList<UsuarioBici> lista, int size) {
		if(lista.size() < size) {
			size = lista.size();
		}
		System.out.println("Numero de usuarios distintos: " + lista.size() +"\n");
		System.out.println("Usuarios     Traslados     Circular    Total");
		System.out.println("========     =========     =======     =====");
		for(int i = 0; i < size; i++) {
			System.out.print(lista.get(i).getUsuario() + "            ");
			System.out.print(lista.get(i).getTraslados() + "            ");
			System.out.print(lista.get(i).getCircular() + "            ");
			System.out.print(lista.get(i).getTotal() + "\n");
		}
		
	}
	
	/**
	 * Pre:
	 * Post: dicho metodo ordena un array por el total de su objeto
	 * 		 UsuarioBici
	 */
	public static ArrayList<UsuarioBici> organizador(ArrayList<UsuarioBici> lista){ // Nota ARREGLAR METODO
		UsuarioBici temp = new UsuarioBici(0,0,0,0);
		for(int i = 0; i < lista.size();i++) {
			for(int r = i; r < lista.size(); r++) {
				if(lista.get(i).getTotal() < lista.get(r).getTotal()) { // ordenamos la array por su total
					temp.setAll(lista.get(i).getUsuario(),
								lista.get(i).getTraslados(),
								lista.get(i).getCircular(),
								lista.get(i).getTotal());
					
					lista.get(i).setAll(lista.get(r).getUsuario(),
										lista.get(r).getTraslados(),
										lista.get(r).getCircular(),
										lista.get(r).getTotal());
					
					lista.get(r).setAll(temp.getUsuario(),
										temp.getTraslados(),
										temp.getCircular(),
										temp.getTotal());
				}
			}
		}
		
		return lista;
		
	}
	
	/**
	 * Pre:
	 * Post: Dicho metodo es el metodo principal el cual ejecuta los
	 * 		 menus, lee archivos, escribe en ellos y muestra gran parte
	 * 		 del programa entre otras cosas
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in); // Clase scanner de entrada de texto de usuario
		String eStr = ""; // Variable generica de entrada de texto
		String ruta = "";
		while(true) { 
			menu(); // Mostramos menu
			eStr = sc.nextLine(); // solicitamos al usuario una opcion
			if(eStr.equalsIgnoreCase("1")) { // Tarea 1 -------------------------------------
				try {
					Scanner file1 = new Scanner(new File("C:\\eclip\\usos-16.csv"));
					Formatter fo1 = new Formatter(new File("C:\\eclip\\pruebas-10.csv"));
					String temp = "";
					for(int i = 0; i < 10; i++) {
						if(file1.hasNextLine()) { // Copia de las primeras 10 lineas
							fo1.format(file1.nextLine() + "\n"); // escribimos en el fichero
						} else { break; }
					}
					fo1.close(); // Cerramos
					file1.close();
					Scanner file2 = new Scanner(new File("C:\\eclip\\usos-17.csv"));
					Formatter fo2 = new Formatter(new File("C:\\eclip\\pruebas-2000.csv"));
					for(int i = 0; i < 2000; i++) { // Copia de las primeras 2000 lineas
						if(file2.hasNextLine()) {
							fo2.format(file2.nextLine() + "\n"); // escribimos en el fichero
						} else { break; }
					}
					fo2.close(); // Cerramos
					file2.close();
					System.out.println("Proceso finalizado");
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if(eStr.equalsIgnoreCase("2")) { // Tarea 2 -------------------------------------
				ruta = "";
				ruta = ruta();
				
				// Calculador de datos y mostrador
				System.out.println("Ruta: " + ruta); // muestra la ruta
				File f = new File(ruta);
				String linea = ""; 
				String [] tlinea;
				int cTotal = 0;  // Creamos varibales contadoras
				int cCircular = 0;
				int cTraslado = 0;
				try {
					Scanner file = new Scanner(f);
					System.out.println("Cargando...");
					file.nextLine(); // Nos saltamos la primera linea
					while(file.hasNextLine()) {
						Usobici ub = new Usobici(file.nextLine());
						if(ub.esCircular()) { // Preguntamos si es circular
							cCircular++;
						} else {
							cTraslado++;
						}
						cTotal++;
					}
					System.out.println(); // Mostramos datos
					System.out.println("Numero de usos como traslado: " + cTraslado );
					System.out.println("Numero de usos como circulares: " + cCircular );
					System.out.println("Numero total de usos: " + cTotal);
					file.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if(eStr.equalsIgnoreCase("3")) { // Tarea 3 -------------------------------------
				ruta = "";
				ruta = ruta();
				ArrayList<UsuarioBici> lista = new ArrayList<UsuarioBici>();
				Scanner file;
				boolean existe = false;
				int eTraslado = 0;  // Creamos varibales para eleccion
				int eCircular = 0;
				int posicion = -1;
				try {
					file = new Scanner(new File(ruta));
					System.out.println("Cargando...");
					file.nextLine(); // Nos saltamos la primera linea
					while(file.hasNextLine()) {
						existe = false;
						String tlinea2[] = file.nextLine().split(";");
						for(int i = 0; i < lista.size(); i++) {
							if(Integer.parseInt(tlinea2[0].trim()) == lista.get(i).getUsuario() ) {
								existe = true;
								posicion = i;
							}
						}
						if(existe == true) {
							if(tlinea2[2].trim().equalsIgnoreCase(tlinea2[4].trim())) {
								lista.get(posicion).sumCircular();
							} else {
								lista.get(posicion).sumTraslados();
							}
							lista.get(posicion).sumTotal();
							// Modo 2
							/*
							lista.set(posicion, new UsuarioBici(lista.get(posicion).getUsuario(), // A�adimos datos (Reemplazo)
									lista.get(posicion).getTraslados()+eTraslado,
									lista.get(posicion).getCircular()+eCircular,
									lista.get(posicion).getTotal()+1));
									*/
						} else {
							eTraslado = 0;  // Asignamos a 0
							eCircular = 0;
							if(tlinea2[2].trim().equalsIgnoreCase(tlinea2[4].trim())) {
								eCircular++;
							} else {
								eTraslado++;
							}
							lista.add(new UsuarioBici(Integer.parseInt(tlinea2[0].trim()),eTraslado,eCircular,1)); // creamos un nuevo usuario
						}
					}
					file.close();
					
					vewArray(organizador(lista), 15); // ordeno y muestro
					
				
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if(eStr.equalsIgnoreCase("4")) {
				break;
			} else {
				System.out.println("Debe de introducir uno de los numeros asignados");
			}		
		}
	}
}
