package practicas.Practica3_origin.practica3;

public class UsuarioBici {
	
	private int usuario;
	private int traslados;
	private int circular;
	private int total;
	// Nota el total lo podemos calcular
	//--------------------Usuario--Total traslados-Total circular-total
	public UsuarioBici(int usuario, int traslados, int circular, int total) {
		this.usuario = usuario;
		this.traslados = traslados;
		this.circular = circular;
		this.total = total;
	}
	
	/**
	 * METODOS PRINCIPALES
	 * Pre:
	 * Post: Al llamarlos aumentan en 1 su variable
	 */
	public void sumTraslados() {
		this.traslados++;
	}
	
	public void sumCircular() {
		this.circular++;
	}
	
	public void sumTotal() {
		this.total++;
	}
	
	/*--------------------
	 * GETERS Y SETERS
	 *-------------------- 
	 */
	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getTraslados() {
		return traslados;
	}

	public void setTraslados(int traslados) {
		this.traslados = traslados;
	}

	public int getCircular() {
		return circular;
	}

	public void setCircular(int circular) {
		this.circular = circular;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	/**
	 * Set general
	 * Pre:
	 * Post: Actualiza todos los datos del objeto
	 */
	public void setAll(int usuario, int traslados, int circular, int total) {
		this.usuario = usuario;
		this.traslados = traslados;
		this.circular = circular;
		this.total = total;
	}
	
}
