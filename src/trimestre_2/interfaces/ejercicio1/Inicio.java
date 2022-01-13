package trimestre_2.interfaces.ejercicio1;

public class Inicio {
	// ejercicio de ejemplo y pruebas
	public static void main(String[] arg) {
		Moto moto = new Moto("40", "10", 30);
		System.out.println(moto.getVelocidad());
		
		
		moto.frenar(10);
		System.out.println(moto.getVelocidad());
		
	}

}
