package practicas.practica6;

public class Pasajero {
	
	private String nombre;
	private String dni;
	private int numero_vuelo;
	public Pasajero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pasajero(String nombre, String dni, int numero_vuelo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.numero_vuelo = numero_vuelo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getNumero_vuelo() {
		return numero_vuelo;
	}
	public void setNumero_vuelo(int numero_vuelo) {
		this.numero_vuelo = numero_vuelo;
	}
	@Override
	public String toString() {
		return "Pasajer@ [nombre=" + nombre + ", dni=" + dni + ", numero_vuelo=" + numero_vuelo + "";
	}
	
	

}
