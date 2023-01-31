package Boletin3;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta el dia: ");
		dia = sc.nextInt();
		System.out.print("Inserta el mes: ");
		mes = sc.nextInt();
		System.out.print("Inserta el año: ");
		ano = sc.nextInt();
		dia = dia + 1; 
		if (dia > 30) {
			mes = mes + (dia/30);
			dia = dia % 30;
		}
		if (mes > 12) {
			ano = ano + (mes/12);
			mes = mes % 12;
		}
		System.out.println(dia + " " +  mes +  " " + ano);
		sc.close();
	}

}
