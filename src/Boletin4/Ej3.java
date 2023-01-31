package Boletin4;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*100+1);
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		System.out.println("Pulsa -1 para salir, si deseas salir");
		num2 = sc.nextInt();
		while (num1 != num2) {
			if (num2 == -1) {
				System.out.println("Fin del programa");
				break;
			}
			if (num1 > num2) {
				System.out.println("El numero es mayor");
			} else {
				System.out.println("El numero es menor");
			}
			System.out.println("Introduce un numero: ");
			num2 = sc.nextInt();
			System.out.println("Numero correcto");
		}
		sc.close();
	}

}
