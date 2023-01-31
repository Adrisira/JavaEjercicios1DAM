package orientadoAObjetos;

import java.util.Arrays;

public class Trenes {
	private Locomotoras locomotora;
	private Maquinista maquinista;
	private Vagones vagones[] = new Vagones[5];
	public Trenes() {
		super();
	}
	public Trenes(Locomotoras locomotora, Maquinista maquinista, Vagones[] vagones) {
		super();
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		setVagones(vagones); 
	}
	public Locomotoras getLocomotora() {
		return locomotora;
	}
	public void setLocomotora(Locomotoras locomotora) {
		this.locomotora = locomotora;
	}
	public Maquinista getMaquinista() {
		return maquinista;
	}
	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}
	public Vagones[] getVagones() {
		return vagones;
	}
	public void setVagones(Vagones[] vagones) {
		if (vagones.length <= 5) {
			this.vagones = vagones;
		}
		
	}
	// metodos
	public void addVagon(Vagones vagones) {
		for (int i = 0; i < this.vagones.length; i++) {
			if (this.vagones[i] == null) {
				this.vagones [i] = vagones;
			}
		}
	}
	@Override
	public String toString() {
		return "Trenes [locomotora=" + locomotora + ", maquinista=" + maquinista + ", vagones="
				+ Arrays.toString(vagones) + "]";
	}
	
	
	
	
	
}
