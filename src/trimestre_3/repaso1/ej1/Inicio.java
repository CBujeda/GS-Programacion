package trimestre_3.repaso1.ej1;

public class Inicio {

	/*
	 * Diseñad un método recursivo que escriba al revés la cadena que se
	 * le pasa como parámetro, más un índice que se usará para recorrer 
	 * la cadena. Haced dos versiones del mismo, una en la que el índice 
	 * vaya incrementándose a cada llamada y otra en la éste que vaya 
	 * decrementándose
	 */
	
	public static String inversor(String str) {return inversor(str, 0, "");}
	public static String inversor(String str, int i, String salida) {
		
		if(i == str.length()) {
			return salida;
		}else {
			return inversor(str,i+1,salida + str.substring(str.length()-i-1,str.length()-i));
		}
	}
	
	public static String inversorAmenor(String str) {return inversorAmenor(str, str.length(), "");}
	public static String inversorAmenor(String str, int i, String salida) {
		if(i == 0) {
			return salida;
		}else {
			return inversorAmenor(str,i-1,salida + str.substring(i-1,i));
		}
	}
	
	public static void main(String[] arg) {
		
		System.out.println(inversor("Hola"));
		System.out.println(inversorAmenor("Buenas noches"));
		
	}
}
