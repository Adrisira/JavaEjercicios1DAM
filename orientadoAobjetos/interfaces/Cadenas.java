package interfaces;

import java.util.Arrays;

public class Cadenas implements Estadistica<String> {

	// Atributos

	private String[] cadena;

	public Cadenas(String[] cadena) {
		super();
		this.cadena = cadena;
	}

	@Override
	public String mayor() {
		String mayor = " ";
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i].compareTo(mayor) > 0) {
				mayor = cadena[i];
			}
		}
		return mayor;
	}

	@Override
	public String menor() {
		String menor = cadena[0];
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i].compareTo(menor) < 0) {
				menor = cadena[i];
			}
		}
		return menor;
	}

	@Override
	public double media() {
		double sumTotal = 0;
		for (int i = 0; i < cadena.length; i++) {
			sumTotal += cadena[i].length();
		}
		return sumTotal / cadena.length;
	}

	@Override
	public String[] mayoresQue(String obj) {
//		Integer [] mayores = new Integer [tabla.length];
//		int size = 0;
//		for (int i = 0; i < tabla.length; i++) {
//			if (tabla[i].compareTo(obj) > 0) {
//				mayores[size] = tabla[i];
//				size++;
//			}
//		}
//		mayores = Arrays.copyOf(mayores, size);
//		return mayores;
		String [] mayores = new String [cadena.length];
		int size = 0;
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i].compareTo(obj) > 0) {
				mayores[size] = cadena[i];
				size++;
			}
		}
		mayores = Arrays.copyOf(mayores, size);
		return mayores;
	}

	@Override
	public String[] menoresQue(String obj) {
		String [] menores = new String [cadena.length];
		int size = 0;
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i].compareTo(obj) < 0) {
				menores[size] = cadena[i];
				size++;
			}
		}
		menores = Arrays.copyOf(menores, size);
		return menores;
	}

}
