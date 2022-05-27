package examenes.prog3Ev.ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase la cual devuelve datos de un 
 * fichero y clasifica dichos datos
 */
public class Inicio {
	
	/**
	 * Pre:
	 * Post: Método el cual ordena un Arraylist por 
	 * 		 el número cont de su objeto LocalCont de mayor a menor
	 */
	public static ArrayList<LocalCont> organizador(ArrayList<LocalCont> l){
		LocalCont temp = new LocalCont();
		for(int i = 0; i < l.size(); i++) {
			for(int r = i+1; r < l.size(); r++) {
				if(l.get(i).getCont() < l.get(r).getCont()) {
					temp.setAll(l.get(i).getLocal(), l.get(i).getCont());
					l.get(i).setAll(l.get(r).getLocal(), l.get(r).getCont());
					l.get(r).setAll(temp.getLocal(), temp.getCont());		
				}
			}	
		}
		return l;
	}
	
	/**
	 * Pre:
	 * Post: Método principal el cual devuelve el número de personas 
	 * 		 con pre divorcio en 2019, número de personas 
	 * 		 sin pre divorcio en 2018 y provincia con mas personas
	 */
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\examen\\Divorcios.csv");
		DivYear con2019 = new DivYear();
		DivYear con2018 = new DivYear();
		ArrayList<LocalCont> l = new ArrayList<LocalCont>();
		try {
			Scanner sc =  new Scanner(f);
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			con2019.setYear(2019);
			con2018.setYear(2018);
			while(sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] datos = linea.split(";");
				if(datos[2].equalsIgnoreCase("2019")) {
					if(datos[1].equalsIgnoreCase("Si")) {
						String datastr = datos[3].replaceAll("\\.", "");
						int data = Integer.parseInt(datastr);
						con2019.setCont(con2019.getCont() + data);
					}
				}
				if(datos[2].equalsIgnoreCase("2018")) {
					if(datos[1].equalsIgnoreCase("No")) {
						String datastr = datos[3].replaceAll("\\.", "");
						int data = Integer.parseInt(datastr);
						con2018.setCont(con2018.getCont() + data);
					}
				}
				int year = Integer.parseInt(datos[2]);
				if(year >= 2013 && year <= 2019 && datos[1].equalsIgnoreCase("Si")) {
					if(l.size() == 0) {
						l.add(new LocalCont(datos[0],1));
					} else {
						boolean contiene = false;
						for(int i = 0; i < l.size(); i++) {
							if(l.get(i).getLocal().equalsIgnoreCase(datos[0])) {
								l.get(i).sum();
								String datastr = datos[3].replaceAll("\\.", "");
								if(!datastr.equalsIgnoreCase("")) {
									int data = Integer.parseInt(datastr);
									l.get(i).setCont(l.get(i).getCont()+data);
								}
								contiene = true;
							}
						}
						if(contiene == false) {
							l.add(new LocalCont(datos[0],1));
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Con separacion :" + con2019.getYear() 
								+ ", Total: " + con2019.getCont());
		System.out.println("Sin separacion :" + con2018.getYear() +
								  ", Total: " + con2018.getCont());
		l = organizador(l);
		if(l.size() > 0) {
			for(int i = 0; i < 1;i++) {
				System.out.println("Mas divorcios entre 2013 y 2019 es: "
						+ l.get(i).getLocal() + ": " + l.get(i).getCont());
			}
		}
	}
}
