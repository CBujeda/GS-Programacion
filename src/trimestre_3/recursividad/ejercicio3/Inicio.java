package trimestre_3.recursividad.ejercicio3;

public class Inicio {

	public static void recorrer(int[] t) {recorrer(t,0);}
	private static void recorrer(int[] t,int i) {
		if(i < t.length) {
			System.out.println(t[i]);
			recorrer(t,i+1);
		}
	}
	

	
	public static void main(String[]arg) {
		
		int[] t ={1,2,3,4};
		recorrer(t);
		
	}
}
