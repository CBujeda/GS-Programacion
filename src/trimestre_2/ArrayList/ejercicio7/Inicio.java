package trimestre_2.ArrayList.ejercicio7;
import java.util.ArrayList;

public class Inicio {

	public static void main(String[] arg) {
		ArrayList<String> lista = new ArrayList<String>();
		
		for(int i = 0; i < 10; i++) {
			lista.add(Integer.toString(i));
		}
		for(String i: lista) {
			System.out.print(i +"|");
		}
		System.out.println("\n" + lista.size()/2 + " - " + lista.size());
		
		for(int i = 0; i < lista.size(); i++) {
			lista.add(0,lista.get(i));
			i++;
		}
		int constante = lista.size();
		for(int i = lista.size()/2; i < constante; i++) {
			lista.remove((constante/2));
		}
		
		System.out.println();
		for(String i: lista) {
			System.out.print(i +"|");
		}		
	}
}
