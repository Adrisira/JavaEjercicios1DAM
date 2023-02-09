package interfaces;

import java.util.Arrays;

public class PilaLista{
	private Lista [] lista;
	
private int numElem;
	
	public PilaLista() {
		lista = new Lista [10];
	}
	
	private boolean redimensionarSiNecesario() {
		boolean aumentado = false;
		if (numElem >= lista.length) {
			lista = Arrays.copyOf(lista, numElem + 10);
			aumentado = true;
		}
		return aumentado;
	}
	
	public void apilar (Lista elem) {
		redimensionarSiNecesario();
		lista[numElem++] = elem;
	}
	
	public void desapilar() {
		numElem--;
	}
	
	@Override
	public String toString() {
		String cadena = "[";
		for (int i = 0; i < numElem; i++) {
			cadena += lista[i];
			if (i + 1 < numElem) {
				cadena += ", ";
			}
		}
		cadena += "]";
		return cadena;
	}

	


}
