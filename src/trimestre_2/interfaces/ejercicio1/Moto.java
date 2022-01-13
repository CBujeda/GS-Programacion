package trimestre_2.interfaces.ejercicio1;

public class Moto implements Vehiculo {
	
	private String frenar;
	private String acelerar;
	private int velocidad;
	
	public Moto (String frenar, String acelerar) {
		this.frenar = frenar;
		this.acelerar = acelerar;
		
	}

	public Moto (String frenar, String acelerar, int velocidad) {
		this.frenar = frenar;
		this.acelerar = acelerar;
		this.velocidad = velocidad;
	}
	
	@Override
	public String frenar(int cuanto) {
		// TODO Auto-generated method stub
		this.velocidad = this.velocidad - cuanto;
		return Integer.toString(this.velocidad);
	}

	@Override
	public String acelerar(int cuanto) {
		// TODO Auto-generated method stub
		this.velocidad = this.velocidad + cuanto;
		return Integer.toString(this.velocidad);
	}

	public String getFrenar() {
		return frenar;
	}

	public void setFrenar(String frenar) {
		this.frenar = frenar;
	}

	public String getAcelerar() {
		return acelerar;
	}

	public void setAcelerar(String acelerar) {
		this.acelerar = acelerar;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

		
}
