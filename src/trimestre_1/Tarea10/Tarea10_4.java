package trimestre_1.Tarea10;

/**
 *  Programam java el cual crea 3 tablas y calcula el 
 *  precio de ellas y lo muestra por pantalla los datos ordenados
 *  con el formato prebiamente dicho
 */
public class Tarea10_4 {
	

	/**
	 * Pre:
	 * Post: Calcula el precio total y muestra por pantalla los datos
	 */
	private static void calule(int[][] kilos, int[] precios, String[] frutas) {
		int[] result = new int [precios.length];
		for(int i = 0; i < kilos.length; i++) {
			for(int j = 0; j < kilos[i].length; j++) {
				result[i] = kilos[i][j] + result[i];
			}
		}
		for(int i = 0; i < result.length; i++) {
			System.out.print(frutas[i] + " => " + result[i] + "kg * " + precios[i] + "€");
			result[i] = result[i] * precios[i]; 
			System.out.println(" = " + result[i]);	
		}
	}
	
	/**
	 * Pre:
	 * Post: Crea las tablas de kilos frutas y precios y llama al metodo calule
	 */
	public static void main(String[] arg) {
		int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
		String frutas[] = {"Pera", "Manzana"};
		int precios[] = {6, 7};
		calule(kilos,precios,frutas);
		
	}
}
