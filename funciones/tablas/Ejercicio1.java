package tablas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Diseñar un programa que solicite al usuario 5 números decimales. A
		// continuación, debe mostrar los números en el mismo orden en que se han
		// introducido.
		int i;
		float numeros[] = new float[5];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dime cinco numeros decimales: ");
			for (i = 0; i < numeros.length; i++) {
				// Recuerda introducrilo con comas
				numeros[i] = sc.nextFloat();	
			}
		}
		for (i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}
}
