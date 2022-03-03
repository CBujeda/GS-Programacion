package examenes.prog2Ev.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Inicio {
	
	public static String []  tratador(String dato) {
		for(int i = 0; i < dato.length(); i++) {
			
			
			
		}
		
		return null;
	}
	
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
				
				String [] datos = tratador(file.nextLine());
				 
				
				
				
				
				if(primer == true) {
					list.add(new Tupla(datos[2],1));
					primer = false;
				}else {
					for(int i = 0; i < list.size(); i++) {
						if(list.get(i).getNombre().equalsIgnoreCase(datos[2])) {
							list.get(i).setAdd();
							existe = true;
						} 	
					}
					
					if(existe == false) {
						list.add(new Tupla(datos[2],1));
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
