package orientadoAObjetos;

public class CuentaCorrienteMartaMain {

	public static void main(String[] args) {
		CuentaCorrienteMarta c2 = new CuentaCorrienteMarta("Maria", "12345A");
		System.out.println(c2.getNombre());
		c2.setSaldo(100);
		if(c2.sacarDinero(160)) {
			System.out.println("Su nuevo saldo es: " + c2.getSaldo());
		} else {
			System.out.println("Dinero insuficiente");
		}
		c2.ingresarDinero(100);
		System.out.println(c2.toString());
	}

}
