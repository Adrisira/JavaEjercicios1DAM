package examenAdrianSiguenza;

import java.util.Objects;

public class Monstruo implements Comparable<Monstruo> {
	private int coste;
	private String nombre;
	private int nivelSalud;
	private int nivelDanyo;

	public Monstruo(int coste, String nombre, int nivelSalud, int nivelDanyo) {
		super();
		this.coste = coste;
		this.nombre = nombre;
		this.nivelSalud = nivelSalud;
		this.nivelDanyo = nivelDanyo;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivelSalud() {
		return nivelSalud;
	}

	public void setNivelSalud(int nivelSalud) {
		this.nivelSalud = nivelSalud;
	}

	public int getNivelDanyo() {
		return nivelDanyo;
	}

	public void setNivelDanyo(int nivelDanyo) {
		this.nivelDanyo = nivelDanyo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monstruo other = (Monstruo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "\nMonstruo [coste=" + coste + ", nombre=" + nombre + ", nivelSalud=" + nivelSalud + ", nivelDanyo="
				+ nivelDanyo + "]";
	}

	@Override
	public int compareTo(Monstruo o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}

}
