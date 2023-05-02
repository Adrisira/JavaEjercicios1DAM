package boletin1;

import java.util.Scanner;

public class EEj2 {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Inserta un numero: ");
			num = sc.nextInt();
			System.out.println(num);

		} catch (Throwable e) {
			System.out.println(e);
		}
		sc.close();
	}

}
