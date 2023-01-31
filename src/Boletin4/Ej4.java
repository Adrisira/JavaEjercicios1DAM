package Boletin4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num1 = sc.nextInt();
		num2 = 1;
		while (num2 <= num1) {
			System.out.println(num2);
			if (num1 == num2) {
				break;
			}
			num2++;
		}
		sc.close();
	}
}
