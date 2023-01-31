package orientadoAObjetos;

public class CuentaCorrienteMarta {
	//atributos
	private String nombre;
	private String dni;
	private float saldo;
	private int limiteDescubierto;
	private Banco banco;
	static private String nombreBanco;
	//constructores
	public CuentaCorrienteMarta() {
		super();
		//contrsuctor por defecto
	}
	public CuentaCorrienteMarta(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = 0;
		this.limiteDescubierto = -50;
	}
	
	public CuentaCorrienteMarta(String nombre, String dni, float saldo, int limiteDescubierto, Banco banco) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
		this.limiteDescubierto = limiteDescubierto;
		this.banco = banco;
	}
	
	
	public CuentaCorrienteMarta(String nombre, String dni, float saldo, int limiteDescubierto, Banco banco, String nombreBanco) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
		this.limiteDescubierto = limiteDescubierto;
		this.banco = banco;
		//Si tienes un comprobacion llamar desde aqui al set
		CuentaCorrienteMarta.nombreBanco = nombreBanco;
	}
	// getters y stters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int getLimiteDescubierto() {
		return limiteDescubierto;
	}
	public void setLimiteDescubierto(int limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	public Banco getBanco() {
		return banco;
	}
	public  void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public static String getNombreBanco() {
		return nombreBanco;
	}
	public static void setNombreBanco(String nombreBanco) {
		CuentaCorrienteMarta.nombreBanco = nombreBanco;
	}
	//metodos
	public boolean sacarDinero (int dineroASacar) {
		boolean haPodidoSacar = false;
		if (saldo-dineroASacar >= limiteDescubierto) {
			haPodidoSacar = true;
			saldo = saldo - dineroASacar;
			System.out.println("Ha podido sacarlo");
		}
		return haPodidoSacar;
	}
	public void ingresarDinero(float dineroAIngresar) {
		saldo = saldo + dineroAIngresar;
	}
	// No le gustan dos return, intentar poner uno
	@Override
	public String toString() {
		if (banco != null) {
			return "CuentaCorrienteMarta [nombre=" + nombre + ", dni=" + dni + ", saldo=" + saldo + ", banco= "+ banco +"]";
		} else {
			return "CuentaCorrienteMarta [nombre=" + nombre + ", dni=" + dni + ", saldo=" + saldo + "]";
		}
	}
	
	
	
}
