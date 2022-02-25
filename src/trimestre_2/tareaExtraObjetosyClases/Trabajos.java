package trimestre_2.tareaExtraObjetosyClases;

public class Trabajos {
	
	private double precio;
	private int id;
	private String description;
	private int horas;
	private boolean finalizado;
	
	public Trabajos(int id, String description) {
		this.id = id;
		this.precio = 0;
		this.horas = 0;
		this.description = description;
		this.finalizado = false;
	}
	
	
	
	public double getPrecio() {
			return precio;
	}

	public void setPrecio(double precio) {
		if(finalizado == false) {
			this.precio = precio;
		}
	}

	public int getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		if(this.finalizado == false) {
			this.horas = horas;
		}
	}
	public boolean getFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	
}
