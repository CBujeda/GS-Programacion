package practicas.practica1;

public class Liga {
	
	private String nombre;
	private Equipo[] clasificacion;

	/**
	 * Pre:
	 * Post: Metodo constructor de Liga
	 */
	public Liga(String nombre, Equipo[] clasificacion) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
	}

	/**
	 * METODOS GET
	 */
	public String getNombre() {
		return nombre;
	}
	public Equipo[] getClasificacion() {
		return clasificacion;
	}

	/**
	 * METODOS SET
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setClasificacion(Equipo[] clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	
	
}
