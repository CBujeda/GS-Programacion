package practicas.practica5;

public class Animations {
	
	// IMAGENES PRE GUARDADAS
	// ║═ ╗╔ ╝╚ ╠ ╣
	
	/**
	 * Pre:
	 * Post: dicho metodo muestra la imagen de ajuste
	 */
	public static void ajustar(String[] data) {

		Screen.view(adjust(),data);
	}
	
	
	// Metodo el cual devuelve la pantalla de carga
	public static String[] charge () {
		String[] dato = {
				  "                                                                                                    ",
				  "                                                                                                    ",
				  "                                                                                                    ",
				  "                                                                                                    ",
				  "                                                                                                    ",
				  "                                        ───▄▄▄                                                      ",
				  "                                        ─▄▀░▄░▀▄                                                    ",
				  "                                        ─█░█▄▀░█                                                    ",
				  "                                        ─█░▀▄▄▀█▄█▄▀                                                ",
				  "                                        ▄▄█▄▄▄▄███▀                                                 ",
				  "                                                                                                    ",
				  "                                      ╔═══════════════╗                                             ",
				  "                                      ║  Cargando.... ║                                             ",
				  "                                      ╚═══════════════╝                                             "
		};
		return dato;
	}

	/**
	 * Pre:
	 * Post: Metodo el cual devuelve la pantalla de ajuste
	 */
	public static String[] adjust () {
		String[] dato1 = {
				 "                                                                                                    ",
				 "                                                                                                    ",
				 "                                               ░▓█▓░                                                ",
				 "                                            ▒▓███████▓░                                             ",
				 "                                         ▒███████████████▒                                          ",
				 "                                     ▒▓█████████████████████▓▒                                      ",
				 "                                    ▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒                                     ",
				 "                                                                                                    ",
				 "                                                                                                    ",
			  	 "              ▒                                                                   ▓▒                ",
				 "            ▓██                                                                   ███▓░             ",
				 "         ▒█████                                                                   ██████▓░          ",
				 "       ▓███████                           ╔             ╗                         █████████▓░       ",
				 "    ▒██████████                                Ajusta                             █████████████░    ",
				 "    ▓██████████                               Pantalla                            ███████████▓▒     ",
				 "       ▓███████                           ╚             ╝                         ████████▓░        ",
				 "         ▒█████                                                                   █████▓░           ",
				 "           ░███                                                                   ██▓░              ",
				 "             ░▓                                                                   ▒                 ",
				 "                                                                                                    ",
				 "                                   ░▒░░                  ░░▒▒░                                      ",
				 "                                   ▒▓███████████████████████▓░                                      ",
				 "                                       ▒█████████████████▒                                          ",
				 "                                          ░▓█████████▓░                                             ",
				 "                                              ▒▓█▓▒                                                 "};
		return dato1;
	}
}
