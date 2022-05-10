package trimestre_3.repaso1.ej3;

public class Inicio {
	/*
	 * Dada una lista doblemente enlazada que almacena datos de tipo entero, 
	 * con el método añadir() y eliminar(). Diseña un método llamado 
	 * sePuedeObtener(int numero) que devuelve true sí y solo sí, el número pasado
	 * como parámetro se puede obtener de la suma de dos de los nodos de la lista. Ejemplo:

               Contenido de la lista: 3 -> 2 -> 9 -> 10
               Número pasado por parámetro: 13
               Resultado: 3 + 10 = 13 -----> RETURN TRUE
	 */
	
	
	public static void main(String[] arg) {
		
		Lde l = new Lde();
		
		for(int i = 0; i < 10; i++) {
			l.add(i);
		}
		l.show();
		System.out.println(l.sePuedeObtener(17));
		
	}
}
