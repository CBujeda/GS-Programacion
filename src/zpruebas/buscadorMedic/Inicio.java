package zpruebas.buscadorMedic;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Inicio {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String busqeda = sc.nextLine();
		

		File f = new File("C:\\eclip\\medicamentos.csv");
		try {
			Scanner file = new Scanner(f);
			System.out.println("0");
			System.out.println(f.exists());
			System.out.println(file.hasNextLine());
			while(file.hasNextLine()) {
				
				System.out.println("0");
				String linea = file.nextLine();
				String [] datos = linea.split(";");
				if(datos[1].toLowerCase().contains(busqeda)) {
					System.out.println("-------------------------------");
					System.out.println("ID: " + datos[0]);
					
				}
			}		
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		
	}
}
