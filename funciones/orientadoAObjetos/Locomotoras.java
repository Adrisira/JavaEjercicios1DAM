package orientadoAObjetos;

public class Locomotoras {
	private String matricula;
	private int potenciaMotor;
	private int añoFabricacion;
	private Mecanicos mecanico;
	public Locomotoras() {
		super();
	}
	public Locomotoras(String matricula, int potenciaMotor, int añoFabricacion, Mecanicos mecanico) {
		super();
		this.matricula = matricula;
		this.potenciaMotor = potenciaMotor;
		this.añoFabricacion = añoFabricacion;
		this.mecanico = mecanico;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public int getAñoFabricacion() {
		return añoFabricacion;
	}
	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	public Mecanicos getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanicos mecanico) {
		this.mecanico = mecanico;
	}
	@Override
	public String toString() {
		return "Locomotoras [matricula=" + matricula + ", potenciaMotor=" + potenciaMotor + ", añoFabricacion="
				+ añoFabricacion + ", mecanico=" + mecanico + "]";
	}
	
	
}
