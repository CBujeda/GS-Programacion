package practicas.Practica3_origin.practica3;

public class Usobici {
	
	private String [] tlinea;
	
	/**
	 * Constructor de Usobici
	 * Pre:
	 * Post: guarda el String obtenido como tabla
	 * 		 usando como dibisor el ";"
	 */
	public Usobici (String linea) {
		this.tlinea = linea.split(";");
	}
	
	/**
	 * Pre:
	 * Post: Dicho metodo devuelve si es circular o no
	 */
	public boolean esCircular() {
		if(tlinea[2].trim().equalsIgnoreCase(this.tlinea[4].trim())){
			// es circular
			return true; 
		} else {
			// es traslado
			return false;
		}
	}
	
	/**
	 * Pre:
	 * Post: Dicho metodo devuelve la tabla almacenada
	 * Dicho metodo actua como el get asi que debido a esto
	 * suprimo en comentario el get
	 */
	public String[] uso() {
		return this.tlinea;
	}

	/**
	 * METODOS GETERS Y SETERS
	 */
	
	// --Dicho metodo devuelve la tabla almacenada hace lo mismo que uso() 
	//public String[] getTlinea() {
	//	return tlinea;
	//}
	
	public void setTlinea(String[] tlinea) {
		this.tlinea = tlinea;
	}
	
	
	
	
}
