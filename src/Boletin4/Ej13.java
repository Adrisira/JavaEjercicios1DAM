package Boletin4;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		Scanner sc = new Scanner(System.in);
		num1 = 0;
		num4 = 0;
		num5 = 0;
		for (num2 = 1; num2 <= 6; num2++) {
			System.out.println("Introduce la nota del alumno " + num2);
			num3 = sc.nextInt();
			if (num3 == 4) {
				num1++;
			} else if (num3 <= 3){
				num4++;
			} else {
				num5++;
			}
			sc.close();
		}
		System.out.println("Hay " + num1 + " condicionados.");
		System.out.println("Hay " + num4 + " suspensos.");
		System.out.println("Hay " + num5 + " aprobados");
	}

}
