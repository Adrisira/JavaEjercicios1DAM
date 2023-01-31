package funciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase =sc.nextLine();
		if (frase.startsWith("Javalin, javalon")) {
			System.out.println("Esta en javanes");
			String subCadena1 = frase.substring(17, frase.length());
			System.out.println(subCadena1);
		} else if (frase.endsWith("javalen, len, len")) {
			System.out.println("Esta en javanes");
			String subCadena2 = frase.substring(0, frase.length() -18);
			System.out.println(subCadena2);
		
		} else {
			System.out.println("No esta Javanes");
		}
		sc.close();
	}

}
