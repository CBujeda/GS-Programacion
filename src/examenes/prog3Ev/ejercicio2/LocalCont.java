package examenes.prog3Ev.ejercicio2;

/**
 * Objeto el cual almacena una Localidad con su cantidad respectiva
 */
public class LocalCont {

	private String local;
	private int cont;
	public LocalCont(String local, int cont) {
		super();
		this.local = local;
		this.cont = cont;
	}
	public LocalCont() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	public void setAll(String local, int cont) {
		this.local = local;
		this.cont = cont;
	}
	
	public void sum() {
		cont++;
	}
	
}
