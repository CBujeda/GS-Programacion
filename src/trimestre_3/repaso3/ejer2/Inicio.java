package trimestre_3.repaso3.ejer2;

import java.util.ArrayList;

public class Inicio {
	
	public static void main(String[] arg) {
		Lde l = new Lde();
		
		for(int i = 0; i < 30; i++) {
			l.add(new Node(i,null,null));
		}
		
		l.show();
		ArrayList<Integer> t = new ArrayList<Integer>();
		
		for(int i = 1; i < 15 ; i++) {
			t.add(i);
		}
		l.eliminar(t);
		l.show();
		
	}
}
