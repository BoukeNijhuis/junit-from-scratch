import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AdvancedMockTest {

    @Test
    void advancedMockTest() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        listMock.size();
        verify(listMock, times(1)).size();
        assertEquals(listMock.size(), 2);
    }
}
