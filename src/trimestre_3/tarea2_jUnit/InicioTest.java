package trimestre_3.tarea2_jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InicioTest {

	
	@Test
	public void consonante() {
		assertEquals(Inicio.consonante("a"),false);
		assertEquals(Inicio.consonante("b"),true);
		//comprobamos que devuelva bien si es consonante
	}
	
	@Test
	public void vocales() {
		String[] v = Inicio.vocales();
		boolean correct = false;
		for(int i = 0; i < v.length; i++) {
			if(v[i].equalsIgnoreCase("a") 
					|| v[i].equalsIgnoreCase("i") 
					||v[i].equalsIgnoreCase("u") 
					|| v[i].equalsIgnoreCase("e") 
					|| v[i].equalsIgnoreCase("o")) {
				correct = true;
			}
		}
		// comprobamos que contenga las vocales
		assertEquals(correct, true);
	}
	
	@Test
	public void contador() {
		
		String[] t = new String[] {"Hola","que","Comer","dormir","rozar",
									"supercalifragilisticoespialidoso", "essternocleidomastoideo",
									"globulo","blanco","rosa"};
		for(int i = 0; i < t.length; i++) {
			String data = t[i];
			data = data.replaceAll(" ", "");
			assertEquals(data.length(), Inicio.contador(data));
			// comprobamos que la suma de consonantes y vocales == a la longitud
		}
	}

	/*
		@Test
		void test() {
			fail("Not yet implemented");
		}
	*/
}
