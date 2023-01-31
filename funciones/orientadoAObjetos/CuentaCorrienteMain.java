package orientadoAObjetos;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		CuentaCorriente c1 = new CuentaCorriente("Pepe", "999999999A");
		CuentaCorriente c2 = new CuentaCorriente("Jose", "8888888889A");
		c1.sacarDinero(50);
		c1.ingresarDinero(300);
		c2.sacarDinero(500);
		c2.ingresarDinero(1000);
		c1.cambiarBanco("Caixa");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
