package trimestre_3.recursividad.ejercicio4;

public class Inicio {
	
	public static boolean table(int[] t,int n) {return table(t,0,n,false);}
	public static boolean table(int[] t, int i, int n, boolean temp) {
		if(t[i] == n) {temp = true;}
		if(i == t.length-1) {
			return temp;
		}else {
			return table(t,i+1, n,temp);
		}
	}
	
	public static void main(String[] arg) {
		int[] t ={1,2,3,4};
		System.out.println(table(t,2));
		
	}
}
