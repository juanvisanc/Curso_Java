package tiposEnumerados;

public class Demo{

	public String nombre;
	public String apellido;
	public Meses mesDeNacimiento;
	public Day diaDeNacimiento;
	
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		Meses meses[]=Meses.values();
		
		d.nombre="Jesé Luis";
		d.apellido="Sánchez";
		d.mesDeNacimiento=Meses.FEBRERO;
		d.diaDeNacimiento=Day.JUEVES;
		
		System.out.println(d);
		
		for (Meses mes:meses) 
        { 
            // Calling ordinal() to find index 
            // of color. 
            System.out.print(" "+mes); 
        } 
		
		System.out.println();

	}
	
	public String toString() {
		return "Demo [nombre: "+nombre+", apellido: "+apellido+", mes de nacimiento: "+mesDeNacimiento+", día de nacimiento: "+diaDeNacimiento+"]";
	}
	

}
