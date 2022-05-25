package trimestre_3.repaso2.ej2;

public class Inicio {
	
	/*
	 * Dada una lista simple enlazada, con los métodos add(), delete() y isEmpty(). 
	 * Implementa un método addComplex() el cual inserta el elemento indicado en la ú
	 * ltima posición de la lista únicamente si este no existe. Si ya está insertado, 
	 * lo que hace es colocarlo de nuevo al final de la misma (sin repetirlo).
	 */
	
	public static void main(String[] arg) {
		SimpleLinkedList l = new SimpleLinkedList();
		l.addcomplex(new Node(1,null));
		l.show();
		l.addcomplex(new Node(2,null));
		l.show();
		l.addcomplex(new Node(3,null));
		l.show();
		l.addcomplex(new Node(1,null));
		l.show();
	}
}
