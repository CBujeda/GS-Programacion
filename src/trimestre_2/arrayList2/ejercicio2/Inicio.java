package trimestre_2.arrayList2.ejercicio2;
import java.util.ArrayList;

public class Inicio {
	public static void main(String[] arg) {
		ArrayList<Personas> lista = new ArrayList<Personas>();
		
		int estatic = (int) Math.round(Math.random()* 50);
		
		
		for(int i = 0; i < estatic; i++) {
			lista.add(new Personas(genNomAp(),(int) Math.round(Math.random()* 50)));
		}
		
		int contador = 0;
		for(int i = 0; i < lista.size(); i++) {
			System.out.print("Nombre : " + lista.get(i).getNombre() + ""
							+ " Edad :" + lista.get(i).getEdad());
			if(lista.get(i).getEdad() <= 10) {
				System.out.println("  Paga: " + 1 + "€");
				contador++;
			}else if(lista.get(i).getEdad() <= 17) {
				System.out.println("  Paga: " + 25 + "€");
				contador = contador + 25;
			}else if(lista.get(i).getEdad() >= 18) {
				System.out.println("  Paga: " + 35 + "€");
				contador = contador + 35;
			}else {
				System.out.println("Edad no valida");
			}		
		}
		System.out.println("--------------------------\nTotal de " + contador + "€");

	
	
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
