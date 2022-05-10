package trimestre_3.repaso1.ej2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	
	
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
	
	public static ArrayList<Tupla> organizador(ArrayList<Tupla> l) {
		for(int i = 0; i < l.size(); i++) {
			for(int r = i+1; r <l.size(); r++) {
				Tupla temp = new Tupla();
				if(l.get(i).getCantidad() < l.get(r).getCantidad()) {
					temp.setAll(l.get(r).getPais(), 
								l.get(r).getCantidad());			
					l.get(r).setAll(l.get(i).getPais(),
									l.get(i).getCantidad());
					l.get(i).setAll(temp.getPais(), 
									temp.getCantidad());
				}
			}
		}
		return l;
	}
	
	public static void main(String[] arg) {
		
		File f = new File("C:\\eclip\\drivers.csv");
		
		ArrayList<Tupla> l = new ArrayList<Tupla>();
		
		try {
			Scanner sc = new Scanner(f);
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			while(sc.hasNextLine()) {
		
				String data = sc.nextLine();
				data = tratador(data).replaceAll("\"", "");
				String[] datos = data.split(",");
				
				if(l.size() == 0) {
					l.add(new Tupla(datos[7],1));
				}else {
					boolean alguno = false;
					for(int i = 0; i < l.size(); i++) {
						if(l.get(i).getPais().equalsIgnoreCase(datos[7])) {
							l.get(i).aumentar();
							alguno = true;
						}
					}
					if(alguno == false) {
						l.add(new Tupla(datos[7],1));
					}
				}
				/*
				for(int i = 0; i < datos.length; i++) {
					System.out.print(datos[i] + " ");
				}
				System.out.println();
				*/
			}
			l = organizador(l);
			for(int i = 0; i < l.size(); i++) {
				System.out.println(l.get(i));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
