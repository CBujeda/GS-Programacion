package trimestre_2.clasesYobjetos.ejercicio2;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni; 
	private String sexo;
	private int peso;
	private int altura;
	
	/**
	 * Metodo Constructor 1
	 */
	public Persona(String nombre, int edad, String dni,String sexo, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	/**
	 * Metodo Constructor 2
	 */
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "";
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}
	
	/**
	 * Metodo Constructor 3
	 */
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = "";
		this.peso = 0;
		this.altura = 0;
	}
	
	/**
	 * Calculador de IMC
	 */
	public int calcularICM() {
		int imc = (peso / (altura/100)^2);
		if(imc < 20) {imc = -1;
		}else if(imc >= 20 && imc <= 25) {
			imc = 0;
		}else if(imc > 25) {
			imc = 1;
		}else {
			imc = 10;
		}
		
		return imc;
	}
	
	/**
	 * Calculador de mayoria de edad
	 */
	public boolean esMayorDeEdad() {
		boolean may;
		if(edad >= 18) {
			may = true;
		}else {
			may = false;
		}
		return may;
	}
	
	/**
	 * Comprobador de s3X0
	 */
	public String comprobarSexo(String sexo) {
		if(sexo.equalsIgnoreCase("H")) {
			System.out.println("H");
		}else if(sexo.equalsIgnoreCase("M")) {
			System.out.println("M");
		}else if(sexo.equalsIgnoreCase("O")) {
			System.out.println("O");
		}else {
			sexo = "H";
		}
		return sexo;
	}
	
	/**
	 * Metodo toString
	 */
	@Override
	public String toString() {
		String str = (nombre+ "," + edad +","+ dni +","+ sexo +","+ peso +","+ altura);
		return str;
	}
	
	/**
	 * Generador de DNI
	 * pre:
	 * Post: Genera un dni aleatorio
	 */
	public String generaDNI() {
		String[] abc = new String[] {"A","B","C","D","E","F","G"
									,"H","I","J","K","L","M","N"
									,"O","P","Q","R","S","T","U"
									,"W","X","Y","Z"};
		String dni = "";
		int aleatorio;
		for(int i = 0; i < 8; i++) {
			aleatorio = (int)(Math.random()*10+1);
			dni = (dni + aleatorio);
		}
		dni = dni + abc[((int)(Math.random()*(abc.length))+1)];
		return dni;
	}
	
	/**
	 * Mostar datos
	 */
	public void show() {
		System.out.println(nombre+ "," + edad +","+ dni +","+ sexo +","+ peso +"kg,"+ altura+ "cm");
	}
	
	
	/**
	 * Metodos Get
	 */
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	/**
	 * Metodos Set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
}
