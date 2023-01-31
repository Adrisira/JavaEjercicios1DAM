package orientadoAObjetos;

public class Hora {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora() {
		super();
	}
	
	public Hora(int hora, int segundo) {
		super();
		this.hora = hora;
		this.segundo = segundo;
	}
	
	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if (hora <= 24) {
			this.hora = hora;
		}
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if (hora <= 60) {
			this.minuto = minuto;
		}
		
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if (hora <= 60) {
			this.segundo = segundo;
		}
	}
	
	// metodos
	public void devuelveLaHora() {
		int horaAntigua;
		int minutoAntiguo;
		int segundoAntiguo;
		horaAntigua = hora;
		minutoAntiguo = minuto;
		segundoAntiguo = segundo;
		minuto = minuto + (segundo/60);
		segundo = segundo % 60;
		hora = hora + (minuto/60);
		minuto = minuto % 60 ;
		if (hora >= 24) {
			hora = hora - 24;
		}
		System.out.println("La hora introducida es: " + horaAntigua + ":"+ minutoAntiguo+ ":" + segundoAntiguo);
	}
	public void addSegundos(int segundo) {
		this.segundo = segundo;
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo +"]";
	}

	

	
	
	
}
