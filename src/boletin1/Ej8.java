package boletin1;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		int dias, horas, minutos, segundos;
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserta las horas: ");
		horas = sc.nextInt();
		System.out.print("Inserta los minutos: ");
		minutos = sc.nextInt();
		System.out.print("Inserta los segundos: ");
		segundos = sc.nextInt();
		minutos = minutos + (segundos/60);
		segundos = segundos % 60;
		horas = horas + (minutos/60);
		minutos = minutos % 60;
		dias = horas / 24;
		horas = horas % 24;
		System.out.print(dias +" Dias "+ horas +" Horas "+ minutos + " Minutos " + segundos + " Segundos.");
		sc.close();

	}

}
