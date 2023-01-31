package herencias;

public class Hora12 extends Hora {
	private Meridiano meridiano;

	// hay que añadir otro atributo
	public Hora12(int hora, int minuto, Meridiano meridiano) {
		super(hora, minuto);
		this.meridiano = meridiano;
	}
	
	public Meridiano getMeridiano() {
		return meridiano;
	}

	public void setMeridiano(Meridiano meridiano) {
		this.meridiano = meridiano;
	}

	@Override
	public void setHora(int hora) {
		if (hora >= 1 && hora <= 12) {
			this.hora = hora;
		} else {
			this.hora = 1;
		}
	}
	@Override
	public void inc() {
		super.inc();
		if (minuto == 0 && hora == 1) {
			hora= 1;
			cambiarMeridiano();
		}
	}
	private void cambiarMeridiano() {
		if (meridiano == Meridiano.AM) {
			meridiano = Meridiano.PM;
		} else {
			meridiano = Meridiano.AM;
		}
	}
	@Override
	public String toString() {
		return super.toString()+ " "+ meridiano;
	}
	
}
