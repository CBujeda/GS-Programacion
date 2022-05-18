package practicas.practica7;



public class Nodo_Socio implements Comparable<Nodo_Socio> {
	private Socio content;
	private Nodo_Socio next;
	/**
	 * CONSTRUCTORES
	 */
	public Nodo_Socio (Socio content, Nodo_Socio next) {
		this.content = content;
		this.next = next;
	}
	/**
	 * GETERS AND SETERS
	 */
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

	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return  content + " \n " + next;
	}
	/**
	 * Pre:
	 * Post: metodo el cual compara la posicion de la primera
	 * 		 letra de la entrada
	 */
	@Override
	public int compareTo(Nodo_Socio o) {
		//Hacemos la comparacion
		return this.content.getNombre()
				.toLowerCase().substring(0, 1)
				.compareTo(
						o.content.getNombre().toLowerCase().substring(0,1));
	}
}
