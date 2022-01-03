package practicas.practica1;

public class Equipo {
	private String nombre;
	private String estadio;
	private int fundacion;
	private Jugador[] jugador;
	private int puntosGanados;
	private int puntosPerdidos;
	private int partidosEmpatados;
	private int puntos;

	public Equipo(String nombre, String estadio, int fundacion, Jugador[] jugador, int partidosGanados, int partidosPerdidos, int partidosEmpatados, int puntos) {
		this.nombre = nombre;
		this.estadio = estadio;
		this.fundacion = fundacion;
		this.jugador = jugador;
		this.puntosGanados = partidosGanados;
		this.puntosPerdidos = partidosPerdidos;
		this.partidosEmpatados = partidosEmpatados;
		this.puntos = puntos;
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
	public void setPartidosGanados(int puntosGanados) {
		this.puntosGanados = puntosGanados;
	}
	public void setPartidosPerdidos(int puntosPerdidos) {
		this.puntosPerdidos = puntosPerdidos;
	}
	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
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
	public int getPartidosGanados() {
		return this.puntosGanados;
	}
	public int getPartidosPerdidos() {
		return this.puntosPerdidos;
	}
	public int getPartidosEmpatados() {
		return this.partidosEmpatados;
	}
	public int getPuntos() {
		return this.puntos;
	}
	
	
}

