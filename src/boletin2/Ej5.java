package boletin2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		long num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero largo: ");
		num1 = sc.nextInt();
		System.out.print("Inserta otro numero largo: ");
		num2 = sc.nextInt();
		System.out.print("Inserta otro numero largo: ");
		num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("El numero " + num1 + " es mayor.");
		} else {
			if (num2 > num3) {
				System.out.println("El numero " + num2 + " es mayor");
			} else {
				System.out.println("El numero " + num3 + " es mayor");
			}
		}
		sc.close();
	}

}
