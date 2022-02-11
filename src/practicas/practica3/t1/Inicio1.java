package practicas.practica3.t1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;

public class Inicio1 {
	public static void start() {
		File f1 = new File("C:\\eclip\\usos-16.csv");
		File f2 = new File("C:\\eclip\\usos-17.csv");
		try {
			Scanner file1 = new Scanner(f1);
			Scanner file2 = new Scanner(f2);
			Formatter fo1 = new Formatter(new File("C:\\eclip\\pruebas-10.csv"));
			Formatter fo2 = new Formatter(new File("C:\\eclip\\pruebas-2000.csv"));
			String temp = "";
			for(int i = 0; i < 10; i++) {
				if(file1.hasNextLine()) {
					fo1.format(file1.nextLine() + "\n");
				} else {
					break;
				}
			}
			fo1.close();
			file1.close();
			for(int i = 0; i < 2000; i++) {
				if(file2.hasNextLine()) {
					fo2.format(file2.nextLine() + "\n");
				} else {
					break;
				}
			}
			fo2.close();
			file2.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
