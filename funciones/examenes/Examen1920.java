package examenes;

import java.util.Scanner;

public class Examen1920 {

	public static void main(String[] args) {
		final int MAXEQUIPOS = 20;
		String[] nombresEquipos = new String[MAXEQUIPOS];
		// 0 equipo local
		// 1 equipo visitante
		int[][][] goles = new int[MAXEQUIPOS][MAXEQUIPOS][2];
		int contEquipos = 0;
		int opcion = 0;
		// relleno todo los elemenos de la tablla goles con -1
		rellenoGoles(goles, -1);
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Introducir equipo local, visitante y goles. \r\n"
				+ "2- Monstrar todos los partidos introducidos. \r\n" + "3- Monstrar el equipo ganador de la liga. \r\n"
				+ "4- Monstrar porcentaje de partidos en los que ha perdido el equipo local. \r\n"
				+ "5- Introducir nombre equipo y monstrar sus partidos. \r\n" + "6- Fin. \r\n");
		opcion = sc.nextInt();
		while (opcion != 6) {
			switch (opcion) {
			case 1:
				System.out.println("Nombre del equipo local: ");
				String nombreEquipoLocal = sc.next();
				int indiceEquipoLocal = getIndexOf(nombresEquipos, contEquipos, nombreEquipoLocal);
				if (indiceEquipoLocal == contEquipos) {
					indiceEquipoLocal = contEquipos++;
					nombresEquipos[indiceEquipoLocal] = nombreEquipoLocal;
				}

				System.out.println("Nombre del equipo visitante: ");
				String nombreEquipoVisitante = sc.next();
				int indiceEquipoVisitante = getIndexOf(nombresEquipos, contEquipos, nombreEquipoVisitante);
				if (indiceEquipoVisitante == contEquipos) {
					indiceEquipoVisitante = contEquipos++;
					nombresEquipos[indiceEquipoVisitante] = nombreEquipoVisitante;
				}

				System.out.println("Goles que ha marcado el equipo local: ");
				goles[indiceEquipoLocal][indiceEquipoVisitante][0] = sc.nextInt();
				System.out.println("Goles que ha marcado el equipo visitante: ");
				goles[indiceEquipoVisitante][indiceEquipoLocal][1] = sc.nextInt();
				break;
			case 2:
				for (int i = 0; i < goles.length; i++) {
					for (int j = 0; j < goles[i].length; j++) {
						System.out.println(nombresEquipos[i] + " - " + nombresEquipos[j] + " (" + goles[i][j][0] + "-"
								+ goles[i][j][1] + ")");
					}
				}
				break;
			case 3:
				int maxPuntos = Integer.MIN_VALUE;
				int indiceEquipoMax = -1;
				for (int i = 0; i < contEquipos; i++) {
					int puntos = 0;
					// si gana como local
					for (int j = 0; j < goles[i].length; j++) {
						if (goles[i][j][0] > -1) {
							if (goles[i][j][0] > goles[i][j][1]) {
								puntos += 3;
							} else if (goles[i][j][0] == goles[i][j][1]) {
								puntos += 1;
							}
						}
					}
					// si gana como visitante
					for (int j = 0; j < goles.length; j++) {
						if (goles[j][i][0] > -1) {
							if (goles[j][i][1] > goles[j][i][0]) {
								puntos += 3;
							} else if (goles[j][i][1] == goles[j][i][0]) {
								puntos += 1;
							}
						}
					}
					// que equipo tiene mas puntos
					if (puntos > maxPuntos) {
						maxPuntos = puntos;
						indiceEquipoMax = i;
					}
				}
				System.out.println("El equipo con mas puntos es: " + nombresEquipos[indiceEquipoMax] + " con "
						+ maxPuntos + " puntos.");
				break;
			case 4:
				int contPartidosPerdidosLocal = 0;
				int contTotalPartidosJugados = 0;
				for (int i = 0; i < goles.length; i++) {
					for (int j = 0; j > goles[i].length; j++) {
						if (goles[i][j][0] > -1) {
							contTotalPartidosJugados++;
							if (goles[i][j][0] < goles[i][j][1]) {
								contPartidosPerdidosLocal++;
							}
						}
					}
				}
				System.out.println("Porcentaje de partidos en los que ha perdido el equipo local es: "
						+ (float) 100 * contPartidosPerdidosLocal / contTotalPartidosJugados);

				break;
			case 5:
				System.out.println("Dime el nombre del equipo: ");
				String nombreEquipo = sc.next();
				int indiceEquipo = getIndexOf(nombresEquipos, contEquipos, nombreEquipo);
				boolean tienePartidos = false;
				// aqui se ha monstrado el nombre del equipo como local
				for (int i = 0; i < goles[indiceEquipo].length; i++) {
					if (goles[indiceEquipo][i][0] > -1) {
						if (!tienePartidos) {
							tienePartidos = true;
							System.out.println("Como local ha jugado con: ");
						}
						System.out.println(nombresEquipos[i]);
					}
				}
				tienePartidos = false;
				// aqui se ha monstrado el nombre del equipo como visitante 
				for (int j = 0; j < goles.length; j++) {
					if (goles[j][indiceEquipo][0] > -1) {
						if (!tienePartidos) {
							tienePartidos = true;
							System.out.println("Como visitante ha jugado con: ");
						}
						System.out.println(nombresEquipos[j]);
					}
				}
				break;
			case 6:
				System.out.println("Adios");
				break;
			}
		}
		sc.close(); 
	}

	public static void rellenoGoles(int[][][] goles, int valor) {
		for (int i = 0; i < goles.length; i++) {
			for (int j = 0; j < goles[i].length; j++) {
				for (int z = 0; z < goles[i][z].length; z++) {
					goles[i][j][z] = valor;
				}
			}
		}
	}

	// te devuelve el indice, super importante en examen
	private static int getIndexOf(String[] nombresEquipos, int numEquipos, String nombreEquipo) {
		int indiceEquipo = 0;
		while (indiceEquipo < numEquipos && !nombresEquipos[indiceEquipo].equals(nombreEquipo)) {
			indiceEquipo++;
		}
		return indiceEquipo;
	}

}
