package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTest {
	private static Calculadora calcu;

	@BeforeAll
	public static void creaCalculadora() {
		calcu = new Calculadora(10, 10);
	}

	@Test
	void testSumaBefore() {
		assertEquals(20, calcu.suma(), 0);
	}

	@Test
	void testSuma() {
		Calculadora c = new Calculadora(20, 10);
		assertEquals(30, c.suma(), 0);
	}

	@Test
	void testResta() {
		Calculadora res = new Calculadora(20, 10);
		assertEquals(10, res.resta(), 0);
	}

	@Test
	void testMultiplica() {
		Calculadora mul = new Calculadora(20, 10);
		assertEquals(200, mul.multiplica(), 0);
	}

	@Test
	void testDivide() {
		try {
			new Calculadora(20, 0).divide();
			fail("Fallo: deberia haber lanzado excepcion");
		} catch (ArithmeticException e) {

		}
	}

	@Test
	void testRestaPositivaTrue() {
		Calculadora restaPositivaTrue = new Calculadora(20, 10);
		assertTrue(restaPositivaTrue.restaPositiva());
	}

	@Test
	void testRestaPositivaFalse() {
		Calculadora restaPositivaFalse = new Calculadora(10, 20);
		assertFalse(restaPositivaFalse.restaPositiva());
	}

	@Test
	void testDivideAcepta0Null() {
		Calculadora divideAcepta0Null = new Calculadora(10, 0);
		assertNull(divideAcepta0Null.divideAcepta0());
	}

	@Test
	void testDivideAcepta0NotNull() {
		Calculadora divideAcepta0NotNull = new Calculadora(10, 10);
		assertNotNull(divideAcepta0NotNull.divideAcepta0());
	}

	@Test
	void testDivideAcepta0NotNullDiv() {
		Calculadora testDivideAcepta0NotNullDiv = new Calculadora(10, 10);
		assertEquals(1, testDivideAcepta0NotNullDiv.divide(), 0);
	}

	@Test
	void testValorAbsolutoNum1Mayor() {
		Calculadora testValorAbsolutoNum1Mayor = new Calculadora(20, 10);
		assertEquals(10, testValorAbsolutoNum1Mayor.valorAbsoluto(), 0);
	}

	@Test
	void testValorAbsolutoNum2Mayor() {
		Calculadora testValorAbsolutoNum2Mayor = new Calculadora(10, 20);
		assertEquals(10, testValorAbsolutoNum2Mayor.valorAbsoluto(), 0);
	}

	@ParameterizedTest
	@CsvSource({ "20, 10, 30", "10, 5, 15", "20, 5, 25" })
	void testSumaParam(int a, int b, int valorEsperado) {
		assertEquals(valorEsperado, new Calculadora(a, b).suma());
	}

	@ParameterizedTest
	@CsvSource({ "20, 10, 10", "10, 5, 5", "20, 5, 15" })
	void testRestaParam(int a, int b, int valorEsperado) {
		assertEquals(valorEsperado, new Calculadora(a, b).resta());
	}

	@ParameterizedTest
	@CsvSource({ "20, 10, 200", "10, 5, 50", "20, 5, 100" })
	void testMultiParam(int a, int b, int valorEsperado) {
		assertEquals(valorEsperado, new Calculadora(a, b).multiplica());
	}

}
