package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		num1 = sc.nextInt();
		System.out.println("Dime otro numero: ");
		num2 = sc.nextInt();
		System.out.println("Dime otro numero mas: ");
		num3 = sc.nextInt();
		numeroMayor(num1, num2, num3);
		sc.close();

	}

	public static void numeroMayor(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("En numero " + num1 + " es mayor.");
		} else if (num2 > num3){
			System.out.println("El numero " + num2 + " es mayor.");
		} else {
			System.out.println("El numero " + num3 + " es mayor.");
		}
	}
}
