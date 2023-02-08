package examen2018;

import java.util.Arrays;

public class ListaMiembros {
	private Miembro tabla[];

	public Miembro[] getTabla() {
		return tabla;
	}

	public int getTamano() {
		return this.tabla.length;
	}

	public ListaMiembros() {
		this.tabla = new Miembro[0];
	}

	public void anadeMiembro(Miembro m) {
		Miembro[] tablaNueva = new Miembro[this.getTamano() + 1];
		for (int i = 0; i < this.getTamano(); i++)
			tablaNueva[i] = this.tabla[i];
		tablaNueva[this.getTamano()] = m;
		this.tabla = tablaNueva;
	}

	public void anadeMiembroSinRepetir(Miembro m) {
	}

	public String toString() {
		return Arrays.toString(this.tabla);
	}

	public boolean contieneMiembro(Miembro m) {
		boolean contiene = false;
		for (int i = 0; i < tabla.length && tabla[i] != null && !contiene; i++) {
			if (m.equals(tabla[i])) {
				contiene = true;
			}
		}
		return contiene;
	}

	public void eliminaMiembro(Miembro m) {
	}

}
