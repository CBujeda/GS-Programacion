package trimestre_3.stack;

public class Inicio {

	public static void main(String[] arg) {
		Stack s = new Stack();
		
		for(int i = 0; i < 10; i++) {
			s.push(new Node(i,null));
		}
		
		while(s.isEmpty()) {
			System.out.println(s.pop().getContent());
		}
	}
}
