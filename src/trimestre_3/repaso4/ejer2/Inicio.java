package trimestre_3.repaso4.ejer2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inicio {
	
	/*
	 * Dado el fichero "texto.txt", muestra por pantalla todas
	 * aquellas palabras del fichero que tengan más de 3 vocales.
	 */
	
	public static boolean mtvocal(String a) {
		boolean c;
		int sum = 0;
		for(int i = 0; i < a.length(); i++) {
			String tmp = a.substring(i,i+1);
			if(tmp.equalsIgnoreCase("a") || 
					tmp.equalsIgnoreCase("i") || 
					tmp.equalsIgnoreCase("u") || 
					tmp.equalsIgnoreCase("e") || 
					tmp.equalsIgnoreCase("o")) {
				sum++;
			}
		}
		
		if(sum >=3) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\texto.txt");
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNext()) {
				String a = sc.next();
				if(mtvocal(a)) {
					System.out.println(a);
				}
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
