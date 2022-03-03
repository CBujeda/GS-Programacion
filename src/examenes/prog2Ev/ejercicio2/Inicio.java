package examenes.prog2Ev.ejercicio2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inicio {
	
	public static int palabrasMasLargasQue(int longitud){
		System.out.println("x- Palabras -x");
		File f = new File("C:\\eclip\\textoExamen.txt");
		int cont = 0;
		try {
			Scanner file = new Scanner(f);
			
			while(file.hasNext()) {
				String palabra = file.next();
				
				if(palabra.length() >= longitud) {
					cont++;
					
					System.out.println(palabra);
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
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Longitud: ");
		int longitud = sc.nextInt();
		sc.close();
		System.out.println("Palabras iguales o mas largas: "
						+ palabrasMasLargasQue(longitud));
		
		
	}

}
