package trimestre_2.ArrayList.ejercicio3;
import java.util.Scanner;
import java.util.ArrayList;

public class Inicio {
	public static void main(String[] arg) {
		ArrayList<String> lista = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < (int) Math.round(Math.random()*20+10); i++) {
			lista.add(Integer.toString((int) Math.round(Math.random()*100)));
		}
		
		System.out.println("Ubicacion a buscar");
		System.out.println("Numero maximo a buscar: 0 - " + (lista.size() - 1));
		int dt = sc.nextInt();
		System.out.println("------------------");
		for(int i = 0; i < lista.size(); i++){
			System.out.print("I: " + i + " | " + lista.get(i));
			if(dt == i) {
				System.out.println(" < " + dt + " (indice)");
			}else {
				System.out.println();
			}
		}
		
	}
}
