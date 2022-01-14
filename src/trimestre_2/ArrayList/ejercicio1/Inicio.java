package trimestre_2.ArrayList.ejercicio1;
import java.util.ArrayList;

public class Inicio {

	public static void main(String[] arg) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Azul");
		lista.add("Verde");
		lista.add("Rojo");
		lista.add("Amarillo");
		lista.add("Magenta");
		lista.add("Purpura");
		lista.add("Celeste");
		lista.add("Ababol");
		lista.add("Carmesi");
		
		for(String i: lista) {
			System.out.println(i);
		}
		
		
	}
}
