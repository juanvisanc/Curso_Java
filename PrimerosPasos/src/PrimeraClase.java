
public class PrimeraClase {
	public static void main (String args []) {
		//System.out.print("Hola mundo");
		
		Ejemplo1 ejemplo=new Ejemplo1();
		String mes= ejemplo.getMeses();
		System.out.println("Estamos en el mes de "+mes);
		
		SentenciaSwitch ejemplo2 = new SentenciaSwitch();
		String mes2=ejemplo2.getMes();
		System.out.println("Estamos en el mes de "+mes2);
	}

}
