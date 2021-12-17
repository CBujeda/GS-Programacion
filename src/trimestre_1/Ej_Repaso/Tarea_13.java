package trimestre_1.Ej_Repaso;
import java.util.Scanner;

/**
 * Programa java el cual compara dos tablas y muestra 
 * los datos que son iguales y sus dichas posiciones
 */
public class Tarea_13 {
	
	private static void mostrar(String[] t) {
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " | ");
		}
	}
	
	private static void compare(String[] t1, String[] t2) {
		System.out.println();
		for(int i = 0; i < t1.length; i++) {
			for(int j = 0; j < t2.length; j++) {
				if(t1[i].equals(t2[j])) {
					System.out.println("(P:" + i + ") DT1: " + t1[i] + " = "
							+ "(P:" + j + ") DT2: " + t2[j]); // P = Posicion DT2 = Valor
				}
			}
		}
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cledas t1:");
		int cels = sc.nextInt();
		String[] t1 = new String [cels];
		System.out.print("Cledas t2:");
		cels = sc.nextInt();
		String[] t2 = new String [cels];
		
		System.out.println("\nIntroduzca los valores de la t1:\n");
		sc.nextLine();
		for(int i = 0; i < t1.length; i++) {
			System.out.print("T1 D" + i + ": ");
			t1[i] = sc.nextLine();	
		}
		mostrar(t1);
		System.out.println("\nIntroduzca los valores de la t2:\n");
		for(int i = 0; i < t2.length; i++) {
			System.out.print("T2 D" + i + ": ");
			t2[i] = sc.nextLine();	
		}
		mostrar(t2);
		compare(t1,t2);
	}
}
