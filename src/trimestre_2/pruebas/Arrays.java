package trimestre_2.pruebas;


import java.util.ArrayList;

public class Arrays {

	public static void main(String[] arg) {
		ArrayList<Coche> lista = new ArrayList<Coche>();
		Coche p = new Coche("aaagaa", "Azul", 9);lista.add(p);
		Coche p1 = new Coche("aaafaa", "Azul", 9);lista.add(p1);
		Coche p2 = new Coche("aadaaa", "Azul", 9);lista.add(p2);
		Coche p3 = new Coche("Xdaaa", "Rojo", 4);lista.add(p3);
		Coche p4 = new Coche("apaaaa", "Rojo", 4);lista.add(p4);
		lista.add(new Coche("xd", "Pink", 7));
		
		for(int i = 0; i < 8; i++) {
			lista.add(new Coche("xd", "Rojo", (int) Math.round(Math.random()*10)));	
		}
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getColor().equalsIgnoreCase("Rojo") && lista.get(i).getPuertas() == 4 ) {
				System.out.println( lista.get(i).getMatricula() + " " +
										  lista.get(i).getColor() + " " +
										  lista.get(i).getPuertas());
				
			}

		}
		System.out.println("-----------");
		for(int i = 0; i < lista.size(); i++) {
			System.out.print( lista.get(i).getMatricula() + " " +
					  lista.get(i).getColor() + " " +
					  lista.get(i).getPuertas());
			if(lista.get(i).getPuertas() == 4) {
				System.out.println(" <");
			}else {
				System.out.println();
			}

		}
	}
}
