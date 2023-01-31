package funciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intorduce la contraseña:");
		String contrasena = sc.next();
		System.out.println("Intenta acertar la contraseña:");
		String intentoContrasena = sc.next();
		while(!contrasena.equals(intentoContrasena)) {
			System.out.println("Fallaste");
			System.out.println("Pista: La contraseña tiene una longitud de " + contrasena.length() + " caracteres.");
			System.out.println("Pista: La primera letra de la contraseña es: " + contrasena.charAt(0));
			System.out.println("Pista: La ultima letra de la contraseña es: " + contrasena.charAt(contrasena.length()-1));
			if (contrasena.compareTo(intentoContrasena) < 0) {
				System.out.println("Es menor.");
			} else {
				System.out.println("Es mayor.");
			}
			System.out.println("Intenta acertar la contraseña:");
			intentoContrasena = sc.next();
		}
		System.out.println("Acertaste");
		sc.close();

	}

}
