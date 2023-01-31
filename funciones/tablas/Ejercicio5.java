package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Leer una serie de 6 enteros que se almacenarán en una tabla que hay que
		// ordenar y mostrar. Hacer lo mismo con otra serie de 6 enteros. A
		// continuación, fusionar las dos
		// tablas en una tercera, de forma que los 12 números sigan ordenados. Fusionar
		// significa copiar
		// en el orden correcto para que los datos resultantes continúen ordenados sin
		// necesidad de
		// volver a realizar una ordenación.
		int tablaUno[] = new int[6];
		int tablaDos[] = new int[6];
		int tablaTres[] = new int[12];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce los numeros de la tabla uno: ");
			for (int i = 0; i < tablaUno.length; i++) {
				tablaUno[i] = sc.nextInt();
			}
			System.out.println("Introduce los numero de la tabla dos: ");
			for (int j = 0; j < tablaDos.length; j++) {
				tablaDos[j] = sc.nextInt();
			}
		}
		Arrays.sort(tablaUno);
		Arrays.sort(tablaDos);
		int i = 0;
		int j = 0;
		for (int z = 0; z < tablaTres.length; z++) {
			if (i < 6 && j >= 6) {
				tablaTres[z] = tablaUno[i];
				i++;
			} else if (j < 6 && i >= 6) {
				tablaTres[z] = tablaDos[j];
				j++;
			} else if (tablaUno[i] <= tablaDos[j]) {
				tablaTres[z] = tablaUno[i];
				i++;
			} else if (tablaDos[j] <= tablaUno[i]) {
				tablaTres[z] = tablaDos[j];
				j++;
			}

		}
		System.out.println(Arrays.toString(tablaTres));

	}

}
