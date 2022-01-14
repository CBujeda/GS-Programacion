package trimestre_2.ArrayList.ejercicio9;
import java.util.ArrayList;

public class Inicio {
	public static void main(String[] arg) {
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		
		int size = 0;
		for(int i = 0; i < 10; i++) {
			lista1.add(Integer.toString((int) Math.round(Math.random()*10)));
			lista2.add(Integer.toString((int) Math.round(Math.random()*10)));
			size++;
		}
		

		for(int i = 0; i < size; i++) {
			System.out.print("| " + lista1.get(i) + " | " + lista2.get(i) + " |");
			if(lista1.get(i).equals(lista2.get(i))) {
				System.out.println(" < " + "(Iguales)");
			}else{
				System.out.println();
			}

		}
	}	
}
