package orientadoAObjetos;

public class JefeEstacion {
	// Poner todas las clases minusculas menos vagones
	private String nombre;
	private String dni;
	public JefeEstacion() {
		super();
	}
	public JefeEstacion(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "JefeEstacion [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
}
