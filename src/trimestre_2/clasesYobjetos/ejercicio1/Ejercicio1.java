package trimestre_2.clasesYobjetos.ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad de cuentas:");
		int p = sc.nextInt();
		Cuenta[] c = new Cuenta[p];
		
		String titular;
		int cantidad;
		for(int i = 0; i < c.length; i++) {
			System.out.println("Cuenta " + (i+1) + ":");
			System.out.print("-> Nombre:");
			titular = sc.next();
			System.out.print("-> Cantidad:");
			cantidad = sc.nextInt();
			c[i] = new Cuenta(titular, cantidad);
		}
		System.out.println("--------------------");
		for(int i = 0; i < c.length; i++) {
			c[i].show();
			System.out.println("--------------------");
		}
		
		
	}
}
