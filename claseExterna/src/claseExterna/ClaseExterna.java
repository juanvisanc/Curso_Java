package claseExterna;

public class ClaseExterna {
	
	public int edad;
	public ClaseInterna ci;
	static ClaseAnidadaEstatica ce;
	
	public ClaseExterna() {
		this.ci=new ClaseInterna();
	}
	
	public static class ClaseAnidadaEstatica{
		
		public static String anidado="Un valor anidado";
		
		public static String interno2="interno";
		
	}
	
	private class ClaseInterna{
		
		public String variableInterna="Valor interno...!!";
		
		
	}

	public static void main(String[] args) {
		ClaseExterna ce=new ClaseExterna();
		
		System.out.println(ce.ci.variableInterna);
		
		System.out.println(ClaseExterna.ClaseAnidadaEstatica.interno2);

	}

}
