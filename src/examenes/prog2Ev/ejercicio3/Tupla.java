package examenes.prog2Ev.ejercicio3;

public class Tupla {
	
	private String nombre;
	private int cantidad;
	/**
	 * METODO CONSTRUCTOR
	 */
	public Tupla(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	/**
	 * Pre:
	 * Post: añade 1 a cantidad
	 */
	public void setAdd() {
		this.cantidad++;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
}
