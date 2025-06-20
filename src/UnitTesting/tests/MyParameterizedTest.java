package UnitTesting.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MyParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void isEven_shouldReturnTrueForEvenNumbers(int number) {
        assertTrue(MyMath.isEven(number));
    }
}

class MyMath {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}