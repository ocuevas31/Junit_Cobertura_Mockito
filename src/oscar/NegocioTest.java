package oscar;

import static org.junit.Assert.assertNotNull;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class NegocioTest {

	Negocio n;
	//BBDD datos;

	
	/* creamos un objeto de la clase a probar con todos los tests y 
	 * en este caso un mock de la BBDD que no queremos probar, hacemos
	 * como si no pudiesemos ver sus metodos, solo queremos probar la clase Negocio
	 * y ponemos algun when para que al llamar a los metodos del mock hagan lo que queremos (lo simulamos)*/
	@Before
	public void setup() {
		n = new Negocio();
		n.datos = mock(BBDD.class);
		when(n.datos.insertar(null)).thenReturn(true);

	}

	@Test
	public void testNegocio() {
		assertNotNull(n.datos);
	}

	
	/**Prueba par el insertar de negocio, el de BBDD mockeado*/
	@Test
	public void testInsertar() {
		//insertar uno que no esta repetido
		n.insertar(null);
		
		//intentar insertar uno repetido para que recorra la 2 ramas del if
		//hay que mockear el buscar ya que el att datos (Objeto) ya esta mockeado
		Info fo=new Info(1);
		when(n.datos.buscar(fo)).thenReturn(fo);	
		
		n.insertar(fo);		
	}

	@Test
	public void testBuscar() {	
		n.buscar(null);
		//para las 2 ramas del if
		Info fo=new Info(1);
		when(n.datos.buscar(fo)).thenReturn(fo);	
		n.buscar(fo);		
	}

	@Test
	public void testMostrar() {
		n.mostrar();
	}

}
