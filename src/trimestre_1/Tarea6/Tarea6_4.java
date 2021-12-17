package trimestre_1.Tarea6;

public class Tarea6_4 {
	/*
	 * Pre:
	 * Post: Programa Java que muestre el siguiente patrón (hasta 7, tal
	 *  	 cual se muestra en el ejemplo). Pista: debes utilizar 3 bucles.
	 */
	public static void main(String[] arg) {
		int i = 7;
		int i2 = 0;
		int ast = 1;
		int tercer = 0;
		int sab = (i - ast);
		while(i > 0) {
			while(i2 < ast) {			// Numeros
				System.out.print((i2+ 1));	
				i2++;
			}
			while(tercer < sab) {		//Asteriscos
				System.out.print("*");
				tercer++;
			}	
			sab--;
			tercer = 0;
			ast++;	
			i2 = 0;
			System.out.println("");	//bajar texto
			i--;
		}
	}
		
}