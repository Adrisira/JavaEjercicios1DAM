package tarea1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		System.out.println("Introduce una palabra: ");
		Scanner sc = new Scanner (System.in);
		String palabraString = sc.nextLine();
		ArrayList<String> listaFrase = new ArrayList <>();
		listaFrase.add(palabraString);
		while (!palabraString.equals("fin")) {
			System.out.println("Introduce una palabra: ");
			palabraString = sc.nextLine();
			listaFrase.add(palabraString);
		}
		Collections.sort(listaFrase);
		System.out.println(listaFrase);
		sc.close();

	}

}
