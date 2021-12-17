package trimestre_1.v_practica1;
import java.util.Scanner;  // importacion de Scanner
/**
 *  Calculadora basica para hacer operaciones basicas
 *  Programa java el cual te pedira una accion y
 *  en base a esta hara una operacion.
 */
public class Calculadora {

	/**
	 * Pre:
	 * Post: Hace la suma de num1 y num2
	 */
	public static int suma(int a, int b) { 	//metodo suma
		return a + b;	//Operacion +	
	}
	
	/**
	 * Pre:
	 * Post: Hace la resta de num1 y num2
	 */
	public static int resta(int a, int b) { 	//metodo resta
		return a - b; //Operacion -	
	}  
	
	/**
	 * Pre:
	 * Post: Hace la multiplicacion de num1 y num2
	 */
	public static int multipi(int a, int b) { 	//metodo multiplicacion
		return a * b; //Operacion *
		}
	
	/**
	 * Pre:
	 * Post: Hace la suma de num1 y num2
	 */
	public static int dividir(int a, int b) { 	//metodo division
			return a / b; //Operacion /
	}
	
	/**
	 * 
	 * 
	 * Pre: --
	 * Post: Expone el resultado de la operacion 
	 * 		 a elegir y los 2 numeros previamente 
	 * 		 introducidos
	 * 
	 * Numeracion de operaciones
	 *	1.- Sumar
	 *	2.- Restar
	 *	3.- Multiplicar
	 *	4.- Dividir
	 *
	 *	NOTA: LA CALCULADORA NO ESTA PREPARADA
	 *		  PARA VALORES DECIMALES NO USARLOS
	 */
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in); // Declaracion de objeto de scanner
		int num1 = 0; 	// almacena numero 1º a introducir
		int num2 = 0; 	// almacena numero 2º a introducir
		int rout = 0; 	// almacena el resultado de la operacion
		int sig = 0; 	// almacena el operador
		// usare la variable sig para asignar un valor a cada operacion	
		while(true) {
			System.out.println("Bienvenid@s a mi primera calculadora"
					+ " \n 1.- Sumar \n 2.- Restar \n 3.- Multiplicar \n 4.- Dividir"
					+ "\n 4.- Fin"
					+ "\n ----------------------------------------------");
	
			System.out.print("Elige opcion: ");
			sig = sc.nextInt();				//solicitud del numero de la lista de operadores
			if(sig >= 1 && sig <= 4) {
				System.out.print("Num1: ");
				num1 = sc.nextInt();			//solicitud del 1º numero
				System.out.print("Num2 ");
				num2 = sc.nextInt();			//solicitud del 2º numero
				if(sig == 1) {rout= suma(num1,num2); 			//comprobacion suma
				}else if(sig == 2) {rout= resta(num1,num2);	//comprobacion resta
				}else if(sig == 3) {rout= multipi(num1,num2);	//comprobacion multiplicacion
				}else if(sig == 4) {rout= dividir(num1,num2);	//comprobacion division
				}else {							//si se da un valor diferente al de la lista, terminar programa
					System.out.println("No hay operador con dicha introduccion");
					System.exit(0); //Salir	
				}
				System.out.println("--------------------------");
				System.out.println("Resultado: " + rout); // resultado
			}else if(sig == 5){
				break; //Rompe el bucle
			}else {
				System.out.println("ERROR la accion " + sig + " no es valida"); //Introduccion invalida
			}
			System.out.println();
		}
		System.out.println("\n Finalizado correctamente");
	}
}
