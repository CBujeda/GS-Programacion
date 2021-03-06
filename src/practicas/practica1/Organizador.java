package practicas.practica1;

public class Organizador {
	
	
	/**
	 * Pre:
	 * Post: Dicho metodo muestra una tabla con los 3 
	 * 		 equipos junto a sus mejores goleadores y
	 * 		 sus respectivos puntos		 
	 */
	public static void equipoGol(Liga[] l, boolean cargas) {
		int max = (3+1);
		Jugador[] j = goleadores(l, cargas);
		Jugador[] js = new Jugador [max];
		for(int i = 0; i< (max - 1); i++) {
			js[i] = j[i];
		}
		Equipo[] e = null;
		for(int i = 0; i < l.length; i++) {
			e = l[i].getClasificacion();
		}		
		for(int s = 0; s < js.length; s++) { // Bucle de mejores jugadores 			
			for(int i = 0 ; i < e.length; i++) {// Bucle equipos
				for(int r = 0; r < e[i].getJugadores().length; r++) {  
					//System.out.println(s + " | " + i + " | " + r );
					Jugador[] jr = e[i].getJugadores();
					if(js[s] == jr[r]) {
						System.out.println("Equipo: " + e[i].getNombre() + "Puntos: "
								+ "" + e[i].getPuntos());
						System.out.println("       ---> Jugador: "+ jr[r].getNombre() + "Goles: "
								+ "" + jr[r].getGoles());
					}
				}
			}
		}
	}
	
	/**
	 * Pre:
	 * Post: Dicho metodo debuelve una tabla
	 * 		 con los 5 jugadores con mas expulsiones
	 */
	public static Jugador[] expulsiones(Liga[] l, boolean cargas) {
		int temp;
		int size = 5;
		Jugador[] je = new Jugador[size];
		for(int i = 0; i < l.length; i++) {
			Equipo[] e = l[i].getClasificacion();
			Jugador[] ju = new Jugador[(e.length*(e[0].getJugadores().length))];
			
			int sumador = 0;
			for(int j = 0; j < e.length; j++) {	
				for(int r = 0; r < e[j].getJugadores().length; r++) {
					Jugador[] tempo = e[j].getJugadores();
					ju[r + sumador] = tempo[r];
					if(r == ((e[j].getJugadores().length)-1)) {
						sumador = sumador + e[j].getJugadores().length;
					}
				}
			}
			//Las tarjetas rojas significan la expulsion del jugador
			int [] expulsiones = new int[ju.length]; 
			for(int j = 0; j < ju.length; j++) {
				expulsiones[j] = ju[j].getRedCards();
			}
			expulsiones = ordenInt_reverse(expulsiones);
			
			for(int j = 0; j < ju.length; j++) {
				for(int r = j + 1; r < ju.length; r++) {
					if(expulsiones[j] == ju[r].getRedCards()) {
						temp = ju[j].getRedCards();
						ju[j].setRedCards(ju[r].getRedCards());
						ju[r].setRedCards(temp);
					}
				}
			}
			
			if(cargas == true) {
				Show.int1D(expulsiones);
			}
			
			je = ju;
		}
		return je;
	}
	
	/**
	 * Pre:
	 * Post: Dicho metodo debuelve los 5 jugadores con mas goles
	 */
	public static Jugador[] goleadores(Liga[] l, boolean cargas) {
		int temp;
		int size = 5;
		Jugador[] jg = new Jugador[size];
		for(int i = 0; i < l.length; i++) {
			Equipo[] e = l[i].getClasificacion();
			Jugador[] ju = new Jugador[(e.length*(e[0].getJugadores().length))];
			
			int sumador = 0;
			for(int j = 0; j < e.length; j++) {	
				for(int r = 0; r < e[j].getJugadores().length; r++) {
					Jugador[] tempo = e[j].getJugadores();
					ju[r + sumador] = tempo[r];
					if(r == ((e[j].getJugadores().length)-1)) {
						sumador = sumador + e[j].getJugadores().length;
					}
				}
			}
			
			int [] goles = new int[ju.length]; 
			for(int j = 0; j < ju.length; j++) {
				goles[j] = ju[j].getGoles();
			}
			goles = ordenInt_reverse(goles);
			
			for(int j = 0; j < ju.length; j++) {
				for(int r = j + 1; r < ju.length; r++) {
					if(goles[j] == ju[r].getGoles()) {
						temp = ju[j].getGoles();
						ju[j].setGoles(ju[r].getGoles());
						ju[r].setGoles(temp);
					}
				}
			}
			
			if(cargas == true) {
				Show.int1D(goles);
			}

			jg = ju;
		}
		return jg;
	}
	
	/**
	 * Pre:
	 * Post: Dicho metodo muestra la clasificacion de los equipos
	 * 		 ordenados por puntos.
	 */
	public static Equipo[] clasificacion(Liga[] l, boolean cargas) {
		int temp;
		Equipo[] ec = null;
		for(int i = 0; i < l.length; i++) {
			Equipo[] e = l[i].getClasificacion();
			
			int [] puntos = new int[e.length]; 
			for(int j = 0; j < e.length; j++) {
				puntos[j] = e[j].getPuntos();
			}
			puntos = ordenInt_reverse(puntos);
			
			for(int j = 0; j < e.length; j++) {
				for(int r = j + 1; r < e.length; r++) {
					if(puntos[j] == e[r].getPuntos()) {
						temp = e[j].getPuntos();
						e[j].setPuntos(e[r].getPuntos());
						e[r].setPuntos(temp);
					}
				}
			}
			if(cargas == true) {
				Show.int1D(puntos);
			}
			ec = e;
		}
	return ec;	
	
	}
	
	/**
	 *---Metodo no usado---
	 *Pre: 
	 *Post: dicho metodo devuelve una tabla ordenada de menor a mayor
	 */
	public static int[] ordenInt(int t[]) {
		int temp = 0;
		for(int i = 0; i < t.length; i++) {
			for(int j = i; j < t.length; j++) {
				if(t[i] > t[j]) {
					temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}
		return t;
	}
	
	/**
	 *Pre: 
	 *Post: dicho metodo devuelve una tabla ordenada de mayor a menor
	 */
	public static int[] ordenInt_reverse(int t[]) {
		int temp = 0;
		for(int i = 0; i < t.length; i++) {
			for(int j = i; j < t.length; j++) {
				if(t[i] < t[j]) {
					temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
			}
		}
		return t;
	}

	
	
}
