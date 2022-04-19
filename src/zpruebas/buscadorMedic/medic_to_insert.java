package zpruebas.buscadorMedic;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class medic_to_insert {

		public static void main(String[] arg) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nombre Medicamento: ");
			String busqeda = sc.nextLine();
			
			sc.close();
			File f = new File("C:\\eclip\\medic.txt");
			File output = new File("C:\\eclip\\medic_insert.txt");
			try {
				Scanner file = new Scanner(f);
				Formatter fo = new Formatter(output);
				System.out.println("Correcto?: " + f.exists());
				System.out.println("Cargando....");
				int cont = 0;
				while(file.hasNextLine()) {
					
					String linea = file.nextLine();
					linea = linea.replaceAll("\\(", "+").replaceAll("\\)", "+");
					String [] datos = linea.split(";");
					System.out.println(datos.length);
					if(datos.length > 11) {
						try {
						fo.format("('"+datos[0]+"','"+datos[1]+"','"+datos[2]+"','"+ datos[7]+"','"+ datos[11]+"'),\n");
						}catch(Exception e) {
							System.out.println("Fallo");
						}
					}
				}		
				file.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}
			
		}
	
}
