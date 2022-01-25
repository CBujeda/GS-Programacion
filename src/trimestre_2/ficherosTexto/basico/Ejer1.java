package trimestre_2.ficherosTexto.basico;

import java.io.File;
import java.util.Scanner;

//documento de ejemplo : C:\Users\USUARIO\Documents\ejemplo.txt

public class Ejer1 {
	
	
	
	public static void mostrarInformacion(File f) {
		if(f.isFile()) {
			System.out.println();
			System.out.println(" ---------------------");
			System.out.println("| INFORMACIÓN DE FILE |");
			System.out.println(" ---------------------");
			System.out.println("| Nombre del fichero:                             " + f.getName());
			System.out.println("| Ruta relativa del directorio del fichero:       " + f.getParent());
			System.out.println("| Nombre del fichero (ruta relativa):             " + f.getPath());
			System.out.println("| Nombre del fichero (ruta absoluta):             " + f.getAbsolutePath());
			System.out.println("| Tamaño del fichero (en bytes):                  " + f.length());
			System.out.println("| Puede ser leído:                                " + f.canRead());
			System.out.println("| Puede ser escrito:                              " + f.canWrite());
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("Selecciona una opción: ");
		System.out.println("  1) Renombrar");
		System.out.println("  2) Eliminar");
		System.out.println("  3) Mostrar info");
		System.out.print("Opción seleccionada (0 para finalizar): ");
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		File f;
		System.out.print("Escriba la ruta para File: ");
		String rutaFinal = sc.next();
		f = new File(rutaFinal);
		mostrarMenu();
		int eInt = sc.nextInt();
		if(eInt == 1) {
			System.out.print("Escriba la ruta para File: ");
			String temp = sc.next();
			File f2 = new File(temp);
			f.renameTo(f2);
		}else if(eInt == 2) {
			f.delete();
		}else if(eInt == 3) {
			mostrarInformacion(f);
		}else if(eInt == 0) {
			
		}else {
			System.out.println("ERROR");
		}
		
		
		
	}
}
