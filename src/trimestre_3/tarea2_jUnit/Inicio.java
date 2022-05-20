package trimestre_3.tarea2_jUnit;

public class Inicio {
	
	
	public static String[] vocales() {
		return new String[] {"a","i","u","e","o"};
	}
	
	
	public static boolean consonante(String dato) {
		String[] v = vocales();
		boolean consonante = true;
		for(int i = 0; i < v.length; i++) {
			if(v[i].equalsIgnoreCase(dato)) {
				consonante = false;
			}
			
		}
		return consonante;
	}
	
	public static int contador(String cadena) {
		int c = 0;
		int v = 0;
		cadena = cadena.replaceAll(" ", "");
		for(int i = 0 ; i < cadena.length(); i++) {
			System.out.println(cadena.substring(i,i+1));
			if(consonante(cadena.substring(i,i+1))) {
				c++;
			}else {
				v++;
			}	
		}	
		System.out.println("Vocales: " + v + " Consonantes: " + c);
		return c+v;
	}
	
	public static void main(String[] arg) {
		contador("Que tal");
		
		
	}

}
