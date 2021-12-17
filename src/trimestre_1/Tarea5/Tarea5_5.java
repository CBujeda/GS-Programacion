package trimestre_1.Tarea5;
import java.util.Scanner;
public class Tarea5_5 {
	
	/**
	 * Pre:
	 * Post: Programa Java que solicite al usuario 
	 * 		 una cadena de caracteres (String) y 
	 * 		 muestre por pantalla el número de veces
	 * 		 que aparece la sub-cadena “aaa” dentro
	 * 		 de dicho String. Ej: usuario introduce
	 * 		 “aabaabaababababaa” –&gt; el resultado
	 * 		 debe ser: “Número de veces que aparece aa: 4”
	 * 		 (Ingnora Mayusculas Y minusculas)
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		int count = 0;
		String cadena = "aaa";
		String process;
		int lc = cadena.length();
	    for(int i=0; i < (txt.length()-2); i++) { //Recorrido por el texto
	    	//System.out.println(txt.substring(i, (i+lc)) );
	    	process = txt.substring(i, (i+lc));	//proceso texto
	    	if(process.equalsIgnoreCase(cadena) ) {	//Comparo la cadena
	            count++;
	            //System.out.println(count);
	        }	
	    }
	    System.out.println(count);
	}
}
