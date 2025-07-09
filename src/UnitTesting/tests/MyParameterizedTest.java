package UnitTesting.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void isEven_shouldReturnTrueForEvenNumbers(int number) {
        assertTrue(MyMath.isEven(number));
    }
    
    
    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
        assertEquals(expected, (input == null || input.isBlank() || input.isEmpty()));
    }
    
    
    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
          Arguments.of(null, true),
          Arguments.of("", true),
          Arguments.of("  ", true),
          Arguments.of("not blank", false)
        );
    }
    
}

class MyMath {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}