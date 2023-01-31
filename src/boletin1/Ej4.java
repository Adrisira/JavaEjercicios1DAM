package boletin1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int millas, metros;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la distancia en millas: ");
		millas = sc.nextInt();
		metros = millas * 1609;
		System.out.print (metros);
		sc.close();
	}

}
