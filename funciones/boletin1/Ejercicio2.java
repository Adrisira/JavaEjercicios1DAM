package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		int num1 = sc.nextInt();
		System.out.println("Dime otro numero: ");
		int num2 = sc.nextInt();
		numeros(num1, num2);
		sc.close();
	}

	public static void numeros(int num1, int num2) {
		if (num1 < num2) {
			for (int i = num1 + 1; i < num2; i++) {
				System.out.println("Los numeros entre " + num1 + " y " + num2 + " son: " + i);
			}
		} else {
			for (int i = num2 + 1; i < num1; i++) {
				System.out.println("Los numeros entre " + num2 + " y " + num1 + " son: " + i);
			}
		}
	}

}
