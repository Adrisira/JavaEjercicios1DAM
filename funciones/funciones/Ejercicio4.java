package funciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		boolean espacio = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		char c[] = frase.toCharArray();
		//for (int i = 0; i < frase.length()/2; i++) {
		//	if (frase.charAt(i) == ' ') {
		//		posicionCentralEspacio = true;
		//	}
		//}
		//if (posicionCentralEspacio == true) {
		//	System.out.println("La posicion central es un espacio");
		//} else {
		//	System.out.println("La posicion central no es un espacio");
		//}
		//if (frase.charAt(frase.length() + 1) == ' ') {
		//	System.out.println("La posicion central es un espacio");
		//} else {
		//	System.out.println("La posicion central no es un espacio");
		//}
		System.out.println(frase);
		for (int i = 0; i < c.length/2 + 1; i++) {
			System.out.println(c[i]);
			if(c[i] == ' ') {
				espacio = true;
			} else {
				espacio = false;
			}
		}
		if (espacio == true) {
				System.out.println("La posicion central es un espacio");
			} else {
				System.out.println("La posicion central no es un espacio");
			}
		sc.close();
	}

}
