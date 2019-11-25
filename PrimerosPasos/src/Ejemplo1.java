
public class Ejemplo1 {
	
	int mes=1;
	String meses;
	
	public String getMeses() {
		
		if(mes==1) {
			System.out.println("Enero");
			meses="Enero";
		} else if(mes==2) {
			System.out.println("Febrero");
			meses="Febrero";
		} else if(mes==3) {
			System.out.println("Marzo");
			meses="Marzo";
		}
		
		return meses;
	}
}
