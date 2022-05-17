package trimestre_3.les_revisado;

public class Inicio {

	public static void main(String[] arg) {
		SimpleLinkedList l = new SimpleLinkedList();
		
		for(int i = 0; i < 10; i++) {
			l.add(new Node(i+100,null));
		}
		System.out.println(l.getSize());
		l.show();
		l.show();
		l.show(8);
		
		l.add(2, new Node(10000,null));
		System.out.println(l.getSize());
		l.show();
		
		l.add(2, new Node(20000,null));
		System.out.println(l.getSize());
		l.show();
		
		l.add(0, new Node(00000,null));
		System.out.println(l.getSize());
		l.show();
		
		l.add(13, new Node(900000,null));
		System.out.println(l.getSize());
		l.show();
		
		
		System.out.println(l.get(1));
		System.out.println("Hola");
	}
}
