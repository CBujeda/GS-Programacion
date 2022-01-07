package practicas.practica1;

public class Jugador {
	
	private String nombre;
	private int dorsal;
	private int goles;
	private int redCards;
	private int yellowCards;
	
	/**
	 * En este metodo no puede haber un constructor default ya 
	 * que no puedes crear un jugador sin datos.
	 */
	//public Jugador() {}
	
	/**
	 * Pre:
	 * Post: Metodo constructor Jugador
	 */
	public Jugador(String nombre, int dorsal, int goles, int redCards, int yellowCards) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
		this.redCards = redCards;
		this.yellowCards = yellowCards;
		
	}
	/**
	 *METODOS SET
	 */
	public void setNombre(String dat) {
		this.nombre = dat;
	}
	public void setDorsal(int dat) {
		this.dorsal = dat;
	}
	public void setGoles(int dat) {
		this.goles = dat;
	}
	public void setRedCards(int dat) {
		this.redCards = dat;
	}
	public void setYellowCards(int dat) {
		this.yellowCards = dat;
	}
	
	
	/**
	 * METODOS GET
	 */
	public String getNombre() {
		return this.nombre;
	}
	public int getDorsal() {
		return this.dorsal;
	}
	public int getGoles() {
		return this.goles;
	}
	public int getRedCards() {
		return this.redCards;
	}
	public int getYellowCards() {
		return this.yellowCards;
	}
	
	
	
}
