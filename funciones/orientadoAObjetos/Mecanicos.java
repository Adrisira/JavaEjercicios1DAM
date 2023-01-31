package orientadoAObjetos;

public class Mecanicos {
	private String nombre;
	private int telefono;
	private String especialidad;
	public Mecanicos() {
		super();
	}
	public Mecanicos(String nombre, int telefono, String especialidad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	@Override
	public String toString() {
		return "Mecanicos [nombre=" + nombre + ", telefono=" + telefono + ", especialidad=" + especialidad + "]";
	}
	
	
}
