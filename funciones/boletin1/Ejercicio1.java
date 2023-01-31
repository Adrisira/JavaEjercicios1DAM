package boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int nVeces = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero de veces que quieres que se imprima Eco ");
		nVeces = sc.nextInt();
		sc.close();
		eco(nVeces);
	}
	 public static void eco(int nVeces) {
		 for (int i = 1; i <= nVeces; i++)
		System.out.println("Eco");
	}

}
