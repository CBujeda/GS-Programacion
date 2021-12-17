package trimestre_1.Tarea2;
import java.util.Scanner;
public class Tarea2_10 {
	/**
	 * pre:
	 * post: Muestra una cantidad previamente 
	 * 		 introducida de numeros de la 
	 * 		 Sucesión de Fibonacci
	 * 		 
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad a mostrar: ");
		int cant = sc.nextInt();
		System.out.println("----------------------");
		int n = 0;
		int n2 = 1;
		int i = 0;
		int g = 0;
		while(i <= (cant - 2)) {
			//n = n-1 + n-2;
			System.out.print(n + ", ");
			// g guarda el valor de n previo para n2
			g = n;
			n = n + n2;
			n2 = g;
			

		i++;	
		}
		System.out.print(n + "....");
	}
}
