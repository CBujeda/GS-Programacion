package practicas.practica7;

public class Club {
	
	private String nombre;
	private Lista_Socios conjunto_socios;
	
	/**
	 * CONSTRUCTORES
	 */
	public Club(String nombre, Lista_Socios conjunto_socios) {
		super();
		this.nombre = nombre;
		this.conjunto_socios = conjunto_socios;
	}
	
	public Club(String nombre) {
		super();
		this.nombre = nombre;
		this.conjunto_socios = new Lista_Socios();
	}
	
	/**
	 * Pre:
	 * Post: Metodo que llama a ver el conjunto de socios
	 * 		 que conforma un club
	 */
	public void viewSocios() {
		conjunto_socios.show();
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual recive un socio y llama
	 * 		addOrden enviandoselo (añade un socio de forma ordenada)
	 */
	public void addSocio(Socio socio) {
		conjunto_socios.addOrden(new Nodo_Socio(socio,null) );
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual añade los socios de un club al actual
	 */
	public void unionClub(Club club) {
		for(int i = 0; i< club.conjunto_socios.size();i++) {
			addSocio(club.conjunto_socios.get(i).getContent());
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual verifica si la lista de socios esta
	 * 		 Vacia o hay contenido
	 */
	public boolean vacioScios() {
			if(conjunto_socios.size() == 0) {
				return true;
			}else {
				return false;
			}	 
	}
	
	/**
	 * SETERS AND GETTES
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Lista_Socios getConjunto_socios() {
		return conjunto_socios;
	}
	public void setConjunto_socios(Lista_Socios conjunto_socios) {
		this.conjunto_socios = conjunto_socios;
	}
	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return " " + nombre + " ";
	}
	
	
}
