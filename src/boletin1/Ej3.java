package boletin1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero: ");
		num1 = sc.nextInt();
		System.out.print("Inserta otro numero: ");
		num2 = sc.nextInt();
		float num3 = num1;
		float num4 = num2;
		float calcular = ((num3 + num4)/2);
		System.out.print (calcular);
		sc.close();
	}

}
