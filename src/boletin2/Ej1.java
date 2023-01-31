package boletin2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero: ");
		num1 = sc.nextInt();
		if (num1 > 0) {
			System.out.println("El numero " + num1 + " es positivo.");
		} else {
			System.out.println("El numero " + num1 + " no es positivo.");
		}
		sc.close();

	}

}
