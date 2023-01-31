package Boletin4;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero: ");
		num1 = sc.nextInt();
		while (num1 != 0) {
			if (num1 % 2 == 0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero no es par");
			}
			if (num1 > 0) {
				System.out.println("El numero es positivo");
			} else {
				System.out.println("El numero no es positivo");
			}
			num1 = num1 * num1;
			System.out.println("El cuadrado es " + num1);
			System.out.print("Inserta el numero: ");
			num1 = sc.nextInt();
		}
		sc.close();
	}
}
