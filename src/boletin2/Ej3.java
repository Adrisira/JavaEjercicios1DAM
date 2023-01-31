package boletin2;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero: ");
		num1 = sc.nextInt();
		if (num1 % 2 != 0) {
			System.out.println("El numero es impar.");
		} else {
			System.out.println("El numero es par");
		}
		sc.close();

	}

}
