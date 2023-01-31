package examenes;

import java.util.Arrays;
import java.util.Scanner;

public class Examen1819 {

	public static void main(String[] args) {
		int opcion = 0;
		final int MAXPARTIDOS = 20;
		final int MAXLOCALIDADES = 30;
		int[][] votos = new int[MAXPARTIDOS][MAXLOCALIDADES];
		String[] partidos = new String[MAXPARTIDOS];
		String[] localidades = new String[MAXLOCALIDADES];
		int contPartidos = 0;
		int contLocalidades = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Introducir votos obtenidos en una ciudad por un partido. \r\n"
				+ "2- Listado alfabetico por partidos de todos los datos introducidos. \r\n"
				+ "3- Listado de mejores resultados de cada partido. \r\n"
				+ "4- Listado de localidades de menor a mayor participacion. \r\n"
				+ "5- Porcentajes de votos obtenidos por cada partido de la comunidad. \r\n" + "6- Fin. \r\n");
		opcion = sc.nextInt();
		while (opcion != 6) {
			switch (opcion) {
			case 1:
				int buscadorIndicesLocalidades = Integer.MIN_VALUE;
				int indiceLocalidad = 0;
				int buscadorIndicesPartidos = Integer.MIN_VALUE;
				int indicePartido = 0;
				// Insertar localidades
				System.out.println("Dime el nombre de la localidad: ");
				String localidad = sc.next();
				for (int i = 0; i < contLocalidades && buscadorIndicesLocalidades == Integer.MIN_VALUE; i++) {
					if (localidades[i].equals(localidad)) {
						buscadorIndicesLocalidades = i;
					}
				}
				indiceLocalidad = buscadorIndicesLocalidades;
				if (indiceLocalidad < 0) {
					indiceLocalidad = contLocalidades;
					localidades[contLocalidades] = localidad;
					contLocalidades++;
				}
				// Insertar partidos
				System.out.println("Dime el nombre del partido: ");
				String partido = sc.next();
				for (int i = 0; i < contPartidos && buscadorIndicesPartidos == Integer.MIN_VALUE; i++) {
					if (partidos[i].equals(partido)) {
						buscadorIndicesPartidos = i;
					}
				}
				indicePartido = buscadorIndicesPartidos;
				if (indicePartido < 0) {
					indicePartido = contPartidos;
					partidos[contPartidos] = partido;
					contPartidos++;
				}
				// Insertar votos
				System.out.println("Dime los votos obtenidos: ");
				votos[indicePartido][indiceLocalidad] = sc.nextInt();
				System.out.println("Datos almacenados");
				break;
			case 2:
				// Sin resolver(copiado porque soy un inutil)
				String[] copiaOrdenadaPartidos = getMatrizSorted(partidos, contPartidos);
				for (int i = 0; i < contPartidos; i++) {
					int indice = getIndexOf(partidos, contPartidos, copiaOrdenadaPartidos[i]);
					
					
					boolean hayDatos=false;
					for (int j1 = 0; j1 < contLocalidades && !hayDatos; j1++) {
						if (votos[indice][j1] != 0) {
							hayDatos=true;
							System.out.println("Partido: " + partidos[indice]);
							String[] copiaOrdenadaLocalidades = getMatrizSorted(localidades, contLocalidades);
							for (int j = 0; j < contLocalidades; j++) {
								int indiceLoc = getIndexOf(localidades, contLocalidades, copiaOrdenadaLocalidades[j]);
								if (votos[indice][indiceLoc] != 0) {
									System.out.println("\t" + localidades[indiceLoc] + ": " + votos[indice][indiceLoc] + " votos");
								}
							}
						}
					}
					
				}
				
				break;
			case 3:
				for (int i = 0; i < contPartidos; i++) {
					String localidadMaxVotos = null;
					int maxVotos = Integer.MIN_VALUE;
					for (int j = 0; j < contLocalidades; j++) {
						if (votos[i][j] > maxVotos) {
							maxVotos = votos[i][j];
							localidadMaxVotos = localidades[j];
						}
					}
					System.out
							.println("El partido: " + partidos[i] + " ha obtenido mas votos en: " + localidadMaxVotos);
				}
				break;
			case 4:
				int[] sumVotosLocalidades = new int[contLocalidades];
				int[] sumVotosLocalidadesOrdenadas = new int[contLocalidades];
				String[] localidadesOrdenadasVotos = new String[contLocalidades];
				for (int i = 0; i < contLocalidades; i++) {
					for (int j = 0; j < contLocalidades; j++) {
						sumVotosLocalidades[i] += votos[i][j];
					}
					int posicion = Arrays.binarySearch(Arrays.copyOf(sumVotosLocalidadesOrdenadas, i),
							sumVotosLocalidades[i]);
					int indiceInsercion = -posicion - 1;
					if (posicion > 0) {
						indiceInsercion = posicion;
					}
					for (int x = i; x > indiceInsercion; x--) {
						sumVotosLocalidadesOrdenadas[x] = sumVotosLocalidadesOrdenadas[x - 1];
					}
					sumVotosLocalidadesOrdenadas[indiceInsercion] = sumVotosLocalidades[i];
					for (int z = i; z > indiceInsercion; z--) {
						localidadesOrdenadasVotos[z] = localidadesOrdenadasVotos[z - 1];
					}
					localidadesOrdenadasVotos[indiceInsercion] = localidades[i];
				}
				for (int y = 0; y < contLocalidades; y++) {
					System.out.println("En la ciudad de " + localidadesOrdenadasVotos[y]
							+ " el numero de votos ha sido de: " + sumVotosLocalidadesOrdenadas[y]);
				}
				break;
			case 5:
				int sumTotalVotos = 0;
				for (int i = 0; i < contPartidos; i++) {
					for (int j = 0; j < contLocalidades; j++) {
						sumTotalVotos += votos[i][j];
					}
				}
				for (int z = 0; z < contPartidos; z++) {
					System.out.println("Partido: " + partidos[z] + ". Porcentaje de votos: " + (float) 100 * sumaFila(votos, z, contLocalidades)/sumTotalVotos);
				}
				break;
			case 6:
				System.out.println("Adios");
				break;
			}
			System.out.println("1- Introducir votos obtenidos en una ciudad por un partido. \r\n"
					+ "2- Listado alfabetico por partidos de todos los datos introducidos. \r\n"
					+ "3- Listado de mejores resultados de cada partido. \r\n"
					+ "4- Listado de localidades de menor a mayor participacion. \r\n"
					+ "5- Porcentajes de votos obtenidos por cada partido de la comunidad. \r\n" + "6- Fin. \r\n");
			opcion = sc.nextInt();
		}
		sc.close();
	}
	private static int sumaFila(int[][] votos, int fila, int numLocalidades) {
		int suma = 0;
		for (int j = 0; j < numLocalidades; j++) {
			suma += votos[fila][j];
		}
		return suma;
	}
	private static String[] getMatrizSorted(String[] matriz, int numElementos) {
		String[] matrizOrdenada = Arrays.copyOf(matriz, numElementos);
		Arrays.sort(matrizOrdenada);
		return matrizOrdenada;
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
