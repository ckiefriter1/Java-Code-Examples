package UnitTesting.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import UnitTesting.Math;

class MathTest4 {

	Math m = new Math();
	
	@Test
	void testMultiplyReturnsCorrectValues() {
		int product = m.multiply(2, 5);
		assertEquals(10, product);
	}
	

}
