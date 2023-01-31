package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FactorialTest {

	@Test
	void testExcepcion() {
		try {
			Factorial.calculo(-1);
			fail("Número n no puede ser < 0.");
		} catch (IllegalArgumentException e) {

		}
	}

	@ParameterizedTest
	@CsvSource({ "0, 1", "5, 120", "4, 24" })
	void testPruebas(int a, int valorEsperado) {
		assertEquals(valorEsperado, Factorial.calculo(a));
	}

}
