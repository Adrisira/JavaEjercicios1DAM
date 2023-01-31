package boletin2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero: ");
		num1 = sc.nextInt();
		System.out.print("Inserta otro numero: ");
		num2 = sc.nextInt();
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println("Los dos numeros son pares");
		} else {
			if (num1 % 2 == 0 || num2 % 2 == 0) {
				System.out.println("Uno es par");
			} else {
				System.out.println("Los dos son impares");
			}
		}
		sc.close();
	}

}
