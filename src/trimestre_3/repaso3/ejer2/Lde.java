package trimestre_3.repaso3.ejer2;

import java.util.ArrayList;

public class Lde {

	private int size = 0;
	private Node first;
	public Lde() {
		super();
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean eliminar(ArrayList<Integer> t) {
		boolean bool = true;
		for(int i = 0; i < t.size(); i++) {
			boolean tem =delete(t.get(i)-i);
			if(tem == false) {
				bool = false;
			}
		}
		
		return bool;
		
		
	}
	
	public boolean delete(int position) {
		Node p = first;
		try {
			if(position == 1) {
				if(size > 1) {
					first = p.getNext();
					p.getNext().setPrevious(null);
				} else {
					first = null;
				}
			}else { 
				
				for(int i = 0; i < position-1; i++) {
					p = p.getNext();
				}
				if(position == size) {
					p.getPrevious().setNext(null);
				}else {
					p.getPrevious().setNext(p.getNext());
					p.getNext().setPrevious(p.getPrevious());
				}
			}
			size--;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
		
	}
	
	public boolean add(Node node) {
		try {
			if(size == 0) {
				first = node;
				size++;
			}else {
				Node p = first;
				for(int i = 0; i < size-1; i++) {
					p = p.getNext();
				}
				node.setPrevious(p);
				p.setNext(node);
				size++;
			}
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}	
	}
	
	public boolean add(Node node, int position) {
		try {
			if(position == 1) {
				node.setNext(first);
				first.setPrevious(node);
				first = node;
				size++;
			}else if(position == size) {
				Node p = first;
				for(int i = 0; i < size; i++) {
					p = p.getNext();
				}
				p.setNext(node);
				node.setPrevious(p);
				size++;
			}else {
				Node p = first;
				for(int i = 0; i < position-1; i++) {
					p = p.getNext();
				}
				node.setNext(p);
				node.setPrevious(p.getPrevious());
				p.getPrevious().setNext(node);
				node.getNext().setPrevious(node);		
				size++;
			}
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
		
	}
	
	public void show() {show(true);}
	public void show(boolean ln) {
		try {
			if(size > 0) {
				Node p = first;
				System.out.print("┌");
				for(int i = 0; i < size-1; i++) {
					System.out.print("[ "+p.getContent()+" ]->");
					p = p.getNext();
				}
				System.out.print("[ "+p.getContent()+" ]");
				System.out.println("(Next)");
				System.out.print("└");
				for(int i = 0; i < size-1; i++) {
					System.out.print("[ "+p.getContent()+" ]->");
					p = p.getPrevious();
				}
				System.out.print("[ "+p.getContent()+" ]");
				System.out.print("(Previous)");
				
				if(ln == true) {
					System.out.println();
				}
			} else {
				System.out.println("(X) [NO SHOW] NO DATA");
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
