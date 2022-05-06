package practicas.practica6;

import practicas.practica6.node_Pasajeros.Node;

public class Aeropuerto {

	private Cola c;
	private Pila p;
	private Lavion av;
	
	/**
	 * CONSTRUCTOR
	 */
	public Aeropuerto() {
		super();
		c = new Cola();
		p = new Pila();
		av = new Lavion();
	}
	
	/**
	 * GETERS AND SETERS
	 */
	public Cola getC() {
		return c;
	}
	public void setC(Cola c) {
		this.c = c;
	}
	public Pila getP() {
		return p;
	}
	public void setP(Pila p) {
		this.p = p;
	}
	public Lavion getAv() {
		return av;
	}
	public void setAv(Lavion av) {
		this.av = av;
	}
	
	public void avView() {
		av.show();
	}
	
	/**
	 * Pre:
	 * Post: metodo el cual añade un pasajero a la cola o la Pila dependiendo de su tamaño
	 */
	public void addPasajero(Pasajero pasajero) {
		if(c.getSize() < 2) {
			c.push(new Node(pasajero, null));
			System.out.println("Entraste en la Cola");
		}else if(p.getSize() < 3) {
			System.out.println("Entraste en la Pila");
			p.push(new Node(pasajero, null));
		}
	}
	
	/**
	 * Pre:
	 * Post: Metodo el cual embarca a los pasajeros en sus respectivos aviones
	 */
	public void embarque() {
		int numero = 0;
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
	}
	
	
	
}
