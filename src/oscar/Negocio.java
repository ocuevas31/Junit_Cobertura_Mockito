package oscar;

public class Negocio {

	BBDD datos;
	/**pero si datos es privado nada de nada,si no hay get/set/*/

	public Negocio() {
		super();
		datos = new BBDD();
	}

	/**
	 * Inserta que en la BBDD comprobando que no exista ya antes y muestra por
	 * Consola si pudo o no
	 */
	void insertar(Info que) {

		Info buscado = datos.buscar(que);

		if (buscado == null) {
			datos.insertar(que);
			System.out.println(que+" Insertado OK");
		} else
			System.out.println("No insertado, ya repetido");

	}

	/**
	 * Busca que en la BBDD y muestra si está o no
	 */
	void buscar(Info que) {
		
		
		Info buscado = datos.buscar(que);

		if (buscado!=null) System.out.println(buscado);
		else System.out.println(que+" No encontrado");
		

	}

	void mostrar() {

		datos.mostrar();
	}

}
