package examenAdrianSiguenza;

import java.util.Objects;

public class Jugador implements Comparable<Jugador> {
	private String nick;

	public Jugador(String nick) {
		super();
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nick);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nick, other.nick);
	}

	@Override
	public String toString() {
		return nick;
	}

	@Override
	public int compareTo(Jugador o) {
		// TODO Auto-generated method stub
		return this.nick.compareTo(o.nick);
	}

}
