package comercial;

import java.util.Objects;

public class Comercial implements Comparable<Comercial>{
	private String nombre;
	private float ventas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getVentas() {
		return ventas;
	}

	public void setVentas(float ventas) {
		this.ventas = ventas;
	}

	public  Comercial(String nombre, float ventas)
	{
		super();
		this.nombre = nombre;
		this.ventas = ventas;
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
		Comercial other = (Comercial) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public int compareTo(Comercial o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}
}
