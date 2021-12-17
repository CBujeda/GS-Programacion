package trimestre_2.clasesYobjetos.ejercicio3;

public class Television extends Electrodomestico{

	private double resolucion;
	private boolean sintonizadorTDT;
	
	/**
	 * Metodo Constructor 1
	 */
	public Television(){
		super();
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	/**
	 * Metodo Constructor 2
	 */
	public Television(double precio, double peso){
		super(precio, peso);
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	/**
	 * Metodo Constructor 3
	 */
	public Television(double resolucion, boolean sintetizadorTDT, double precio, String color, String consumo,double peso) {
		super(precio,color,consumo,peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintetizadorTDT;
	}
	
	/**
	 * Metodos Get
	 */
	public double getResolucion() {
		return this.resolucion;
	}
	
	public boolean getSintonizadorTDT() {
		return this.sintonizadorTDT;
	}
	
	
	/**
	 * Metodo precio final
	 * Pre:
	 * Post: Calcula los precios finales con dichas condiciones 
	 */
	@Override
	public double precioFinal(double precio){
		super.precioFinal(precio);
		
		if(this.resolucion > 40) { // Calcula el precio en base a la resolucion
			precio = (precio + (precio*0.3));
		}
		if(this.sintonizadorTDT == true) {//calcula el precio en base al sintotizador
			precio = precio + 50;
		}
		return precio;
		
	}
	
}
