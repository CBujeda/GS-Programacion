package practicas.practica6;

import practicas.practica6.node_Pasajeros.Node;

public class Pila {
	
	private int size;
	private Node last;
	/**
	 * CONSTRUCTOR
	 */
	public Pila() {
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual añade un nodo a una pila
	 */
	public boolean push(Node node) {
		try {
			if(size == 0) {
				last = node;
			} else {
				node.setNext(last);
				last = node;
			}size++;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual saca un nodo de la pila
	 */
	public Node pop() {
		Node p = last;
		last = last.getNext();
		size--;
		return p;
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual indica si existen nodos en la pila
	 */
	public boolean isEmpty() {
		if(size == 0) {
			return false;
		}else {
			return true;
		}
	}

	/**
	 * GETERS AND SETERS
	 */
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	@Override
	public String toString() {
		return "Pila [Lista= \n" + last + "]";
	}
	
	
}
