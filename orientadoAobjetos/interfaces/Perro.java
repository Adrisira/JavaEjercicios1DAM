package interfaces;

public class Perro extends Mascota {
	private boolean chip;

	public Perro(String nombre, int edad, Origen origen, boolean chip) {
		super(nombre, edad, origen);
		this.chip = chip;
	}

	public Perro() {
		super();
	}

	public boolean isChip() {
		return chip;
	}

	public void setChip(boolean chip) {
		this.chip = chip;
	}
	@Override
	public String toString() {
		return super.toString()+ " "+ ", chip=" + chip + "]";
	}
	
	
	
	
	
	

}
