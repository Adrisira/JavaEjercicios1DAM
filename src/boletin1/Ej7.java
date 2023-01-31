package boletin1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		int base, altura;
		float area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta la base: ");
		base = sc.nextInt();
		System.out.print("Inserta la altura: ");
		altura = sc.nextInt();
		area = (float)(base * altura)/2;
		System.out.print(area);
		sc.close();

	}

}
