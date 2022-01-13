package trimestre_2.interfaces.ejercicio1;

public class Coche implements Vehiculo{
	
	private int plazas;
	private String color;
	private String frenar;
	private String acelerar;
	private int velocidad;
	
	public Coche (int plazas, String color, String frenar, String acelerar) {
		this.plazas = plazas;
		this.color = color;
		this.frenar = frenar;
		this.acelerar = acelerar;
		
	}
	
	public Coche (int plazas, String color, String frenar, String acelerar, int velocidad) {
		this.plazas = plazas;
		this.color = color;
		this.frenar = frenar;
		this.acelerar = acelerar;
		this.velocidad = velocidad;
	}

	@Override
	public String frenar(int cuanto) {
		this.velocidad = this.velocidad - cuanto;
	
		return Integer.toString(this.velocidad);
	}

	@Override
	public String acelerar(int cuanto) {
		this.velocidad = this.velocidad + cuanto;
		return Integer.toString(this.velocidad);
	}
	
	public int getplazas() {
		
		return 0;
	}
	
	public String getColor() {
		return "";
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
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

	public void setColor(String color) {
		this.color = color;
	}

	
}
