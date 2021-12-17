package trimestre_1.examenProgramacion;

/**
 * Programa java el cual Muestra una lista de fechas erroneas
 * y correctas de una tabla dada
 */
public class Ejercicio_2 {
	
	/**
	 * Pre:
	 * Post: Muestra Una lista con las fechas erroneas
	 * 		 y las okays
	 * 		 Nota: llama al metodo esValido para comprobar
	 * 		 las fechas
	 */
	public static void comprobarFechas(String[] t) {
		for(int i = 0; i < t.length;i++) {
			//	Transformamos los trozos de strings en enteros
			int dia = Integer.parseInt(t[i].substring(0,2));
			int mes = Integer.parseInt(t[i].substring(3,5));
			int ano = Integer.parseInt(t[i].substring(6,10));
			System.out.print(t[i] + " -> ");
			if(esValido(dia,mes,ano) == true) {
				System.out.print("OK");
			}else {
				System.out.print("ERROR");
			}
			System.out.println();
			//esValido(dia,mes,ano);
		}
	}
	
	/**
	 * Pre:
	 * Post: Comprueba si una fecha introducida es valida o es erronea
	 */
	private static boolean esValido(int dia, int mes, int ano) {
		//System.out.println(dia + " " + mes + " " + ano);
		boolean resul = true;
		//comprobador mes:
		if(mes <= 12) {
			if(mes > 0) {
				resul = true;
				//meses Genericos
				if(mes > 0) {
					if (mes%2!=0) {
						if(dia > 31) {
							resul = false;
						}
					}else if(dia > 30) {
						resul = false;
					}
				}
				//Febrero
				if(mes == 2) {
					if(esBisiesto(ano) == true) {
						if(dia == 29) {
							resul = true;
						}
					}
				}
			}else {
				resul = false;
			}
		}else {
			resul = false;
		}
		return resul;
	}
	
	/**
	 * Pre: ---
	 * Post: devuelve [true] sí y solo sí el [ano] pasado como
	 * 		parámetro es bisiesto. En caso contrario, devuelve [false].
	 */
	private static boolean esBisiesto(int ano) {
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
			return true;
		else
			return false;
	}
	
	/**
	 * Pre:
	 * Post: Metodo main el cual crea una tabla de fechas
	 * 		 y llama al metodo comprobar fechas
	 */
	public static void main(String[] args) {
		String[] t = {"28/02/1995", "28/03/2010", 
				"32/12/1995", "02/01/2019", "29/02/2024"};
		comprobarFechas(t);
	}
}
