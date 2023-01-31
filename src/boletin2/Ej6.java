package boletin2;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		final double GRAVEDAD = 9.8; 
		float tiempo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta el tiempo: ");
		tiempo = sc.nextInt();
		if (tiempo > 0) {
			System.out.println("La velocidad es: " + GRAVEDAD * tiempo);
		} else {
			System.out.println("El tiempo no puede ser negativo o 0");
		}
		
		sc.close();
	}

}
