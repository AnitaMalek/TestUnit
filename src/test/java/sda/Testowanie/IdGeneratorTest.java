package sda.Testowanie;

import org.junit.Before;
import org.junit.Test;
import sda.Testowanie.IdGenerator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class IdGeneratorTest {

    private IdGenerator idGenerator;
    private IdGenerator mockIdGenerator;

    @Before
    public void setUp() {
        this.idGenerator = new IdGenerator();
        this.mockIdGenerator = mock(IdGenerator.class);
    }

    @Test
    public void testIdGenerator() {
        System.out.println(idGenerator.getUniqueId());
        when(mockIdGenerator.getUniqueId()).thenReturn(15);
        System.out.println(mockIdGenerator.getUniqueId());
        verify(mockIdGenerator).getUniqueId();
    }


}
