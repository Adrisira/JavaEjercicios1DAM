package boletin1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int gradosC, gradosF;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime la temperatura en grados Centigrados: ");
		gradosC = sc.nextInt();
		gradosF = 9*gradosC/5 + 32;
		System.out.print (gradosF);
		sc.close();

	}

}
