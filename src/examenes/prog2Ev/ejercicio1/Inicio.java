package examenes.prog2Ev.ejercicio1;
import java.util.ArrayList;

public class Inicio {
	
	/**
	 * Pre:
	 * Post: Dicho metodo muestra una arrayList
	 * 		 de tipo jugadores
	 */
	public static void mostrar(ArrayList<Jugador> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNombre() + " > D: " 
		+ list.get(i).getDorsal() + " V: " + list.get(i).getVidas());
		}
	}
	
	/**
	 * Pre:
	 * Post: dicho metodo genera los jugadores
	 * 		 y ejecuta el juego
	 */
	public static void main(String[] arg) {
		ArrayList<Jugador> list = new ArrayList<Jugador>();
		// String nombre, int dorsal, int potencia_disparo, int calidad_porteria
		list.add(new Jugador("Jaime",1,50,10)); // añadimos datos
		list.add(new Jugador("Maria",2,50,20));
		list.add(new Jugador("Josefa",3,60,10));
		list.add(new Jugador("Teresa",4,40,30));
		list.add(new Jugador("Manuel",5,20,60));
		list.add(new Jugador("Cristina",6,30,40));
		list.add(new Jugador("Jose",7,70,10));
		list.add(new Jugador("Martinez",8,40,20));
		list.add(new Jugador("Yamada",9,80,30));
		list.add(new Jugador("Santos",10,15,20));
		
		
		for(int i = 0; i < list.size(); i++) { // desordenamos array
			int ubic = (int) Math.round(Math.random()*list.size());
			if (ubic >= 10 || ubic < 0) {
				ubic = 0;
			}
			list.add(list.get(ubic));
			list.remove(ubic);
			
		}
		System.out.println("Fila de jugadores: ");
		mostrar(list);
		
		int size = list.size();
		System.out.println("Piiiiiiiiiii Comienza el Juego!");
		while(list.size() > 1) {
			for(int i = 0; i < size; i++) {
				if(list.size() > 1) {
					System.out.println("---------------------");
					if(i != list.size() - 1) {
						System.out.println(list.get(i).getNombre() + " sera portero");
						System.out.println(list.get(i+1).getNombre() + " sera disparador");
						if(list.get(i+1).habilidadDisparo() > list.get(i).habilidadPorteria()) {
							System.out.println(" >" + list.get(i+1).getNombre() + " Atino gol");
							list.get(i).setVidas(list.get(i).getVidas()-1);
						}else {
							System.out.println(" >" + list.get(i).getNombre() + " Paro la  bola");
						}
					}else { // evitamos errores (el ultimo se enfrenta al primero)
						System.out.println(list.get(i).getNombre() + " sera portero");
						System.out.println(list.get(0).getNombre() + " sera disparador");
						if(list.get(0).habilidadDisparo() > list.get(i).habilidadPorteria()) {
							System.out.println(" >" + list.get(0).getNombre() + " Atino gol");
							list.get(i).setVidas(list.get(i).getVidas()-1);
						}else {
							System.out.println(" >" + list.get(i).getNombre() + " Paro la  bola");
						}
					}
				}
				
				if(list.get(i).getVidas() == 0) { // comprobamos vidas
					System.out.println(list.get(i).getNombre() + "Fuera");
					list.remove(i);
					
					size = list.size();
				}
			
			}
		
		}
		System.out.println("x---------------------x"); // mostramos ganador
		System.out.println("Jugadores ganadores: " + list.size());
		System.out.println("Jugador ganador: ");
		mostrar(list);
		
		
		
		
	}
}
