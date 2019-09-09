import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class InteractionTest {

    @Test
    void interactionTest() {
        List listMock = mock(List.class);
        listMock.size();
        verify(listMock, times(1)).size();
    }
}
