package practicas.practica4;

public class Asignaturas_nip implements Comparable<Asignaturas_nip> {
	
	private int nip;
	private int cod_asig;
	private String asig;
	
	/**
	 * CONSTRUCTORES
	 */
	public Asignaturas_nip () {
	}
	
	public Asignaturas_nip (int nip, int cod_asig, String asig) {
		this.nip = nip;
		this.cod_asig = cod_asig;
		this.asig = asig;	
	}

	/**
	 * GETERS AND SETERS
	 */
	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public int getCod_asig() {
		return cod_asig;
	}

	public void setCod_asig(int cod_asig) {
		this.cod_asig = cod_asig;
	}

	public String getAsig() {
		return asig;
	}

	public void setAsig(String asig) {
		this.asig = asig;
	}
	
	public void setAll(int nip, int cod_asig, String asig) {
		this.nip = nip;
		this.cod_asig = cod_asig;
		this.asig = asig;
	}

	@Override
	public int compareTo(Asignaturas_nip o) {
		
		//Hacemos la comparacion
		return this.asig.toLowerCase().compareTo(o.asig.toLowerCase());
	}


}
