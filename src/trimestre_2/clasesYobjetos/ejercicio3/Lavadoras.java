package trimestre_2.clasesYobjetos.ejercicio3;

public class Lavadoras extends Electrodomestico {
	
	private double carga;
	
	/**
	 * Metodo Constructor 1
	 */
	public Lavadoras(double precio, String color, String consumo,double peso, double carga){
		super(precio, color, consumo, peso);
		this.carga = carga;
	}
	
	/**
	 * Metodo Constructor 2
	 */
	public Lavadoras(double precio,double peso){
		super(precio, peso);
		this.carga = 5;
	}
	
	/**
	 * Metodo Constructor 3
	 */
	public Lavadoras(){
		this.carga = 5;
	}
	
	/**
	 * Metodo Get
	 */
	public double getCarga() {
		return this.carga;
	}
	
	
	/**
	 * Metodo precio final
	 * Pre:
	 * Post: Calcula los precios finales con dichas condiciones 
	 */
	@Override
	public double precioFinal(double precio){
		if(this.consumo.equalsIgnoreCase("A")) { //Calcula el precio en base al consumo
			precio = precio + 100; 
		}else if(this.consumo.equalsIgnoreCase("F")) {
			precio = precio + 10;
		}
		if(this.peso >= 0 && this.peso <= 19) { //Calcula el precio en base a el peso
			precio = precio + 10;
		}else if(this.peso >= 20 && this.peso <= 49) {
			precio = precio + 50;
		}else if(this.peso >= 50 && this.peso <=75) {
			precio = precio + 80;
		}else if(this.peso >= 80) {
			precio = precio + 100;
		}
		if(this.carga > 50) { // Calcula el precio en base a la carga
			precio = precio + 50;
		}
		return precio;
		
	}
}
