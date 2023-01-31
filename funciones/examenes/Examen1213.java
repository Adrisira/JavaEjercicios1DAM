package examenes;

import java.util.Scanner;

public class Examen1213 {

	public static void main(String[] args) {
		int opcion = 0;
		final int MAXCIUDADES = 30;
		int[][] consumoCombustible = new int[MAXCIUDADES][MAXCIUDADES];
		String[] ciudades = new String[MAXCIUDADES];
		int numCiudades = 0;
		rellenaCiudades(consumoCombustible, -1);
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Introducir dato. \r\n" + "2- Listar todos los datos. \r\n"
				+ "3- Listado de ciudades de origen y media de combustible. \r\n"
				+ "4- Listado de ciudades que son origen de vuelo y tambien destino. \r\n"
				+ "5- Listado de las ciudades que son destino de mas de N vuelos. \r\n" + "6- Fin. \r\n");
		opcion = sc.nextInt();
		while (opcion != 6) {
			switch (opcion) {
			case 1:
				System.out.println("Dime el nombre de la ciudad de origen:");
				String nombreCiudadOrigen = sc.next();
				int filaOrigen = getIndexOf(ciudades, numCiudades, nombreCiudadOrigen);
				if (filaOrigen == -1) {
					ciudades[numCiudades] = nombreCiudadOrigen;
					filaOrigen = numCiudades;
					numCiudades++;
				}
				System.out.println("Dime el nombre de la ciudad de destino:");
				String nombreCiudadDestino = sc.next();
				int columnaDestino = getIndexOf(ciudades, numCiudades, nombreCiudadDestino);
				if (columnaDestino == -1) {
					ciudades[numCiudades] = nombreCiudadDestino;
					columnaDestino = numCiudades;
					numCiudades++;
				}
				System.out.println("Introduce el combustible consumido:");
				consumoCombustible[filaOrigen][columnaDestino] = sc.nextInt();
				break;
			case 2:
				for (int i = 0; i < consumoCombustible.length; i++) {
					for (int j = 0; j < consumoCombustible[i].length; j++) {
						if (consumoCombustible[i][j] != -1) {
							System.out.println("El viaje de: " + ciudades[i] + " hacia: " + ciudades[j]
									+ " ha consumido: " + consumoCombustible[i][j] + " litros.");
						}
					}
				}
				break;
			case 3:
				for (int i = 0; i < consumoCombustible[i][0]; i++) {
					int consumoPorCiudadOrigen = 0;
					int contCiudades = 0;
					for (int j = 0; j < consumoCombustible[i][j]; j++) {
						consumoPorCiudadOrigen += consumoCombustible[i][j];
						contCiudades++;
					}
					System.out.println("En la ciudad de origen " + ciudades[i] + " el consumo medio ha sido " + (float) consumoPorCiudadOrigen/contCiudades);
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("Adios");
				break;
			}
			System.out.println("1- Introducir dato. \r\n" + "2- Listar todos los datos. \r\n"
					+ "3- Listado de ciudades de origen y media de combustible. \r\n"
					+ "4- Listado de ciudades que son origen de vuelo y tambien destino. \r\n"
					+ "5- Listado de las ciudades que son destino de mas de N vuelos. \r\n" + "6- Fin. \r\n");
			opcion = sc.nextInt();
		}
		sc.close();

	}

	private static int getIndexOf(String[] arrayStrings, int numElementos, String aBuscar) {
		int index = -1;
		for (int i = 0; i < numElementos && index == -1; i++) {
			if (arrayStrings[i].equals(aBuscar)) {
				index = i;
			}
		}
		return index;
	}

	private static void rellenaCiudades(int[][] notas, int elem) {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				notas[i][j] = elem;
			}
		}

	}

}
