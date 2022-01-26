package trimestre_2.ficherosTexto.escritura;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class Ej1 {
	
	public static boolean isInteger(String dato) {
        try {
        	Double.parseDouble(dato);
        	return true;
        }catch(NumberFormatException e) {
            return false;
        }
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Ubicacion del archivo");
		//String eStr = sc.nextLine;
		//Formatter f = new Formatter(eStr);
		String eStr = "";
		try {
			
			Formatter f = new Formatter("C:\\Users\\USUARIO\\Documents\\ejemploescritura.txt");
			
			while(true) {
				System.out.print("Linea:");
				eStr = sc.nextLine();
				//eStr = sc.next();
				if(!eStr.contains(" ")) {
					if(!eStr.equalsIgnoreCase("fin")) {
						if(isInteger(eStr)) {
							System.out.println("El numero ( " + eStr + " ) se ha escrito en el fichero");
						}else {
							System.out.println("El texto ( " + eStr + " ) se ha escrito en el fichero");
						}
						f.format(eStr + "\n");
					}else {
						f.close();
						System.out.println("Progrma finalizado");
						break;
					}
				}else {
					System.out.println("No puedes contener espacios");
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR AL GENERAR EL FICHERO");
			e.printStackTrace();
		}
		
		
		
	}
}
