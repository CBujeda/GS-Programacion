package trimestre_3.recursividad2;

public class Inicio {
	
	public static int funct(int m) { return funct(m,1,1); }
	public static int sumatoria(int i, int total) {
		//System.out.println("i= " + i  + " total= " + total);
		if(i == 0) {
			return total;
		}
		
		return sumatoria(i-1, total +i);
	}
	public static int funct(int m, int i,int suma) {
		System.out.println("i= " + i  + " suma= " + suma);	
		if(suma > m) {
			return i;
		}else {
			System.out.println("--------------");
			return funct(m,i+1,sumatoria(i+1,0));
		}
	}
	
	public static void main(String[] arg) {
		System.out.println("---------------\n= " + funct(15));
		
	}
}
