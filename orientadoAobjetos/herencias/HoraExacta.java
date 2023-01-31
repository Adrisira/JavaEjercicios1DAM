package herencias;

import java.util.Objects;

public class HoraExacta extends Hora {
	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		setSegundo(segundo);
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}
	@Override
	public void inc() {
		if (segundo + 1 >= 60) {
			super.inc();
			segundo = 0;
		} else {
			segundo += 1;
		}
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(segundo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoraExacta other = (HoraExacta) obj;
		return segundo == other.segundo && hora == other.hora && minuto == other.minuto;
	}

	@Override
		public String toString() {
			return super.toString() + ":" + segundo;
		}
}
