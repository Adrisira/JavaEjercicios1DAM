package examen2022;

import java.util.Arrays;

public class CiudadGastronomica {
	private String ciudad;
	private int numHabitantes;
	private String [] comidas;
	private int numComidas;

	public CiudadGastronomica(String ciudad, int numHabitantes, String[] comidas) {
		super();
		this.ciudad = ciudad;
		this.numHabitantes = numHabitantes;
		setComidas(comidas);
	}
	
	
	public int getNumHabitantes() {
		return numHabitantes;
	}


	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}


	public CiudadGastronomica() {
		super();
		comidas = new String[10];
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String[] getComidas() {
		return comidas;
	}

	public void setComidas(String[] comidas) {
		this.comidas = comidas;
		numComidas = 0;
		for (int i = 0; i < comidas.length && comidas[i] != null; i++) {
			numComidas++;
		}
	}

	public void addComida(String c) {
		if (this.comidas.length >= this.numComidas) {
			this.comidas = Arrays.copyOf(comidas, this.comidas.length + 1);
		}
		this.comidas[numComidas++] = c;
	}


	@Override
	public String toString() {
		return "CiudadGastronomica [ciudad=" + ciudad + ", numHabitantes=" + numHabitantes + ", comidas="
				+ Arrays.toString(Arrays.copyOf(comidas, numComidas)) + "]";
	}

	

}
