package examenes.prog2Ev.ejercicio2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inicio {
	
	/**
	 * Pre:
	 * Post: Dicho metodo obtiene el texto
	 * 		 lo procesa, muestra palabras
	 * 		 y debuelve cantidad con las
	 * 		 condiciones establecidas
	 */
	public static int palabrasMasLargasQue(int longitud){
		System.out.println("x- Palabras -x");
		File f = new File("C:\\eclip\\textoExamen.txt");
		int cont = 0;
		try {
			Scanner file = new Scanner(f);
			
			while(file.hasNext()) {
				String palabra = file.next();
				// no considero los caracteres especiales palabras
				palabra = palabra.replaceAll("\\.", "").replaceAll(",", "");
				palabra = palabra.replaceAll(":", "").replaceAll("\"", "");
				palabra = palabra.replaceAll("\\(", "").replaceAll("\\)","");

				if(!palabra.equalsIgnoreCase("")) {
					if(palabra.length() >= longitud) {
						cont++;
						
						System.out.println(palabra);
					}
				}
			}
			
			file.close();
			System.out.println("x---------------x");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cont;
	}
	
	
	/**
	 * Pre:
	 * Post: Dicho metodo pide la longitud
	 * 		 y muestra datos de palabrasMasLargasQue()
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Longitud: ");
		int longitud = sc.nextInt();
		sc.close();
		System.out.println("Palabras iguales o mas largas: "
						+ palabrasMasLargasQue(longitud));
		
		
	}

}
