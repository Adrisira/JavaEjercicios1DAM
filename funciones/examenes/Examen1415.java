package examenes;

import java.util.Scanner;

public class Examen1415 {

	public static void main(String[] args) {
		final int MAXALUMNOS = 30;
		String[] nombreAlumnos = new String[MAXALUMNOS];
		float[][] notasAlumnos = new float[3][MAXALUMNOS];
		int opcion = 0;
		int contAlumnos = 0;
		String[] nombreAlumnosOrdenados;
		float[] alumnosNotaFinalOrdenado;
		float maxPositivos = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Introducir alumno, nota del control y nota del examen final del alumno. \r\n"
				+ "2- Poner un positivo a un alumno. \r\n"
				+ "3- Listar todos los alumnos con su nota final de evaluación ordenado por\r\n"
				+ "nota. \r\n"
				+ "4- Mostrar estadísticas de la evaluación. \r\n" + "5- Finalizar. \r\n"
				+ "");
		opcion = sc.nextInt();
		while (opcion != 5) {
			switch (opcion) {
			case 1:
				System.out.println("Dime el nombre del alumno:");
				nombreAlumnos[contAlumnos] = sc.next();
				System.out.println("Dime la nota del control:");
				// 0 es siempre para la nota del control
				notasAlumnos[0][contAlumnos] = sc.nextInt();
				System.out.println("Dime la nota del examen final del alumno:");
				// 1 es siempre para la nota final del alumno
				notasAlumnos[1][contAlumnos] = sc.nextInt();
				contAlumnos++;
				System.out.println("Datos almacenados");
				break;
			case 2:
				System.out.println("Dime el nombre del alumno:");
				String nombre = sc.next();
				for (int i = 0; i < contAlumnos; i++) {
					if (nombreAlumnos[i].equals(nombre)) {
						// 2 es siempre para los positivos
						notasAlumnos[2][i]++;
						System.out.println("Postivios sumado");
					}else {
						System.out.println("Nombre no reconocido.");
					}
				}
				break;
			case 3:
				nombreAlumnosOrdenados = new String[contAlumnos];
				alumnosNotaFinalOrdenado = new float[contAlumnos];
				//calculo el alumno con mas positivos
				for (int i = 0; i < contAlumnos; i++) {
					if(notasAlumnos[2][i] < maxPositivos) {
						maxPositivos = notasAlumnos[2][i];
					}
				}
				//calaculo la nota final de los alumnos y la ordeno
				for(int i = 0; i < contAlumnos; i++) {
					float notaFinalAlumno = 0.3f * notasAlumnos[0][i] + 0.6f * notasAlumnos[1][i] + 0.1f * notasAlumnos[2][i]/maxPositivos;
					int x = i - 1;
					while (x >= 0 && alumnosNotaFinalOrdenado[x]>notaFinalAlumno) {
						alumnosNotaFinalOrdenado[x+1]= alumnosNotaFinalOrdenado[x];
						nombreAlumnosOrdenados[x+1] = nombreAlumnosOrdenados[x];
						x--;
						}
					alumnosNotaFinalOrdenado[x+1] = notaFinalAlumno;
					nombreAlumnosOrdenados[x+1] = nombreAlumnos[i];
				}
				System.out.println("Listado de todos los alumnos ordenados por su nota: ");
				for(int i = 0; i < contAlumnos; i++) {
					System.out.println(nombreAlumnosOrdenados[i] + ": " + alumnosNotaFinalOrdenado[i]);
				}
				break;
			case 4:
				float sumTotalNotaFinal = 0;
				int contadorSuspensos = 0;
				for(int i = 0; i <contAlumnos; i++) {
					if(notasAlumnos[1][i]<5) {
						contadorSuspensos++;
					}
				}
				System.out.println("El % de los alumnos con el examen final suspenso es: " + 100 * contadorSuspensos/contAlumnos + "%.");
				for(int i = 0; i < contAlumnos; i++) {
					sumTotalNotaFinal +=  0.3f * notasAlumnos[0][i] + 0.6f * notasAlumnos[1][i] + 0.1f * notasAlumnos[2][i]/maxPositivos;
				}
				System.out.println("La media del grupo es: " + sumTotalNotaFinal /contAlumnos);
				float notaMaxControl = Integer.MIN_VALUE;
				String notaMaxAlumnoNombre = null;
				for (int i = 0; i < contAlumnos; i++) {
					if(notasAlumnos[0][i] > notaMaxControl) {
						notaMaxControl = notasAlumnos[0][i];
						notaMaxAlumnoNombre = nombreAlumnos[i];
					}
				}
				System.out.println("El alumno con la mayor nota media es " + notaMaxAlumnoNombre + " con una nota de " + notaMaxControl + ".");
				break;
			case 5:
				break;
			}
			System.out.println("1- Introducir alumno, nota del control y nota del examen final del alumno. \r\n"
					+ "2- Poner un positivo a un alumno. \r\n"
					+ "3- Listar todos los alumnos con su nota final de evaluación ordenado por\r\n"
					+ "nota. \r\n"
					+ "4- Mostrar estadísticas de la evaluación. \r\n" + "5- Finalizar. \r\n"
					+ "");
			opcion = sc.nextInt();
		}
		sc.close();
	}

}
