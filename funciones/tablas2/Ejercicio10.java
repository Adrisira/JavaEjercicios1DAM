package tablas2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int[] pares = new int[6];
		System.out.println(funcionPares(pares));
	}

	public static int funcionPares(int[] numeros) {
		boolean esPrimo = true;
		int contadorImpares = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los numeros");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 != 0) {
				i--;
				contadorImpares++;
			}
		}
		return contadorImpares;
	}

}
