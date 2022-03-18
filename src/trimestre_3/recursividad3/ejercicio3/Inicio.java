package trimestre_3.recursividad3.ejercicio3;

public class Inicio {
	
	public static int sumador(int[] t) {return sumador(t,0,0);}
	public static int sumador(int[] t, int i, int suma) {
		if(i == t.length) {
			return suma;
		}else {
			return sumador(t,i+1,suma + t[i]);
		}
	}
	
	public static void main(String[] arg) {
		
	int data [] = {1,2,3,4};	
	System.out.println(sumador(data));
		
		
	}
}
