package trimestre_3.repaso2.ej4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] arg) {
		File f1 = new File("C:\\eclip\\archiv1.txt");
		File f2 = new File("C:\\eclip\\archiv2.txt");
		File salida = new File("C:\\eclip\\salida3.txt");
		try {
			Scanner sc = new Scanner(f1);
			Scanner sc2 = new Scanner(f2);
			Formatter f = new Formatter(salida);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				f.format(data + "\n");
			}
			while(sc2.hasNextLine()) {
				String data = sc2.nextLine();
				f.format(data + "\n");
			}
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
