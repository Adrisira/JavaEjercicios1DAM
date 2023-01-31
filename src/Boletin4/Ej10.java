package Boletin4;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un numero: ");
		num1 = sc.nextInt();
		while (num1 > 0 && num1 > 10) {
			System.out.print("Dime un numero: ");
			num1 = sc.nextInt();
		}
		if (num1 > 0 && num1 < 10) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num1 * i);
			}
		}
		sc.close();
	}

}
