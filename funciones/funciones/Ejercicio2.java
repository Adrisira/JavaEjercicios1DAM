package funciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intorduce la contraseña:");
		String contraseña = sc.next();
		System.out.println("Intenta acertar la contraseña:");
		String intentoContraseña = sc.next();
		while(!contraseña.equals(intentoContraseña)) {
			System.out.println("Fallaste");
			System.out.println("Pista: La contraseña tiene una longitud de " + contraseña.length() + " caracteres.");
			System.out.println("Pista: La primera letra de la contraseña es: " + contraseña.charAt(0));
			System.out.println("Pista: La ultima letra de la contraseña es: " + contraseña.charAt(contraseña.length()-1));
			System.out.println("Intenta acertar la contraseña:");
			intentoContraseña = sc.next();
		}
		System.out.println("Acertaste");
		sc.close();
	}

}
