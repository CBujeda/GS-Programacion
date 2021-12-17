package trimestre_1.Ej_Repaso;
import java.util.Scanner;

public class Tarea_15 {
	
	private static void mostrar(String[] t) {
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " | ");
		}
	}
	
	public static void compare(String[] t) {
		System.out.println("\nEstan duplicados: ");
		String data = "";
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t.length; j++) {
				if(t[i].equals(t[j])) {
					if(!data.contains(t[j])) {
						System.out.println(t[i]);
						
					}
				}
			}
		}
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int cels = sc.nextInt();
		String[] t = new String [cels];
		
		sc.nextLine();
		for(int i = 0; i < t.length; i++) {
			t[i] = sc.nextLine();
		}
		mostrar(t);
		compare(t);
	}
	
}
