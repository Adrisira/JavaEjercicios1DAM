package Boletin5;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Una empresa fabrica motores de automóviles. Se pretende contabilizar las
		// unidades
		// fabricadas cada mes. Para ello, disponemos del número de motores que se ha
		// fabricado
		// cada día. Realizar un programa en Java que:
		// - Pida el número del mes que se va a introducir (sólo se van a introducir
		// datos de un
		// mes).
		// - Para cada día de ese mes debe pedir el número de piezas que se ha
		// fabricado.
		// Sabemos que en un día nunca se van a fabricar más de 1000 piezas. No todos
		// los
		// meses tienen igual número de días; consideramos febrero con 28 días.
		// - Debe mostrarse al final: Qué día se fabricaron más piezas. Cuál fue el
		// mínimo de
		// piezas fabricadas. Cuántos motores se han fabricado en el mes. Si algún día
		// se ha
		// fabricado menos de 300 piezas, debe indicarse al final con el mensaje:
		// “Existen días
		// por debajo del mínimo”.
		int mes;
		int numdia = 0;
		int piezas;
		int contPiezas = 0;
		int diaMaxPro = 0;
		int piezaMaxima = Integer.MIN_VALUE;
		int piezaMinima = Integer.MAX_VALUE;
		boolean diaMenos = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero del mes:");
		mes = sc.nextInt();
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numdia = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numdia = 30;

			break;
		case 2:
			numdia = 28;

			break;
		}
		for (int i = 1; i <= numdia; i++) {
			System.out.println("Dime el numero de piezas que se han fabricado en el dia " + i);
			piezas = sc.nextInt();
			if (piezas > 1000) {
				System.out.println("No se puede fabricar mas de 1000 piezas en un dia, vuelve a introducirlas");
				i--;
			}
			if (piezas > piezaMaxima) {
				diaMaxPro = i;
				piezaMaxima = piezas;
			}
			if (piezas < piezaMinima) {
				piezaMinima = piezas;
			}
			if (piezas < 300) {
				diaMenos = true;
			}
			contPiezas = piezas + contPiezas;
		}
		System.out.println("Se han producido " + contPiezas + " motores.");
		System.out.println("El minimo de piezas fabricados es " + piezaMinima);
		System.out.println("El dia que mas se ha producido es " + diaMaxPro);
		if (diaMenos == true) {
			System.out.println("Existen dias por debajo del minimo");
		}
		sc.close();
	}
}
