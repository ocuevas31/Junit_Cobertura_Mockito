package oscar;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class NegocioTestSinMock {

	Negocio n = new Negocio();

	/*
	 * @Before public void setup() { n = new Negocio();
	 * 
	 * }
	 */

	@Test
	void testNegocio() {
		assertNotNull(n.datos);
	}

	@Test
	void testInsertar() {
		n.insertar(null);
		
		Info fo=new Info(1);
		n.insertar(fo);
		n.insertar(fo);
	}

	@Test
	void testBuscar() {
		n.buscar(null);
		
		
		n.insertar(new Info(1));
		n.buscar(new Info(1));
		
		
		
		
	}

	@Test
	void testMostrar() {
		n.mostrar();
	}
	
	@Test
	void testResto()
	{
		Info fo=new Info(1,"Oscar");
		
		fo.setClave(2);
		
		fo.getInfo();
		fo.setInfo(null);
		
		String s=new String("");
		
		fo.equals(s);
		
		fo.equals(null);
		
		Info fo2=new Info(1);
		
		fo.equals(fo2);
		
		n.insertar(fo2);
		n.mostrar();
		
		BBDD b=new BBDD();
		
		b.buscar(1);
		
	}

}
