package trimestre_3.stack;

public class Stack {

	private int size;
	private Node last;
	public Stack() {
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


	@Override
	public String toString() {
		return "Stack [last=" + last + "]";
	}
	
	
	
}
