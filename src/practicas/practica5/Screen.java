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
	
	public static void limpiador(int a) {
		for(int i = 0; i < a; i++) {
			System.out.println("");
		}
	}
	
	//║═ ╗╔ ╝╚ ╠ ╣
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
	
	
	public static void stats(int a, String[] data) { // todo + 6 en data no se muestra
		for(int i = 0; i < data.length; i++) {
			if(data[i] == null) {
				data[i] = "????";
			}
		}
		String stats = " " + data[0] + "♥ " + data[1] + "♦  " + data[2] + "Ᵽ " +
						data[3] + "≈ | " + data[4] + "☺ " + data[5];
		line(a," Vidas Dinero Poder Arma  |  Avatar y Character");
		line(a,stats);
	}
	
	// line group normal
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
	public static void lineGroupComent(int a, String[] p1, int alto, String comment) {
		int count = 0;
		for(int i = 0; i < p1.length; i++) {
			if(i == alto-3 || i == alto-4 ||i == alto-5 || i == alto-2 ) {
				if(i == alto-3 || i == alto-4) {
					if(comment.length() > a) {
						if(i == alto-4) {
							lineComment(a,comment.substring(0,a),p1[i]);
						}else {
							lineComment(a,comment.substring(a,comment.length()),p1[i]);
						}
					}else {
						if(i == alto-4) {
							lineComment(a,comment,p1[i]);
						}else {
							lineComment(a,"",p1[i]);
						}
					}
				}else {
					if(i == alto-5 ) {
						lineTopComment(a,p1[i]);
					}else {
						lineButtomComment(a,p1[i]);
					}
				}	
			}else {
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
			}else {
				break;
			}
		}
	}
	
	
	
	public static void line(int a, String dato) {
		System.out.print("║");
		for(int i = 0; i < a; i++) {
			if(i < dato.length()) {
				if(dato.length() > i) {
					System.out.print(dato.substring(i,i+1));
				}
			}else {
				System.out.print(" ");
			}
		}
		System.out.print("║");
		System.out.println();
	}
	public static void linTop(int a) {
		System.out.print("╔");
		for(int i = 0; i < a; i++) {
			System.out.print("═");
		}
		System.out.print("╗");
		System.out.println();
	}
	
	public static void linButton(int a) {
		System.out.print("╚");
		for(int i = 0; i < a; i++) {
			System.out.print("═");
		}
		System.out.print("╝");
		System.out.println();
	}
	public static void linMed(int a) {
		System.out.print("╠");
		for(int i = 0; i < a; i++) {
			System.out.print("═");
		}
		System.out.print("╣");
		System.out.println();
	}
	
	//Comments metods
	public static void lineComment(int a, String dato, String linea) {
		System.out.print("║");
		System.out.print(linea.substring(0,1));;
		System.out.print(lineString(a,dato));
		System.out.print(linea.substring(linea.length()-1,linea.length()));;
		System.out.print("║");
		System.out.println();
	}
	public static void lineTopComment(int a,String linea) {
		System.out.print("║");
		System.out.print(linea.substring(0,1));;
		System.out.print("╔");
		for(int i = 0; i < a-4; i++) {
			System.out.print("═");
		}
		System.out.print("╗");
		System.out.print(linea.substring(linea.length()-1,linea.length()));;
		System.out.print("║");
		System.out.println();
	}
	public static void lineButtomComment(int a,String linea) {
		System.out.print("║");
		System.out.print(linea.substring(0,1));;
		System.out.print("╚");
		for(int i = 0; i < a-4; i++) {
			System.out.print("═");
		}
		System.out.print("╝");
		System.out.print(linea.substring(linea.length()-1,linea.length()));;
		System.out.print("║");
		System.out.println();
	}
	// String metods
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
	
}
