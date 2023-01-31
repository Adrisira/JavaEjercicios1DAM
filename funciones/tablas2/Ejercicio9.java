package tablas2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int[] apuesta = new int[6];
		int[] premio = new int[6];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu apuesta");
		for (i = 0; i < apuesta.length; i++) {
			apuesta[i] = sc.nextInt();
		}
		System.out.println("Dime los numeros ganadores");
		for (i = 0; i < premio.length; i++) {
			premio[i] = sc.nextInt();
		}
		System.out.println(numeroNumerosPremiados(apuesta, premio));
		sc.close();
		
	}
	public static int numeroNumerosPremiados(int [] j, int [] z) {
		int contadorPremiados = 0;
		for (int apuesta: j) {
			for (int premio: z) {
				if (apuesta == premio) {
					contadorPremiados++ ;
				}
			}
		}
		return contadorPremiados;
	}
}
 