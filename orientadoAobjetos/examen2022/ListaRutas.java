package examen2022;

import java.util.Arrays;

public class ListaRutas {
	private Ruta[] rutas;
	private int numRutas = 0;

	public ListaRutas(Ruta[] rutas) {
		super();
		setRutas(rutas);
	}

	public ListaRutas() {
		super();
		rutas = new Ruta[10];
	}

	public Ruta[] getRutas() {
		return rutas;
	}

	public int getNumRutas() {
		return numRutas;
	}

	public void setRutas(Ruta[] rutas) {
		this.rutas = rutas;
		numRutas = 0;
		for (int i = 0; i < rutas.length && rutas[i] != null; i++) {
			numRutas++;
		}
	}

	public void addRuta(Ruta r) {
		if (this.rutas.length >= this.numRutas) {
			this.rutas = Arrays.copyOf(rutas, this.rutas.length + 1);
		}
		this.rutas[numRutas++] = r;
	}

	// a
	public boolean hayRutaEntre(Ciudad origen, Ciudad destino) {
		boolean existeRuta = false;
		for (int i = 0; i < numRutas; i++) {
			if ((this.rutas[i].getOrigen().equals(origen)) && (this.rutas[i].getDestino().equals(destino))) {
				existeRuta = true;
			}
		}
		return existeRuta;
	}

	// b
	public boolean hayRutaDeIdaYVueltaEntre(Ciudad origen, Ciudad destino) {
		return hayRutaEntre(origen, destino) && hayRutaEntre(destino, origen);
	}

	// c
	public ListaRutas getRutasDesde(Ciudad origen) {
		ListaRutas ruta = new ListaRutas();
		for (int i = 0; i < numRutas; i++) {
			if (rutas[i].getOrigen().equals(origen)) {
				ruta.addRuta(rutas[i]);
			}
		}
		return ruta;
	}

	// d
	public Ciudad[] getCiudadesImportantes(int numHabitantes) {
		Ciudad[] ciudadesImportantes = new Ciudad[10];
		int numCiudades = 0;
		for (int i = 0; i < numRutas; i++) {
			if (rutas[i].getOrigen().getNumHabitantes() > numHabitantes) {
				ciudadesImportantes[numCiudades] = new Ciudad(rutas[i].getOrigen().getNombre(),
						rutas[i].getOrigen().getNumHabitantes());
				numCiudades++;
			} else if (rutas[i].getDestino().getNumHabitantes() > numHabitantes) {
				ciudadesImportantes[numCiudades] = new Ciudad(rutas[i].getDestino().getNombre(),
						rutas[i].getDestino().getNumHabitantes());
				numCiudades++;
			}
		}

		ciudadesImportantes = Arrays.copyOf(ciudadesImportantes, numCiudades);
		return eliminarDuplicadosCiudad(ciudadesImportantes);
	}

	public Ciudad[] eliminarDuplicadosCiudad(Ciudad[] ciudadesConDuplicados) {
		Ciudad[] ciudadesSinDuplicados = new Ciudad[ciudadesConDuplicados.length];
		int numCiudades = 0;
		for (int i = 0; i < ciudadesConDuplicados.length; i++) {
			boolean ciudadDuplicada = false;
			for (int j = 0; j < numCiudades; j++) {
				if (ciudadesConDuplicados[i].equals(ciudadesSinDuplicados[j])) {
					ciudadDuplicada = true;
				}
			}
			if (!ciudadDuplicada) {
				ciudadesSinDuplicados[numCiudades] = ciudadesConDuplicados[i];
				numCiudades++;
			}
		}

		return Arrays.copyOf(ciudadesSinDuplicados, numCiudades);
	}

	// e)
	public ListaRutas getListaOrdenada() {
		//Ordenacion burbuja
		
		//Creamos una copia del array de rutas
		Ruta[] copiaRutas = Arrays.copyOf(rutas, numRutas);
		
		//Ordenamos el array de rutas 
		boolean intercambio = true;
		int tamano = copiaRutas.length;
		while (intercambio) {
			intercambio = false;
			for (int i = 0; i < tamano -1; i++) {
				if (copiaRutas[i].compareTo(copiaRutas[i + 1]) > 0) {
				Ruta temp = copiaRutas[i];
				copiaRutas[i] = copiaRutas[i + 1];
				copiaRutas[i + 1] =  temp;
				intercambio = true;
				}
			}
			tamano--;
		}
		
		// Creamos una nueva lista de rutas y añadimos las rutas ordenadas
		ListaRutas rutaMenor = new ListaRutas();
		for (int i = 0; i < numRutas; i++) {
			rutaMenor.addRuta(copiaRutas[i]);
		}
		return rutaMenor;
	}

	@Override
	public String toString() {
		return "ListaRutas [rutas=" + Arrays.toString(Arrays.copyOf(rutas, numRutas)) + "]";
	}
}
