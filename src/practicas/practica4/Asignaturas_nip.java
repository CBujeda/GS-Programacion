package practicas.practica4;

public class Asignaturas_nip {
	
	private int nip;
	private int cod_asig;
	private String asig;
	
	public Asignaturas_nip (int nip, int cod_asig, String asig) {
		this.nip = nip;
		this.cod_asig = cod_asig;
		this.asig = asig;
		
	}

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
	

}