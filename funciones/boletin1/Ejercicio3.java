package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int base = 0;
		int altura = 0;
		int tipoFuncion = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime que es lo que quieres hacer(1 = calcula el area total, 2 = calcula el volumen): ");
		tipoFuncion = sc.nextInt();
		System.out.println("Dime el radio de la base:");
		base = sc.nextInt();
		System.out.println("Dime la altura: ");
		altura = sc.nextInt();
		if (tipoFuncion == 1) {
			alturaTotal(base, altura);
		} else if (tipoFuncion == 2) {
			volumen(base, altura);
		} else {
			System.out.println("Introduce un valor valido.");
		}
		sc.close();
	}
	public static void alturaTotal(int base, int altura) {
		float resultado = (float) (2 * Math.PI * base * (base * altura));
		System.out.println("El resultado es:" + resultado);
	}
	public static void volumen(int base, int altura) {
		float resultado = (float) (Math.PI * Math.pow(base, 2) * altura);
		System.out.println("El resultado es: "+ resultado);
	}
}
