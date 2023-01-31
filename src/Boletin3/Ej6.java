package Boletin3;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		int horas,sueldo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el numero de horas que has trabajado(minimo 40): ");
		horas = sc.nextInt();
		
		if (horas <= 40) {
			sueldo = horas * 12;
		} else {
			sueldo = (40 * 12) + ((horas - 40) * 16);
		}
		System.out.println("Tu sueldo es: " + sueldo);
		sc.close();
	}

}
