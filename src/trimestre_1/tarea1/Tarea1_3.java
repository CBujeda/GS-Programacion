package trimestre_1.tarea1;
/**
 * 
 * @author Clara
 * Implementa un programa Java que muestre por pantalla el resultado de
 * las siguientes operaciones:
 */
public class Tarea1_3 {
	public static void main(String[] arg) {
		int var1 = -5;
		int var2 = 8;
		int var3 = 6;
		int sol = var1 + var2 * var3;
		
		System.out.println("-5 + 8 * 6 = " + sol);
		
		var1 = 55;
		var2 = 9;
		var3 = 9;
		sol = (var1 + var2) % var3;
				
		System.out.println("(55+9) % 9 = " + sol);
		
		var1 = 20;
		var2 = -3;
		var3 = 5;
		int var4 = 8;
		sol = var1 + var2 * var3 / var4;
				
		System.out.println("20 + -3*5 / 8 = " + sol);
		
		
	}
	
}
