package interfaces;

import java.util.Arrays;

public class Lista {
	//Atributos
	private Integer [] lista;
	private int numElem = 0;
	
	
	//Constructores
	public Lista() {
		lista = new Integer [10];
	}
	
	public Lista(int tam) {
		lista = new Integer [tam];
	}
	

	//Get
	public int getNumElem() {
		return numElem;
	}

	//Metodos
	public void addFinal(Integer elem) {
		redimensionarArraySiNecesario();
		lista[numElem++] = elem;
	}
	
	public void addPrincipio (Integer elem) {
		redimensionarArraySiNecesario();
		//mover elementos
		for (int i = numElem; i > 0; i--) {
			lista[i] = lista[i-1];
		}
		lista[0] = elem;
		numElem++;
	}
	
	public boolean add (Integer elem, Integer posicion) {
		boolean anadido = false;
		if (posicion >=  0 && posicion <= numElem) {
			redimensionarArraySiNecesario();
			for (int i = numElem; i > posicion; i--) {
				lista[i] = lista[i-1];
			}
			anadido = true;
		}
		lista[posicion] = elem;
		numElem++;
		return anadido;
	}
	
	public void addLista(Lista lista2) {
		for (int i = 0; i < lista2.numElem; i++) {
			this.addFinal(lista2.get(i));
		}
	}
	private boolean redimensionarArraySiNecesario() {
		boolean aumentado = false;
		if (lista.length >= numElem) {
			lista = Arrays.copyOf(lista, numElem + 10);
			aumentado = true;
		}
		return aumentado;
	}
	public Integer get(int pos) {
		Integer elem = null;
		if (pos >= 0 && pos <= numElem -1) {
			elem = lista[pos];
		}
		return elem;
	}
	
	public boolean eliminarElemento(Integer posicion) {
		boolean borrado = false;
		if (posicion >=  0 && posicion < numElem) {
			for (int i = posicion; i < numElem - 1; i++) {
				lista[i] = lista[i + 1];
			}
			numElem--;
			borrado = true;
		}
		return borrado;
	}
	
	public int getIndexOf (Integer elem) {
		int indice = -1;
		for (int i = 0; i < numElem && indice == -1; i++) {
			if (lista[i].equals(elem)) {
				indice = lista[i];
			}
		}
		return indice;
	}
	//ToString
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
