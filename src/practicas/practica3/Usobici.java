package practicas.practica3;

public class Usobici {
	
	private String [] tlinea;
	
	public Usobici (String linea) {
		this.tlinea = linea.split(";");
	}
	
	public boolean esCircular() {
		if(tlinea[2].trim().equalsIgnoreCase(this.tlinea[4].trim())){
			// es circular
			return true; 
		} else {
			// es traslado
			return false;
		}
	}
	
	public String[] uso() {
		return this.tlinea;
	}
	
	
}
