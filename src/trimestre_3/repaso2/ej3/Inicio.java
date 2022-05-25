package trimestre_3.repaso2.ej3;

public class Inicio {
	
	/**
	 * Diseña un método recursivo "esPalindromo()" que devuelva true, sí y 
	 * solo sí, la palabra introducida es igual si se lee de izquierda a
	 *  derecha que de derecha a izquierda.
	 */
	
	public static boolean esPalindromo(boolean bool, String b){
		int a = b.length();
		if(a == 0 || a == 1) {
			return true;
		}
		if(b.substring(0,1).equalsIgnoreCase(b.substring(a-1,a))) {
			b = b.substring(1,b.length()-1);
			return esPalindromo(true, b);
		}else {
			return false;
		}
	}
	
	
	
	public static void main(String[] arg) {
		System.out.println(esPalindromo(true, "abbba"));
	}

}
