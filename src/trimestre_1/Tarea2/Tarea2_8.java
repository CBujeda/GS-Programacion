package trimestre_1.Tarea2;
import java.util.Scanner;

public class Tarea2_8 {
	/**
	 *  pre:
	 *  Post: Muestra el mayor y el menor entre 10 numeros
	 */
	public static void main(String[] arg) {
		int n1;
		int may;
		int men;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa 10 numeros");
		System.out.println("------------------");
		
		System.out.print("1: "); n1 = sc.nextInt();
		may = n1;
		men = n1;
		int i = 2;
		while(i <=10) {
			System.out.print(i + ": "); n1 = sc.nextInt();
			if(may < n1) {
				may = n1;
			}else if(n1 < men) {
				men = n1;
			}
		i++;
		}
		System.out.println("----------------------------");
		System.out.println("Menor:" + men + " Mayor: " + may);
	}
}
