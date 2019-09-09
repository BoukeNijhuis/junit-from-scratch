import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockTest {

    @Test
    void mockTest() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(1);
        assertEquals(listMock.size(), 1);
    }
}
