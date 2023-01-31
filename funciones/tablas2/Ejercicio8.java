package tablas2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int [] [] tabla =  new int [5] [5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Dime los elementos de la tabla:");
				tabla[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(tabla));
		sc.close();
	}

}
