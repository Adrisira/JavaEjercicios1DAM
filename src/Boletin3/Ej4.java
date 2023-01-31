package Boletin3;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		float num1;
		int num2;
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el valor del radio");
		num1 = sc.nextInt();
		System.out.print("Elige una de estas tres opciones:\n 1.Calcular diametro \n 2.Calcular perimetro \n 3.Calcular area");
		num2 = sc.nextInt();
		switch (num2) {
		case 1:
			System.out.print("El diametro es " + (2 * num1));
			break;
		case 2:
			System.out.print("El perimetro es " + (2 * PI * num1));
			break;
		case 3:
			System.out.print("El area es " + (PI * (num1 * num1)));
			break;
		}
		sc.close();
	}

}
