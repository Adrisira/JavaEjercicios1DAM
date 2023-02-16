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

	// B
	public void anadeMiembroSinRepetir(Miembro m) {
		if (!this.contieneMiembro(m)) {
			this.anadeMiembro(m);
		}
	}

	public String toString() {
		return Arrays.toString(this.tabla);
	}

	// A
	public boolean contieneMiembro(Miembro m) {
		boolean contiene = false;
		for (int i = 0; i < tabla.length && !contiene; i++) {
			contiene = tabla[i].equals(m);
		}
		return contiene;
	}

	// C
	public void eliminaMiembro(Miembro m) {
		if (this.contieneMiembro(m)) {
			for (int i = getIndexOf(m); i < this.getTamano() - 1; i++) {
				this.tabla[i] = this.tabla[i + 1];
			}
			this.tabla = Arrays.copyOf(this.tabla, this.tabla.length - 1);
		}
	}

	public int getIndexOf(Miembro m) {
		int indice = -1;
		if (this.contieneMiembro(m)) {
			for (int i = 0; i < tabla.length && indice == -1; i++) {
				if (m.equals(tabla[i])) {
					indice = i;
				}
			}
		}
		return indice;
	}

}
