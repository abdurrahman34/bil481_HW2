import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;



public class TestUtil {
    private Util util;

    @Before
    public void setUp() {
        util = new Util();
    }

    @Test
    public void testSingleArgShouldReturnFalse() {
        assertFalse("Expected false when only one argument is passed", util.compute(2));
    }

    @Test
    public void testEvenNumberOfArgsShouldReturnFalse() {
        assertFalse("Expected false with an even number of arguments", util.compute(1, 2));
    }

    @Test(expected = RuntimeException.class)
    public void testZeroArg() {
        util.compute(1, 0, 3);
    }

    
}
