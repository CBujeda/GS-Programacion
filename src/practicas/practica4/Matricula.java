package practicas.practica4;

public class Matricula {

	private int nip_alumno;
	private int cod_asignatura;
	
	/**
	 * CONSTRUCTOR
	 */
	public Matricula(int nip_alumno, int cod_asignatura) {
		this.nip_alumno = nip_alumno;
		this.cod_asignatura = cod_asignatura;
	}

	/**
	 * GETERS AND SETERS
	 */

	public int getNip_alumno() {
		return nip_alumno;
	}

	public void setNip_alumno(int nip_alumno) {
		this.nip_alumno = nip_alumno;
	}

	public int getCod_asignatura() {
		return cod_asignatura;
	}

	public void setCod_asignatura(int cod_asignatura) {
		this.cod_asignatura = cod_asignatura;
	}
	
	public void setNulo() {
		this.nip_alumno = -1;
		this.cod_asignatura = -1;
	}
	
	@Override
	public String toString() {
		return "Matricula [nip_alumno=" + nip_alumno + ", cod_asignatura=" + cod_asignatura
				+ "]";
	}
	
	
}
