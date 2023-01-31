package herencias;

public class Hora {
	//atributos
	protected int hora;
	protected int minuto;
	
	//constructores
	
	public Hora(int hora, int minuto) {
		super();
		setHora(hora);
		setMinuto(minuto);
	}

	public Hora() {
		super();
	}

	//getters and setters
	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		
	}


	public int getMinuto() {
		return minuto;
	}


	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}
	
	//metodos
	public void inc() {
		if (minuto + 1 >= 60) {
			minuto = 0;
			setHora(hora + 1);
		} else {
			minuto = minuto + 1;
		}
	}
	//Puedes poner un formato que tu quieras
	@Override
	public String toString() {
		return hora + ":" + minuto;
	}
	
	

}
