package trimestre_2.arrayList3;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] arg) {
		ArrayList<Personas> lista = new ArrayList<Personas>();
		Scanner sc = new Scanner(System.in);
		//Generador de personas:
		for(int i = 0; i < 20; i++) {
			lista.add(new Personas(genNomAp(),genDni()));
		}
		String entrada = "";
		String temp = "";
		while(true) {
			
		System.out.println("1. Paso de frontera.\r\n"
						 + "2. Mostrar todas las personas.\r\n"
						 + "3. Búsqueda por nombre.\r\n"
						 + "4. Búsqueda por DNI.\r\n"
						 + "5. Salir");	
		entrada = sc.next();
		if(entrada.equals("1")) {
			System.out.println("Añadir a una nueva persona");
			System.out.print("Nombre: ");
			entrada = sc.next();
			temp = entrada;
			System.out.print("DNI: ");
			entrada = sc.next();
			lista.add(new Personas(temp,entrada));
			
		}else if(entrada.equals("2")) {
			for(Personas i: lista) {
				System.out.println("Nombre: " + i.getNombre() + " Dni: " + i.getDni());
			}
		}else if(entrada.equals("3")) {
			System.out.println("Busqueda por nombre:");
			System.out.print("Buscar: ");
			entrada = sc.next();
			System.out.println("Se encontraron las siguientes personas:");
			for(int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getNombre().toUpperCase().contains(entrada.toUpperCase())
						|| lista.get(i).getNombre().equalsIgnoreCase(entrada)) {
					System.out.println("Nombre: " + lista.get(i).getNombre() + " Dni: " + lista.get(i).getDni());
					
				}
			}
			System.out.println("---------------------------\n");
		}else if(entrada.equals("4")) {
			System.out.println("Busqueda por dni:");
			System.out.print("Buscar: ");
			entrada = sc.next();
			System.out.println("Se encontraron las siguientes personas:");
			for(int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getDni().toUpperCase().contains(entrada.toUpperCase())
						|| lista.get(i).getDni().equalsIgnoreCase(entrada)) {
					System.out.println("Nombre: " + lista.get(i).getNombre() + " Dni: " + lista.get(i).getDni());
				}
			}
			System.out.println("---------------------------\n");
		}else if(entrada.equals("5")) {
			break;
		}else {
			System.out.println("Elija una opcion valida");
		}
		entrada = "";
		temp = "";
		}	
	}
	
	
	/**
	 * Generador DNI
	 */
	
	public static String genDni() {
		String gen = "";
		String[] abc = abc();
		for(int i = 0; i<9; i++) {
			gen = gen + Integer.toString((int) Math.round(Math.random()*9));
		}
		return gen + abc[(int) (Math.random()*abc.length)];
	}
	
	/**
	 * Pre:
	 * Post: Genera una palabra con caracteres aleatorios
	 */
	public static String genNomAp() {
		//Generador apellidos
		String[] abc = new String[abc().length];
		abc = abc();
		String data = "";
		for(int i = 0; i < Math.random()*12+3; i++) {
			data = data + abc[(int) (Math.random()*abc.length)];
			
		}
		return mayus(data.substring(0, 1)) + data.substring(1,data.length());
	}
	
	
	/**
	 * Pre:
	 * Post: Debuleve un caracter en mayuscula que
	 * 		 se le paso en minuscula
	 */
	public static String mayus(String my) {
		if(my.equalsIgnoreCase("a")) {my = "A";
		}else if(my.equalsIgnoreCase("b")) {my = "B";
		}else if(my.equalsIgnoreCase("c")) {my = "C";
		}else if(my.equalsIgnoreCase("d")) {my = "D";
		}else if(my.equalsIgnoreCase("e")) {my = "E";
		}else if(my.equalsIgnoreCase("f")) {my = "F";
		}else if(my.equalsIgnoreCase("g")) {my = "G";
		}else if(my.equalsIgnoreCase("h")) {my = "H";
		}else if(my.equalsIgnoreCase("i")) {my = "I";
		}else if(my.equalsIgnoreCase("j")) {my = "J";
		}else if(my.equalsIgnoreCase("k")) {my = "K";
		}else if(my.equalsIgnoreCase("l")) {my = "L";
		}else if(my.equalsIgnoreCase("m")) {my = "M";
		}else if(my.equalsIgnoreCase("n")) {my = "N";
		}else if(my.equalsIgnoreCase("o")) {my = "O";
		}else if(my.equalsIgnoreCase("p")) {my = "P";
		}else if(my.equalsIgnoreCase("q")) {my = "Q";
		}else if(my.equalsIgnoreCase("r")) {my = "R";
		}else if(my.equalsIgnoreCase("s")) {my = "S";
		}else if(my.equalsIgnoreCase("t")) {my = "T";
		}else if(my.equalsIgnoreCase("v")) {my = "v";
		}else if(my.equalsIgnoreCase("w")) {my = "W";
		}else if(my.equalsIgnoreCase("x")) {my = "X";
		}else if(my.equalsIgnoreCase("y")) {my = "Y";
		}else if(my.equalsIgnoreCase("z")) {my = "Z";
		}
		return my;
	}
	
	/**
	 * Pre:
	 * Post: Contiene una tabla con el abecedario
	 * 		 la cual esta la devuelve al llamar al metodo.
	 */
	public static String[] abc() {
		String[] abc = new String[] {"a","b","c","d","e","f","g",
				"h","i","j","k","l","m","n","o","p","q","r","s",
				"t","v","w","x","y","z"};
		return abc;
	}
	
}
