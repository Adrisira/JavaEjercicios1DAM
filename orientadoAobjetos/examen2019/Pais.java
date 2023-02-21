package examen2019;

import java.util.Arrays;

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

	// b
	public Pais[] posiblesEnemigos() {
		Bando bandoFicticio = new Bando("Mentira");

		for (int i = 0; i < this.nGuerras; i++) {
			if (this.tablaGuerras[i].getBandoA().contienePaisBando(this)) {
				for (int k = 0; k < this.tablaGuerras[i].getBandoB().getnPaises(); k++)
					if (!bandoFicticio.contienePaisBando(this.tablaGuerras[i].getBandoB().getTablaPaises()[k]))
						bandoFicticio.añadePaís(this.tablaGuerras[i].getBandoB().getTablaPaises()[k]);
			} else {
				for (int k = 0; k < this.tablaGuerras[i].getBandoA().getnPaises(); k++)

					if (!bandoFicticio.contienePaisBando(this.tablaGuerras[i].getBandoA().getTablaPaises()[k]))
						bandoFicticio.añadePaís(this.tablaGuerras[i].getBandoA().getTablaPaises()[k]);
			}

		}

//		Pais tEnemigos[] = new Pais[bandoFicticio.getnPaises()];
//		for(int i=0;i<bandoFicticio.getnPaises();i++)
//			tEnemigos[i] = bandoFicticio.getTablaPaises()[i];

		return Arrays.copyOf(bandoFicticio.getTablaPaises(), bandoFicticio.getnPaises());
	}

	// c
	public boolean hasidoAlidadoDe(Pais pais) {
		boolean esAliado = false;
		for (int i = 0; i < this.nGuerras && !esAliado; i++) {
			if (this.tablaGuerras[i].getBandoA().contienePaisBando(this)
					&& this.tablaGuerras[i].getBandoA().contienePaisBando(pais)
					|| this.tablaGuerras[i].getBandoB().contienePaisBando(this)
							&& this.tablaGuerras[i].getBandoB().contienePaisBando(pais)) {
				esAliado = true;
			}
		}
		return esAliado;
	}

	public void setnGuerras(int nGuerras) {
		this.nGuerras = nGuerras;
	}
	
	public int getNBatallas()
	{
		int numBatallas=0;
		
		for(int i=0;i<this.nGuerras;i++)
		{
		  for(int j=0;j<this.tablaGuerras[i].getnBatallas();j++)
			  if(this.tablaGuerras[i].getTablaBatallas()[j].getPais1().equals(this) ||
				 this.tablaGuerras[i].getTablaBatallas()[j].getPais2().equals(this))
				  numBatallas++;
		
		}
		return numBatallas;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public void participóEn(Guerra guerra) {
		this.tablaGuerras[this.nGuerras++] = guerra;

	}

}
