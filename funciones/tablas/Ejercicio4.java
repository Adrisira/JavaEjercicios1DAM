package tablas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Juego: La cámara secreta. El jugador especifica el número de dígitos de la
		// clave
		// secreta. La aplicación genera de forma aleatoria, una combinación secreta de
		// n dígitos del 1 al
		// 5 (siendo n la longitud indicada anteriormente por el usuario). El jugador
		// introduce ahora una
		// combinación de prueba. En cada intento se mostrará como pista, para cada
		// dígito, si es mayor
		// menor o igual que el correspondiente de la combinación secreta.
		int numDigitosClaveSecreta = 0;
		int pruebaIntentoClaveSecreta = 0;
		int contadorVerdaderos = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dime cuantos digitos tiene la clave secreta: ");
			numDigitosClaveSecreta = sc.nextInt();
			if (numDigitosClaveSecreta <= 5) {
				int claveSecreta[] = new int[numDigitosClaveSecreta];
				System.out.println("Introduce la clave secreta: ");
				for (int i = 0; i < claveSecreta.length; i++) {
					claveSecreta[i] = sc.nextInt();
				}
				while (contadorVerdaderos != numDigitosClaveSecreta) {
					contadorVerdaderos = 0;
					for (int i = 0; i < claveSecreta.length; i++) {
						System.out.println("Dime los digitos de la clave secreta:");
						pruebaIntentoClaveSecreta = sc.nextInt();
						if (pruebaIntentoClaveSecreta < claveSecreta[i]) {
							System.out.println(pruebaIntentoClaveSecreta + " Es menor");
						}
						if (pruebaIntentoClaveSecreta > claveSecreta[i]) {
							System.out.println(pruebaIntentoClaveSecreta + " Es mayor");
						}
						if (pruebaIntentoClaveSecreta == claveSecreta[i]) {
							System.out.println(pruebaIntentoClaveSecreta + " Es igual");
							contadorVerdaderos++;
						}
						
					}
				}
			}
		}
		System.out.println("Es correcto");
	}
}
