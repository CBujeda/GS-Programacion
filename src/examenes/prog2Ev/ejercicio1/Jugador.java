package examenes.prog2Ev.ejercicio1;

public class Jugador {
	
	private String nombre;
	private int dorsal;
	private int potencia_disparo;
	private int calidad_porteria;
	private int vidas;
	
	/**
	 * METODO CONSTRUCTOR
	 */
	public Jugador(String nombre, int dorsal, int potencia_disparo, int calidad_porteria) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.potencia_disparo = potencia_disparo;
		this.calidad_porteria = calidad_porteria;
		this.vidas = 2;
	}
	
	/**
	 * Pre:
	 * Post: debueleve la habilidad disparo
	 */
	public int habilidadDisparo(){ 
		int total = 0; // sobre 100
		total = this.potencia_disparo - calidad_porteria;
		if(total < 0) {
			total = 0;
		}
		return total;
	} 
	
	/**
	 * Pre:
	 * Post: Devuelve la habilidad porteria
	 */
	public int habilidadPorteria() {
		int total = 0; // sobre 100
		total = ((this.potencia_disparo + calidad_porteria)/2);
		return total;
		
	}

	/**
	 * GETERS AND SETERS
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getPotencia_disparo() {
		return potencia_disparo;
	}

	public void setPotencia_disparo(int potencia_disparo) {
		this.potencia_disparo = potencia_disparo;
	}

	public int getCalidad_porteria() {
		return calidad_porteria;
	}

	public void setCalidad_porteria(int calidad_porteria) {
		this.calidad_porteria = calidad_porteria;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	
}
