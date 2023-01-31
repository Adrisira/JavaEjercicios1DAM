package orientadoAObjetos;

public class BancoMain {

	public static void main(String[] args) {
		Banco b1 = new Banco("Santander", "Avda Virgen del Rocio");
		Banco b2 = new Banco ("Caixa", "Avda De los pirralos");
		
		CuentaCorrienteMarta cc1 = new CuentaCorrienteMarta("Adrian", "111A", 1000f, -50, b1);
		System.out.println(cc1.toString());
		
	}

}
