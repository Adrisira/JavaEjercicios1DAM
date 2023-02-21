package examen2019;

public class Guerra implements Comparable<Guerra> {
	private String denominación; // nombre de la guerra
	private Bando bandoA; // uno de los dos bandos que lucharon en esta guerra
	private Bando bandoB; // el otro bando que luchó en esta guerra.
	private Batalla tablaBatallas[]; // batallas que tuvieron lugar en esta guerra
	private int nBatallas; // número de batallas en la tabla
	public static final int MAX_BATALLAS = 10; // máximo

	public Guerra(String denominación, Bando BandoA, Bando BandoB) {
		this.denominación = denominación;
		this.bandoA = BandoA;
		this.bandoB = BandoB;
		this.tablaBatallas = new Batalla[Guerra.MAX_BATALLAS];
		this.nBatallas = 0;
	}

	public void añadeBatalla(Batalla batalla) {
		this.tablaBatallas[nBatallas++] = batalla;
	}

	public Bando getBandoA() {
		return bandoA;
	}
	

	public Batalla[] getTablaBatallas() {
		return tablaBatallas;
	}

	public void setTablaBatallas(Batalla[] tablaBatallas) {
		this.tablaBatallas = tablaBatallas;
	}

	public int getnBatallas() {
		return nBatallas;
	}

	public void setnBatallas(int nBatallas) {
		this.nBatallas = nBatallas;
	}

	public void setBandoA(Bando bandoA) {
		this.bandoA = bandoA;
	}

	public Bando getBandoB() {
		return bandoB;
	}

	public void setBandoB(Bando bandoB) {
		this.bandoB = bandoB;
	}

	@Override
	public String toString() {
		String cad = "Guerra: " + denominación + "\n\n" + "    Bando:   " + bandoA // + "\n"
				+ "    Bando:   " + bandoB // + "\n"
				+ "    Batallas:\n";
		for (int i = 0; i < this.nBatallas; i++)
			cad += "             " + this.tablaBatallas[i] + "\n";

		return cad;
	}

	public int getNPaisesTotal() {
		return this.bandoA.getnPaises() + this.bandoB.getnPaises();
	}

	@Override
	public int compareTo(Guerra guerra) {
		return this.getNPaisesTotal() - guerra.getNPaisesTotal();
	}
}
