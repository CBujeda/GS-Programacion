package trimestre_3.repaso3.ejer1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import trimestre_3.repaso2.ej1.Tipo;

public class Inicio {

	/**
	 * Dado el fichero "paises.csv", muestra por pantalla, ordenado de menor a mayor,
	 *  el número de países que empiezan por cada una de las letras del abecedario.
	 */
	
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\paises.csv");
		ArrayList<Paletra> p = new ArrayList<Paletra>();
		try {
			Scanner sc = new Scanner(f);
			
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			
			while(sc.hasNextLine()) {
				String[] datafin = new String[13];
				String data = sc.nextLine();
				String[] datos = data.split(",");
				String info = datos[0];
				info = info.replaceAll("\"", "");
				if(p.size() == 0) {
					p.add(new Paletra(info.substring(0, 1),1));
				}else {
					boolean contiene = false;
					for(int i = 0; i < p.size(); i++) {
						if(p.get(i).getLetra().equalsIgnoreCase(info.substring(0, 1))) {
							p.get(i).sum();
							contiene = true;
						}
					}
					if(contiene == false) {
						p.add(new Paletra(info.substring(0, 1),1));
					}
					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(p);
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).getLetra() + " :" + p.get(i).getCont());
		}
		
		
	}
}
