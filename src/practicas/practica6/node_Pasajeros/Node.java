package practicas.practica6.node_Pasajeros;

import practicas.practica6.Pasajero;

public class Node {
	
	private Pasajero content;
	private Node next;
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Node(Pasajero content, Node next) {
		super();
		this.content = content;
		this.next = next;
	}
	public Pasajero getContent() {
		return content;
	}
	public void setContent(Pasajero content) {
		this.content = content;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "[" + content + ",\n" + next + "]";
	}
	
	

}
