package examenes.prog3Ev.ejercicio2;

public class DivYear {

	private int year;
	private int cont;
	public DivYear(int year, int cont) {
		super();
		this.year = year;
		this.cont = cont;
	}
	public DivYear() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	public void sum() {
		cont++;
	}
	
	
}
