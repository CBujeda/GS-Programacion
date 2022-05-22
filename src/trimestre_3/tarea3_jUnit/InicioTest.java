package trimestre_3.tarea3_jUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InicioTest {

	@Test
	public void povOf2test() {
		String data;	
		for(int i = -2; i == 2; i++ ) {
			data = Inicio.povOf2(i);
			int d = i*i;
			assertEquals(data,d );
		}
	}
}
