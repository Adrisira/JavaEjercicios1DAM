package examenVuelos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Modelo {
	private TreeMap<Localidad, HashSet<Vuelo>> conexiones;
	private TreeSet<LineaAerea> lineas;

	public Modelo() {
		this.conexiones = new TreeMap<Localidad, HashSet<Vuelo>>();
		this.lineas = new TreeSet<LineaAerea>();
	}

	public void addLinea(LineaAerea linea) {
		this.lineas.add(linea);
	}

	public void addLocalidad(Localidad localidad) {
		// añade al mapa de conexiones una nueva pareja con la localidad
		// pasada como parámetro y un nuevo conjunto de vuelos vacío.

		// Metodo put: añade un nuevo metodo
		conexiones.put(localidad, new HashSet<Vuelo>());

	}

	public void addVueloALocalidad(Localidad localidad, Vuelo vuelo) {
		// añade el vuelo pasado como parámetro al conjunto de vuelos asociado a
		// la localidad pasada como parámetro.

		// Primero quiero comprobar si esa localidad existe para ahorrarme el proceso de
		// tener que añadrila.
		// Metodo get:Devuelve el valor de la clave que se le pasa como parámetro o
		// 'null' si la clave no existe
		if (conexiones.get(localidad) == null) {
			this.addVueloALocalidad(localidad, vuelo);
		}
		// Metodo add: Funciona para añadir nuevos elementos a los hashSet
		conexiones.get(localidad).add(vuelo);

	}

	public boolean hayErrores() {
		// devuelve un boolean indicando si hay errores en los datos, es decir,
		// si hay algún vuelo con la misma localidad de origen que de destino.
		boolean hayError = false;

		// Manera mas sencilla pero menos eficiente en este caso, porque con que solo
		// uno sea falso ya nos vale.

		// Metodo KeySet: Nos da la Key del treeMap

		// Primero recorro todos las localidades del mapa
//		for(Localidad l: conexiones.keySet()) {
//			//Segundo recorro todos los vuelos de esa localidad
//			for(Vuelo v: conexiones.get(l)) {
//				//Comparo que esa localidad sea igual al destino del vuelo que es otra localidad
//				if(l.equals(v.getDestino())) {
//					hayError = true;
//				}
//			}
//			
//		}

		// Manera mas complicada en codigo pero mas eficiente ya que al encontrar el
		// true para.

		// Primero creamos el iterador de localidad
		Iterator<Localidad> itLocalidad = conexiones.keySet().iterator();
		// El metodo hasNext: nos pasa al siguiente metodo del iterador, recuerda que
		// empieza antes del primero
		while (itLocalidad.hasNext() && !hayError) {
			// Segundo guardamos en una variables el siguiente elemento del iterador
			Localidad l = itLocalidad.next();
			// Creamos el iterador de vuelos
			Iterator<Vuelo> itVuelo = conexiones.get(l).iterator();
			while (itVuelo.hasNext() && !hayError) {
				Vuelo v = itVuelo.next();
				if (l.equals(v.getDestino())) {
					hayError = true;
				}
			}

		}
		return hayError;
	}

	public int numVuelosALocsMillon(Localidad loc) {
		// devuelve un entero con el número de vuelos que parten de la localidad
		// pasada como parámetro y llegan a localidades con más de 1.000.000 habs.
		int numVuelos = 0;

		// En este caso hay que utilizar el foreach porque quiero recorrerlos todos

		for (Vuelo v : conexiones.get(loc)) {
			if (v.getDestino().getHabitantes() > 1000000) {
				numVuelos++;
			}
		}
		return numVuelos;
	}

	public TreeSet<LineaAerea> lineasHasta(Localidad localidad) {
		// devuelve un TreeSet con todas las líneas aéreas que tienen vuelos hacia
		// la localidad pasada como parámetro.
		TreeSet<LineaAerea> linea = new TreeSet<>();
		
//		for(HashSet<Vuelo> vuelos: conexiones.values()) {
//			for(Vuelo v: vuelos) {
//				if(v.getDestino().equals(localidad)) {
//					linea.add(v.getLinea());
//				}
//			}
//		}
		Collection<HashSet<Vuelo>> conjDeConjuntos = this.conexiones.values();
		Iterator<HashSet<Vuelo>> it = conjDeConjuntos.iterator();
		while (it.hasNext()) {
			HashSet<Vuelo> conjVuelos = it.next();
			
			Iterator<Vuelo> itVuelos=conjVuelos.iterator();
			while(itVuelos.hasNext()) {
				Vuelo v=itVuelos.next();
				if(v.getDestino().equals(localidad)) {
					linea.add(v.getLinea());
				}
			}
		}
		
		return linea;
	}

	public int totalAvionesDesde(Localidad localidad) {
		// devuelve un entero con la suma de todos los aviones que tienen las líneas
		// que hacen vuelos desde la localidad pasada como parámetro.
		int numAviones = 0;
		for (Vuelo v : conexiones.get(localidad)) {
			numAviones = numAviones + v.getLinea().getNumAviones();
		}
		return numAviones;
	}

	public boolean hayVuelosReciprocos() {
		// devuelve un boolean indicando si existen dos ciudades entre las que hay
		// vuelos en los dos sentidos.
		//No tengo claro que este bien del todo
		boolean hayVuelosReciprocos = false;
		for(Localidad l: conexiones.keySet()) {
			for(Vuelo vOrigen: conexiones.get(l)) {
				for(Vuelo vDestino: conexiones.get(vOrigen.getDestino())) {
					if(vDestino.getDestino().equals(vOrigen.getDestino())) {
						hayVuelosReciprocos = true;
					}
				}
			}
		}
		return hayVuelosReciprocos;
	}

	@Override
	public String toString() {
		String res = "";
		for (Localidad l : this.conexiones.keySet()) {
			res += "\nDesde: " + l.getNombre() + " hasta:\n";
			for (Vuelo v : this.conexiones.get(l))
				res += v.getDestino().getNombre() + " con " + v.getLinea() + ", ";
		}

		return res;
	}
}
