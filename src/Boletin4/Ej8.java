package Boletin4;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		int num, num2, resultado;
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
			resultado = 1;
			for (num2 = 1; num2 <= num; num2++) {
				resultado = resultado * num2;
			}
			System.out.println(resultado);
		}
	}

}
