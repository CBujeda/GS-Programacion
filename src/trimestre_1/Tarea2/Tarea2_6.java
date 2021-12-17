package trimestre_1.Tarea2;

public class Tarea2_6 {
	/**
	 * Pre:
	 * Post: Muestra todos los numeros impares entre 0 y 100
	 */
	public static void main(String[] arg) {
		
		int i = 0;
		while(i <= 100) {
			if (i%2!=0) {
			    System.out.print(i);
			    System.out.print(" ");
			}
			i++;
		}
	}
}
