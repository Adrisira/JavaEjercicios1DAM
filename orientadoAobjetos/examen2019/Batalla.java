package examen2019;

public class Batalla {
	private String nombre; // nombre de la batalla
	private Pais pais1; // uno de los paises contendientes en la batalla
	private Pais pais2; // el otro país de la batalla.

	public Batalla(String nombre, Pais pais1, Pais pais2) {
		this.nombre = nombre;
		this.pais1 = pais1;
		this.pais2 = pais2;
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Pais getPais1() {
		return pais1;
	}


	public void setPais1(Pais pais1) {
		this.pais1 = pais1;
	}


	public Pais getPais2() {
		return pais2;
	}


	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}


	public String toString() {
		return this.nombre + " (" + pais1 + " - " + pais2 + ")";
	}
}
