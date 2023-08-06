package oscar;


import java.util.List;
import java.util.ArrayList;

public class BBDD {

	private List<Info> datos;

	public BBDD() {
		super();
		datos = new ArrayList<>();
	}

	public boolean insertar(Info que) {
		boolean insertado = false;

		System.out.println("Insertando en BBDD");
		datos.add(que);

		return insertado;

	}

	public Info buscar(Info que) {
		Info buscado = null;
		int pos = -1;

		if (que != null) {
			pos = datos.indexOf(que);
			if (pos != -1)
				buscado = datos.get(pos);
		}
		return buscado;

	}

	public Info buscar(int que) {
		Info buscado = new Info(que);

		buscado = buscar(buscado);
		return buscado;
		

	}

	public void mostrar() {

		for (Info fo : datos) {
			System.out.print(fo + "--");
		}

		System.out.println("|");
	}

}
