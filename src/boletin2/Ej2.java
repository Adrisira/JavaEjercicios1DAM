package boletin2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta el numero 12: ");
		num1 = sc.nextInt();
		if (num1 == 12) {
			System.out.println("Es 12, es correcto.");
		} else {
			System.out.println("El numero " + num1 + " no es 12");
		}
		sc.close();

	}

}
