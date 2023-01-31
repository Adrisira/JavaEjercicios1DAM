package orientadoAObjetos;

public class Banco {
	// nombre no se ponerlo que no se pueda modificar
	private  final String NOMBRE;
	private double capital;
	private String direccion;
	// constructores
	public Banco(String nombre, float capital, String direccion) {
		super();
		this.NOMBRE = nombre;
		this.capital = capital;
		this.direccion = direccion;
	}
	public Banco(String nombre, String direccion) {
		super();
		this.NOMBRE = nombre;
		this.capital = 5.2;
		this.direccion = direccion;
	}
	//getters and setters 
	public String getNombre() {
		return NOMBRE;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Banco [NOMBRE=" + NOMBRE + ", capital=" + capital + ", direccion=" + direccion + "]";
	}
	
	
}
