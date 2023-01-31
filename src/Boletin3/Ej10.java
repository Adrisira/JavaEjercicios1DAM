package Boletin3;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta el dia: ");
		dia = sc.nextInt();
		System.out.print("Inserta el mes: ");
		mes = sc.nextInt();
		System.out.print("Inserta el año: ");
		ano = sc.nextInt();
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (mes == 31) {
				System.out.println("La fecha " + dia + " " + mes + " " + ano + "es correcta");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (mes == 30) {
				System.out.println("La fecha " + dia + " " + mes + " " + ano + "es correcta");
			}
			break;
		case 2:
			if (mes == 28) {
				System.out.println("La fecha " + dia + " " + mes + " " + ano + "es correcta");
			}
			break;
		}
		System.out.println("No coincide el mes con el dia");
		sc.close();
	}

}
