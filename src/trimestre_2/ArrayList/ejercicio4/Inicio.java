package trimestre_2.ArrayList.ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
	public static void main(String[] arg) {
		ArrayList<String> lista = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 12; i++) {
			lista.add(Integer.toString(i));
			
		}
		for(String i: lista) {
			System.out.print(i + " ");
		}
		System.out.println("\n Numero maximo a indice: 0 - " + (lista.size() - 1));
		System.out.println("Indice: ");
		int dt = sc.nextInt();
		System.out.println("Texto:");
		sc.nextLine();
		String b = sc.nextLine();
		lista.set(dt, b);
		
		for(String i: lista) {
			System.out.print(i + " ");
		}
	}
}
