package practicas.practica5;

public class Pregunta {

	private String pregunta;
	private String correcta;
	private String incorrecta;
	public Pregunta () {}
	public Pregunta (String pregunta, String correcta, String incorrecta) {
		this.pregunta = pregunta;
		this.correcta = correcta;
		this.incorrecta = incorrecta;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getCorrecta() {
		return correcta;
	}
	public void setCorrecta(String correcta) {
		this.correcta = correcta;
	}
	public String getIncorrecta() {
		return incorrecta;
	}
	public void setIncorrecta(String incorrecta) {
		this.incorrecta = incorrecta;
	}
	

}
