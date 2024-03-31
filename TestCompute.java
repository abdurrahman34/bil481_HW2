import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class TestCompute {
    MessageQueue mq;
    Compute compute;

    @Before
    public void setUp() {
        mq = mock(MessageQueue.class);
        compute = new Compute(mq);
    }

    @Test
    public void testEmptyQueue() {
        when(mq.size()).thenReturn(0);
        assertEquals(-1, compute.countNumberOfOccurrences("element"));
    }

    @Test
    public void testElementNotInQueue() {
        when(mq.size()).thenReturn(3);
        when(mq.contains("element")).thenReturn(false);
        assertEquals(0, compute.countNumberOfOccurrences("element"));
    }

 
}
