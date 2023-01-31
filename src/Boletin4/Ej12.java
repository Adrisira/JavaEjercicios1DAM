package Boletin4;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		num1 = 0;
		for (num2 = 1; num2 <= 5; num2++) {
			System.out.println("Introduce la nota del alumno " + num2);
			num3 = scan.nextInt();
			if (num3 < 5) {
				num1++;
			}
			scan.close();
		}
		
		System.out.println("Hay " + num1 + " supensos.");
	}

}
