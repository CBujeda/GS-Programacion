package practicas.practica4;

public class Alumno_codigo {
	
	private String alumno;
	private int nip;
	private int codigo;
	
	public Alumno_codigo(String alumno, int nip, int codigo) {
		this.alumno = alumno;
		this.nip = nip;
		this.codigo = codigo;	
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setAll(String alumno, int nip, int codigo) {
		this.alumno = alumno;
		this.nip = nip;
		this.codigo = codigo;	
		
	}
	
}
