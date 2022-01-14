package trimestre_2.ArrayList.ejercicio10;
import java.util.ArrayList;

public class Inicio {

	public static void main(String[] arg) {
		ArrayList<String> lista1 = new ArrayList<String>();
		ArrayList<String> lista2 = new ArrayList<String>();
		ArrayList<String> lista3 = new ArrayList<String>();
		
		for(int i = 0; i < 20; i++) {
			lista1.add(Integer.toString(i));
			lista2.add(Integer.toString(i*20));
		}
		//Era posible hacerlo en dos bucles pero preferi hacerlo en uno para optimizar
		for(int i = 0; i < lista1.size()+lista2.size(); i++) { 
			if(i >= lista1.size()) {
				lista3.add(lista2.get(i-lista1.size()));
			}else {
				lista3.add(lista1.get(i));
			}
		}
		
		for(String i: lista3) {
			System.out.print(i + "|");
		}
		
		
	}
}
