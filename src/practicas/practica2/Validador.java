package practicas.practica2;

public class Validador {

	/*
	 * Pre:
	 * Post: si una celda existe en la tabla devuelve true en caso contrario sera false
	 */
	public static boolean esCeldaValida(int j, int r, boolean t[][]) {
		  return (0 <= j && j < t.length && 0 <= r && r < t[0].length);
		 }
}
