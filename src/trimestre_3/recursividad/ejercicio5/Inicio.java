package trimestre_3.recursividad.ejercicio5;

public class Inicio {
	
	public static void table(int[][] t) {table(t,0,0);}
	public static void table(int[][] t,int i,int j) {
		System.out.print(t[i][j]);
		if(t[i].length-1 == j) {
			System.out.println();
			if(i < t.length-1) {table(t,i+1,0);}
		}else {table(t,i,j+1);}
	}
	
	
	public static void main(String[]arg) {
		
		int[] t[] ={{1,2,3},{4,5,6},{7,8,9}};
		table(t);
		
	}
}
