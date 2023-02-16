package examen2019;

public class Bando {
	private String nombre; // nombre del bando
	private Pais tablaPaises[]; // países que formaron este bando
	private int nPaises; // número de países en la tabla
	public static final int MAX_PAISES = 10; // máximo.

	public Bando(String nombre) {
		this.nombre = nombre;
		this.tablaPaises = new Pais[Bando.MAX_PAISES];
		this.nPaises = 0;
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Pais[] getTablaPaises() {
		return tablaPaises;
	}


	public void setTablaPaises(Pais[] tablaPaises) {
		this.tablaPaises = tablaPaises;
	}


	public int getnPaises() {
		return nPaises;
	}


	public void setnPaises(int nPaises) {
		this.nPaises = nPaises;
	}


	public void añadePaís(Pais pais) {
		this.tablaPaises[nPaises++] = pais;
	}

	public String toString() {
		String cad = nombre + "\n";
		for (int i = 0; i < this.nPaises; i++)
			cad += "                      - " + this.tablaPaises[i] + "\n";
		return cad;
	}
}
