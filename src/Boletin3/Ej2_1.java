package Boletin3;

import java.util.Scanner;

public class Ej2_1 {

	public static void main(String[] args) {
		int num1,par;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero: ");
		num1 = sc.nextInt();
		par = (num1 % 2 == 0)?1:0;
		System.out.println(par);
		sc.close();
	}

}
