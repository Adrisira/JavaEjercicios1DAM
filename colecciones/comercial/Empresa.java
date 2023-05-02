package comercial;

import java.util.Objects;

public class Empresa implements Comparable<Empresa>{
	private String nombre;
	private float compras;

	public Empresa(String nombre, float compras) {
		super();
		this.nombre = nombre;
		this.compras = compras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCompras() {
		return compras;
	}

	public void setCompras(float compras) {
		this.compras = compras;
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
		Empresa other = (Empresa) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public int compareTo(Empresa o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}
}
