package tablas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Introducir por teclado un número n; a continuación solicitar al usuario que
		// teclee n números. Realizar la media de los números positivos, la media de los
		// negativos, y
		// contar el número de ceros introducidos.
		int negativos = 0;
		int positivos = 0;
		int ceros = 0;
		int sumPositivos = 0;
		int sumNegativos = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dime cuantos numero  la tabla: ");
			double numeros[] = new double[sc.nextInt()];
			System.out.println("Introduce los numeros: ");
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = sc.nextDouble();
				if (numeros[i] < 0) {
					negativos++;
					sumNegativos += numeros[i];
				}
				if (numeros[i] > 0) {
					positivos++;
					sumPositivos += numeros[i];
				}
				if (numeros[i] == 0) {
					ceros++;
				}
			}
			if (negativos != 0) {
				System.out.println(sumPositivos / (float)negativos);
			}
			if (positivos != 0) {
				System.out.println(sumNegativos / (float)positivos);
			}
		}
		System.out.println("Hay " + ceros + " ceros.");
	}

}
