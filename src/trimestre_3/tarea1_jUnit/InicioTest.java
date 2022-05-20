package trimestre_3.tarea1_jUnit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InicioTest {

	Stack st;
	
	@BeforeEach
	public void starttest() {
		st = new Stack();
		assertEquals(st.size(),2); // comprobamos que se crean 2
	}
	
	@Test
	public void pushtest() {
		st.push(new Node(20,null));
		assertEquals(st.size(),3);// comprobamos que entre 2 y 50 se añade
		st.push(new Node(0,null));
		assertEquals(st.size(),3); // con 0 al ser menor que 0 no se añade
	}
	
	@Test
	public void poptest() {
		st.pop();
		assertEquals(st.size(),2); // no nos permitira depilar
		st.pop();
		assertEquals(st.size(),2); // no nos permitira depilar
	}
	
	
	
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/

}
