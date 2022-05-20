package trimestre_3.tarea1_jUnit;

public class Stack {

	private int size;
	private Node last;
	public Stack() {
		push(new Node(0,null));
		push(new Node(0,null));
	}
	
	
	public boolean push(Node node) {	
		try {
			if(node.getContent() > 2 && node.getContent() < 50 || size < 2) {
				if(size == 0) {
					last = node;
				} else {
					node.setNext(last);
					last = node;
				}size++;
				return true;
				
			}else {
				System.out.println("Es <=2 o >= 50");
				return false;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	
	public Node pop() {
		
		if(size > 2) {
			Node p = last;
			last = last.getNext();
			size--;
			return p;
		} else {
			System.out.println("No se pueden desapilar los 2 primeros");
			return null;
		}
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return false;
		}else {
			return true;
		}
	}
	

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "Stack [last=" + last + "]";
	}
	
	
	
}
