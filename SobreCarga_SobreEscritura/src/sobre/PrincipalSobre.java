package sobre;

import animales.Animal;
import animales.Caballo;
import animales.OtroAnimal;

public class PrincipalSobre {
	
	public static Animal animal;
	public static Caballo caballo;
	public static OtroAnimal otro;
	
	public static void main(String[] args) {
		
//		animal=new Animal();
//		animal.comer();
//		animal.crecer();
		
		otraForma();
	}

	private static void otraForma() {
		
		caballo=new Caballo();
		caballo.comer();
		caballo.comer("Pasto");
		caballo.comer("Pasto", 200);
		
		caballo.crecer();
		caballo.crecer(20);
		caballo.crecer(25, 124);
		
		otro=new OtroAnimal();
		otro.comer();
		otro.comer("Alfalfa", 113);
		
	}

}
