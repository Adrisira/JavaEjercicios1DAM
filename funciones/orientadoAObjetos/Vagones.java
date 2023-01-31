package orientadoAObjetos;

class Vagones {
	private float capacidadMaxima;
	private float capacidadActual;
	private String tipoMercancia;
	public Vagones() {
		super();
	}
	public Vagones(float capacidadMaxima, float capacidadActual, String tipoMercancia) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = capacidadActual;
		this.tipoMercancia = tipoMercancia;
	}
	public float getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(float capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public float getCapacidadActual() {
		return capacidadActual;
	}
	public void setCapacidadActual(float capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
	public String getTipoMercancia() {
		return tipoMercancia;
	}
	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}
	@Override
	public String toString() {
		return "Vagones [capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual
				+ ", tipoMercancia=" + tipoMercancia + "]";
	}
	
	
}
