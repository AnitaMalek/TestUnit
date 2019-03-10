package sda.Testowanie;

import org.junit.Before;
import org.junit.Test;
import sda.Testowanie.IdGenerator;
import sda.Testowanie.Names;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.*;

public class NamesTest {

    private Names names;
    IdGenerator idGenerator = mock(IdGenerator.class);

    @Before
    public void setUp() throws Exception {
        when(idGenerator.getUniqueId()).thenReturn(0);

        this.names = new Names(idGenerator);
    }

    @Test
    public void randomNameTest() {
       assertThat(names.getRandomName()).isEqualTo("Jan");
    }

    @Test
    public void verifyUniqueId() {
        verify(idGenerator,never()).getUniqueId();

        names.getRandomName();

        verify(idGenerator).getUniqueId();
    }
}
