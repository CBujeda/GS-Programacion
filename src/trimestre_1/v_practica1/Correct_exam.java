package trimestre_1.v_practica1;
import java.util.Scanner;
/**
 *	 Programa que facilita a los profesores la corrección de los exámenes 
 *   que tienen resultados enteros (Examenes tipo test).
 */

public class Correct_exam {

	
	/**
	 * Pre:
	 * Post: Muestra La tabla introducida
	 */
	private static void mostrarint(int[] t) {//Muestra la tabla int
		System.out.println();
		for(int i=0;i < t.length;i++) {
			System.out.print(" " + t[i] + " |");
		}
		System.out.println();
	}
	
	/**
	 * Pre:
	 * Post: Muestra una tabla con las respuestas correctas e incorrectas
	 */
	private static void mostrarbool(boolean[] t) {//Muestra correctas e incorrectas
		System.out.println();
		for(int i=0;i < t.length;i++) {
			if(t[i] == true) {System.out.print(" Correcta |");}
			if(t[i] == false) {System.out.print(" Incorrecta |");}
		}
		System.out.println();
	}
	
	/**
	 * Pre:
	 * Post: Calcula la nota y el % del test y los muestra por pantalla
	 */
	private static double calculator(int cont_b, int t_leng) {// Calcula las notas y % del test
		double nota = 0;
		System.out.println("Respuestas correctas: " + cont_b);
		System.out.println("Respuestas Incorrectas: " + ((cont_b - t_leng)*-1));
		nota = (double)cont_b/t_leng; 
		System.out.println("Nota: " + (nota*10));
		System.out.println("Porcentaje: " + (nota*100) + "%");
		return nota;
	}
	
	/**
	 * Pre:
	 * Post: Compara la tabla del alumno y del profesor
	 */
	private static double compare(int[] t, int[] alu) {// Comparador de tablas
		boolean[] resp = new boolean [t.length];
		int cont_buenas = 0;
		for(int i = 0; i < t.length; i++) {
			if(t[i] == alu[i]) { // Compara si las celdas son iguales
				resp[i] = true;
				cont_buenas++;
			}else {
				resp[i] = false;
			}
		}
		mostrarbool(resp);
		return calculator(cont_buenas, t.length); 
		
	}
	
	/**
	 * Pre:
	 * Post: Solicita la tabla del profesor y la de los diferentes alumnos
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String pregu = "";// Variable para la pregunta
		System.out.print("Preguntas totales: ");
		int n = sc.nextInt();
		double contador = 0;
		double media = 0;
		int[] t = new int [n];// Tabla profesor
		int[] alu = new int [t.length]; // Tabla alumnos
		for(int i = 0; i < t.length ; i++) { // Introducir datos tabla profe
			System.out.print("Respuesta " + i + " : ");
			t[i] = sc.nextInt();
		}
		mostrarint(t);
		while(true) {
			contador++;
			System.out.println("Preguntas alumno: ");
			for(int i = 0; i < t.length ; i++) { // Introducir datos tabla alumno
				System.out.print("Respuesta " + i + " : ");
				alu[i] = sc.nextInt();
			}
		
			media = compare(t,alu);
			System.out.println("¿Desea corregir un nuevo test? (y/n).");
			sc.nextLine();
			pregu = sc.nextLine();
			if (pregu.equalsIgnoreCase("n")) {break;// Si elije n Rompe bucle
			}else {pregu = "";}
		}
		media = (double)media/contador; 
		System.out.println("Nota media: " + (media*10));
		System.out.println("Porcentaje de media: " + (media*100) + "%");
	}
}
