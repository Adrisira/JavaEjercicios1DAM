package interfaces;

import java.util.Arrays;

public class Enteros implements Estadistica<Integer> {

	// Atributos
	private Integer[] tabla;

	// Constructor

	public Enteros(Integer[] tabla) {
		super();
		this.tabla = tabla;
	}

	@Override
	public Integer mayor() {
		Integer maxvalue = Integer.MIN_VALUE;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i].compareTo(maxvalue) > 0) {
				maxvalue = tabla[i];
			}
		}

		return maxvalue;
	}

	@Override
	public Integer menor() {
		Integer minvalue = Integer.MAX_VALUE;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i].compareTo(minvalue) < 0) {
				minvalue = tabla[i];
			}
		}
		return minvalue;
	}

	@Override
	public double media() {
		Integer sumTotal = 0;
		int contador = 0;
		for (int i = 0; i < tabla.length; i++) {
			sumTotal += tabla[i];
			contador++;
		}

		return (double) sumTotal / contador;
	}

	@Override
	public Integer[] mayoresQue(Integer obj) {
		Integer [] mayores = new Integer [tabla.length];
		int size = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i].compareTo(obj) > 0) {
				mayores[size] = tabla[i];
				size++;
			}
		}
		mayores = Arrays.copyOf(mayores, size);
		return mayores;
	}

	@Override
	public Integer[] menoresQue(Integer obj) {
		Integer [] menores = new Integer [tabla.length];
		int size = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i].compareTo(obj) < 0) {
				menores[size] = tabla[i];
				size++;
			}
		}
		menores = Arrays.copyOf(menores, size);
		return menores;
	}

}
