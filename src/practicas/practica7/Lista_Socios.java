package practicas.practica7;

public class Lista_Socios {
	private Nodo_Socio first;
	private int size;
	/**
	 * CONSTRUCTORES
	 */
	public Lista_Socios() {
		this.first = null;
		this.size = 0;
	}
	
	public Lista_Socios(Nodo_Socio first) {
		this.first = first;
		this.size = 1;
	}

	public Nodo_Socio getFirst() {
		return first;
	}
	
	/**
	 * GETERS AND SETES
	 */
	public void setFirst(Nodo_Socio first) {
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
	 * Post: metodo el cual añade un nodo de socio
	 * 		 a la lista
	 */
	public boolean add(Nodo_Socio node) {
		try {
			if(size == 0) { // si size es 0 el nuevo nodo sera first
				first = node;
			} else {
				Nodo_Socio p = first; // p apunta a first
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
	 * Post: Metodo el cual añade un nodo socio ordenado
	 * 		 a la lista
	 */
	public void addOrden(Nodo_Socio node) {
		Nodo_Socio p = first;
		if(size > 0) {
			boolean fin = true;
			for(int i = 0; i < size; i++) {
					if(p.compareTo(node) >= 0) {						
						add(i,node);
						fin = false;
						break;
					}
					p = p.getNext();
			}
			if(fin == true) {
				add(node);
			}
		} else if(size == 0) {
			add(node);
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual añade un nodo socio a una posicion
	 * 		 de la lista
	 */
	public boolean add(int position, Nodo_Socio node) {
		try {
			if(position == 0) {
				node.setNext(first);
				first = node;
				size++;
				return true;
			} else if (position == size) {
				return add(node);
			}else {
				Nodo_Socio p = first;
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
	 * Post: Metodo el cual elimine un nodo
	 * 		 de una posicion de la lista 
	 */
	public boolean delete(int position) {
		try {
			if(position == 0) {
				first = first.getNext();
				size--;
				return true;
			} else if (position == size) {
				Nodo_Socio p = first;
				for(int i = 1; i < position; i++) {
						p = p.getNext();
				}
				p.setNext(null);
				size--;
				return true;
			}else {
				Nodo_Socio p = first;
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
	 * Post: metodo el cual devuelve el tamaño
	 * 		 de la lista
	 */
	public int size() {
		return size;
	}
	
	public Nodo_Socio get(int position) {
		try {
			if(position < size && position >= 0) {
				Nodo_Socio p = first;
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
	 * Post: metodo el cual muestra los datos de los socios de la
	 * 		 lista
	 */
	public void show(int position) {show(position, true);   }
	public void show(int position, boolean ln) {
		Nodo_Socio d = get(position);
		if(d != null) {
			System.out.print("("+position+")[ "+d.getContent()+" ]"); 
		}else {
			System.out.print("(?"+position+")[ "+null+" ]"); 
		}
		if(ln == true) {
			System.out.println();
		}
	}
	public void show() {
		Nodo_Socio p = first;
		for(int i = 0; i < size; i++) {
			System.out.print("("+i+")[ "+p.getContent()+" ] ->  \n");
			p = p.getNext();
		}
		System.out.println();
	}
	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Lista_Socios > \n" + first;
	}
	
	
}
