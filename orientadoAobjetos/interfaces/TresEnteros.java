package interfaces;

import java.util.Arrays;

public class TresEnteros implements Estadistica<Integer> {

	// Atributos

	Integer num1;
	Integer num2;
	Integer num3;

	// Contructores

	public TresEnteros(Integer num1, Integer num2, Integer num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public TresEnteros() {
		super();
	}

	// Gettes y setters

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

	// Metodos

	@Override
	public Integer mayor() {
		Integer res = 0;
		if (num1 > num2 && num1 > num3) {
			res = num1;
		} else if (num2 > num3) {
			res = num2;
		} else {
			res = num3;
		}
		return res;
	}

	@Override
	public Integer menor() {
		Integer res = 0;
		if (num1 < num2 && num1 < num3) {
			res = num1;
		} else if (num2 < num3) {
			res = num2;
		} else {
			res = num3;
		}
		return res;
	}

	@Override
	public double media() {
		Integer numeros = 3;
		return (num1 + num2 + num3) / numeros;
	}

	@Override
	public Integer[] mayoresQue(Integer obj) {
		Integer[] tabla = new Integer[3];
		Integer[] valores = { num1, num2, num3 };
		int size = 0;

		for (int i = 0; i < valores.length; i++) {
			if (valores[i].compareTo(obj) > 0) {
				tabla[size] = valores[i];
				size++;
			}

		}
		tabla = Arrays.copyOf(tabla, size);
		return tabla;
	}

	@Override
	public Integer[] menoresQue(Integer obj) {
		Integer[] tabla = new Integer[3];
		Integer[] valores = { num1, num2, num3 };
		int size = 0;

		for (int i = 0; i < valores.length; i++) {
			if (valores[i].compareTo(obj) < 0) {
				tabla[size] = valores[i];
				size++;
			}

		}
		tabla = Arrays.copyOf(tabla, size);
		return tabla;
	}

}
