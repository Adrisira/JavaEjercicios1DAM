package interfaces;

import java.util.Comparator;

public class ComparadorClienteEdad implements Comparator <Cliente>{
	
	public int compare(Cliente o1, Cliente o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
