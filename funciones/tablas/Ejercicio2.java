package tablas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Escribir una aplicación que solicite al usuario cuántos números desea introducir. A
		// continuación, se introducirá por teclado esa cantidad de números enteros, y por último, los
		// mostrará en el orden inverso al introducido.
		int i;
		int numerosAIntroducir = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dime cuantos numero deseas que haya en la tabla: ");
			numerosAIntroducir = sc.nextInt();
			int numeros[] = new int[numerosAIntroducir];
			System.out.println("Introduce los numeros: ");
			for (i = 0; i < numeros.length; i++) {
				numeros[i] = sc.nextInt();	
			}
			for (i = numeros.length - 1; i >= 0; i--) {
				System.out.println(numeros[i]);
			}
		}
	}

}
