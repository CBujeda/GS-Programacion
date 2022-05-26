package trimestre_3.repaso3.ejer1;

public class Paletra implements Comparable<Paletra> {

	private String letra;
	private int cont;
	public Paletra(String letra, int cont) {
		super();
		this.letra = letra;
		this.cont = cont;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
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
	
	@Override
	public int compareTo(Paletra o) {
		// TODO Auto-generated method stub
		return letra.compareTo(o.getLetra());
	}
}
