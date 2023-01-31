package orientadoAObjetos;

public class Sintonizador {

	// atributos
	private double frecuenciaEmisora = 80;
	private final double CAMBIO = 0.5;
	private final double FRECUENCIAMAXIMA = 108;
	private final double FRECUNECIAMINIMA = 80; 

	// constructor
	public Sintonizador() {
		super();
	}

	// metodos
	public void up() {
		if (frecuenciaEmisora + CAMBIO < FRECUENCIAMAXIMA) {
			frecuenciaEmisora += CAMBIO;
		}  else {
			frecuenciaEmisora = FRECUNECIAMINIMA;
		}
	}
	public void down() {
		if (frecuenciaEmisora - CAMBIO < frecuenciaEmisora) {
			frecuenciaEmisora -= CAMBIO;
		} else {
			frecuenciaEmisora = FRECUENCIAMAXIMA;
		}
	}
	public String display() {
		return frecuenciaEmisora + "MHz";
	}

}
