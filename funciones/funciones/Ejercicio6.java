package funciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		boolean esPalindroma = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase =sc.nextLine();
		frase= frase.replaceAll("\\s+", "");
		frase = frase.toLowerCase();
		char fraseNormal[] = frase.toCharArray();
		char fraseInvertida[] = new char [fraseNormal.length];
		for (int i = 0; i < fraseNormal.length; i++) {
			fraseInvertida[i] = fraseNormal[fraseNormal.length-1-i];
		}
		for ( int j = 0; j < fraseNormal.length;j++) {
			if (fraseNormal[j] == fraseInvertida[j]) {
				esPalindroma = true;
			} else {
				esPalindroma = false;
			}
		}
		if (esPalindroma == true) {
			System.out.println("Es palindroma");
		} else {
			System.out.println("No es palindroma");
		}
		sc.close();
	}

}
