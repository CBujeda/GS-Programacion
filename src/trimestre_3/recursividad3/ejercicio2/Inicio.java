package trimestre_3.recursividad3.ejercicio2;

public class Inicio {
	public static int sumador(int num) {
		return sumador(0,Integer.toString(num),Integer.toString(num).length());}
	public static int sumador(int temp,String num, int i) {
		if(i==0) {
			return temp;
		}else {
			if(i > 0) {
				return sumador(temp +Integer.parseInt(num.substring(i-1,i)),num,i-1);
			}else{
				return sumador(temp + Integer.parseInt(num.substring(i)),num,i-1);
			}
		}
	}
	
	public static void main(String[] arg) {
		System.out.println(sumador(1234));
		
	}

}
