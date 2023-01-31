package orientadoAObjetos;

public class Bombillas {
	//atributos
	private boolean encendida;
	static private boolean fusibleRoto = false;
	
	//contructores
	
	public Bombillas() {
		// Si no le paso nada encendida va a estar apagada
		encendida = false;
	}
	public Bombillas(boolean encendida) {
		super();
		this.encendida = encendida;
	}
	
	//getters and setters
	
	public boolean isEncendida() {
		return encendida;
	}
	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}
	public static boolean isFusibleRoto() {
		return fusibleRoto;
	}
	public static void setFusibleRoto(boolean fusibleRoto) {
		Bombillas.fusibleRoto = fusibleRoto;
	}
	
	//metodos
	//
	public boolean estadoBombilla() {
		 return encendida && !fusibleRoto;
	}
	public static void saltanLosFusibles() {
		fusibleRoto = true;
	}
	public static void arregloLosFusibles() {
		fusibleRoto = false;
	}
	
	
	
	

}
