package herencias;

public class Caja {
	protected final int ANCHO;
	protected final int ALTO;
	protected final int FONDO;
	protected Unidades unidad;
	
	public Caja(int aNCHO, int aLTO, int fONDO, Unidades unidad) {
		super();
		this.ANCHO = aNCHO;
		this.ALTO = aLTO;
		this.FONDO = fONDO;
		this.unidad = unidad;
	}

	public int getANCHO() {
		return ANCHO;
	}

	public int getALTO() {
		return ALTO;
	}

	public int getFONDO() {
		return FONDO;
	}

	public Unidades getUNIDAD() {
		return unidad;
	}
	
	//metodo
	
	public double getVolumen () {
		double volumen = ANCHO * ALTO * FONDO;
		if (this.unidad == Unidades.CM) {
			volumen = volumen / 100;
		}
		return volumen;
		
	}

	@Override
	public String toString() {
		return "Caja [ANCHO=" + ANCHO + ", ALTO=" + ALTO + ", FONDO=" + FONDO + ", UNIDAD=" + unidad + ", getVolumen()="
				+ getVolumen() + "]";
	}

	
	
	
	
	
	
}
