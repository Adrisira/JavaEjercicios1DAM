package examenAdrianSiguenza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Modelo {
	private HashMap<Jugador, TreeSet<Monstruo>> jugadoresMonstruosDispo = new HashMap<>();
	private TreeSet<Monstruo> todosLosMonstruos = new TreeSet<>();
	private ArrayList<Partida> partidas = new ArrayList<>();

	public Modelo() {
		super();
	}

	public HashMap<Jugador, TreeSet<Monstruo>> getJugadoresMonstruosDisponibles() {
		return jugadoresMonstruosDispo;
	}

	public TreeSet<Monstruo> getTodosLosMonstruos() {
		return todosLosMonstruos;
	}

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	@Override
	public String toString() {
		return "Modelo [jugadoresMonstruosDisponibles=" + jugadoresMonstruosDispo + "\ntodosLosMonstruos="
				+ todosLosMonstruos + "\npartidas=" + partidas + "]";
	}

	// a)
	// devuelve el monstruo que est� disponible para mayor n�mero de jugadores.
	// a igualdad de repeticiones, devuelve uno de ellos, no importa cual.
	public Monstruo getMonstruoDisponibleMasJugadores() {
		

		return null;
	}

	// b)
	// Calcula y devuelve la media de coste total de monstruos disponibles de cada
	// jugador:
	public float costeMedio() {
		int sum = 0;
		int cont = 0;
		float total = 0;
		for (Jugador c : jugadoresMonstruosDispo.keySet()) {
			for (Monstruo m : jugadoresMonstruosDispo.get(c)) {
				sum += m.getCoste();
			}
			cont++;
		}
		total = (float) sum / cont;
		return total;
	}

	// c) Devuelve un mapa con entradas de tipo <Jugador, Integer> indicando el
	// n�mero de partidas en las que va ganando cada jugador (no se suma si va
	// empate).
	public HashMap<Jugador, Integer> numPartidasGanador() {
		HashMap<Jugador, Integer> jugadorGanando = new HashMap<>();
		for (Partida p : this.partidas) {
			Integer puntosJugador1 = 0;
			Integer puntosJugador2 = 0;
			Jugador jugadorGanador = null;
			Integer numPartidasGanadas = 0;
			for (Jugador j : p.getJugadores()) {
				for (Integer i : p.getPuntosJugadores()) {
					if (p.getPos(j) == 0) {
						puntosJugador1 = i;
					} else if (p.getPos(j) == 1) {
						puntosJugador2 = i;
					}
					if (puntosJugador1 > puntosJugador2) {
						jugadorGanador = j;
						numPartidasGanadas++;

					} else {
						jugadorGanador = j;
					}

				}
			}
			jugadorGanando.put(jugadorGanador, puntosJugador1);
		}
		// Esta mal, lo se
		return jugadorGanando;
	}

	// d) este m�todo devolver� una lista con las partidas en las que hay alg�n
	// jugador
	// que tiene un monstruo en la
	// partida que no est� entre los monstruos disponibles para ese jugador.
	public ArrayList<Partida> partidasConErrores() {
		ArrayList<Partida> partida = new ArrayList<>();
//		for (Partida p : this.partidas) {
//			for (TreeSet<Monstruo> tm : p.getMostruosJugadoresEnPartida()) {
//				for (Jugador j : p.getJugadores()) {
//					for(Monstruo mEnPartida: tm) {
//							if() {
//								partida.add(p);							}
//						}
//					}
//				}
//		}
		//No se hacerlo
		return partida;
	}

}
