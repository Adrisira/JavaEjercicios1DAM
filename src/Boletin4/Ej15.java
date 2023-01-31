package Boletin4;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		//Adrian Sigüenza Ramirez 
		int num1, num2, contador, contadorprimos;
		boolean primo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un numero: ");
		num1 = sc.nextInt();
		sc.close();
		contadorprimos = 1;
		for (contador = 2; contador <= num1; contador++) {
			primo = true;
			num2 = 2;
			while (num2 <= contador - 1 && primo == true) {
				if (contador % num2 == 0) {
					primo = false;
				}
				num2++;
			}
			if (primo == true) {
				contadorprimos++;
			}
		}
		System.out.println("El numero " + num1 + " tiene " + contadorprimos + " primos.");
	}

}
