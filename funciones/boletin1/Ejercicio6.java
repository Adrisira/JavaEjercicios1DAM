package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		char letra;
		boolean valLetra = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un letra: ");
		letra = sc.next().charAt(0);
		esVocal(letra, valLetra);
		sc.close();
	}

	public static void esVocal(char letra, boolean valLetra) {
		if (String.valueOf(letra).equals("a") || String.valueOf(letra).equals("e") || String.valueOf(letra).equals("i")
				|| String.valueOf(letra).equals("o") || String.valueOf(letra).equals("u")) {
			valLetra = true;
			System.out.println(valLetra);
		} else {
			System.out.println(valLetra);
		}
	}
}
