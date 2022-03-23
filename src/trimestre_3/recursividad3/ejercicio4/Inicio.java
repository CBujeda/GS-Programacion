package trimestre_3.recursividad3.ejercicio4;

public class Inicio {
	
	public static void fibonachi(int limite) { fibonachi(0, limite);}
	public static void fibonachi(int i, int limite) {
		if(i < limite) {
			System.out.print(prueba(i) + " ");
			fibonachi(i+1,limite);
		}
	}

	public static int prueba(int i) {
			if (i == 0) {
				return 0;
			} else if(i == 1){
				return 1;
			} else {
				return prueba(i - 1) + prueba(i - 2);
			}				
	}

	public static void main(String[] arg) {
		fibonachi(20);
	}
}
