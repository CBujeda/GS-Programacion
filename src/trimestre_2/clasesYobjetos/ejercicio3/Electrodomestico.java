package trimestre_2.clasesYobjetos.ejercicio3;

public class Electrodomestico {

	private double precio;
	private String color;
	protected String consumo;
	protected double peso;
	
	/**
	 * Metodo Constructor 1
	 */
	public Electrodomestico(double precio, String color, String consumo,double peso) {
		
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumoEnergetico(consumo);
		this.peso = peso;
		// El precio es dependiente del resto de los atributos.
		this.precio = precio;
	}
	
	/**
	 * Metodo Constructor 2
	 */
	public Electrodomestico(double precio,double peso) {
		this.color = "blanco";
		this.consumo = "F";
		this.precio = precio;
		this.peso = peso;
	}
	
	/**
	 * Metodo Constructor 3
	 */
	public Electrodomestico() {
		this.precio = 100;
		this.color = "blanco";
		this.consumo = "F";
		this.peso = 5;
		
	}
	
	/**
	 * Pre:
	 * Post: Comprueba que la letra sea correcta
	 * 		 de no ser asi devolvera la letra de default
	 */
	public String comprobarConsumoEnergetico(String letra){
		if(letra.equalsIgnoreCase("F") || letra.equalsIgnoreCase("A")) {
			return letra;
		}else {
			System.out.println("Consumo erroneo");
			return "F";
		}
	}
	
	/**
	 * Pre:
	 * Post: Comprueba el color que sea correcto
	 * 		 Si no es correcto devolveria el color
	 * 		 por defecto.
	 */
	public String comprobarColor(String color){
		if(color.equalsIgnoreCase("Blanco")
				|| color.equalsIgnoreCase("negro")
				|| color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul")
				|| color.equalsIgnoreCase("gris")){
			return color;
		}else {
			return "Blanco";	
		}
		
	}
	
	/**
	 * Pre:
	 * Post: Devuelve el precio final por su consumo
	 */
	public double precioFinal(double precio){
		if(this.consumo.equalsIgnoreCase("A")) {
			precio = precio + 100; 
		}else if(this.consumo.equalsIgnoreCase("F")) {
			precio = precio + 10;
		}
		if(this.peso >= 0 && this.peso <= 19) {
			precio = precio + 10;
		}else if(this.peso >= 20 && this.peso <= 49) {
			precio = precio + 50;
		}else if(this.peso >= 50 && this.peso <=75) {
			precio = precio + 80;
		}else if(this.peso >= 80) {
			precio = precio + 100;
		}
		return precio;
	}
	
	/**
	 * Metodos Get
	 */
	public double getPrecio() {
		return precio;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getConsumo() {
		return consumo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	/**
	 * Metodos set
	 */
	public void setPrecio(int precio) {
		this.precio = precioFinal(precio);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
