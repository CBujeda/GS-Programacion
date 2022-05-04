package practicas.practica6;

import practicas.practica6.node_Pasajeros.Node;

public class Principal {

	/**
	 * Pre: 
	 * Post: Metodo principal el cual ejecuta la mayor parte de la ejecucion
	 */
	public static void inicio() {
		
		Cola c = new Cola();
		Pila p = new Pila();
		Lavion av = new Lavion();
		System.out.println("Aviones disponibles");
		av.add(new practicas.practica6.node_Aviones.Node(new Avion("La Maria",123,new Lemb ()), null));
		av.add(new practicas.practica6.node_Aviones.Node(new Avion("La Maria",19,new Lemb ()), null));
		av.show();
		System.out.println("[NOTA] Debera elegir un avion al presentarse en recepcion");
		int numero = 0;
		while(true) {
			 
			if(p.getSize() >= 3 && c.getSize() >= 2) {
				Inicio.puntos(59);
				System.out.println("\nNo hay capacidad para mas pasajeros");
				Inicio.puntos(59);
				System.out.println("\nLa cajera mira la lista de pasajeros");
				break;
			}
			
			numero++;
			System.out.println();
			System.out.println("Entras al aeropuerto y piden que te identifiques eres el pasajero: " + numero);
			Inicio.puntos(59);
			System.out.println();
			System.out.print("Nombre:");
			String name = Inicio.scStr();
			System.out.print("DNI:");
			String dni = Inicio.scStr();
			int nv;
			while(true) {
				System.out.print("Numero de vuelo (Avion):");
				nv = Inicio.scInt();
				boolean alguno = false;
				for(int i = 0; i < av.size(); i++) {
					if(av.get(i).getContent().getId_avion() == nv) {
						alguno = true;
					}
				}
				if(alguno == true) {
					break;
				}else {
					System.out.println("Recepcionista: No existe ningun avion con ese numero");
				}
			}
			if(c.getSize() < 2) {
				c.push(new Node(new Pasajero(name,dni,nv), null));
				System.out.println("Entraste en la Cola");
			}else if(p.getSize() < 3) {
				System.out.println("Entraste en la Pila");
				p.push(new Node(new Pasajero(name,dni,nv), null));
			}
		}
		Inicio.puntos(59);
		System.out.println("\nLa recepcionista decide ver la Cola de Pasajeros: ");
		System.out.println(c);
		System.out.println("\nLa recepcionista decide ver la Pila de Pasajeros: ");
		System.out.println(p);
		Inicio.puntos(59);
		System.out.println("\nLos pasajeros han comenzado a embarcar");
		numero = 0;
		while(true) {
			numero++;
			Pasajero temp = null;
			if(c.getSize() != 0) {
				temp = c.pop().getContent();
			}else if(p.getSize() != 0) {
				temp = p.pop().getContent();
			}else {
				break;
			}
			
			for(int i = 0; i < av.size(); i++) {
				if(av.get(i).getContent().getId_avion() == temp.getNumero_vuelo()) {
					av.get(i).getContent().getEmbarcados().add(new Node(temp, null));
				}
			}
			System.out.println(
					"Acaba de embarcar " + 
							temp.getNombre() + 
								" - Pasajeros embarcados " + numero);
		}
		Inicio.puntos(59);
		System.out.println("\nAcaban de embarcar los diferentes pasageros en sus aviones");
		Inicio.puntos(59);
		System.out.println("\n");
		av.showEmbarque();
		
	}

}
