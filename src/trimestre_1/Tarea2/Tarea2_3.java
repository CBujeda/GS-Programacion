package trimestre_1.Tarea2;

public class Tarea2_3 {
	/**
	 * Pre:
	 * Post: Suma todos los numeros entre 50 y 100
	 */
	public static void main(String[] arg) {
		
		int i = 50;
		int dat = 0;
		while(i <= 100) {
			dat = dat + i;
			i++;
		}
		System.out.print(dat);
		
	}
}
