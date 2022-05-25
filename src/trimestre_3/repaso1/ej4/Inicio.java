package trimestre_3.repaso1.ej4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	/**
	 * Dado el fichero "constructors.csv" que contiene la información sobre 
	 * las escuderías de F1, y el fichero "constructor_standings.csv" que 
	 * contiene información adicional sobre estas mismas, diseña una base 
	 * de datos capaz de almacenar todos estos datos. Pista: piensa el número 
	 * de tablas necesarias y como las relacionarías entre ellas.
	 */
	
	public static String tratador(String data) {
		boolean comillas = false;
		String datoFin = "";
		for(int i = 0; i < data.length(); i++) {
			
			if(data.substring(i,i + 1).equalsIgnoreCase("\"")) {
				if(comillas == false) {
					comillas = true;
				}else {
					comillas = false;
				}
			}
			if(comillas == true) {
				if(!data.substring(i,i + 1).equalsIgnoreCase(",")) {
					datoFin = datoFin + data.substring(i,i + 1);
				}
			}else{
				datoFin = datoFin + data.substring(i,i + 1);
			}
			
		}
		return datoFin;
	}
	
	public static ArrayList<Constructors> lector_1() {
		File f = new File("C:\\eclip\\constructors.csv");
		ArrayList<Constructors> cadena =  new ArrayList<Constructors>();
		try {
			Scanner sc = new Scanner(f);
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				data = tratador(data);
				data = data.replaceAll("\"", "");
				String datos[] = data.split(",");
				cadena.add(
						new Constructors(
								Integer.parseInt(datos[0]),
								datos[1],
								datos[2],
								datos[3],
								datos[4]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return cadena;
	}
	
	public static ArrayList<Constructors_Standings> lector_2() {
		File f = new File("C:\\eclip\\constructor_standings.csv");
		ArrayList<Constructors_Standings> cadena =  new ArrayList<Constructors_Standings>();
		try {
			Scanner sc = new Scanner(f);
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				data = tratador(data);
				data = data.replaceAll("\"", "");
				data = data.replaceAll("\\.", "");
				String datos[] = data.split(",");
				cadena.add(
						new Constructors_Standings(
								Integer.parseInt(datos[0]),
								Integer.parseInt(datos[1]),
								Integer.parseInt(datos[2]),
								Integer.parseInt(datos[3]),
								Integer.parseInt(datos[4]),
								datos[5],
								Integer.parseInt(datos[6])));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return cadena;
		
	}
	
	public static void main(String[] arg) {
		
		ArrayList<Constructors> cadena_1 = lector_1();
		MySql my = new MySql();
		ArrayList<Constructors_Standings> cadena_2 = lector_2();
		for(int i = 0; i < cadena_1.size();i++) {
			
			try {
				my.setDato(cadena_1.get(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i = 0; i < cadena_2.size(); i++) {
			try {
				my.setDato2(cadena_2.get(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
