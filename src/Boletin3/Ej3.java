package Boletin3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		byte num1,num2, menor;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero: ");
		num1 = sc.nextByte();
		System.out.print("Inserta otro numero: ");
		num2 = sc.nextByte();
		if (num1 > num2) {
			menor = num2;
		} else {
			menor = num1;
		}
		System.out.println(menor);
		sc.close();
	}

}
