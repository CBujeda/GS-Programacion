package trimestre_3.recursividad.ejercicio1;

import java.util.Scanner;

public class Inicio {
	
	public static int sumador(int n) {
		if(n == 0) {
			return 0;
		}else {
			return n+sumador(n-1);
		}
	}
	

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int dato = sc.nextInt();
		System.out.println(sumador(dato));
	}
	
}
