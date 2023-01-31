package Boletin3;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		double a, b, c, s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el numero para a: ");
		a = sc.nextDouble();
		System.out.print("Dime el numero para b: ");
		b = sc.nextDouble();
		System.out.print("Dime el numero para c: ");
		c = sc.nextDouble();
		if (Math.pow(b, 2) - (4*a*c) >=0) {
			s1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
			s2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
			System.out.println("Solucion 1: " + s1);
			System.out.println("Solucion 2: " + s2);
		} else {
			System.out.println("No tiene solucion");
		}
		sc.close();
	}

}
