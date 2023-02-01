package interfaces;

public class TresEnteros implements Estadistica <Integer>{
	
	//Atributos
	
	Integer num1;
	Integer num2;
	Integer num3;
	
	//Contructores
	
	public TresEnteros(Integer num1, Integer num2, Integer num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public TresEnteros() {
		super();
	}
	
	//Gettes y setters

	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	public Integer getNum3() {
		return num3;
	}

	public void setNum3(Integer num3) {
		this.num3 = num3;
	}
	
	//Metodos

	@Override
	public Integer mayor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer menor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double media() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer[] mayoresQue(Integer obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer[] menoresQue(Integer obj) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
