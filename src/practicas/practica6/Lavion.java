package practicas.practica6;

import practicas.practica6.node_Aviones.Node;
/**
 * Clase la cual hace una lista simple
 */
public class Lavion {
	
	private Node first;
	private int size;
	/**
	 * CONSTRUCTORES
	 */
	public Lavion() {
		this.first = null;
		this.size = 0;
	}
	
	public Lavion(Node first) {
		this.first = first;
		this.size = 1;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual añade un nodo al final de la lista
	 */
	public boolean add(Node node) {
		try {
			if(size == 0) { // si size es 0 el nuevo nodo sera first
				first = node;
			} else {
				Node p = first; // p apunta a first
				for(int i = 1; i < size; i++) {
					p = p.getNext(); // apuntas al siguiente y te vuelves el siguiente
				} p.setNext(node); // Creamos un nodo en el siguiente al ultimo
			} size++;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual añade un nodo en una posicion predeterminada
	 */
	public boolean add(int position, Node node) {
		try {
			if(position == 0) {
				node.setNext(first);
				first = node;
				return true;
			} else if (position == size) {
				return add(node);
			}else {
				Node p = first;
				for(int i = 1; i < position; i++) {
						p = p.getNext();
				}
				node.setNext(p.getNext());
				p.setNext(node);
				size++;
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual elimina un nodo de una posicion predeterminada
	 */
	public boolean delete(int position) {
		try {
			if(position == 0) {
				first = first.getNext();
				size--;
				return true;
			} else if (position == size) {
				Node p = first;
				for(int i = 1; i < position; i++) {
						p = p.getNext();
				}
				p.setNext(null);
				size--;
				return true;
			}else {
				Node p = first;
				for(int i = 1; i < position; i++) {
						p = p.getNext();
				}
				p.setNext(p.getNext().getNext());
				
				size--;
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	
	/**
	 * Pre:
	 * Post: Devuelve el tamaño de la lista
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Pre:
	 * Post: metodo el cual obtienes un nodo de la lista
	 */
	public Node get(int position) {
		try {
			if(position < size && position >= 0) {
				Node p = first;
				for(int i = 0 ; i < position ; i++) {
					p = p.getNext();
				}
				return p;
			}
		} catch (Exception e) {
			System.out.println(e.toString());	
		} return null;
	}
	
	/* Shows */
	/**
	 * Pre:
	 * Post: Metodos show: Muestran los datos de la lista
	 */
	public void show(int position) {show(position, true);   }
	public void show(int position, boolean ln) {
		Node d = get(position);
		if(d != null) {
			System.out.print("("+position+")[ "+d.getContent()+" ]"); 
		}else {
			System.out.print("(?"+position+")[ "+null+" ]"); 
		}
		if(ln == true) {
			System.out.println();
		}
	}
	public void show() {show(true);}
	public void show(boolean ln) {
		Node p = first;
		for(int i = 0; i < size; i++) {
			System.out.print("[ "+p.getContent()+" ] \n");
			p = p.getNext();
		}
		if(ln == true) {
			System.out.println();
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual muestra los aviones con sus embarques
	 */
	public void showEmbarque() {
		Node p = first;
		for(int i = 0; i < size; i++) {
			System.out.print("[ "+p.toString()+" ] \n");
			p = p.getNext();
		}
	}
	
}
