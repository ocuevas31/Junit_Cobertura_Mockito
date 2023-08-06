package oscar;

public class Cobertura {

	public static void main(String[] args) {
/*Subido a github*/
		System.out.println("Hola Multiverso");

		Negocio n = new Negocio();
		Info fo = new Info(1, "OScar");
		Info fo2=new Info(2,"Juan");

		n.insertar(fo);
		
		
		
		n.insertar(fo2);

		n.mostrar();

	}

}
