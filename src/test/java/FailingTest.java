import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FailingTest {

    @ParameterizedTest
    @MethodSource("testInputs")
    // this test has to fail to show the error message
    void failingTest(int a, int b, int res)
    {
        assertEquals(Math.min(a, b), res);
    }

    private static Stream<Arguments> testInputs() {
        return Stream
            .of(Arguments.of(4, 2, 4));
    }
}
