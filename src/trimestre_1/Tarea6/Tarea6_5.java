package trimestre_1.Tarea6;
import java.util.Scanner;

public class Tarea6_5 {
	  /**
	   * Pre:
	   * Post:  Escribe un programa Java que muestre 
	   * 		por pantalla las potencias de n^1 hasta
	   * 		 n^4 de los números desde 1 hasta n, donde
	   * 		 n es un número entero escrito por el usuario.
	   */
	
	
	static int poten (int num, int pow){
	        if (pow == 0) // Si la potencia es 0 el resultado siempre es 0
	            return 1;	// Por ende devuelve 1
	        else
	        	//el numero se multiplica por el metodo poten(con el numero, y la potencia -1)
	        	//en resumen llamamos al metodo en el metodo.
	            return num * poten(num, pow - 1); 
	    }
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hasta que numero? : ");
		int i2 = sc.nextInt();
		int n = 1;
		System.out.println("n^1   n^2   n^3   n^4");
		
		while(i2 > 0) {

			System.out.println(poten(n,1) + "     " + poten(n,2)+ "     " + poten(n,3) + "     " + poten(n,4));
			n++;
			i2--;
			
		}
		
	}

}
