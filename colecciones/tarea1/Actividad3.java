package tarea1;

import java.util.Collections;
import java.util.LinkedList;

public class Actividad3 {

	public static void main(String[] args) {
		LinkedList<Integer> listaEnteros = new LinkedList<>();
		for (int i = 0; i < 20; i++) {
			listaEnteros.add((int)(Math.random()*11));
			Collections.sort(listaEnteros);
			Collections.reverse(listaEnteros);
		}
		System.out.println(listaEnteros);
	}

}
