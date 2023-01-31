package boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int num1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		num1 = sc.nextInt();
		System.out.println(numPrimo(num1));
		sc.close();
	}

	public static int numPrimo(int num1) {
		int contadorDivPrimos = 0;
		for (int i = 1; i <= num1; i++) {
			boolean esPrimo = true;
			if (num1 % i == 0) {
				// El 0, 1 y 4 no son primos
				if ( i == 4) {
					esPrimo = false;
				}
				for (int x = 2; x < i / 2; x++) {
					// Si es divisible por cualquiera de estos números, no
					// es primo
					if (i % x == 0) {
						esPrimo = false;
					}
				}
		if (esPrimo == true) {
			contadorDivPrimos++;
				}
			}
		}
		return contadorDivPrimos;
	}

}
