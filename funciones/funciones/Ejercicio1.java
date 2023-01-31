package funciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String cadena1 = sc.next();
		System.out.println("Dime otra palabra");
		String cadena2 = sc.next();
		if (cadena1.length() > cadena2.length()) {
			System.out.println("La primera es mayor");
		} else {
			System.out.println("La segunda es mayor");
		}
		sc.close();
	}

}
