package trimestre_2.prueba_TXT;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.File;

public class Escritura {

		public static void main(String[] arg) {
			File f = new File("C:\\eclip\\ejemplo.txt");
			try {
				Formatter file = new Formatter("C:\\eclip\\ejemplo.txt");
				
				file.format("Prueba");
				file.close();
				
				f.delete();
				f.renameTo(new File("C:\\eclip\\ejemplo2.txt"));
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
