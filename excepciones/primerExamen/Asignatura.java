package primerExamen;

public class Asignatura implements Comparable<Asignatura>{
	private String nombre;
	private int horasSemanales;

	public Asignatura(String nombre, int nota) {
		super();
		this.nombre = nombre;
		this.horasSemanales = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horasSemanales;
	}

	public void setHoras(int nota) {
		this.horasSemanales = nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
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

	@Override
	public int compareTo(Asignatura o) {
		return this.nombre.compareTo(o.nombre);
	}

}

