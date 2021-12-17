package trimestre_1.Tarea2;

public class Tarea2_5 {
	/**
	 * pre:
	 * Post: Muestra todos los pares entre 0 y 100
	 */
	public static void main(String[] arg) {
		
		int i = 0;
		while(i <= 100) {
			if (i%2==0) {
			    System.out.print(i);
			    System.out.print(" ");
			}
			i++;
		}
	}
}
