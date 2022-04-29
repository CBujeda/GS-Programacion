package trimestre_3.listas_doblemente_enlazadas;

public class Inicio {

	public static void main(String[] arg) {
		Lde l = new Lde();
		int size = 10;
		for(int i = 0; i< size; i++) {
			l.show();
			l.add(new Node(i,null,null));
		}
		l.show();
		
		for(int i = 0; i< size; i++) {
			l.delete(1);
			l.show();
		}	
	}
}
