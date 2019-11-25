package animales;

public class Caballo extends Animal{
	
	public void comer(String comida) {
		System.out.println("El caballo come "+comida);
	}
	
	public void crecer(long altura) {
		System.out.println("El caballo crece "+altura);
	}
	
	private int comer(int kilos) {
		return kilos;
	}
	
	private int crecer(int altura) {
		return altura;
	}
	
	private int crecer(int altura, long peso) {
		return altura;
	}
	
	@Override
	public void comer() {
		System.out.println("MÉTODO SOBREESCRITURA DE COMER");
	}
	
	@Override
	public void comer(String comida, int kilos) {
		System.out.println("MÉTODO SOBREESCRITURA DE COMER "+comida+" "+kilos);
	}
	
	@Override
	public void crecer() {
		System.out.println("MÉTODO SOBREESCRITURA DE CRECER");
	}
	
	@Override
	public void crecer(long altura, long peso) {
		System.out.println("MÉTODO SOBREESCRITURA DE CRECER "+altura+" "+peso);
	}

}
