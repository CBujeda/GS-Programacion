package examenes.prog3Ev.ejercicio3;

/**
 * Clase con la cual confirmamos que funciona la lista enlazada simple
 */
public class Inicio {
	
	/**
	 * Pre:
	 * Post: Método principal el cual confirma que la lista enlazada simple elimina el numero mayor
	 */
	public static void main(String[] arg) {
		SimpleLinkedList l = new SimpleLinkedList();
		for(int i = 0; i < 10;i++) {
			l.add(new Node(i,null));
		}
		l.add(2,new Node(50,null));
		l.show();
		l.eliminarMayor();
		l.show();
		
	}
}
