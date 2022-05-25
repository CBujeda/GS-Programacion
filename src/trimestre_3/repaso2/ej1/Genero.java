package trimestre_3.repaso2.ej1;

public class Genero {
	
	private String genero;
	private int cont;
	public Genero(String genero, int cont) {
		super();
		this.genero = genero;
		this.cont = cont;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void sum() {
		this.cont++;
	}

}
