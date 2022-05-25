package trimestre_3.repaso2.ej1;

public class Tipo {
	
	private String tipo;
	private int cant;
	public Tipo(String tipo, int cant) {
		super();
		this.tipo = tipo;
		this.cant = cant;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public void sum() {
		this.cant++;
	}
	
	

}
