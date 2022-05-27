package examenes.prog3Ev.ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import trimestre_3.repaso3.ejer1.Paletra;

public class Inicio {
	
	
	
	
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\examen\\Divorcios.csv");
		DivYear con2019 = new DivYear();
		try {
			Scanner sc =  new Scanner(f);
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
			
			con2019.setYear(2018);
			while(sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] datos = linea.split(";");
				
				if(datos[2].equalsIgnoreCase("2019")) {
					if(datos[1].equalsIgnoreCase("Si")) {
						String datastr = datos[3].replaceAll("\\.", "");
						int data = Integer.parseInt(datastr);
						System.out.println();
						con2019.setCont(con2019.getCont() + data);
					}
				}
				if(datos[2].equalsIgnoreCase("2018")) {
					if(datos[1].equalsIgnoreCase("No")) {
						String datastr = datos[3].replaceAll("\\.", "");
						int data = Integer.parseInt(datastr);
						System.out.println();
						con2019.setCont(con2019.getCont() + data);
					}
				}
				
				

			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Con en el :" + con2019.getYear() + ", Total: " + con2019.getCont());
	}
}
