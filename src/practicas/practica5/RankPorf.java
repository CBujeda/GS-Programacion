package practicas.practica5;

public class RankPorf {

	private String name;
	private int vida;
	private int puntos;
	
	public RankPorf() {}
	public RankPorf(String name, int vida, int puntos) {
		this.name = name;
		this.vida = vida;
		this.puntos = puntos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	
}
