package examenes.prog1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inicio {
	
	/**
	 * Pre:
	 * Post: Dicho metodo es el principal e inicial
	 * 		 muestra datos sobre los pasajeros del titanic
	 * 		 obteniendo datos de un fichero .csv
	 */
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\titanic.csv"); // Creamos objeto file
		try {
			Scanner file = new Scanner(f); // creamos el objeto Scanner
			String [] data;
			if(file.hasNextLine()) { // nos saltamos la primera linea
				file.nextLine();
			}
			double pasajeros = 0; // Variables contadoras (Las dejo como double para que sea posible hacer calulos)
			double cM=0;
			double cF=0;
			double cMFallecido = 0;
			double cFFallecido = 0;
			System.out.println("Cargando...");
			while(file.hasNextLine()) {
				data = file.nextLine().split(","); //Lo separamos por comas
				if(data[5].equalsIgnoreCase("male")) { // Preguntamos su geneo 
					cM++;
					if(data[1].equalsIgnoreCase("0")) {// no lo trato ya que no lo veo necesario
						cMFallecido++;
					}
				}else if (data[5].equalsIgnoreCase("female")) {
					cF++;	
					if(data[1].equalsIgnoreCase("0")) {// no lo trato ya que no lo veo necesario
						cFFallecido++;
					}
				}
				pasajeros++;	
			}
			
			System.out.println("Existen " + pasajeros + " pasajeros");
			System.out.println("Existen " + cM + " hombres");
			System.out.println("Existen " + cF + " mujeres");
			System.out.println("Porcentaje de hombres muertos: " + Math.round((cMFallecido/cM)*100) + "%");
			System.out.println("Total de hombres muertos: " + cMFallecido);
			System.out.println("Porcentaje de mujeres muertas: " + Math.round((cFFallecido/cF)*100) + "%");
			System.out.println("Total de mujeres muertas: " + cFFallecido);	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
