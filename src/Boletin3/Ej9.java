package Boletin3;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero entre 0 y 9999: ");
		num1 = sc.nextInt();
		if (num1 < 10) {
			System.out.println("El numero tiene una cifra");
		} else {
			if (num1 < 100) {
				System.out.println("El numero tiene dos cifra");
			} else {
				if (num1 < 1000) {
					System.out.println("El numero tiene tres cifra");
				} else {
					if (num1 < 10000) {
						System.out.println("El numero tiene cuatro cifra");
					}
				}

			}
		}
		sc.close();
	}

}
