package practicas.practica1;

public class Show {

	public static void all(Liga[] l) {
	System.out.println("---Ligas---");
		for(int i = 0; i < l.length; i++) {
			System.out.println(l[i].getNombre());
			System.out.println("-------------------------");
			Equipo[] e = l[i].getClasificacion();
			
			System.out.println("---Equipos---");
			for(int j = 0; j < e.length; j++) {
				System.out.println("--------------------------------\n Equipo " + (j+1) + " : ");
				System.out.println("    " + e[j].getNombre());
				System.out.println("    " + "Fundacion: " + e[j].getFundacion());
				System.out.println("    " + "Estadio: " + e[j].getEstadio());
				System.out.println("    " + "Partidos Empatados |" + " Partidos Ganados "
											+ "| Partidos Perdidos");
				System.out.println("       "+ e[j].getPartidosEmpatados() + "                           " + 
											  e[j].getPartidosGanados() + "                   " + 
											  e[j].getPartidosPerdidos());
							
				System.out.println("    " + "---> Jugadores");
				System.out.println("    " + "Nombre | Dorsal | Goles | redCards | yellowCards");
				Jugador[] js = e[i].getJugadores();
				for(int s = 0; s < js.length; s++) {
					System.out.println("    " + js[s].getNombre() + " | " +
												js[s].getDorsal() + " | " +
												js[s].getGoles() + " | " +
												js[s].getRedCards() + " | " +
												js[s].getYellowCards());
				}
				
			}
			
		}
	}
}
