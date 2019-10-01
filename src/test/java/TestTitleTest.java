import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TestTitleTest {

    @Test
    @DisplayName("this is a human readable title")
    void methodNamingTest() {
        assertNotEquals(true, false);
    }
}
