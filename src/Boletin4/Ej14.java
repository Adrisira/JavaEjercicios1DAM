package Boletin4;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		int ancho, alto, lado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el alto:");
		alto = sc.nextInt();
		for (ancho = alto; ancho >= 0; ancho--) {
			for (lado = 1; lado <= ancho; lado++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
