package trimestre_3.repaso3.ejer3;

public class Inicio {
	
	/*
	 * Diseña un método recursivo en Java que elimine todas las vocales de una frase.
	 */
	
	public static boolean esVocal(String dat) {
		if(dat.equalsIgnoreCase("a") 
				|| dat.equalsIgnoreCase("i") 
				|| dat.equalsIgnoreCase("u") 
				|| dat.equalsIgnoreCase("e") 
				|| dat.equalsIgnoreCase("o")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static String elimVocal( int a,String data) {
		if(a == data.length()) {
			return data;
		}
		String datos = data.substring(a,a+1);
		if(!esVocal(datos)) {
			a++;
			return elimVocal(a,data);	
		} else {
			data = data.substring(0,a) + data.substring(a+1,data.length());
			return elimVocal(a,data);
		}
	}
	
	
	public static void main(String[] arg) {
		System.out.println(elimVocal(0, "Que tal estas?? yo estoy muy muy cansada"));
		
		
		
	}

}
