package Boletin4;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int max, min, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero maximo: ");
		max = sc.nextInt();
		System.out.println("Introduce un numero minimo: ");
		min = sc.nextInt();
		System.out.println("Introduce un numero entre los dos numeros: ");
		num = sc.nextInt();
		while (num > max || num < min) {
			System.out.println("Introduce un numero entre los dos numeros: ");
			num = sc.nextInt();
		}
		sc.close();
	}

}
