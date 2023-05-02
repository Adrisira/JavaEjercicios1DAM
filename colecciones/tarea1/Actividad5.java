package tarea1;

import java.util.ArrayList;
import java.util.Collections;

public class Actividad5 {

	public static void main(String[] args) {
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			listaEnteros.add((int)(Math.random()*101));
			Collections.sort(listaEnteros);
			Collections.reverse(listaEnteros);
		}
		System.out.println(listaEnteros);
	}

}
