package interfaces;

import java.util.Objects;

public class Cliente {
	private String dni;
	private String nombre;
	private int edad;
	private double saldo;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String dni) {
		super();
		this.dni = dni;
	}
	
	public Cliente(String dni, String nombre, int edad, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	
	//Equals basado en dni
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cliente other = (Cliente) obj;
//		return Objects.equals(dni, other.dni);
		return this.dni.equals(((Cliente)obj).dni);
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", saldo=" + saldo + "]";
	}
	
	//Implementamos una interfaz compareto que siempre se ejecuta en la clase a la que afecta

	public int compareTo(Cliente o) {
		return this.dni.compareTo(o.dni);
	}
	
	
}
