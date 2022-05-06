package practicas.practica6;

import practicas.practica6.node_Pasajeros.Node;

public class Principal {

	/**
	 * Pre: 
	 * Post: Metodo principal el cual ejecuta la mayor parte de la ejecucion
	 */
	public static void inicio() {
		
		Aeropuerto a = new Aeropuerto();
		System.out.println("Aviones disponibles");
		a.getAv().add(new practicas.practica6.node_Aviones.Node(new Avion("La Maria",123,new Lemb ()), null));
		a.getAv().add(new practicas.practica6.node_Aviones.Node(new Avion("La Maria",19,new Lemb ()), null));
		a.avView();
		System.out.println("[NOTA] Debera elegir un avion al presentarse en recepcion");
		int numero = 0;
		while(true) {
			 
			if(a.getP().getSize() >= 3 && a.getC().getSize() >= 2) {
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
				for(int i = 0; i < a.getAv().size(); i++) {
					if(a.getAv().get(i).getContent().getId_avion() == nv) {
						alguno = true;
					}
				}
				if(alguno == true) {
					break;
				}else {
					System.out.println("Recepcionista: No existe ningun avion con ese numero");
				}
			}
			
			a.addPasajero(new Pasajero(name,dni,nv));
		}
		Inicio.puntos(59);
		System.out.println("\nLa recepcionista decide ver la Cola de Pasajeros: ");
		System.out.println(a.getC());
		System.out.println("\nLa recepcionista decide ver la Pila de Pasajeros: ");
		System.out.println(a.getP());
		Inicio.puntos(59);
		System.out.println("\nLos pasajeros han comenzado a embarcar");
		
		a.embarque();
		
		Inicio.puntos(59);
		System.out.println("\nAcaban de embarcar los diferentes pasageros en sus aviones");
		Inicio.puntos(59);
		System.out.println("\n");
		a.getAv().showEmbarque();
		
	}

}
