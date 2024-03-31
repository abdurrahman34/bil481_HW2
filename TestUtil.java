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

}
