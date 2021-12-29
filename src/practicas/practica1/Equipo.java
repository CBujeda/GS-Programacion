package practicas.practica1;

public class Equipo {
	private String nombre;
	private String estadio;
	private int fundacion;
	private Jugador[] jugador;
	private int puntosGanados;
	private int puntosPerdidos;
	private int partidosEmpatados;

	public Equipo(String nombre, String estadio, int fundacion, Jugador[] jugador, int puntosGanados, int puntosPerdidos, int partidosEmpatados) {
		this.nombre = nombre;
		this.estadio = estadio;
		this.fundacion = fundacion;
		this.jugador = jugador;
		this.puntosGanados = puntosGanados;
		this.puntosPerdidos = puntosPerdidos;
		this.partidosEmpatados = partidosEmpatados;
	}
	/**
	 * METODOS SET
	 */
	public void setNombre(String dat) {
		this.nombre = dat;
	}
	public void setEstadio(String dat) {
		this.estadio = dat;
	}
	public void setJugador(Jugador[] jugador) {
		this.jugador = jugador;
	}
	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}
	public void setPuntosGanados(int puntosGanados) {
		this.puntosGanados = puntosGanados;
	}
	public void setPuntosPerdidos(int puntosPerdidos) {
		this.puntosPerdidos = puntosPerdidos;
	}
	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}
	
	/**
	 * METODOS GET
	 */
	public String getNombre() {
		return this.nombre;
	}
	public String getEstadio() {
		return this.estadio;
	}
	public int getFundacion() {
		return this.fundacion;
	}
	public Jugador[] getJugadores() {
		return this.jugador;
	}
	public int getPuntosGanados() {
		return this.puntosGanados;
	}
	public int getPuntosPerdidos() {
		return this.puntosPerdidos;
	}
	public int getPartidosEmpatados() {
		return this.partidosEmpatados;
	}
	
	
	
}

