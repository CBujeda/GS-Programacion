package trimestre_3.recursividad.ejercicio2;

public class Inicio {

	public static double fact(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*fact(n-1);
			
		}
	}
	
	public static void main(String[] arg) {
		
		System.out.println(fact(3));
		
	}
}
