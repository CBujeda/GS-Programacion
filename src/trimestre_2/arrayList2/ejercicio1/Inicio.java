package trimestre_2.arrayList2.ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;

public class Inicio {

	
	public static int calcularSuma(ArrayList<Integer> lista) {
		int total = 0;
		for(int i = 0; i < lista.size(); i++ ) {
			total = total + lista.get(i);
		}
		return total;
	}
	
	public static int calcularMedia(ArrayList<Integer> lista) {
		return (calcularSuma(lista))/lista.size();
	}

	public static boolean esCapicua(ArrayList<Integer> lista) {
		int temp;
		int temp2;
		boolean capicua = true;
		for(int i = 0; i < lista.size(); i++) {
			temp = lista.get(i);
			temp2 = lista.get(lista.size()-(i+1));
			if(temp != temp2) {
				capicua = false;
			}
		}
		return capicua;
	} 
	public static void main(String[] arg) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int entrada;
		
		while(true) {
			entrada = sc.nextInt();
			if(entrada >= 0 && entrada <= 10) {
				if(entrada == 0) {
					System.out.println("Suma de los datos: " + calcularSuma(lista));
					System.out.println("Calcular media:" + calcularMedia(lista));
					System.out.println("Capicua? : " + esCapicua(lista));
				}else {
					lista.add(entrada);
				}
			}else {
				System.out.println("No puedes introducir un numero que nosea entre 0 y 9 ");
			}
		}
	}
}
