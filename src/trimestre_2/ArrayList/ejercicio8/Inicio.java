package trimestre_2.ArrayList.ejercicio8;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] arg) {
		ArrayList<String> lista = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N: ");
		int n = sc.nextInt();
		System.out.print("M: ");
		int m = sc.nextInt();
		System.out.println("Borrando datos entre: " + n + " - " + m);
		for(int i = 0; i < 30; i++) {
			lista.add(Integer.toString(i));
		}
		for(String i: lista) {
			System.out.print(i + "|");
		}
		
		System.out.println();
		for(int i = 0; i <= (m-n); i++) {
			lista.remove(n);
		}
		
		for(String i: lista) {
			System.out.print(i + "|");
		}
		
	
	}
}
