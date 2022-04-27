package trimestre_3.cola;

public class Inicio {

	public static void main (String[] arg) {
		
		Cola c = new Cola();
		c.show();
		System.out.println(c.isEmpty());
		c.push(new Node(1,null));
		c.show();
		c.push(new Node(2,null));
		c.show();
		c.push(new Node(3,null));
		c.show();
		System.out.println("----POP");
		c.pop();
		c.show();
		c.pop();
		c.show();
		c.pop();
		c.show();
		c.pop();
	}
}
