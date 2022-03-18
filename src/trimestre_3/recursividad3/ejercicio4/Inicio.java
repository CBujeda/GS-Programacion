package trimestre_3.recursividad3.ejercicio4;

public class Inicio {
	
	public static void fibonachi(int i, int limite,int n,int temp) {
		System.out.println(n);
		if(i <= limite) {
			if(i == 0) {
				fibonachi(i+1,limite,1,temp+n);
			}else if(i == 1){
				fibonachi(i+1,limite,1,temp);
			}else {
				fibonachi(i+1,limite,n-1+temp-2,temp);
			}
		}	
	}

	public static void main(String[] arg) {
		fibonachi(0,200,0,0);
	}
}
