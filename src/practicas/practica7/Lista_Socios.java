package practicas.practica7;


public class Lista_Socios {
	private Nodo_Socio first;
	private int size;
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

	public void setFirst(Nodo_Socio first) {
		this.first = first;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
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
	
	public void addOrden(Nodo_Socio node) {
			Nodo_Socio p = first;
		if(size > 1) {
			for(int i = 0; i < size; i++) {
				
					System.out.println(p.getNext().compareTo(node));
					if(p.getNext().compareTo(node) <= 0) {
						add(i,node);
						break;
					}
					p = p.getNext();
				// revisar
			}
		} else if(size == 1){
			if(first.compareTo(node) <= 0) {
				add(1,node);	
			} else {
				add(0,node);
			}
		} else {
			add(node);
		}
		show();
	}
	
	
	public boolean add(int position, Nodo_Socio node) {
		try {
			if(position == 0) {
				node.setNext(first);
				first = node;
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
	public void show() {show(true);}
	public void show(boolean ln) {
		Nodo_Socio p = first;
		for(int i = 0; i < size; i++) {
			System.out.print("("+i+")[ "+p.getContent()+" ] ->  \n");
			p = p.getNext();
		}
		if(ln == true) {
			System.out.println();
		}
	}

	@Override
	public String toString() {
		return "Lista_Socios > \n" + first;
	}
	
	
}
