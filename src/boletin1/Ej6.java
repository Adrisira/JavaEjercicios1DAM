package boletin1;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		float num1, num2, num3, num4;
		int suma;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta un numero: ");
		num1 = sc.nextInt();
		System.out.print("Inserta otro numero: ");
		num2 = sc.nextInt();
		System.out.print("Inserta otro numero mas: ");
		num3 = sc.nextInt();
		System.out.print("Inserta un numero mas: ");
		num4 = sc.nextInt();
		suma = (int) (num1 + num2 + num3 + num4)/4; 
		System.out.print (suma);
		sc.close();
	}

}
