package interfaces;

import java.util.Comparator;

public class ComparadorClientesNombre implements Comparator<Cliente>{
	
	@Override
	public int compare(Cliente o1, Cliente o2) { // occn.compare(c1, c2)
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
