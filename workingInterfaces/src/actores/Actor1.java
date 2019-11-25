package actores;

import workingInterfaces.WorkInter;

public class Actor1 implements WorkInter {

	@Override
	public void act() {
		String palabra="Antonio Banderas";
		System.out.println("El actor es: "+palabra);
		
	}

	@Override
	public void resultadoLogico(boolean result) {
		System.out.println("El resultado lógico es: "+result);
		
	}

	@Override
	public void imprimeAlgo(String palabra) {
		
		
	}
	
	

}
