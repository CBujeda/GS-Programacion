package practicas.practica6;

import practicas.practica6.node_Pasajeros.Node;
/**
 * Clase la cual hace una lista de tipo cola
 */
public class Cola {
	private Node first;
	private Node last;
	private int size = 0 ;
	
	/**
	 * CONSTRUCTORES
	 */
	public Cola() {
		super();
	}

	public Cola(Node first, Node last) {
		this.first = first;
		this.last = last;
	}
	
	/**
	 * GETERS AND SETERS
	 */
	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual añade un nodo a la cola
	 */
	public boolean push(Node node) {
		
		try {
			if(size == 0) {
				first = node;
				last = node;
				size++;
				return true;
			}else {
				Node p = last;
				p.setNext(node);
				last = node;
				
				size++;
				return true;
			}
		} catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}	
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual saca un nodo de la cola
	 */
	public Node pop() {
		Node p = null; 
		try {
			if(size > 0) {
				p = first;
				first = first.getNext();
				size--;
			}else {
				System.out.println("(X) [NO POP] NO DATA");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return p;	
	}

	/**
	 * Pre:
	 * Post: Metodo el cual indica si existen nodos en la cola
	 */
	public boolean isEmpty() {
		if(size == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodos show: muestran el contenido de la cola
	 */
	public void show() {show(true);}
	public void show(boolean ln) {
		if(size > 0) {
			Node p = first;
			System.out.print("(First)");
			for(int i = 0; i < size; i++) {
				System.out.print("[ "+p.getContent()+" ]");
				p = p.getNext();
			}
			System.out.print("(Last)");
			if(ln == true) {
				System.out.println();
			}
		} else {
			System.out.println("(X) [NO SHOW] NO DATA");
		}
	}

	@Override
	public String toString() {
		return "Cola [Lista= \n" + first + "]";
	}
	
	
}
