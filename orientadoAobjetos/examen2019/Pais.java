package examen2019;

public class Pais {
	private String nombre; // nombre del país
	private Guerra tablaGuerras[]; // guerras en las que ha participado este país.
	private int nGuerras; // número de elementos en la tabla.
	public static final int MAX_GUERRAS = 10; // constante con el máximo de guerras permitido en un país.

	public Pais(String nombre) {
		this.nombre = nombre;
		this.tablaGuerras = new Guerra[Pais.MAX_GUERRAS];
		this.nGuerras = 0;
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Guerra[] getTablaGuerras() {
		return tablaGuerras;
	}


	public void setTablaGuerras(Guerra[] tablaGuerras) {
		this.tablaGuerras = tablaGuerras;
	}


	public int getnGuerras() {
		return nGuerras;
	}
	
	public Pais[] posiblesEnemigos() {
		return null;
	}


	public void setnGuerras(int nGuerras) {
		this.nGuerras = nGuerras;
	}


	@Override
	public String toString() {
		return nombre;
	}

	public void participóEn(Guerra guerra) {
		this.tablaGuerras[this.nGuerras++] = guerra;

	}

}
