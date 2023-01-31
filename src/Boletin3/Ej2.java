package Boletin3;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int num1,par;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero: ");
		num1 = sc.nextInt();
		if (num1 % 2 == 0) {
			par = 1;
			System.out.println(par);
		} else {
			par = 0;
			System.out.println(par);
		}
		sc.close();
	}

}
