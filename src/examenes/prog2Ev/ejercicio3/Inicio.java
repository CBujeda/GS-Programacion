package examenes.prog2Ev.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	
	/**
	 * Pre:
	 * Post: Dicho metodo muestra una arraylist
	 * 		 de tipo tupla
	 */
	public static void mostrar(ArrayList<Tupla> list) {
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i).getNombre() + " > "
								+ list.get(i).getCantidad());
		}
	}
	
	/**
	 * Pre:
	 * Post: Dicho metodo trata los campos entre comillas
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
	
	/**
	 * Pre:
	 * Post: Dicho metodo obtiene datos
	 * 		 los procesa y debuelve una
	 * 		 tabla de arraylist
	 * 		 Con procesar es agrupar
	 */
	public static ArrayList<Tupla> informacionVideojuegos(){
		File f = new File("C:\\eclip\\ventasVideojuegos.csv");
		ArrayList<Tupla> list = new ArrayList<Tupla>();
		
		try {
			Scanner file = new Scanner(f);
			
			if(file.hasNextLine()) {
				file.nextLine();
			}
			boolean primer = true;
			while(file.hasNextLine()) {
				boolean existe = false;
				int ubic = 2;
				String dato = file.nextLine();
				dato = tratador(dato);
	
				String [] datos = dato.split(","); // pendiente de mejorar
				
				
				if(primer == true) {
					list.add(new Tupla(datos[ubic],1));
					primer = false;
				}else {
					for(int i = 0; i < list.size(); i++) {
						if(list.get(i).getNombre().equalsIgnoreCase(datos[ubic])) {
							list.get(i).setAdd();
							existe = true;
						} 	
					}
					
					if(existe == false) {
						list.add(new Tupla(datos[ubic],1));
					}
					
				}
			}
			
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public static void main(String[] arg) {
		mostrar(informacionVideojuegos());
	}


}
