package trimestre_2.ArrayList.ejercicio11;
import java.util.ArrayList;
public class Inicio {
	
	public static void main(String[] arg) {
		ArrayList<String> lista = new ArrayList<String>();
		for(int i = 0; i < 20; i++) {
			lista.add(randomAbc(abc()));
		}
		
		for(String i: lista) {
			System.out.print(i + " | ");
		} 
		String[] abc = abc();
		String temp = "";
		for(int i = 0; i < abc.length; i++) {
			for(int r = 0; r < lista.size(); r++) {
				for(int q = r + 1; q < lista.size(); q++) {
					if(lista.get(q).equalsIgnoreCase(abc[i])) {
						temp = lista.get(q); 
						lista.set(q, lista.get(r));
						lista.set(r, temp);
						
					}
				}	
			}
		}
		System.out.println();
		for(String i: lista) {
			System.out.print(i + " | ");
		} 
	}
	
	public static String randomAbc(String[] abc) {
		return abc[(int) Math.round(Math.random()*(abc.length-1))];	 
	}
	
	public static String [] abc() {
		String[] abc = new String [] {"a","b","c","d","e","f","g","h","i",
										"j","k","l","m","n","o","p","q","r",
										"s","t","v","w","y","z"};
		return abc;
	}
}
