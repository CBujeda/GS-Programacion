package practicas.practica3.t2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Inicio2 {
	public static void start() {
		Scanner sc = new Scanner(System.in);
		String eStr = "";
		String ruta = "";
		while(true) {
			
			System.out.println("Desea usar el modo manual o automatico? (Introduccion de direccion)");
			System.out.println("M/A");
			eStr = sc.nextLine();
			if(eStr.equalsIgnoreCase("M")) {
				ruta = manual(sc);
				break;
			}else if (eStr.equalsIgnoreCase("A")) {
				ruta = auto(sc);
				break;
			}
		}
		sc.close();
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
				for(int i = 0; i < tlinea.length; i++) {
					System.out.print(tlinea[i] + " ");
					
				}
				System.out.println();
				
				
			}
			System.out.println("Total: " + cTotal);
			System.out.println("Traslados: " + cTraslado);
			System.out.println("Circular: " + cCircular);
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String manual(Scanner sc) {
		String eStr = "";
		String fil = "";
		sc.nextLine();
		while(true) {
			System.out.print("Ruta: ");
			eStr = sc.nextLine();
			if(new File(eStr).exists()) {
				fil = eStr;
				break;
			}else {
				System.out.println("Dicho fichero no existe");
			}	
		}	
		return fil;
	}
	
	
	public static String auto(Scanner sc) {
		// Scanner sc = new Scanner(System.in);
		String eStr = "";
		String fil = "";
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
						fil = "C:\\eclip\\" + d[i];
					}	
				}				
				break;
			}else {
				System.out.println("El valor introducido no es valido");
				System.out.print("Elija otra Opcion: ");
			}
		}
		return fil;
	}
}
