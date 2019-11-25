package colecciones;

public class DatosPersonales {
	
	private String nombre;
	private String apellido;
	private String identificador;
	private boolean estado=true;
	
	public DatosPersonales(String nombre, String apellido, String identificador, boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificador = identificador;
		this.estado = estado;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
}
