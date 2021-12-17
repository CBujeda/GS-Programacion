package trimestre_1.Ej_Repaso;
import java.util.Scanner;

public class Tarea_9 {
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 == n2) {
			System.out.println(n1 + " = " + n2);
			}else if(n1 != n2) {
				System.out.println(n1 + " != " + n2);
				if(n1 < n2) {
					System.out.println(n1 + " < " + n2);
				}else if(n1 > n2) {
					System.out.println(n2 + " < " + n1);
				}
		}
	}
}
