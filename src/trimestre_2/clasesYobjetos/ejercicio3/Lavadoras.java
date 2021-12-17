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
		super.precioFinal(precio);
		if(this.carga > 50) { // Calcula el precio en base a la carga
			precio = precio + 50;
		}
		return precio;
		
	}
}
