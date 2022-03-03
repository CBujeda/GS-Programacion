package examenes.prog2Ev.ejercicio1;
import java.util.ArrayList;

public class Inicio {
	
	public static void mostrar(ArrayList<Jugador> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getNombre() + " > " + list.get(i).getDorsal());
		}
	}

	public static void main(String[] arg) {
		ArrayList<Jugador> list = new ArrayList<Jugador>();
			// String nombre, int dorsal, int potencia_disparo, int calidad_porteria
		list.add(new Jugador("Jaime",1,50,10));
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
		mostrar(list);
		
		
		for(int i = 0; i < list.size(); i++) {
				if(list.get(i+1).habilidadDisparo() > list.get(i).habilidadPorteria()) {
					list.get(i).setVidas(list.get(i).getVidas()-1);
					
				}
		}
		mostrar(list);
		
		
		
	}
}
