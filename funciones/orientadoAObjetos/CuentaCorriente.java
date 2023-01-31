package orientadoAObjetos;

public class CuentaCorriente {
	/* Ejercicio 3
	private double saldo;
	private int limiteDescubierto;
	public String nombre;
	String dni;
	*/
	double saldo;
	int limiteDescubierto;
	String nombre;
	String dni;
	static String banco = "Santander";
	// Constructor(tiene que tener el mismo nombre que la clase)
	public CuentaCorriente(String nombre, String dni) {
			saldo=0;
			limiteDescubierto = -50;
			// El primero es el atributo y el segundo el parametro
			this.nombre = nombre; 
			this.dni=dni;
	}
	// El 2
	public CuentaCorriente(double saldo) {
		this.saldo=saldo;
		limiteDescubierto = 0;
	}
	public CuentaCorriente(double saldo, int limiteDescubierto, String dni) {
		this.saldo = saldo;
		this.limiteDescubierto = limiteDescubierto;
		this.dni=dni;
	}
	public boolean sacarDinero(double cantidad){
		boolean haPodidoSacar = false;
		if (this.saldo - cantidad >= this.limiteDescubierto) {
			this.saldo = this.saldo - cantidad;
			haPodidoSacar = true;
			System.out.println("Hecho");
		} else {
			System.out.println("Error");
		}
		return haPodidoSacar; 
	}
	public void ingresarDinero(float dineroAIngresar) {
		this.saldo += dineroAIngresar;
	}
	public String toString () {
		return "CuentaCorriente[saldo: " + saldo + ", limite: " + limiteDescubierto + ", nombre: " + nombre + ", dni: " + dni + ", banco: " + banco +"]";
	}
	public String cambiarBanco(String banco) {
		this.banco = banco;
		return banco;
	}
}
