package practicas.practica5;

public class Screen {
	public static int alto() {// guardo variables en metodos
		return 25;
	}
	public static int rAlto() {// guardo variables en metodos
		return 30;
	}
	public static int ancho() {// guardo variables en metodos
		return 100;
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual pausa la ejecucion durante unos milisegundos
	 */
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo space() y limpiador() se encargan de espaciar
	 * 		 la pantalla space() tamaño predefinido limpiador()
	 * 		 tamaño personalizado
	 */
	public static void space() {Screen.limpiador(Screen.rAlto()+4);}
	public static void limpiador(int a) {
		for(int i = 0; i < a; i++) {
			System.out.println("");
		}
	}
	
	/**
	 * Pre: 
	 * Post: Muestra una vista de juego con un string[] p1 que sera
	 * 		 la imagen ASCCI que cubre y un String[] data que muestra
	 * 		 las estadisticas 
	 */
	public static void view(String[] p1, String[] data) {
		// Pantalla total = alto: 30 ancho: 102
		int ancho = ancho();
		int alto = alto(); // img
		linTop(ancho);
		stats(ancho,data);
		linMed(ancho);
		//lineGroup(ancho,p1,alto);
		lineGroup(ancho,p1,alto);
		linButton(ancho);

	}
	
	/**
	 * Pre: 
	 * Post: Muestra una vista de juego con comentario y con un string[]
	 *		 p1 que sera la imagen ASCCI que cubre, un String[] data que
	 *		 muestra las estadisticas y un String comment que contiene el
	 *		 comentario
	 */
	public static void viewComment(String[] p1, String[] data, String comment) {
		// Pantalla total = alto: 30 ancho: 102
		int ancho = 100;
		int alto = 25; // img
		linTop(ancho);
		stats(ancho,data);
		linMed(ancho);
		lineGroupComent(ancho,p1,alto,comment);
		linButton(ancho);

	}
	
	// Formador
	/**
	 * Pre:
	 * Post: metodo el cual muestra las estadisticas en pantalla
	 */
	public static void stats(int a, String[] data) { // todo + 6 en data no se muestra
		for(int i = 0; i < data.length; i++) {
			if(data[i] == null) {
				data[i] = "????";
			}
		}
		String stats = " " + data[0] + "♥ " + data[1] + "♦  " + data[2] + "Ᵽ " +
						data[3] + "≈ | " + data[4] + "☺ " + data[5];
		line(a," Vidas Puntos Poder Arma  |  Avatar y Character");
		line(a,stats);
	}
	
	// line group normal
	/**
	 * Pre:
	 * Post: metodo el cual forma la imagen del view
	 */
	public static void lineGroup(int a, String[] p1, int alto) {
		int count = 0;
		for(int i = 0; i < p1.length; i++) {
			if(i < alto) {
				line(a, p1[i]);
				count = i;
			}
		}
		while(true) {
			if(count+1 < alto) {
				line(a,"");
				count++;
			} else {
				break;
			}
		}
	}
	
	//Line group comment
	/**
	 * Pre:
	 * Post: metodo el cual forma la imagen del view mas la caja de
	 * 		 comentarios con su respectivo comentario
	 */
	public static void lineGroupComent(int a, String[] p1, int alto, String comment) {
		int count = 0;
		for(int i = 0; i < p1.length; i++) {
			if(i == alto-3 || i == alto-4 ||i == alto-5 || i == alto-2 ) {
				if(i == alto-3 || i == alto-4) {
					if(comment.length() > a) { // Formacion de caja continua
						if(i == alto-4) {
							lineComment(a,comment.substring(0,a),p1[i]);
						} else {
							lineComment(a,comment.substring(a,comment.length()),p1[i]);
						}
					} else { // Formacion de caja 1 simple
						if(i == alto-4) {
							lineComment(a,comment,p1[i]);
						} else {
							lineComment(a,"",p1[i]);
						}
					}
				} else {
					if(i == alto-5 ) {
						lineTopComment(a,p1[i]);
					} else {
						lineButtomComment(a,p1[i]);
					}
				}	
			} else {
				if(i < alto) {
					line(a, p1[i]);
					count = i;
				}
			}
		}
		while(true) {
			if(count+1 < alto) {
				line(a,"");
				count++;
			} else {
				break;
			}
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual muestra una linea por pantalla
	 */
	public static void line(int a, String dato) {
		System.out.print("║");
		for(int i = 0; i < a; i++) {
			if(i < dato.length()) {
				if(dato.length() > i) {
					System.out.print(dato.substring(i,i+1));
				}
			} else {
				System.out.print(" ");
			}
		}
		System.out.print("║");
		System.out.println();
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual muestra una linea top
	 */
	public static void linTop(int a) {
		System.out.print("╔");
		gual(a);
		System.out.print("╗");
		System.out.println();
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual muestra una linea button
	 */
	public static void linButton(int a) {
		System.out.print("╚");
		gual(a);
		System.out.print("╝");
		System.out.println();
	}
	
	/**
	 * Pre: 
	 * Post: Metodo el cual muestra una linea intermedia
	 */
	public static void linMed(int a) {
		System.out.print("╠");
		gual(a);
		System.out.print("╣");
		System.out.println();
	}
	
	//Comments metods
	/**
	 * Pre:
	 * Post: Metodo el cual forma una linea de caja de comentario
	 */
	public static void lineComment(int a, String dato, String linea) {
		System.out.print("║");
		System.out.print(linea.substring(0,1));;
		System.out.print(lineString(a,dato));
		System.out.print(linea.substring(linea.length()-1,linea.length()));;
		System.out.print("║");
		System.out.println();
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual forma una linea top de caja de comentario
	 */
	public static void lineTopComment(int a,String linea) {
		System.out.print("║");
		System.out.print(linea.substring(0,1));;
		System.out.print("╔");
		gual(a-4);
		System.out.print("╗");
		System.out.print(linea.substring(linea.length()-1,linea.length()));;
		System.out.print("║");
		System.out.println();
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual forma una linea buttom de caja de comentario
	 */
	public static void lineButtomComment(int a,String linea) {
		System.out.print("║");
		System.out.print(linea.substring(0,1));;
		System.out.print("╚");
		gual(a-4);
		System.out.print("╝");
		System.out.print(linea.substring(linea.length()-1,linea.length()));;
		System.out.print("║");
		System.out.println();
	}
	
	// String metods
	/**
	 * Pre:
	 * Post: Metodo el cual forma una linea de comentario en string
	 */
	public static String lineString(int a, String dato) {
		String data = "║";
		a = a -4;// -4 es el el espacio de los lados -(2)
		for(int i = 0; i < a; i++) {
			if(i < dato.length()) {
				if(dato.length() > i) {
					data = data + dato.substring(i,i+1);
				}
			}else {
				data = data +" ";
			}
		}
		data = data + "║";
		return data;
	}
	
	// space metod
	/**
	 * Pre:
	 * Post: Metodo el cual imprime el numero de espacios solicitados
	 */
	public static void space(int spaces) {
		for(int i = 0; i < spaces ; i++) {
			System.out.print(" ");
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual imprime un numero de caracteres de linea solicitados
	 */
	public static void gual(int spaces) {
		for(int i = 0; i < spaces ; i++) {
			System.out.print("═");
		}
	}
	
}
