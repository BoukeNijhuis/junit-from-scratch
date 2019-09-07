import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleParametrizedTest {

    @ParameterizedTest
    @ValueSource(ints = { 1, 3, 15, Integer.MAX_VALUE })
    void simpleParametrizedTest(int number)
    {
        assertEquals(number % 2, 1);
    }
}
