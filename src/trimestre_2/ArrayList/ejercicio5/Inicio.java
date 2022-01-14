package trimestre_2.ArrayList.ejercicio5;
import java.util.ArrayList;

public class Inicio {
	
	public static void main(String[] arg) {
		ArrayList<String> lista = new ArrayList<String>();
		for(int i = 0; i < 10; i++) {
			lista.add(Integer.toString(i));
		}
		lista.remove(3);
		
		for(String i: lista) {
			System.out.println(i);
		}
		
	}
	
}
