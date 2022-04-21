package trimestre_3.lista_enlazada_simple;

public class Inicio {

	public static void main(String[] arg) {
		SimpleLinkedList l = new SimpleLinkedList();
		
		for(int i = 0; i < 10; i++) {
			l.add(new Node(i+100,null));
		}
		l.show();
		l.delete(3);
		l.show();
	}
}
