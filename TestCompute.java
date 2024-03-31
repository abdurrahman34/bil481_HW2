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

   
}
