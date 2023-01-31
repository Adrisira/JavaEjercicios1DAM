package boletin1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		int num1 = 0;
		boolean esPrimo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		num1 = sc.nextInt();
		numPrimo(num1, esPrimo);
		sc.close();
	}

	public static void numPrimo(int num1, boolean esPrimo) {
		// El 0, 1 y 4 no son primos
		if (num1 == 4) {
			esPrimo = false;
		}
		for (int x = 2; x < num1 / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (num1 % x == 0)
				esPrimo = false;
		}
		if (esPrimo == true) {
			System.out.println("Es primo");
		} else if (esPrimo == false) {
			System.out.println("No es primo");
		}
	}
}
