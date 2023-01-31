package herencias;

public class CajaCarton extends Caja {
	

	public CajaCarton(int aNCHO, int aLTO, int fONDO) {
		super(aNCHO, aLTO, fONDO, Unidades.CM);
	}
	
	@Override
	public double getVolumen () {
		return getVolumen() * 0.8;
	}
	//Faltan muchas cosas
	//public double superficieCaja() {
		
	//}
	@Override
	public String toString() {
		return "CajaCarton [ANCHO=" + ANCHO + ", ALTO=" + ALTO + ", FONDO=" + FONDO + ", UNIDAD=" + unidad
				+ ", getVolumen()=" + getVolumen() + "]";
	}
	

}
