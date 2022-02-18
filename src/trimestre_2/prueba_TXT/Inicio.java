package trimestre_2.prueba_TXT;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class Inicio {
	
	
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\prueba.txt");
		try {
			String palabra = "Quijote";
			Formatter form = new Formatter("C:\\eclip\\prueba_salida.txt");
			Scanner lec = new Scanner(f);
			String temp;
			int contador = 0;
			while(lec.hasNext()) {
				temp = lec.next();
					temp = temp.replaceAll(";", "").replaceAll(",", "").replaceAll("\\.", "");
					if(palabra.equalsIgnoreCase(temp)) {
						contador++;
					}
				form.format(temp + "\n");			
			}
			
			lec.close();
			form.close();	
			System.out.println(contador);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
