package practicas.practica7;

public class Inicio {

	public static void main(String[] arg) {
		
		Club c = new Club("Marias");
		c.addSocio(new Socio("nara"));
		c.addSocio(new Socio("andrea"));
		c.addSocio(new Socio("Noa"));
		c.addSocio(new Socio("Laurencia"));
		c.addSocio(new Socio("Sara"));
		c.addSocio(new Socio("julia"));
		
		
		//c.getConjunto_socios().show();
		/*
		Club c2 = new Club("Saras");
		c2.addSocio(new Socio("Sincera"));
		c2.addSocio(new Socio("Samanta"));
		c2.getConjunto_socios().show();
		
		c2.unionClub(c);
		*/
		//c2.getConjunto_socios().show();
	
	}
	
}
