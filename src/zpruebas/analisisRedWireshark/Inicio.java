package zpruebas.analisisRedWireshark;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class Inicio {

	public static void main(String[] arg) {
		
		File entrada = new File("C:\\eclip\\analisis_red.csv");
		File salida = new File("C:\\eclip\\analisis_red_filtrado.csv");
		String ip = "192.168.1.64";
		int cont = 0;
		try {
			Scanner efile = new Scanner(entrada);
			Formatter sfile = new Formatter(salida); 
			
			sfile.format(" \"Id\",\"time\", \"salida\",\"entrada\", \"Protocolo\", \"Datos\" \n");
			
			while (efile.hasNextLine()) {
				String datos = efile.nextLine();
				String[] data = datos.split(",");
				for(int i = 0; i < data.length; i++) {
					System.out.print(i);
					
				}
				if(data[2].substring(1,data[2].length()-1).equalsIgnoreCase(ip)
						|| data[3].substring(1,data[3].length()-1).equalsIgnoreCase(ip)) {
					sfile.format(datos.replaceAll("%", "%%") + "\n");
					cont++;
				}
				System.out.println();
			}
			efile.close();
			sfile.close();
			
		
	 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fallo en Scanner");
			e.printStackTrace();
		}
		
		
	}
}
