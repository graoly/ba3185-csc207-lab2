import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
// place your cursor over junit below and
// click "Add 'Junit4' to classpath" then press OK to be able to run this test.
import static org.junit.Assert.assertEquals;

public class DataTypesTest {

    @Test(timeout = 1000)

    public void largeSumTest() {

        // You put an L at the end to indicate it is a long.
        // try removing the L and you'll see that you get an error
        // saying "Integer number too large".
        // Note: You can use _ to help make it easier to
        //       read large numbers, as is done below.
        long x = 500_000_500_000L;
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i <= 1_000_000; i++) {
            lst.add(i);
        }
        assertEquals("sum from 1 to 1 million should be " + x, x, DataTypes.sum(lst));
    }
}
