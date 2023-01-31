package orientadoAObjetos;

public class BombillaMain {

	public static void main(String[] args) {
		Bombillas b1 = new Bombillas(true);
		Bombillas b2 = new Bombillas();
		System.out.println("Bombillas creadas");
		if (b1.estadoBombilla() == true) {
			System.out.println("La bombilla esta encendida");
		} else {
			System.out.println("La bombilla esta apagada");
		}
		if (b2.estadoBombilla() == true) {
			System.out.println("La bombilla esta encendida");
		} else {
			System.out.println("La bombilla esta apagada");
		}
		Bombillas.saltanLosFusibles();
		System.out.println("Fusibles rotos");
		if (b1.estadoBombilla() == true) {
			System.out.println("La bombilla esta encendida");
		} else {
			System.out.println("La bombilla esta apagada");
		}
		if (b2.estadoBombilla() == true) {
			System.out.println("La bombilla esta encendida");
		} else {
			System.out.println("La bombilla esta apagada");
		}
		Bombillas.arregloLosFusibles();
		System.out.println("Fusibles arreglados");
		if (b1.estadoBombilla() == true) {
			System.out.println("La bombilla esta encendida");
		} else {
			System.out.println("La bombilla esta apagada");
		}
		if (b2.estadoBombilla() == true) {
			System.out.println("La bombilla esta encendida");
		} else {
			System.out.println("La bombilla esta apagada");
		}

	}

}
