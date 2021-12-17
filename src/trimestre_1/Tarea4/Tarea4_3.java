package trimestre_1.Tarea4;

public class Tarea4_3 {
	
	/**
	 * Pre:
	 * Post: Programa Java que muestra unicamente 
	 * 		 la suma de los numeros enteros entre 
	 * 		 50 y 100 
	 * 
	 */
	public static void main(String[] arg) {
		int num = 0;
		for(int i = 50; i < 101; i++) {
			num = num + i;
			System.out.print(i + " + ");
			
		}
		System.out.println("0");
		System.out.println("----------------");
		System.out.println(num);
		
	}
}
