package practicas.practica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Inicio {

	/**
	 * Pre:
	 * Post: Metodo el cual solicita al usuario introducir un string
	 * 		 y lo devuelve.
	 */
	public static String scStr() {
		Scanner sc = new Scanner(System.in);
		String data; 
		while(true) {
			data = "";
			data = sc.nextLine();
			if(!data.equalsIgnoreCase("")) {
				break;
			}
		}
		return data;
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual muestra 3 Sysos
	 */
	public static void clear() {
		for(int i = 0; i < 3; i++) {
			System.out.println();
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual muestra los datos de la lista de clubes
	 */
	public static void showData(Lista_Clubes lc) {
		for(int i = 0; i < lc.size(); i++) {
			System.out.println("Club: [ " + lc.get(i).getContent().getNombre() + " ]");
			for(int r = 0; r < lc.get(i).getContent().getConjunto_socios().getSize(); r++) {
				System.out.print("  -" + lc.get(i).getContent()
											.getConjunto_socios()
													.get(r).getContent().getNombre());
				System.out.print(" | " + lc.get(i).getContent()
											.getConjunto_socios().get(r)
													.getContent().getPrimer_apellido());
				System.out.print(" | " + lc.get(i).getContent()
											.getConjunto_socios().get(r)
													.getContent().getSegundo_apellido());
				System.out.println(" | " + lc.get(i).getContent()
												.getConjunto_socios().get(r)
													.getContent().getFecha_incorporacion());
			}
			System.out.println();
		}
	}
	
	/**
	 * Pre:
	 * Post: metodo principal el cual ejecuta la mayor parte
	 * 		 del programa
	 */
	public static void main(String[] arg) {
		String ruta = "C:\\eclip\\practica7";
		File f = new File(ruta);
		Lista_Clubes lc = new Lista_Clubes();
		File[] files = f.listFiles();
		Date date = new Date();
		System.out.print("Cargando datos.... \n{ ");
		for(int i = 0; i < files.length;i++) {
			System.out.print(files[i].getName() + " " );
			try {
				Scanner lect = new Scanner(files[i]);
				String name = "";
				if(lect.hasNextLine()) {lect.nextLine();}
				if(lect.hasNextLine()) {lect.nextLine();}
				if(lect.hasNextLine()) {name = lect.nextLine();}
				lc.add(name);
				while(lect.hasNextLine()) {
					String data[] = lect.nextLine().split(",");
					lc.get(lc.size()-1)
						.getContent()
						.addSocio(new Socio(data[0],data[1],data[2],data[3]));
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" } \n");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===================================");
			System.out.println("|  [ 0 ] Nuevo Club               |");
			System.out.println("|  [ 1 ] Ver Clubes               |");
			System.out.println("|  [ 2 ] Añadir Socio             |");
			System.out.println("|  [ 3 ] Eliminar Socio           |");
			System.out.println("|  [ 4 ] Ver Club                 |");
			System.out.println("|  [ 5 ] Eliminar Club            |");
			System.out.println("|  [ 6 ] Fusionar Club            |");
			System.out.println("|  [ G ] Guardar                  |");
			System.out.println("|  [ exit ] Salir                 |");
			System.out.println("===================================");
			System.out.print("> ");
			String data = scStr();
			if(data.equalsIgnoreCase("exit")) {
				break;
			}else if(data.equalsIgnoreCase("0")) {
				System.out.println("==============================");
				System.out.print(  "| - Nombre: ");
				String name = scStr();
				System.out.println("==============================");
				lc.add(name);
				System.out.println("Club añadido");
				System.out.print("Clubes: ");
				lc.show();
				System.out.println();
			}else if(data.equalsIgnoreCase("1")) {
				System.out.println("================================================");
				showData(lc);
				System.out.println("================================================");
			}else if(data.equalsIgnoreCase("2")) {
				System.out.println("==============================");
				System.out.println("Elija un club: ");
				lc.show();
				System.out.println("==============================");
				int club;
				while(true) {
					club = 0;
					try {
						System.out.print("Club: ");
						club = sc.nextInt();
						if(club >= 0 && club < lc.size()) {
						break;
						} else {
							System.out.println("Club invalido");
						}
					}catch(Exception e) {
						System.out.println("No se introdujo un numero");
					}
				}	
				System.out.println("==| Creacion socio |==");
				System.out.print(  " - Nombre: ");
				String name = scStr();
				System.out.print(  " - 1ºApellido: ");
				String apellido1 = scStr();
				System.out.print(  " - 2ºApellido: ");
				String apellido2 = scStr();
				System.out.println("Añadiendo...");
				lc.get(club).getContent()
						.addSocio(new Socio(name,apellido1,apellido2,date+""));
			}else if(data.equalsIgnoreCase("3")) {
				System.out.println("==============================");
				System.out.println("Elija un club: ");
				lc.show();
				System.out.println("==============================");
				int club;
				while(true) {
					try {
						System.out.print("Club: ");
						club = sc.nextInt();
						if(club >= 0 && club < lc.size()) {
						
						break;
						} else {
							System.out.println("Club invalido");
						}
					}catch(Exception e) {
						System.out.println("No se introdujo un numero");
					}
				}	
				lc.get(club).getContent().getConjunto_socios().show();
				int socio;
				while(true) {
					try {
						System.out.print("Club: ");
						socio = sc.nextInt();
						if(socio >= 0 && socio < lc.get(club).getContent()
													.getConjunto_socios().getSize()) {
						
						break;
						} else {
							System.out.println("Club invalido");
						}
					}catch(Exception e) {
						System.out.println("No se introdujo un numero");
					}
				}
				lc.get(club).getContent().getConjunto_socios().delete(socio);
			}else if(data.equalsIgnoreCase("4")) {
				System.out.println("==============================");
				System.out.println("Elija un club: ");
				lc.show();
				System.out.println("==============================");
				int club;
				while(true) {
					try {
						System.out.print("Club: ");
						club = sc.nextInt();
						if(club >= 0 && club < lc.size()) {
						
						break;
						} else {
							System.out.println("Club invalido");
						}
					}catch(Exception e) {
						System.out.println("No se introdujo un numero");
					}
				}	
				System.out.println("Club: [ " + lc.get(club).getContent().getNombre() + " ]");
				for(int r = 0; r < lc.get(club).getContent().getConjunto_socios().getSize(); r++) {
					System.out.print("  -" + lc.get(club).getContent().getConjunto_socios()
												.get(r).getContent().getNombre());
					System.out.print(" | " + lc.get(club).getContent().getConjunto_socios()
												.get(r).getContent().getPrimer_apellido());
					System.out.print(" | " + lc.get(club).getContent().getConjunto_socios()
												.get(r).getContent().getSegundo_apellido());
					System.out.println(" | " + lc.get(club).getContent().getConjunto_socios()
												.get(r).getContent().getFecha_incorporacion());
				}
			}else if(data.equalsIgnoreCase("5")) {
				System.out.println("==============================");
				System.out.println("Elija un club: ");
				lc.show();
				System.out.println("==============================");
				int club;
				while(true) {
					try {
						System.out.print("Club: ");
						club = sc.nextInt();
						if(club >= 0 && club < lc.size()) {
						
						break;
						} else {
							System.out.println("Club invalido");
						}
					}catch(Exception e) {
						System.out.println("No se introdujo un numero");
					}
				}	
				lc.delete(club);
				
			}else if(data.equalsIgnoreCase("6")) {
				
				
				System.out.println("==============================");
				System.out.println("Elija un club principal: ");
				lc.show();
				System.out.println("==============================");
				int club;
				while(true) {
					try {
						System.out.print("Club: ");
						club = sc.nextInt();
						if(club >= 0 && club < lc.size()) {
						
						break;
						} else {
							System.out.println("Club invalido");
						}
					}catch(Exception e) {
						System.out.println("No se introdujo un numero");
					}
				}
				
				System.out.println("==============================");
				System.out.println("Club Secundario: ");
				lc.show();
				System.out.println("==============================");
				int club2;
				while(true) {
					try {
						System.out.print("Club: ");
						club2 = sc.nextInt();
						if(club2 >= 0 && club2 < lc.size()) {
						
						break;
						} else {
							System.out.println("Club invalido");
						}
					}catch(Exception e) {
						System.out.println("No se introdujo un numero");
					}
				}
				
				if(club == club2) {
					System.out.println("Fusionando el secundario con el primario....");
					lc.getClub(club).unionClub(lc.getClub(club2));
					lc.delete(club2);
					System.out.println("Fusion completa");
				}else {
					System.out.println("Error no puede fusionarse el mismo club con sigo mismo");
				}
				
			}else if(data.equalsIgnoreCase("g")) {
				System.out.println("[ Iniciando actualizacion no cerrar programa ]");
				files = f.listFiles();
				for(int i = 0; i < files.length; i++) {
					files[i].delete();
				}
				
				
				for(int i = 0; i < lc.size(); i++) {
					try {
						Formatter out = new Formatter(ruta + "\\" + i +".club");
						out.format("1:{Club} String Nombre"+"\n");
						out.format("2:{Socios} String nombre, "
								+ "String primer_apellido, "
								+ "String segundo_apellido, "
								+ "String fecha_incorporacion"+"\n");
						out.format(lc.get(i).getContent().getNombre() +"\n");
						for(int r = 0; r < lc.get(i)
								.getContent().getConjunto_socios().size();r++) {
							out.format(
									lc.get(i).getContent().getConjunto_socios()
										.get(r).getContent().getNombre()
									+ "," + lc.get(i).getContent().getConjunto_socios()
										.get(r).getContent().getPrimer_apellido()
									+ "," + lc.get(i).getContent().getConjunto_socios()
										.get(r).getContent().getSegundo_apellido()
									+ "," + lc.get(i).getContent().getConjunto_socios()
										.get(r).getContent().getFecha_incorporacion()+"\n"
									);
						}
						out.close();
						System.out.println("Club añadido: " 
								+ lc.get(i).getContent().getNombre());
						System.out.println("Gardado club nº " + i);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
			clear();
		}
	}
}
