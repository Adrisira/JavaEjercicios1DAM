package examen2022;

import java.util.Objects;

public class Ciudad {
	private String nombre;
	private int numHabitantes;

	public Ciudad(String nombre, int numHabitantes) {
		super();
		this.nombre = nombre;
		this.numHabitantes = numHabitantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHabitantes() {
		return numHabitantes;
	}

	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, numHabitantes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(nombre.toLowerCase(), other.nombre.toLowerCase()) && (numHabitantes == other.numHabitantes
				|| (numHabitantes - other.numHabitantes) <= 100 || (numHabitantes - other.numHabitantes) >= 100);
	} 

	@Override
	public String toString() {
		return " " + nombre + "(" + numHabitantes + ") ";
	}

}
