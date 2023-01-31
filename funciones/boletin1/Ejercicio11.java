package boletin1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		double base = 0;
		int exponente = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la base: ");
		base = sc.nextDouble();
		System.out.println("Dime el exponente: ");
		exponente = sc.nextInt();
		calcPotencia(base, exponente);
		sc.close();
	}
	public static void calcPotencia (double base, int exponente) {
		if (exponente > 0) {
			// Es trampa
			double res = Math.pow(base, exponente);
			System.out.println("El resultado de " + (int)base + " elevado a " + exponente + " es: " + (int)res);
		}
	}
}
