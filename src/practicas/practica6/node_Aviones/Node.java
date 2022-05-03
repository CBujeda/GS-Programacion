package practicas.practica6.node_Aviones;

import practicas.practica6.Avion;

public class Node {
	
	private Avion content;
	private Node next;
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Node(Avion content, Node next) {
		super();
		this.content = content;
		this.next = next;
	}
	public Avion getContent() {
		return content;
	}
	public void setContent(Avion content) {
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
		return content.dataString();
	}
}
