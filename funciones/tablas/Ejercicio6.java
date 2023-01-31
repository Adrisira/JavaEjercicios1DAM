package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Implementar una función sinRepetidos() con el prototipo:
			//int[] sinRepetidos(int t[])
			//que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se
			//han eliminado los datos repetidos.
		int t = 0;
		Scanner sc = new Scanner(System.in);
			System.out.println("Dime cuantos elementos va a tener la tabla:");
			t =sc.nextInt();
		int[] sinRepetidosArray = new int[t];
		int[] sinRepetidos = sinRepetidosFuncion(sinRepetidosArray);
		System.out.println(Arrays.toString(sinRepetidos));
		sc.close();
	}
	public static int[] sinRepetidosFuncion(int[] sinRepetidosArray) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Dime los elementos de la tabla:");
			for (int i = 0; i < sinRepetidosArray.length; i++) {
				sinRepetidosArray[i] = sc.nextInt();
			}
		}
        return Arrays.stream(sinRepetidosArray).distinct().toArray();
    }
}
