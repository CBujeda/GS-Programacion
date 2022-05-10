package practicas.practica7;



public class Nodo_Socio implements Comparable<Nodo_Socio> {
	private Socio content;
	private Nodo_Socio next;
	
	public Nodo_Socio (Socio content, Nodo_Socio next) {
		this.content = content;
		this.next = next;
	}
	
	public Socio getContent() {
		return content;
	}

	public void setContent(Socio content) {
		this.content = content;
	}

	public Nodo_Socio getNext() {
		return next;
	}

	public void setNext(Nodo_Socio next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return  content + " \n " + next;
	}
	
	@Override
	public int compareTo(Nodo_Socio o) {
		//Hacemos la comparacion
		return this.content.getNombre()
				.toLowerCase().substring(0, 1)
				.compareTo(
						o.content.getNombre().toLowerCase().substring(0,1));
	}
	//
}
