package trimestre_3.repaso2.ej1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

	
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\2021_Accidentalidad.csv");
		ArrayList<Tipo> t = new ArrayList<Tipo>();
		ArrayList<Genero> t2 = new ArrayList<Genero>();
		try {
			Scanner sc  = new Scanner(f);
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			while(sc.hasNextLine()) {
				String[] datafin = new String[13];
				String data = sc.nextLine();
				String[] datos = data.split(";");
				if(datos.length <= 13) {
					for(int i = 0; i < datos.length; i++) {
						datafin[i] = datos[i];
					}
				}
				for(int i = 0; i < datafin.length;i++) {
					if(datafin[i] == null || datafin[i].equalsIgnoreCase(" ") || datafin[i].equalsIgnoreCase("")) {
						datafin[i] = "Sin dato";
					}
				}
				if(t.size() == 0) {
					t.add(new Tipo(datafin[6],1));
				}else {
					boolean contiene = false;
					for(int i = 0; i < t.size(); i++) {
						if(t.get(i).getTipo().equalsIgnoreCase(datafin[6])) {
							t.get(i).sum();
							contiene = true;
						}
					}
					if(contiene == false) {
						t.add(new Tipo(datafin[6],1));
					}
					
				}
				if(t2.size() == 0) {
					t2.add(new Genero(datafin[11],1));
				}else {
					boolean contiene2 = false;
					for(int i = 0; i < t2.size(); i++) {
						if(t2.get(i).getGenero().equalsIgnoreCase(datafin[11])) {
							t2.get(i).sum();
							contiene2 = true;
						}
					}
					if(contiene2 == false) {
						t2.add(new Genero(datafin[11],1));
					}
				}
				
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("TIPO:");
		for(int i = 0; i < t.size(); i++) {
			System.out.println(" -"+t.get(i).getTipo() + ": " + t.get(i).getCant());
		}
		System.out.println("GENERO:");
		for(int i = 0; i < t2.size(); i++) {
			System.out.println(" -"+t2.get(i).getGenero() + ": " + t2.get(i).getCont());
		}
		
	}
}
