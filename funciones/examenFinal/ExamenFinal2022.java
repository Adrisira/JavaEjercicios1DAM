package examenFinal;

import java.util.Arrays;
import java.util.Scanner;

public class ExamenFinal2022 {

	public static void main(String[] args) {
		//Adrian Siguenza Ramirez
		int opcion = 0;
		final int MAXCIUDADES = 20;
		// El 0 siempre sera para origen y el 1 para visitante
		String[] ciudadesOrigen = new String[MAXCIUDADES];
		String[] ciudadesDestino = new String[MAXCIUDADES];
		int[][] numPasajeros = new int[MAXCIUDADES][MAXCIUDADES];
		int contCiudadesOrigen = 0;
		int contCiudadesDestino = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Introducir numero de viajeros que viajaron desde un origen a un destino. \r\n"
				+ "2- Listado por ciudades de todos los datos introducidos. \r\n"
				+ "3- Cuenta el numero de errores. \r\n" + "4- Media de viajeros por origen/destino. \r\n"
				+ "5- Listado de ciudades origen ordernadas por número de viajeros. \r\n"
				+ "6- Indica si existen viajes hacia el mismo destino con el mismo numero de viajeros. \r\n"
				+ "7- Fin.\r\n");
		opcion = sc.nextInt();
		while (opcion != 7) {
			switch (opcion) {
			case 1:
				int buscadorIndiceOrigen = Integer.MIN_VALUE;
				int indiceOrigen = 0;
				int buscadorIndiceDestino = Integer.MIN_VALUE;
				int indiceDestino = 0;
				// Se que esto se puede hacer con funciones para no tener que repetir codigo
				// Insertar Origen
				System.out.println("Dime el nombre del origen: ");
				String nombreOrigen = sc.next();
				for (int i = 0; i < contCiudadesOrigen && buscadorIndiceOrigen == Integer.MIN_VALUE; i++) {
					if (ciudadesOrigen[i].equals(nombreOrigen)) {
						buscadorIndiceOrigen = i;
					}
				}
				indiceOrigen = buscadorIndiceOrigen;
				if (indiceOrigen < 0) {
					indiceOrigen = contCiudadesOrigen;
					ciudadesOrigen[contCiudadesOrigen] = nombreOrigen;
					contCiudadesOrigen++;
				}
				// Insertar destino
				System.out.println("Dime el nombre del origen: ");
				String nombreDestino = sc.next();
				for (int j = 0; j < contCiudadesDestino && buscadorIndiceDestino == Integer.MIN_VALUE; j++) {
					if (ciudadesDestino[j].equals(nombreDestino)) {
						buscadorIndiceDestino = j;
					}
				}
				indiceDestino = buscadorIndiceDestino;
				if (indiceDestino < 0) {
					indiceDestino = contCiudadesDestino;
					ciudadesDestino[contCiudadesDestino] = nombreDestino;
					contCiudadesDestino++;
				}
				System.out.println("Dime el numero de viajeros: ");
				numPasajeros[indiceOrigen][indiceDestino] = sc.nextInt();
				break;
			case 2:
				// No lo hace bien, hay algo que se me escapa
				for (int i = 0; i < contCiudadesOrigen; i++) {
					int indiceOr = getIndexOf(ciudadesOrigen, contCiudadesOrigen, ciudadesOrigen[i]);

					boolean hayDatos = false;
					for (int j = 0; j < contCiudadesDestino && !hayDatos; j++) {
						if (numPasajeros[indiceOr][j] != 0) {
							hayDatos = true;
							System.out.println("Ciudad: " + ciudadesOrigen[indiceOr]);
							for (int z = 0; z < contCiudadesDestino; z++) {
								int indiceDes = getIndexOf(ciudadesDestino, contCiudadesDestino, ciudadesDestino[j]);
								if (numPasajeros[indiceOr][indiceDes] != 0) {
									System.out.println("\t" + ciudadesOrigen[indiceOr] + " -> "
											+ ciudadesDestino[indiceDes] + ": " + numPasajeros[indiceOr][indiceDes]);
								}
							}
						}
					}
				}
				break;
			case 3:
				int contErrores = 0;
				for (int i = 0; i < contCiudadesOrigen; i++) {
					for (int j = 0; j < contCiudadesDestino; j++) {
						if (ciudadesOrigen[i].equals(ciudadesDestino[i])) {
							contErrores++;
						}
					}
				}
				System.out.println("El numero de errores es: " + contErrores);
				break;
			case 4:
				//El reusltado esta mal, aunque creo que todo lo demas no
				int sumTotal = 0;
				for (int i = 0; i < MAXCIUDADES; i++) {
					for (int j = 0; j < numPasajeros[0].length; j++) {
						sumTotal += numPasajeros[i][j];
					}
				}
				System.out.println(
						"La media de pasajeros en cada origen destinos es: " + (float)sumTotal / contCiudadesOrigen+1);
				break;
			case 5:
				int[] sumPasajerosCiudadesOrigen = new int[contCiudadesOrigen];
				int[] sumPasajerosCiudadesOrigenOrdenadas = new int[contCiudadesOrigen];
				String[] ciudadesOrigenOrdenadas = new String[contCiudadesOrigen];
				for (int i = 0; i < contCiudadesOrigen; i++) {
					for (int j = 0; j < contCiudadesOrigen; j++) {
						sumPasajerosCiudadesOrigen[i] += numPasajeros[i][j];
					}
					int posicion = Arrays.binarySearch(Arrays.copyOf(sumPasajerosCiudadesOrigenOrdenadas, i),
							sumPasajerosCiudadesOrigen[i]);
					int indiceInsercion = -posicion - 1;
					if (posicion > 0) {
						indiceInsercion = posicion;
					}
					for (int x = i; x > indiceInsercion; x--) {
						sumPasajerosCiudadesOrigenOrdenadas[x] = sumPasajerosCiudadesOrigenOrdenadas[x - 1];
					}
					sumPasajerosCiudadesOrigenOrdenadas[indiceInsercion] = sumPasajerosCiudadesOrigen[i];
					for (int z = i; z > indiceInsercion; z--) {
						ciudadesOrigenOrdenadas[z] = ciudadesOrigenOrdenadas[z - 1];
					}
					ciudadesOrigenOrdenadas[indiceInsercion] = ciudadesOrigen[i];
				}
				for (int y = 0; y < contCiudadesOrigen; y++) {
					System.out.println("En la ciudad: " + ciudadesOrigenOrdenadas[y]
							+ " es origen de vuelos con un total de: " + sumPasajerosCiudadesOrigenOrdenadas[y]);
				}
				break;
			case 6:
				//No me dio tiempo y no sabia muy bien como enfocarlo
				break;
			case 7:
				System.out.println("Adios");
				break;

			}
			System.out.println("1- Introducir numero de viajeros que viajaron desde un origen a un destino. \r\n"
					+ "2- Listado por ciudades de todos los datos introducidos. \r\n"
					+ "3- Cuenta el numero de errores. \r\n" + "4- Media de viajeros por origen/destino. \r\n"
					+ "5- Listado de ciudades origen ordernadas por número de viajeros. \r\n"
					+ "6- Indica si existen viajes hacia el mismo destino con el mismo numero de viajeros. \r\n"
					+ "7- Fin.\r\n");
			opcion = sc.nextInt();
		}
		sc.close();

	}

	private static int getIndexOf(String[] matriz, int numElementos, String nombre) {
		int indiceBuscado = -1;
		for (int i = 0; i < numElementos && indiceBuscado == -1; i++) {
			if (matriz[i].equals(nombre)) {
				indiceBuscado = i;
			}
		}
		return indiceBuscado;
	}

}
