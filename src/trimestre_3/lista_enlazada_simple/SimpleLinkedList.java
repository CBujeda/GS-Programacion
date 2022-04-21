package trimestre_3.lista_enlazada_simple;

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
	
	public int size() {
		return size;
	}
	
	public void show() {
		Node p = first;
		for(int i = 0; i < size; i++) {
			System.out.print("("+i+")[ "+p.getContent()+" ] -> ");
			p = p.getNext();
		}
		System.out.println();
	}
}
