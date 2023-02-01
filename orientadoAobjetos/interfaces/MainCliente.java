package interfaces;

import java.util.Arrays;

public class MainCliente {

	public static void main(String[] args) {
		Cliente[] clientes= {
				new Cliente("3333N", "Pepe", 20, 1000),
				new Cliente("222A", "Mar�a", 2, 0),
				new Cliente("666P", "Luis", 30, 2100),
				new Cliente("111K", "Laura", 50, 1100),
		};
		
		Arrays.sort(clientes);
		System.out.println(Arrays.toString(clientes));

		Arrays.sort(clientes, new ComparadorClientesNombre());
		System.out.println(Arrays.toString(clientes));
		
		Arrays.sort(clientes, (c1, c2) -> c1.getEdad()-c2.getEdad());
		System.out.println(Arrays.toString(clientes));

	}

}
