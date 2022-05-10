package trimestre_3.repaso1.ej2;

public class Tupla {
	
	private String pais;
	private int cantidad;
	public Tupla(String pais, int cantidad) {
		super();
		this.pais = pais;
		this.cantidad = cantidad;
	}
	public Tupla() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setAll(String pais, int cantidad) {
		this.pais = pais;
		this.cantidad = cantidad;
	}
	
	public void aumentar() {
		this.cantidad++; 
	}
	@Override
	public String toString() {
		return "[Pais: " + pais + " | Cantidad: " + cantidad + "]";
	}
	
}
