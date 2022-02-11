package practicas.practica3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import practicas.practica3.t1.Inicio1;
import practicas.practica3.t2.Inicio2;
import practicas.practica3.t3.Inicio3;

public class Inicio {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String eStr = "";
		
		while(true) {
		
			System.out.println("--------------------");
			System.out.println("- 1 = Tarea1");
			System.out.println("- 2 = Tarea2");
			System.out.println("- 3 = Tarea3");
			System.out.println("- 4 = Salir");
			System.out.println("--------------------");
			
			eStr = sc.nextLine();
			if(eStr.equalsIgnoreCase("1")) {
				File f1 = new File("C:\\eclip\\usos-16.csv");
				File f2 = new File("C:\\eclip\\usos-17.csv");
				try {
					Scanner file1 = new Scanner(f1);
					Scanner file2 = new Scanner(f2);
					Formatter fo1 = new Formatter(new File("C:\\eclip\\pruebas-10.csv"));
					Formatter fo2 = new Formatter(new File("C:\\eclip\\pruebas-2000.csv"));
					String temp = "";
					for(int i = 0; i < 10; i++) {
						if(file1.hasNextLine()) {
							fo1.format(file1.nextLine() + "\n");
						} else {
							break;
						}
					}
					fo1.close();
					file1.close();
					for(int i = 0; i < 2000; i++) {
						if(file2.hasNextLine()) {
							fo2.format(file2.nextLine() + "\n");
						} else {
							break;
						}
					}
					fo2.close();
					file2.close();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if(eStr.equalsIgnoreCase("2")) {
				eStr = "";
				String ruta = "";
				while(true) {	
					System.out.println("Desea usar el modo manual o automatico? (Introduccion de direccion)");
					System.out.println("M/A");
					eStr = sc.nextLine();
					if(eStr.equalsIgnoreCase("M")) {
						sc.nextLine();
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
					}else if (eStr.equalsIgnoreCase("A")) {
						File directory = new File("C:\\eclip\\");
						String[] d = directory.list();
						System.out.println("Ficheros disponibles: ");
						for(int i = 0; i < d.length; i++) {
							System.out.println(i + " > "+ d[i]);
						}		
						System.out.println("Elija un fichero de la lista: ");
						boolean compr = false;
						while(true) {
							eStr = sc.nextLine();
							for(int i = 0; i < d.length; i++) {
								if(eStr.equalsIgnoreCase(Integer.toString(i))) {
									compr = true;
								}
							}
							if(compr == true) {
								for(int i = 0; i < d.length; i++) {
									if(eStr.equalsIgnoreCase(Integer.toString(i))) {
										System.out.println("Ha elejido el fihero: " + d[i]);
										ruta = "C:\\eclip\\" + d[i];
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
				System.out.println("Ruta: " + ruta);
				File f = new File(ruta);
				String linea = "";
				String [] tlinea;
				int cTotal = 0;
				int cCircular = 0;
				int cTraslado = 0;
				try {
					Scanner file = new Scanner(f);
					file.hasNextLine(); // Nos saltamos la primera linea
					while(file.hasNextLine()) {
						linea = file.nextLine();
						tlinea = linea.split(";");
						if(tlinea[2].equalsIgnoreCase(tlinea[4])) {
							cCircular++;
						} else {
							cTraslado++;
						}
						cTotal++;			
					}
					System.out.println("Numero de usos como traslado: " + cTotal);
					System.out.println("Numero de usos como circulares: " + cTraslado);
					System.out.println("Numero total de usos: " + cCircular);
					file.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if(eStr.equalsIgnoreCase("3")) {
				Inicio3.start();
			} else if(eStr.equalsIgnoreCase("4")) {
				break;
			} else {
				System.out.println("Debe de introducir uno de los numeros asignados");
			}		
		}
	}
}
