package practicas.practica6;

import practicas.practica6.node_Pasajeros.Node;

public class Pila {
	
	private int size;
	private Node last;
	public Pila() {
	}
	
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
	
	public Node pop() {
		Node p = last;
		last = last.getNext();
		size--;
		return p;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return false;
		}else {
			return true;
		}
	}

	
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
