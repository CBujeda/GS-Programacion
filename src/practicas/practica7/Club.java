package practicas.practica7;

public class Club {

	private String nombre;
	private Lista_Socios conjunto_socios;
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
	
	public void addSocio(Socio socio) {
		conjunto_socios.addOrden(new Nodo_Socio(socio,null) );
	}
	
	public void unionClub(Club club) {
		for(int i = 0; i< club.conjunto_socios.size();i++) {
			addSocio(club.conjunto_socios.get(i).getContent());
		}
	}
	
	public boolean vacioScios() {
			if(conjunto_socios.size() == 0) {
				return true;
			}else {
				return false;
			}	 
	}
	

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
	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", conjunto_socios=" + conjunto_socios + "]";
	}
	
	
}
