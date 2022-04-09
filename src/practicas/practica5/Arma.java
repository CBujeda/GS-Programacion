package practicas.practica5;

public class Arma {

	private String name;
	private int danno;
	public Arma() {}
	public Arma(String name, int danno) {
		this.name = name;
		this.danno = danno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDanno() {
		return danno;
	}
	public void setDanno(int danno) {
		this.danno = danno;
	}
}
