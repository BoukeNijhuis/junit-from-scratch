import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexParametrizedTest {

    @ParameterizedTest
    @MethodSource("testInputs")
    void complexParametrizedTest(int a, int b, int res)
    {
        assertEquals(Math.min(a,b), res);
    }

    private static Stream<Arguments> testInputs() {
        return Stream.of(
            Arguments.of(1, 2, 1),
            Arguments.of(3, 2, 2),
            Arguments.of(Integer.MIN_VALUE, 1, Integer.MIN_VALUE)
        );
    }
}
