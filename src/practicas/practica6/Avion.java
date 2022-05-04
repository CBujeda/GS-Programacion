package practicas.practica6;

public class Avion {
	
	private String nombre;
	private int id_avion;
	private Lemb embarcados;
	/**
	 * CONSTRUCTORES
	 */
	public Avion() {
		super();
	}
	public Avion(String nombre, int id_avion, Lemb embarcados) {
		super();
		this.nombre = nombre;
		this.id_avion = id_avion;
		this.embarcados = embarcados;
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
	public int getId_avion() {
		return id_avion;
	}
	public void setId_avion(int id_avion) {
		this.id_avion = id_avion;
	}
	public Lemb getEmbarcados() {
		return embarcados;
	}
	public void setEmbarcados(Lemb embarcados) {
		this.embarcados = embarcados;
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual muestra los datos que contiene avion
	 */
	public String dataString() {
		return "Avion [Nombre= " + nombre + ", id_avion= " + id_avion + ", "+ embarcados +"] \n";
	}
	
	@Override
	public String toString() {
		return "Avion [Nombre= " + nombre + ", id_avion= " + id_avion + ", embarcados (Lista de embarcados)]";
	}

	
}
