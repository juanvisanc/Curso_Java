package abstractas;

public class Demo {

	public static void main(String[] args) {
		
		ProcesamientoDeDatos ca = new Implementacion1();
		
		Implementacion2 imp2=new Implementacion2();
		
		System.out.println(ca.acceso());
		
		System.out.println(imp2.acceso());

	}

}
