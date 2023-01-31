package tablas2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		int[] puntuaciones = { 4, 3, 2, 8, 6, 0, 0, 0 };
		Arrays.sort(puntuaciones, 0, 5);
		System.out.println(Arrays.toString(puntuaciones));
		int numElem = 5;
		// nuevas puntuaciones
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique puntuaci�n de jugador de exhibici�n");
		int puntuacion = sc.nextInt();
		int i = 1;
		while (i < 3 && puntuacion != -1) {
			i++;
			int pos = Arrays.binarySearch(puntuaciones, 0, numElem, puntuacion);
			if (pos < 0) {// no hemos encontrado el elemento
				pos = -pos - 1;
			}
			// pos guarda en cualquier caso, el �ndice donde debo insertar el elemento
			for (int j = numElem; j > pos; j--) {
				puntuaciones[j] = puntuaciones[j - 1];
			}
			puntuaciones[pos] = puntuacion;
			numElem++;
			System.out.println("Indique puntuaci�n de jugador de exhibici�n");
			puntuacion = sc.nextInt();
		}
		System.out.println(Arrays.toString(puntuaciones));
		sc.close();
	}

}
