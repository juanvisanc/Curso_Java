package workingInterfaces;

import actores.Actor1;
import actores.Actor2;
import actores.Actor3;

public class WorkingInterface {
	
	public static Actor1 actor1;
	public static Actor2 actor2;
	public static Actor3 actor3;
	
	public static void main(String[] args) {
		
		actor1=new Actor1();
		actor2=new Actor2();
		actor3=new Actor3();
		
		prueba(actor1, actor2,actor3);
		
		
	}

	private static void prueba(Actor1 actor1, Actor2 actor2, Actor3 actor3) {
		
		actor1.act();
		actor2.act();
		actor2.resultadoLogico(true);
		actor3.imprimeAlgo("Este es el actor número 3");
	}

}
