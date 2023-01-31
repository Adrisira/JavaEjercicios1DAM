package tablas2;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		int sumaFilaOColumna = 0;
		int sumaPatron = 0;
		final int TAM = 4;
		int[][] matriz = new int[TAM][TAM];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		boolean esMagica = true;
		// obtenemos la suma para comparar con el resto
		for (int i = 0; i < matriz.length; i++) {
			sumaPatron += matriz[0][i];
		}
		for (int i = 0; i < matriz.length && esMagica; i++) {
			sumaFilaOColumna = 0;
			for (int j = 0; j < matriz.length; j++) {
				sumaFilaOColumna += matriz[i][j];
			}
			if (sumaFilaOColumna != sumaPatron) {
				esMagica = false;
			}
		}

		// y lo mismo para las columnas
		for (int j = 0; j < matriz.length && esMagica; j++) {
			sumaFilaOColumna = 0;
			for (int i = 0; i < matriz.length; i++) {
				sumaFilaOColumna += matriz[i][j];
			}
			if (sumaFilaOColumna != sumaPatron) {
				esMagica = false;
			}
		}
		if (esMagica) {
			System.out.println("Es m�gica");
		} else {
			System.out.println("No es m�gica");
		}

		sc.close();

	}

}
