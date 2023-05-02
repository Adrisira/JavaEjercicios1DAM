package examenAdrianSiguenza;

import java.util.ArrayList;
import java.util.TreeSet;

public class Partida {
	// lista con los dos jugadores que participan en la partida: [jugador1,
	// jugador2]
	private ArrayList<Jugador> jugadores = new ArrayList<>();

	// lista con los puntos de cada jugador: [puntosJugador1, puntosJugador2]
	private ArrayList<Integer> puntosJugadores = new ArrayList<>();

	// lista con el conjunto de monstruos que cada jugador tiene en la partida:
	// [conjMonstruosJugador1, conjMonstruosJugador2]
	private ArrayList<TreeSet<Monstruo>> mostruosJugadoresEnPartida = new ArrayList<>();

	public Partida(Jugador jugador1, Jugador jugador2) {
		super();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		
		//los dos jugadores parten de 0 puntos
		puntosJugadores.add(0);
		puntosJugadores.add(0);
		
		//a�ado cada jugador con un conjunto (vac�o en principio) de monstruos a�adidos a la partida
		mostruosJugadoresEnPartida.add(new TreeSet<>());
		mostruosJugadoresEnPartida.add(new TreeSet<>());
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public ArrayList<Integer> getPuntosJugadores() {
		return puntosJugadores;
	}

	public ArrayList<TreeSet<Monstruo>> getMostruosJugadoresEnPartida() {
		return mostruosJugadoresEnPartida;
	}

	// a�ade el monstruo del jugador indicado a la partida.
	// devuelve un boolean indicando si ha podido ser a�adido o no.
	// No podr� a�adir el monstruo cuando el jugador no sea de la partida o ese
	// monstruo ya haya sido a�adido por ese jugador
	public boolean addMonstruo(Jugador j, Monstruo m) {
		int posJugador = getPos(j);
		return posJugador!=-1 && mostruosJugadoresEnPartida.get(posJugador).add(m);
	}
	
	//devuelve la posici�n correspondiente al jugador pasado por par�metro en el ArrayList jugadores.
	//Si el jugador no est� en el array, devuelve -1.
	public int getPos(Jugador jugador) {
		int pos = -1;
		if (jugadores.get(0).equals(jugador)) {
			pos = 0;
		} else if (jugadores.get(1).equals(jugador)) {
			pos = 1;
		}
		return pos;
	}

	// e) m�todo que sirve para que el jugadorAtacate ataque con su monstruoAtacante al
	// monstruoAtacado del jugador contrario.
	// El ataque consiste en que se le restan a los puntos de salud del
	// monstruoAtacado los puntos de da�o del atacante.
	// Devuelve true si el monstruo atacado ha muerto (muere cuando no le quedan puntos de salud).
	// Si el monstruo atacado ha muerto, se le suma un punto en esta partida al
	// jugador atacante.
	public boolean atacar(Jugador jugadorAtacante, Monstruo monstruoAtacante, Monstruo monstruoAtacado) {
		return false;
	}

	@Override
	public String toString() {
		return "\nPartida " + jugadores ;
				//+ ", \npuntosJugadores=" + puntosJugadores
				//+ ", \nmostruosJugadoresEnPartida=" + mostruosJugadoresEnPartida + "]";
	}

}
