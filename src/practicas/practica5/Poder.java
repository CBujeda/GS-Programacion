package practicas.practica5;

public class Poder {
	
	private String name;
	private int danno;
	private int defensa;
	
	public Poder () {}
	public Poder (String name, int danno, int defensa) {
		this.name = name;
		this.danno = danno;
		this.defensa = defensa;
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
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}	
}
