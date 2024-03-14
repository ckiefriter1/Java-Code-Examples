package UnitTesting.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import UnitTesting.Math;

class MathTest {

	Math m = new Math();
	
	@Test
	void testMultiplyReturnsCorrectValues() {
		int product = m.multiply(2, 5);
		assertEquals(10, product);
	}
	
	@Test
	void testDivideReturnsCorrectValues() {
		double product = m.divide(5.0, 2.0);
		assertEquals(2.5, product);
	}
	
	@Test
	void testDivideIntThrowsExceptionWhenDivideByZero() {
		assertThrows(ArithmeticException.class, () -> m.divide(5, 0));
	}
	
	@Test
	void testDivideDoubleThrowsExceptionWhenDivideByZero() {
		assertEquals(Double.POSITIVE_INFINITY, m.divide(5.0, 0.0));
	}
	
	@Test
	void testIsPositiveNumberReturnsTrueIfArgIsPositive() {
		int a = 5;
		assertTrue(m.isPositiveNumber(a));
	}
	
	@Test
	void testIsPositiveNumberReturnsFalseIfArgIsNegative () {
		int a = -5;
		assertFalse(m.isPositiveNumber(a));
	}

}
