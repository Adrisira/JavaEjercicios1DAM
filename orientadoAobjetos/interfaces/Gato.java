package interfaces;

public class Gato extends Mascota {
	private int pelosBigote;

	public Gato(String nombre, int edad, Origen origen, int pelosBigote) {
		super(nombre, edad, origen);
		this.pelosBigote = pelosBigote;
	}

	public Gato(String nombre, int edad, Origen origen) {
		super();
	}

	public int getPelosBigote() {
		return pelosBigote;
	}

	public void setPelosBigote(int pelosBigote) {
		this.pelosBigote = pelosBigote;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " "+ ", Pelos del Bigote=" + pelosBigote + "]";
	}
	
	
}
