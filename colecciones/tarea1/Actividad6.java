package tarea1;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		//No se como guardar los distintos
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
		System.out.println(listaFrase);
		sc.close();
	}
}
