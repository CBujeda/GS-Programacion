package trimestre_1.Tarea8;
import java.util.Scanner;

public class Tarea8_1 {
	
	
	/**
	 * Pre:
	 * Post: Programa java con método llamado calcularModa
	 * 		 que calcule la moda de una tabla Java. La moda es
	 * 		 el valor con mayor frecuencia que aparece en una
	 * 		 colección de datos. Por ejemplo, si tenemos la tabla:
	 * 		 {1, 1, 2, 1, 4, 1, 2, 1} la moda es 1.
	 */
	private static int calcularModa(int[] table) {
		 int MaxRep= 0;
		 int moda= 0;
		    for(int i=0; i<table.length; i++) { // primer bucle de recorrido principal
		    	System.out.print(i + "> | ");
		        int NumRep= 0;
		        for(int j=0; j<table.length; j++) { // Bucle de comprobacion de numeros
		        	System.out.print(i + ": " + j + " | ");
		            if(table[i]==table[j]) {
		            	NumRep++;
		            }
		            if(NumRep>MaxRep) {
		                moda= table[i];
		                MaxRep= NumRep;
		            }
		        }
		        System.out.println();
		    }
		    return moda;
	}
	
	private static void mostrar(int[] t) {//Muestra la tabla
		System.out.println();
		for(int i=0;i < t.length;i++) {
			System.out.print(" " + t[i] + " |");
		}
		System.out.println();
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de celdas: ");
		int cels = sc.nextInt();
		int [] a = new int [cels];
		for(int i = 0; i < a.length; i++) {
			System.out.print("Celda " + (i + 1) + " :");
			a[i] = sc.nextInt();
		}
		System.out.println("Moda: " + calcularModa(a));
			
	}
}
