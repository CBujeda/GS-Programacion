package trimestre_3.tarea1_jUnit;

public class Node {
	
	private int content;
	private Node next;
	
	public Node(int content, Node node) {
		this.content = content;
		this.next = node;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node node) {
		this.next = node;
	}
	
	
	
	
}
