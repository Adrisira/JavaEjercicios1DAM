package ejerciciosResueltos;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		String codigoUnidad = "";
		String nombreAlumnoMayorMedia = "", nombreAlumnoMayorMediaGrupo = "", nombreDepartamentoMax = "",
				nombreDepartamento = "", nombreProfesor = "", nombreAlumno = "", nombreEspecialidad, nombreTitulo = "",
				nomCicloMenorDuracion = "", nomDeptMenorMediaPermanencia = "";
		int anyos, numAlumnos = 0;
		int numProfesores, numProfesoresMax = Integer.MIN_VALUE, numAsignaturas, horasDuracionCiclo;
		char tipoClase;
		float notaMediaAlumno, mayorNotaMediaAlumno = -1, mayorNotaMediaAlumnoGrupo = -1, sumaAnyosPermanenciaDepto = 0,
				mediaAnyosPermanencia, menorMediaAnyosPermanencia = Float.MAX_VALUE;
		String especialidadPenulti = "Ninguna", especialidadPCPIUlti = "Ninguna";
		int contClasesBachillerato = 0, contCiclosMasHoras = 0;
		int sumaAsignaturasBach = 0;
		// El dato de que los ciclos no duran m�s de 2500 horas es para que sepas el
		// valor al que debes inicializar esta variable.
		// Tambi�n podr�as poner Integer.MAX_VALUE;
		int duracionMin = 2501;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dime c�digo unidad");
			codigoUnidad = sc.next();
			while (!codigoUnidad.equals("fin")) {
				// una unidad en cada iteraci�n
				if (codigoUnidad.charAt(0) == 'D') {
					System.out.println("Dame nombre de depto");
					nombreDepartamento = sc.next();

					System.out.println("Dime n�mero de profesores");
					numProfesores = sc.nextInt();

					sumaAnyosPermanenciaDepto = 0;
					for (int i = 0; i < numProfesores; i++) {
						// un profesor en cada iteraci�n
						System.out.println("Dime nombre del profesor y a�os de permanencia");
						nombreProfesor = sc.next();
						anyos = sc.nextInt();
						sumaAnyosPermanenciaDepto += anyos;
					}
					// calculo media de a�os de permanencia en ese departamento
					mediaAnyosPermanencia = (float) sumaAnyosPermanenciaDepto / numProfesores;
					if (mediaAnyosPermanencia < menorMediaAnyosPermanencia) {
						menorMediaAnyosPermanencia = mediaAnyosPermanencia;
						nomDeptMenorMediaPermanencia = nombreDepartamento;
					}
					if (numProfesores > numProfesoresMax) {
						numProfesoresMax = numProfesores;
						nombreDepartamentoMax = nombreDepartamento;
					}

				} else if (codigoUnidad.charAt(0) == 'C') {
					System.out.println("Introduzca tipo de clase: E, P, B o F");
					tipoClase = sc.next().charAt(0);
					switch (tipoClase) {
					case 'E':// eso
						System.out.println("Introduzca nombre del primer alumno");
						nombreAlumno = sc.next();
						while (!nombreAlumno.equals("fin")) {
							numAlumnos++;
							System.out.println("Dame su nota media");
							notaMediaAlumno = sc.nextFloat();
							if (notaMediaAlumno > mayorNotaMediaAlumnoGrupo) {
								mayorNotaMediaAlumnoGrupo = notaMediaAlumno;
								nombreAlumnoMayorMediaGrupo = nombreAlumno;
							}
							System.out.println("Introduzca nombre del siguiente alumno");
							nombreAlumno = sc.next();
						}
						if (numAlumnos < 20 && mayorNotaMediaAlumno < mayorNotaMediaAlumnoGrupo) {
							mayorNotaMediaAlumno = mayorNotaMediaAlumnoGrupo;
							nombreAlumnoMayorMedia = nombreAlumnoMayorMediaGrupo;
						}
						mayorNotaMediaAlumnoGrupo = -1;
						nombreAlumnoMayorMediaGrupo = "";
						numAlumnos = 0;
						break;
					case 'P':
						System.out.println("Dime nombre de la especialidad");
						nombreEspecialidad = sc.next();

						especialidadPenulti = especialidadPCPIUlti;
						especialidadPCPIUlti = nombreEspecialidad;

						break;
					case 'B':
						contClasesBachillerato++;

						System.out.println("Dame n�mero de asignaturas");
						numAsignaturas = sc.nextInt();
						sumaAsignaturasBach += numAsignaturas;
						break;
					case 'F':
						// el nombre del t�tulo y las horas totales de duraci�n del ciclo
						System.out.println("Dime nombre del titulo y las horas totales de duraci�n del ciclo");
						nombreTitulo = sc.next();
						horasDuracionCiclo = sc.nextInt();
						if (horasDuracionCiclo > 1500) {
							contCiclosMasHoras++;
						}
						if (horasDuracionCiclo < duracionMin) {
							duracionMin = horasDuracionCiclo;
							nomCicloMenorDuracion = nombreTitulo;
						}
						break;

					}
				}

				System.out.println("Dime c�digo unidad");
				codigoUnidad = sc.next();
			}

			System.out.println("a) El depto con n�m de profesores m�ximo es: " + nombreDepartamentoMax);
			System.out.println(
					"b) El nombre del alumno con mayor nota media de entre los alumnos de los grupos con menos de 20 alumnos es: "
							+ nombreAlumnoMayorMedia);

			/*
			 * if (especialidadPenulti.equals("")) { System.out.
			 * println("c) No han llegado a introducirse dos especialidades de PCPI en total."
			 * ); } else {
			 */
			System.out.println("c) Las dos �ltimas especialidades introducidas son: " + especialidadPenulti + " y "
					+ especialidadPCPIUlti);
			// }

			// Como el enunciado dice que "Habr� al menos una clase de Bachillerato", no
			// tengo que tener miedo de
			// que se produzca una divisi�n entre 0 (que es indeterminado y producir�a una
			// excepci�n)
			System.out.println("d) La media de asignaturas de los grupos de bachillerato es: "
					+ (float) sumaAsignaturasBach / contClasesBachillerato);

			System.out.println("e) N�mero de ciclos de F.P. con m�s de 1.500 horas: " + contCiclosMasHoras);

			System.out.println("f) Nombre del ciclo de F.P. de menor duraci�n: " + nomCicloMenorDuracion);

			System.out.println(
					"g) Nombre del departamento con menor media de a�os de permanencia en el centro de sus profesores: "
							+ nomDeptMenorMediaPermanencia);

		}

	}

}
