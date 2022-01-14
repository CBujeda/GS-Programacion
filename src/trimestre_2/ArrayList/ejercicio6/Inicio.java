package trimestre_2.ArrayList.ejercicio6;
import java.util.ArrayList;
public class Inicio {

	public static void main(String[] arg) {
		
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();

		for(int i = 0; i < 10 ; i++) {
			lista1.add(Integer.toString(i));
		}
		for(int i = 0; i < lista1.size(); i++) {
			lista2.add(lista1.get(i));
		}
		
		for(String i: lista1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(String i: lista2) {
			System.out.print(i + " ");
		}
		
	}
}
