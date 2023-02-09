package interfaces;

import java.util.Arrays;

public class PilaTabla {
	private Integer [] tabla;
	private int numElem;
	
	public PilaTabla() {
		tabla = new Integer [10];
	}
	
	private boolean redimensionarSiNecesario() {
		boolean aumentado = false;
		if (numElem >= tabla.length) {
			tabla = Arrays.copyOf(tabla, numElem + 10);
			aumentado = true;
		}
		return aumentado;
	}
	
	public void apilar (Integer elem) {
		redimensionarSiNecesario();
		tabla[numElem++] = elem;
	}
	
	public void desapilar() {
		numElem--;
	}
	
	@Override
	public String toString() {
		String cadena = "[";
		for (int i = 0; i < numElem; i++) {
			cadena += tabla[i];
			if (i + 1 < numElem) {
				cadena += ", ";
			}
		}
		cadena += "]";
		return cadena;
	}
	
	

}
