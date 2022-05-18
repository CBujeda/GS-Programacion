package practicas.practica7;

public class Nodo_Club {
	private Club content;
	private Nodo_Club next;
	/**
	 * CONSTRUCTORES
	 */
	public Nodo_Club() {
		content = new Club("");
		next = null;
		// TODO Auto-generated constructor stub
	}
	public Nodo_Club(Club content, Nodo_Club next) {
		super();
		this.content = content;
		this.next = next;
	}
	/**
	 * GETERS AND SETERS
	 */
	public Club getContent() {
		return content;
	}
	public void setContent(Club content) {
		this.content = content;
	}
	public Nodo_Club getNext() {
		return next;
	}
	public void setNext(Nodo_Club next) {
		this.next = next;
	}
	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "" + content + "";
	}
	
	
	
}
