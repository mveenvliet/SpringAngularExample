package Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);

		assertEquals(7, result);
	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.divide(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divide(10, 0);
	}

	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculator.equals(20, 0);

		assertFalse(result);
	}


	@Test
	public void testSubstraction() {
		int result = 10 - 3;
		int testResult = calculator.substraction(10, 3);
		assertEquals(testResult, result);
	}

	public void testaLowerThenB() {
		boolean result = calculator.aLowerThenB(10, 20);
		assertTrue(result);

	}
	public void testaBiggerThenB() {
		boolean result = calculator.aLowerThenB(30, 20);
		assertTrue(result);

	}
}
