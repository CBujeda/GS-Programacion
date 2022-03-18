package trimestre_3.recursividad3.ejercicio1;

public class Inicio {
	
	public static int inversor(int num) {
		return inversor("",Integer.toString(num),Integer.toString(num).length());}
	public static int inversor(String temp,String num, int i) {
		if(i==0) {
			return Integer.parseInt(temp);
		}else {
			if(i > 0) {
				return inversor(temp + num.substring(i-1,i),num,i-1);
			}else{
				return inversor(temp + num.substring(i),num,i-1);
			}
		
		}
	}
	
	public static void main(String[] arg) {
		System.out.println(inversor(1234));
		
	}

}
