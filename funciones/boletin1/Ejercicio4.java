package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		num1 = sc.nextInt();
		System.out.println("Dime otro numero: ");
		num2 = sc.nextInt();
		System.out.println(numeroMayor(num1, num2));
		sc.close();
	}
	public static int numeroMayor(int num1, int num2) {
		int a;
		if (num1 > num2) {
			a = num1;
		} else {
			a = num2;
		}
		return a; 
	}
} 
