package trimestre_3.repaso4.ejer1;

public class Provincias {

	private String prov;
	private int cont;
	
	public Provincias() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Provincias(String prov, int cont) {
		super();
		this.prov = prov;
		this.cont = cont;
	}
	public String getProv() {
		return prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}	
	public void setAll(String prov, int cont) {
		this.prov = prov;
		this.cont = cont;
	}
	public void sum() {
		cont++;
	}
	
}
