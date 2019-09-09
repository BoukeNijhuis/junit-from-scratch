import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionTest {

    @Test
    void exceptionTest() {
        assertThrows(NullPointerException.class, () -> {
            String s = null;
            s.length();
        });
    }
}
