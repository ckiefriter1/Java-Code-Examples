package UnitTesting.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import UnitTesting.Math;

class MathTest3 {
	
	Math m = new Math();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMultiplyReturnsCorrectValues() {
		int product = m.multiply(2, 5);
		assertEquals(10, product);
	}
	
}
