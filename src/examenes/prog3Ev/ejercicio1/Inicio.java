package examenes.prog3Ev.ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase la cual añade y muestra los datos de un fichero a una base de datos
 * clasificados por una letra. Con dato nos referimos a palabra
 */
public class Inicio {
	
	/**
	 * Pre:
	 * Post: Método el cual añade y muestra los datos de un fichero a una base de datos
	 *       clasificados por una letra ya sea que la letra este al principio o al final.
	 *       Con dato nos referimos a palabra
	 */
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\examen\\HablanosDelDon.txt");
		String letra = "a";
		MySql d = new MySql();
		try {
			Scanner l = new Scanner(f);
			int linea = 0;
			while(l.hasNextLine()) {
				linea++;
				String datosa = l.nextLine();
				String[] datos = datosa.split(" ");
				for(int i = 0; i < datos.length; i++) {
					String palabra = datos[i];
					palabra = palabra.replaceAll(",", "");
					palabra = palabra.replaceAll("¿", "");
					palabra = palabra.replaceAll("\\?", "");
					palabra = palabra.replaceAll("\\.", "");
					boolean valid = false;
					if(palabra.length() >= 1) {
						if(palabra.substring(0,1).equalsIgnoreCase(letra) ||
								palabra.substring(palabra.length()-1,palabra.length()).equalsIgnoreCase(letra)) {
							System.out.println(palabra);
							try {
								d.setDato(palabra, letra, linea);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
