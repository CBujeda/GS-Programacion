package trimestre_2.wordleBuscador;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordleSearch {

	public static void main(String[] arg) {
		try {
			Scanner sc = new Scanner(System.in);			
			String[] f = new String [5];
			for(int i = 0; i < 5; i++) {
				System.out.print("Letra["+i+"]");
				f[i] = sc.next();
			}
			int cierto = 0;                        // ubicacion archivo
			Scanner file = new Scanner(new File("C:\\Users\\USUARIO\\eclipse-workspace\\Programacion\\src\\trimestre_2\\wordleBuscador\\diccionario.txt"));
			String temp = "";
			System.out.println("--------------");
			while(file.hasNextLine()) {
				cierto = 0;
				temp = file.nextLine();
				if(temp.length() == 5) {
					for(int i = 0; i < 5; i++) {
						if(!f[i].equalsIgnoreCase("*") ) {
							if(f[i].equalsIgnoreCase(temp.substring((i),(1 + i))) ) {
								cierto++;
							}
						}else { cierto++; }
					}
					if(cierto == 5) {
						System.out.println(temp);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
