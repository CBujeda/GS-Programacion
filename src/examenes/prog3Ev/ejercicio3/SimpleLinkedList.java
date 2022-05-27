package examenes.prog3Ev.ejercicio3;

/**
 * Objeto el cual contiene una lista de datos
 */
public class SimpleLinkedList {

	private Node first;
	private int size;
	public SimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public SimpleLinkedList(Node first) {
		this.first = first;
		this.size = 1;
	}

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
	 * Post: Método el cual elimina el número mayor de la lista
	 */
	public boolean eliminarMayor() {
		Tupla t = new Tupla();
		t.setIndex(0);
		t.setNode(new Node(0,null));
		for(int i = 0; i < size; i++) {
			if(get(i).getContent() > t.getNode().getContent()) {
				t.setIndex(i);
				t.setNode(get(i));
			}
		}
		System.out.println("Eliminando en el siguiente indice: "
				+ t.getNode().getNext().getContent());
		return delete(t.getIndex());
	}
	
	/**
	 * Pre:
	 * Post: Método el cual añade un dato a la lista 
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
	 * Post: Método el cual añade un dato a la lista en una posición determinada
	 */
	public boolean add(int position, Node node) {
		try {
			if(position == 0) {
				node.setNext(first);
				first = node;
				size++;
				return true;
			} else if (position == size) {
				return add(node);
			} else {
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
	 * Post: Método el cual elimina un dato de la lista en una posición determinada
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
			} else {
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
	 * Post: Método el cual devuelve el tamaño de una lista
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Pre:
	 * Post: Método el cual obtiene un dato de una lista mediante un índice
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

	/**
	 * Pre:
	 * Post: Métodos los cuales muestran los datos por pantalla
	 */
	public void show(int position) {show(position, true);   }
	public void show(int position, boolean ln) {
		Node d = get(position);
		if(d != null) {
			System.out.print("("+position+")[ "+d.getContent()+" ]"); 
		} else {
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
			System.out.print("("+i+")[ "+p.getContent()+" ] -> ");
			p = p.getNext();
		}
		if(ln == true) {
			System.out.println();
		}
	}
}
