import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MethodNamingTest {

    @Test
    @DisplayName("this is a very description of a test")
    void methodNamingTest() {
        assertNotEquals(true, false);
    }
}
