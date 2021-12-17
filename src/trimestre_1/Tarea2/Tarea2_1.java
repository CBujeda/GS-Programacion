package trimestre_1.Tarea2;

public class Tarea2_1 {
/**
 * Pre:
 * Post: Un bucle while que envia el texto "Texto nº" + la variable i
 * 		 i = Variable iteradora
 * 		 El bucle se repetira unas 10 veces
 */
	public static void main(String[] arg) {
		
		int i = 0;
		while(i != 10) {
			System.out.println("Texto nº " + (i+1));
			i++;
		}
	}
}
