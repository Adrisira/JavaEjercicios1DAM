package primerExamen;

public class Alumno implements Comparable<Alumno>{
	private String nombre;
	private String grupo;

	public Alumno(String nombre, String grupo) {
		super();
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	//suponiendo que el grupo no puede contener espacios
	public Alumno(String grupoNombre) {
		super();
		this.nombre = grupoNombre.substring(grupoNombre.indexOf(" ")+1);
		this.grupo = grupoNombre.substring(0, grupoNombre.indexOf(" "));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
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
		Alumno other = (Alumno) obj;
		if (grupo == null) {
			if (other.grupo != null)
				return false;
		} else if (!grupo.equals(other.grupo))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return grupo + " " + nombre;
	}

	@Override
	public int compareTo(Alumno o) {
		int compGrupos=this.grupo.compareTo(o.grupo);
		return compGrupos!=0?compGrupos: this.nombre.compareTo(o.nombre);
	}


}

