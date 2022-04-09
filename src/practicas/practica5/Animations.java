package practicas.practica5;

public class Animations {
	
	public static void logo() {
		
	}
	// ║═ ╗╔ ╝╚ ╠ ╣
	
	
	

	
	public static void ajustar(String[] data) {

		Screen.view(adjust(),data);
	}
	
	// pre imgs
	
	//Charge
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
	// ajustar pantalla
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
