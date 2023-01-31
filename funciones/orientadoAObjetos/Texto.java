package orientadoAObjetos;

public class Texto {
	// atributo
	private String cadena = " ";
	private int longitud;

	// constructor
	public Texto(int longitud) {
		this.longitud = longitud;
	}

	// getters an setters
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		if (cadena.length() <= longitud) {
			this.cadena = cadena;
		}
	}

	public int getLongitud() {
		return longitud;
	}

	// metodos
	// con pricipio que lo introducimos en la main decimos si lo introducimos al
	// principio o al final.
	public boolean anadir(boolean principio, String palabra) {
		boolean haPodido = false;
		if (this.cadena.length() + palabra.length() <= longitud) {
			haPodido = true;
			if (principio) {
				this.cadena = palabra + this.cadena;
			} else {
				this.cadena = this.cadena + palabra;
			}
		}
		return haPodido;
	}

	public boolean anadir(boolean principio, char letra) {
		boolean haPodido = false;
		if (this.cadena.length() + 1 <= longitud) {
			haPodido = true;
			if (principio) {
				this.cadena = letra + this.cadena;
			} else {
				this.cadena = this.cadena + letra;
			}
		}
		return haPodido;
	}

	//Mirar forma de marta
	public int contadorVocales() {
		int contadorVocales = 0;
		for (int x = 0; x < cadena.toLowerCase().length(); x++) {
			if ((cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'i')
					|| (cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'u') || (cadena.charAt(x) == 'A') || (cadena.charAt(x) == 'E') || (cadena.charAt(x) == 'I')
			|| (cadena.charAt(x) == 'O') || (cadena.charAt(x) == 'U')) {
				contadorVocales++;
			}
		}
		return contadorVocales;
	}

}
