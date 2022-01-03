package practicas.practica1;

public class Generator {

	public static Liga[] genLiga() {
		int numL = 1;
		Liga[] l = new Liga[numL];
		/*
		 * Realmente este for no es necesario
		 * Pero lo puse con la posibilidad de hacer mas ligas
		 */
		String nombre;
		for(int i = 0; i < l.length;i++) {
			nombre = genNomAp();
			l[i] = new Liga(nombre,genEquipo());
		}
		return l;
		
	}
	
	public static Equipo[] genEquipo() {
		int numE = 15;
		Equipo[] e = new Equipo[numE];

		String nombre = "";
		String estadio = "";
		int fundacion = 1999;
		Jugador[] jugadores;
		int puntos = 0;
		int pGanados = 0;
		int pPerdidos = 0;
		int pEmpatados = 0;

		for(int i = 0; i < e.length; i++) {

			nombre = genNomAp();
			estadio = genNomAp();
			fundacion = (int) Math.round(Math.random()*(2022 - 1800) + 1800);
			puntos = (int) Math.round(Math.random()*100);
			pGanados = (int) Math.round(Math.random()*100);
			pPerdidos = (int) Math.round(Math.random()*100);
			pEmpatados = (int) Math.round(Math.random()*100);
			Jugador[] j = new Jugador[11];
			Jugador[][] jm = genPlayer(i, numE);
			for(int s = 0; s < j.length; s++ ) {
				j[s] = jm[s][i];
			}
			
			jugadores = j;
			e[i] = new Equipo(nombre,estadio,fundacion,jugadores,pGanados,pPerdidos,pEmpatados, puntos);
		}
		return e;
		
	}
	
	public static Jugador[][] genPlayer(int numEqu, int numE) {
		int numJ = 11;
		Jugador[][] j = new Jugador[numJ][numE]; 
		String nombre = "";
		int dorsal = 0;
		int goles = 0;
		int tarjRoj = 0;
		int tarjAma = 0;
		for(int i = 0 ; i <j.length; i++) {
			for(int s = 0; s< j[i].length; s++) {
				nombre = genNomAp() + " " + genNomAp()+" "+ genNomAp();
				String dor = Integer.toString(numEqu) + Integer.toString(i);
				int dorI = Integer.parseInt(dor);
				dorsal = dorI;
				// Puse 805 ya que es la media de goles de cada jugador a lo largo de su historia
				goles = (int) Math.round(Math.random()*805); 
				// Puse 138 ya que es el maximo historico de un jugador x 3
				tarjRoj = (int) Math.round(Math.random()*138);
				// Puse 561 ya que es el maximo historico de un jugador x 3
				tarjAma = (int) Math.round(Math.random()*561);
				//Paquete 2D de jugadores cada fila pertenece a un equipo
				j[i][s] = new Jugador(nombre,dorsal,goles,tarjRoj,tarjAma);
			}
		}
		return j;
		}
		
	
	
	public static String genNomAp() {
		//Generador apellidos
		String[] abc = new String[abc().length];
		abc = abc();
		String data = "";
		for(int i = 0; i < Math.random()*12+3; i++) {
			data = data + abc[(int) (Math.random()*abc.length)];
			
		}
		return mayus(data.substring(0, 1)) + data.substring(1,data.length());
	}
	
	
	// debuelve un caracter minuscula como mayuscula
	public static String mayus(String my) {
		if(my.equalsIgnoreCase("a")) {my = "A";
		}else if(my.equalsIgnoreCase("b")) {my = "B";
		}else if(my.equalsIgnoreCase("c")) {my = "C";
		}else if(my.equalsIgnoreCase("d")) {my = "D";
		}else if(my.equalsIgnoreCase("e")) {my = "E";
		}else if(my.equalsIgnoreCase("f")) {my = "F";
		}else if(my.equalsIgnoreCase("g")) {my = "G";
		}else if(my.equalsIgnoreCase("h")) {my = "H";
		}else if(my.equalsIgnoreCase("i")) {my = "I";
		}else if(my.equalsIgnoreCase("j")) {my = "J";
		}else if(my.equalsIgnoreCase("k")) {my = "K";
		}else if(my.equalsIgnoreCase("l")) {my = "L";
		}else if(my.equalsIgnoreCase("m")) {my = "M";
		}else if(my.equalsIgnoreCase("n")) {my = "N";
		}else if(my.equalsIgnoreCase("o")) {my = "O";
		}else if(my.equalsIgnoreCase("p")) {my = "P";
		}else if(my.equalsIgnoreCase("q")) {my = "Q";
		}else if(my.equalsIgnoreCase("r")) {my = "R";
		}else if(my.equalsIgnoreCase("s")) {my = "S";
		}else if(my.equalsIgnoreCase("t")) {my = "T";
		}else if(my.equalsIgnoreCase("v")) {my = "v";
		}else if(my.equalsIgnoreCase("w")) {my = "W";
		}else if(my.equalsIgnoreCase("x")) {my = "X";
		}else if(my.equalsIgnoreCase("y")) {my = "Y";
		}else if(my.equalsIgnoreCase("z")) {my = "Z";
		}
		return my;
	}
	
	public static String[] abc() {
		String[] abc = new String[] {"a","b","c","d","e","f","g",
				"h","i","j","k","l","m","n","o","p","q","r","s",
				"t","v","w","x","y","z"};
		return abc;
	}
}
