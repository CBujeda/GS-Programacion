package trimestre_3.cola;

import trimestre_3.stack.Node;

public class Cola {

	private Node first;
	private Node last;
	private int size = 0 ;
	
	
	public Cola() {
		super();
	}

	public Cola(Node first, Node last) {
		this.first = first;
		this.last = last;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean push(Node node) {
		
		try {
			if(size == 0) {
				first = node;
				last = node;
				size++;
				return true;
			}else if( size == 1) {
				node.setNext(first);
				last = node;
				size++;
				return true;
			}else {
				node.setNext(last);
				node = last;
				size++;
				return true;
			}
		} catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}	
	}
	
	public Node pop() {
		
		Node p = last;
		for(int i = 0; i < size-1; i++) {
		 p = p.getNext();	
		}
		first = p;
		return first;	
	}

	
	public boolean isEmpty() {
		if(size == 0) {
			return false;
		}else {
			return true;
		}
	}
}
