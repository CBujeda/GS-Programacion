package practicas.practica1;

public class Organizador {
	
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
	
	public static Equipo[] clasificacion(Liga[] l, boolean cargas) {
		int temp;
		Equipo[] ec = null;
		for(int i = 0; i < l.length; i++) {
			Equipo[] e = l[i].getClasificacion();
			
			int [] puntos = new int[e.length]; 
			for(int j = 0; j < e.length; j++) {
				puntos[j] = e[j].getPuntos();
			}
			puntos = ordenInt(puntos);
			
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
