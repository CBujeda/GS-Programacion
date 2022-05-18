package practicas.practica7;

public class Socio {

	private String nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private String fecha_incorporacion;
	/**
	 * CONSTRUCTORES
	 */
	public Socio(String nombre, String primer_apellido, String segundo_apellido, String fecha_incorporacion) {
		super();
		this.nombre = nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.fecha_incorporacion = fecha_incorporacion;
	}
	public Socio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Socio(String nombre) {
		super();
		this.nombre = nombre;
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
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}
	public String getSegundo_apellido() {
		return segundo_apellido;
	}
	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}
	public String getFecha_incorporacion() {
		return fecha_incorporacion;
	}
	public void setFecha_incorporacion(String fecha_incorporacion) {
		this.fecha_incorporacion = fecha_incorporacion;
	}
	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Socio [Nombre: " + nombre + ", 1º Apellido: " + primer_apellido + ", 2º Apellido: "
				+ segundo_apellido + ", Fecha Incorporacion: " + fecha_incorporacion + "]";
	}
	
	
}
