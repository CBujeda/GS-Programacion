package trimestre_2.ArrayList.ejercicio2;
import java.util.ArrayList;

public class Inicio {

	public static void main(String[] arg) {
		ArrayList<String> lista = new ArrayList<String>();
		
		for(int i = 0; i < 14; i++) {
			lista.add(Integer.toString(i));
		}
		
		lista.add(0,"Primer valor");
		
		for(String i: lista) {
			System.out.println(i);
		}
		
	}
}
