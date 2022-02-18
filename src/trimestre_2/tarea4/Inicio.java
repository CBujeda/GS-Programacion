package trimestre_2.tarea4;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Inicio {
	
	/**
	 * Pre:
	 * Post: Programa java el cual pregunta	una cadena de palabras
	 * 		 las cuales contara en un fichero de texto
	 */
	public static void main(String[] arg) {
		File f = new File("C:\\eclip\\texto.txt");
		Scanner sc = new Scanner(System.in);
		ArrayList<Palabra> list = new ArrayList<Palabra>();
		System.out.print("Escriba la cadena de palabras a buscar: ");
		String [] data = sc.nextLine().split(" ");
		sc.close();
		for(int i = 0; i < data.length; i++) {
			list.add(new Palabra(data[i],0));
		}
		
		try {
			Scanner	file = new Scanner(f);
			String datos;
			while(file.hasNext()) { // Comparamos y contamos (tratamos texto)
				datos = file.next().replaceAll(",", "").replaceAll("\\.", "").replaceAll(";", "").trim();
				for(int i = 0; i < list.size();i++) {
					if(datos.equalsIgnoreCase(list.get(i).getWord())) {
						list.get(i).sumCont();
					}
				}	
			}
			
			for(int i = 0; i < list.size(); i++) { // mostramos la cantidad
				System.out.println(list.get(i).getWord() + " > " + list.get(i).getCont());
			}
			
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
