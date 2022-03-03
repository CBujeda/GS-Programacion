package examenes.prog2Ev.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Inicio {
	

	
	public static void mostrar(ArrayList<Tupla> list) {
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i).getNombre() + " > "
								+ list.get(i).getCantidad());
		}
	}
	
	
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
				 
	
				String [] datos = dato.split(","); // pendiente de mejorar
				boolean comilla = false;
				for(int i = 0; i < datos[2].length(); i++) { // nos aumentamos 1 en los que el campo 2 tenga comillas
					if(datos[2].substring(i,i+1).equalsIgnoreCase("\"")) {
							comilla = true;
					}
				}
				if(comilla == false) {
					 ubic = 2;
				}else {
					ubic = 3;
				}
				
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
