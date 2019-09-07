import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TestTitleTest {

    @Test
    @DisplayName("this is a long description of a test")
    void methodNamingTest() {
        assertNotEquals(true, false);
    }
}
