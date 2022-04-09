package practicas.practica5;

public class Character {

	private String name;
	private Avatar avatar;
	private Arma arma;
	private Poder poder;
	
	public Character() {}
	public Character(String name,Avatar avatar,Arma arma, Poder poder) {
		this.name = name;
		this.avatar = avatar;
		this.arma = arma;
		this.poder = poder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Avatar getAvatar() {
		return avatar;
	}
	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public Poder getPoder() {
		return poder;
	}
	public void setPoder(Poder poder) {
		this.poder = poder;
	}
	
	
}
