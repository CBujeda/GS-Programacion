package zpruebas.buscadorMedic;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Inicio {
	

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre Medicamento: ");
		String busqeda = sc.nextLine();
		
		sc.close();
		File f = new File("C:\\eclip\\medic.txt");
		try {
			Scanner file = new Scanner(f);
			System.out.println("Correcto?: " + f.exists());
			System.out.println("Cargando....");
			int cont = 0;
			while(file.hasNextLine()) {
				
				String linea = file.nextLine();
				String [] datos = linea.split(";");
				if(datos[1].toLowerCase().contains(busqeda)) {
					cont++;
					System.out.println();
					System.out.println("Muestra: " + cont);
					System.out.println("-------------------------------------------------");
					System.out.println("ID: " + datos[0]);
					System.out.println("Medicamento: " + datos[1]);
					System.out.println("Laboratorio: " + datos[2]);
					System.out.println("Fecha Aut: " + datos[3]);
					System.out.println("Estado: " + datos[4] + " | Fecha: " + datos[5]);
					System.out.println("Cód. ATC: " + datos[6]);
					System.out.println("x--Pricipios Activos--x");
					System.out.println(">  " + datos[7]);
					System.out.println("Nº P. Activos: " + datos[8]);
					System.out.println("x---------------------x");
					System.out.println("Comercializacion: " + datos[9]);
					System.out.println("Observaciones: " + datos[11]);
					System.out.println("Sustituible: " + datos[12]);
					System.out.println("Afecta conducción: " + datos[13]);
					System.out.println("Problemas de suministro: " + datos[14]);
					System.out.println();
				}
			}		
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		
	}
}
