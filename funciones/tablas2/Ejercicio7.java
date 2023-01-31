package tablas2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int suma1 = 0;
		int suma2 = 0;
		int suma3 = 0;
		int i = 0;
		int alumno = 0;
		int sumNotaAlumno = 0;
		int[][] datos = new int[3][5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la nota media del alumno que quieras saber: ");
		alumno = sc.nextInt();
		for (i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Dime la nota de los cinco alumnos en el trimestre " + i);
				datos[i][j] = sc.nextInt();
				int numero = datos[i][j];
				if (i == 0) {
					suma1 += numero;
				} else if (i == 1) {
					suma2 += numero;
				} else {
					suma3 += numero;
				}
				if (j == alumno) {
					sumNotaAlumno += numero;
				}
			}

		}
		System.out.println("La media del primer trimestre es: " + suma1 / 5);
		System.out.println("La media del segundo trimestre es: " + suma2 / 5);
		System.out.println("La media del tercer trimestre es: " + suma3 / 5);
		System.out.println("La media del alumno " + alumno + " es: " + sumNotaAlumno / 3);
		sc.close();
	}

}
