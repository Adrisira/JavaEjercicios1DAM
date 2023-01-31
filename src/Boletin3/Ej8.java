package Boletin3;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		int num1, pre1, pre2, pre3, pre4, pre5, puntos = 0;
		Scanner sc = new Scanner(System.in);
		num1 = 1;
		switch (num1) {
		case 1:
			System.out.println("¿Cual es el numero pi? \n 1. 3.14 \n 2. 3.15");
			pre1 = sc.nextInt();
			if (pre1 == 1) {
				puntos = puntos + 1;
				System.out.println("Correcto, tienes " + puntos + " puntos.");
			} 
		case 2:
			System.out.println("¿Cuanto metro hay en una milla? \n 1. 1608 \n 2. 1609");
			pre2 = sc.nextInt();
			if (pre2 == 2) {
				puntos = puntos + 1;
				System.out.println("Correcto, tienes " + puntos + " puntos.");
			}
		case 3:
			System.out.println("¿Como se hace un comentario multilinia? \n 1. /* */ \n 2. // \\");
			pre3 = sc.nextInt();
			if (pre3 == 1) {
				puntos = puntos + 1;
				System.out.println("Correcto, tienes " + puntos + " puntos.");
			}
		case 4:
			System.out.println("¿Cual es la expresion del operador logico Y? \n 1. AND \n 2. &&");
			pre4 = sc.nextInt();
			if (pre4 == 2) {
				puntos = puntos + 1;
				System.out.println("Correcto, tienes " + puntos + " puntos.");
			}
		case 5:
			System.out.println("¿Que es esto +=? \n 1. Suma y asigna \n 2. Suma o igual");
			pre5 = sc.nextInt();
			if (pre5 == 1) {
				puntos = puntos + 1;
				System.out.println("Correcto, tienes " + puntos + " puntos.");
			}			
			break;
		}
		sc.close();
	}
}
