package trimestre_1.Tarea10;
/**
 * 
 * Programa Java que ordena la tabla dada alfabéticamente, 
 *   y muestra el resultado final por pantalla.
 * 
 */

public class Tarea10_5 {
	
	/**
	 * Pre:
	 * Post: Muestra La tabla dada
	 */
	private static void mostrar(String[] t) { 
		for(int i = 0; i< t.length; i++) {
			System.out.print(t[i] + " |");
		}		
	}
	
	/**
	 * Pre:
	 * Post: Odrena alfabeticamente la tabla dada
	 */
	private static void comp(String[] t) {
		String abc[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m"
							,"n","o","p","q","r","s","t","v","w","x","y","z"};
		String[] t2 = new String [t.length];
		System.out.println("--------------------------");
		int ite = 0;
		for(int i = 0; i < abc.length; i++) {
			for(int j = 0; j < t.length; j++) {
				if((t[j].substring(0,1)).equalsIgnoreCase(abc[i])) {
							System.out.print(abc[i]);
							System.out.print(t[j].substring(0,1));
							System.out.print("-");
							t2[ite] = t[j];
							ite++;
				}	
			}
		}
		System.out.println();
		System.out.println("--------------------------");
		mostrar(t2);
	}
	
	/**
	 * Pre:
	 * Post: Crea la tabla inicial y llama al metodo camp
	 */
	public static void main(String[] arg) {
		String t[] = {"Pepe", "Juan", "María", "Antonio", "Luisa"};
		comp(t);

	}
}
