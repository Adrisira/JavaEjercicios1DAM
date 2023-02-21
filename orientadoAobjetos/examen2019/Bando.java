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

	// Comprueba que un bando contiene ese pais
	public boolean contienePaisBando(Pais p) {
		boolean contiene = false;
		for (int i = 0; i < this.nPaises && !contiene; i++) {
			if (this.tablaPaises[i].equals(p)) {
				contiene = true;
			}
		}
		return contiene;
	}

	// d
	public boolean equals(Object otro) {
		Bando otroBando = (Bando) otro;
		boolean iguales = this.nPaises == otroBando.nPaises;
		for (int i = 0; i < this.nPaises && iguales; i++)
			if (!otroBando.contienePaisBando(this.tablaPaises[i]))
				iguales = false;

		return iguales;

	}

	public String toString() {
		String cad = nombre + "\n";
		for (int i = 0; i < this.nPaises; i++)
			cad += "                      - " + this.tablaPaises[i] + "\n";
		return cad;
	}
}
