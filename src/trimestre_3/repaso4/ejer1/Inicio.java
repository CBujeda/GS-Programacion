package trimestre_3.repaso4.ejer1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Inicio {
	
	/*
	 *Dispones del fichero "fosas.csv" que contiene
	 * la localización de las fosas comunes de la Guerra Civil en Euskadi. 
	 * Muestra por pantalla las provincias junto al número de fosas comunes de 
	 * cada una de ellas, ordenadas de mayor a menor. 
	 */
	
	public static ArrayList<Provincias> organizador(ArrayList<Provincias> t){
		Provincias temp = new Provincias();
		for(int i = 0; i < t.size();i++) {
			for(int r = i+1; r < t.size();r++) {
				if(t.get(i).getCont() < t.get(r).getCont()) {
					temp.setAll(t.get(i).getProv(), 
								t.get(i).getCont());
					t.get(i).setAll(t.get(r).getProv(),
									t.get(r).getCont());
					t.get(r).setAll(temp.getProv(), 
									temp.getCont());
				}
			}
		}
		return t;
	}
	
	
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\fosas2.csv");
		ArrayList<Provincias> t = new ArrayList<Provincias>();
		try {
			Scanner sc = new Scanner(f);
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				String data[] = str.split(";");
				if(t.size() == 0) {
					t.add(new Provincias(data[1],1));
				}else {
					boolean contiene = false;
					for(int i = 0; i < t.size(); i++) {
						if(t.get(i).getProv().equalsIgnoreCase(data[1])) {
							t.get(i).sum();
							contiene = true;
						}
					}
					if(contiene == false) {
						t.add(new Provincias(data[1],1));
					}			
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t = organizador(t);
		
		for(int i = 0; i < t.size() ; i++) {
			System.out.println(t.get(i).getProv()+ ": " + t.get(i).getCont());
		}
	}
}
