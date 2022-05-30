package examenes.edd.edd3ev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjerciciosTest {
	
	/** CORRECTA
	 * Pre:
	 * Post: metodo el jUnit el cual muestra si el metodo
	 * 		 numeroPalabras funciona correctamente
	 */
	@Test
	public void numeroPalabrasTest() {
		int palab = Ejercicios.numeroPalabras("hola buenas que tal estas?? yo estoy muy bien");
		assertEquals(palab+"", 9+"");
		String dat = "";// comprobacion para strings grandes
		for(int i = 0; i < 600; i++) {
			dat = dat + "a ";
		}
		int datp = Ejercicios.numeroPalabras(dat);
		assertEquals(datp+"", 600+"");
		int datp2 = Ejercicios.numeroPalabras("   ");// comprobamos si no hay palabras
		assertEquals(datp2+"", 0+"");
	}
	

	/** INCORRECTA
	 * Prueba 1 sin Vocales
	 * No elimina las "o"
	 * Pre:
	 * Post metodo jUnit el cual comprueba si sinVocales 
	 * 		muestra una palabra correctamente
	 */
	@Test
	public void sinVocalesTest() {
		String dat = Ejercicios.sinVocales("hola");
		assertEquals(dat, "hl");
	}
	
	/** INCORRECTA
	 * Prueba 2 sin Vocales (Confirmacion)
	 * No elimina las "o"
	 * Pre:
	 * Post metodo jUnit el cual comprueba si sinVocales 
	 * 		elimina todas las vocales
	 */
	@Test
	public void sinVocalesTest2() {
		String dat = Ejercicios.sinVocales("aiueo");
		assertEquals(dat, "");
	}
	
	/** CORRECTA
	 * Comprobamos que de una lista del -2 al 7 desordenada
	 * nos la ordena
	 * Pre:
	 * Post: Metodo jUnit el cual comprueba si el metodo quicksort
	 * 		 funciona correctamante con numeros negativos
	 */
	@Test
	public void quicksortTest() {
		int[] dat = new int[] {-1,3,1,4,0,5,6,7,-2,2};
		Ejercicios.quicksort(dat, 0, dat.length-1);
		for(int i = 0; i < dat.length;i++) {
			int comp = i-2;
			assertEquals(dat[i],comp);
		}
	}
	
	/** CORRECTA
	 * Comprobamos con un numero duplicado, nos lo devuelve
	 * de forma correcta
	 * Pre:
	 * Post: Metodo jUnit el cual comprueba sie el metodo
	 * 		 quicksort funciona correctamente en el caso de
	 * 		 tener dos numeros iguales
	 */
	@Test
	public void quicksortTest2() {
		int[] dat = new int[] {-1,3,1,4,0,5,-8,-8,6,-7,7,
								-2,2,-3,-4,-6,-5};
		Ejercicios.quicksort(dat, 0, dat.length-1);
		assertEquals(dat[0]+"",-8+"");
		for(int i = 0; i < dat.length-1;i++) {
			int comp = i-8;
			assertEquals(dat[i+1],comp);
		}
	}
}
