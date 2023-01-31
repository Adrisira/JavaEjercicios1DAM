package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		num1 = sc.nextInt();
		System.out.println("Dime otro numero: ");
		num2 = sc.nextInt();
		amigos (num1, num2);
		sc.close();
	}
	public static void amigos (int num1, int num2) {
		int sumaDivPrimero = 0;
		int sumaDivSegundo = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sumaDivPrimero = i + sumaDivPrimero;
			}
		}
		for (int x = 1; x < num2; x++) {
			if (num2 % x == 0) {
				sumaDivSegundo = x + sumaDivSegundo;
			}
		}
		if (num1 == sumaDivSegundo && num2 == sumaDivPrimero) {
			System.out.println("Son amigos");
		}
	}

}
